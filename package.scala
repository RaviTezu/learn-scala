package sessions.s2.sessioncode

/**
 * Created by ravitezu on 17/6/15.
 */
package object MyApp extends App {

  trait Garage {
    val name: String
    val size: Int
    def getName: String
    def getSize: Int
  }

  trait Vehicle {
    val vType: String
    val vModel: String

  }

}
