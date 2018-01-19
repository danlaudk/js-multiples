package sumOfMultiples

import scala.collection.immutable.Stream.#::


object JsSumOfMultiples {
  def main(args: Array[String]): Unit = {
    println("the sum of multiples of the set( 7 13 17) up to but not including 20 is" +
      "7 + 13 + 14 + 17 which i expect to be 51 and is calculated as ... " + sumOfMultiples(Set(7, 13, 17), 20))
  }

  def sumOfMultiples(set: Set[Int], limit: Int): Int = {
    allMultiples(set, limit).fold(Set())(_ union _).sum
  }

  // helper functions
  def allMultiples(set: Set[Int], limit: Int): Set[Set[Int]] = for {
    j <- set
  } yield multiplesOf(List(), j, limit).toSet

  def multiplesOf(acc:List[Int], start: Int, limit:Int): List[Int] = {
    if (start==0 ) return List()
    val next = if(acc.isEmpty) start else acc.head + start

    if (next >= limit)
      acc
    else
      multiplesOf(next+:acc, start, limit)
  }
}
