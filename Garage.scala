/**
 * Created by ravitezu on 17/6/15.
 */
object MyApp extends App {

  trait Garage {
    val name: String
    val size: Int
  }

  trait Vehicle {
    val vNumber:String
    val vType: String
    val vManufacturer: String
  }

  class Car(val vNumber:String, val vManufacturer:String, val vType:String) extends Vehicle {
    override def toString:String = {
      vManufacturer +" "+ vType+"(" + vNumber+")"
    }
  }

  class Truck(val vNumber:String, val vManufacturer:String, val vType:String) extends Vehicle

  class CarGarage[+T](val name:String, val size:Int) extends Garage {
    def allow[U >: T](car: U) = {
        println(s"Allowing ${car} to Enter ${name}! - PAY THE FEE NOW! ")
    }
    override def toString():String = {
     name
    }
  }

  class TruckGarage[-T](val name:String, val size:Int) extends Garage

  val c1 = new Car("California 6L999999", "Audi", "A7")
  println(s"Here comes the - ${c1} car \n")

  val cg = new CarGarage[Car]("Z-Car-Garage",100)
  println(s"We have a new - ${cg} \n")

  cg.allow(c1)

  println("\nAccording to Elon Musk: Burning Fossil Fuels Is the 'Dumbest Experiment in History, By Far' \n")
  println("So we have Electric Cars now! :) \n ")
  class ECar(vNumber:String, vManufacturer:String, vType:String) extends Car(vNumber, vType, vManufacturer)

  val ec1 = new Car("California 6M666666", "Tesla", "Model S")
  println(s"Here comes the - ${ec1} electric car \n")

  cg.allow(ec1)
  println(s"\nPHEW! Finally, You can allow a subtype(Electric car) of Car into Car garage!")

}
