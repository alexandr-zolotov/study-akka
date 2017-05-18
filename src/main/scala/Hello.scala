import akka.actor.{ActorSystem, Props}


object Hello extends App {

  val system = ActorSystem()
  private val actor = system.actorOf(Props(new SayItActor))

  actor ! "ololo"
}
