import akka.actor.Actor

class SayItActor extends Actor {

  var lastReceived = ""

  override def receive = {
    case s: String => lastReceived = s
    case _ => println("not a string")
  }
}
