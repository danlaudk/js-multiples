package sumOfMultiples

import scala.scalajs.js
import js.annotation.JSExport
import org.scalajs.dom

@js.native
trait EventName extends js.Object {
  type EventType <: dom.Event
}

object EventName {
  def apply[T <: dom.Event](name: String): EventName { type EventType = T } =
    name.asInstanceOf[EventName { type EventType = T }]

  val onmousedown = apply[dom.MouseEvent]("onmousedown")
}

@js.native
trait ElementExt extends js.Object {
  def addEventListener(name: EventName)(
      f: js.Function1[name.EventType, _]): Unit
}

object JsSumOfMultiples extends js.JSApp {
  def main(): Unit = {
    val paragraph = dom.document.createElement("p")
    paragraph.innerHTML = "<strong> sumOfMUltiples of Set(7, 13, 17), 20  is ...  </strong> " + sumOfMultiples(Set(7, 13, 17), 20)
    dom.document.getElementById("playground").appendChild(paragraph)

    val p = paragraph.asInstanceOf[ElementExt]
  }
  def sumOfMultiples(s:Set[Int], i:Int):Int = 0
}
