/**
 * Created by ravitezu on 17/6/15.
 */
//object MyApp extends App {

  trait Garage {
    val name: String
    val size: Int
    def getName: String
    def getSize: Int
  }

  trait Vehicle {
    val vNumber:String
    val vType: String
    val vManufacturer: String
  }

  case class Car(vNumber:String, vType:String="sedan", vManufacturer:String) extends Vehicle {
    override def toString:String = {
      vNumber + " - " + vManufacturer + "("+vType+")"
    }
  }

  case class Truck(vNumber:String, vType:String, vManufacturer:String) extends Vehicle

  case class Bus(vNumber:String, vType:String, vManufacturer:String) extends Vehicle

  case class Bike(vNumber:String, vType:String, vManufacturer:String) extends Vehicle

  case class CarGarage[+T](name:String, size:Int) extends Garage {
    private var availability:Int = 0

    def allow(car: Car):Unit = {
      if (availability <= size) {
        availability = availability + 1
        println(s"Allowing ${car} to Enter ${name}! - PAY THE FEE NOW! ")
      }
    }

    def exit[T <: Vehicle ](car: T):Unit = {
      if (availability >0) {
        println(s"Your shitty ${car} has been THROWN out of ${name}!")
      }
    }

    def getAvailability:Boolean = {
      availability <= size
    }

    def getName:String = {
      name
    }
    def getSize:Int = {
      size
    }
  }

  case class TruckGarage(name:String, size:Int) extends Garage {
    def getName:String = {
      name
    }
    def getSize:Int = {
      size
    }
  }

  case class BusGarage(name:String, size:Int) extends Garage {
    def getName:String = {
      name
    }
    def getSize:Int = {
      size
    }
  }

  case class BikeGarage(name:String, size:Int) extends Garage {
    def getName:String = {
      name
    }
    def getSize:Int = {
      size
    }
  }


//}
