import akka.actor.ActorSystem
import akka.testkit.TestActorRef
import org.scalatest._

class SayItSpec extends FunSpecLike with Matchers with BeforeAndAfterAll{

  implicit val system = ActorSystem()

  describe("actor") {
    it("should remember last received string") {
      val actorRef = TestActorRef(new SayItActor)
      val mem = "ololo"
      actorRef ! "trololo"
      actorRef ! mem
      val actor = actorRef.underlyingActor

      actor.lastReceived should equal(mem)
    }
  }

}
