package sumOfMultiples
import org.scalatest.prop.PropertyChecks
import org.scalatest.FlatSpec

//import utest._


import JsSumOfMultiples._

class sumOfMultiplesTest extends FlatSpec with PropertyChecks {
  it should "sum multiples of 3 or 5 up to 4" in {
    assert(
      sumOfMultiples(Set(3, 5), 4) == 3 )
  }
  it should "sum multiples of 7 13 17 up to 20" in {
    assert(
      sumOfMultiples(Set(7, 13, 17), 20) == 51 )
  }
  // property tests
  "limit is 0" should "sum to 0" in {
    val i = 0
    forAll { (set: Set[Int]) =>
      assert(
        sumOfMultiples(set, i) == 0 )
    }
  }
  "sum of multiples" should "be less than the limit raised to the limit" in {
    forAll { (set: Set[Int], i:Int) =>
      assert(
        sumOfMultiples(set, i) < scala.math.pow(i,i) )
    }
  }
  "set of one number" should "sum up to a multiple of the number " in {
    forAll { (j: Int, i: Int) =>
      val set = Set(j)
      assert(
        sumOfMultiples(set, i) % j == 0)
    }
  }
  "set of 1" should "be sum of ints up to limit " in {
    val set = Set(1)
    forAll { (i: Int) =>
      assert(
        sumOfMultiples(set, i) == (i + 1) * i / 2)
    }
  }
  "empty set" should "= sum to 0" in {
    val set = Set[Int]()
    forAll { (i: Int) =>
      assert(
        sumOfMultiples(set, i) == 0)
    }
  }
}

