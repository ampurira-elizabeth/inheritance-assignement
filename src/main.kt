import kotlin.time.hours

fun main(){
var Car=car("subaru","legacy","black",5)
    Car.carry(3)
  Car.carry(6)

    Car.identity()

    println(Car.calculateparkingfees(6))
    var bus=Bus("subaru","minibus","green",35)
    var taxi =bus.maxtripfare(40000.0)
    println(taxi)
    println( bus.calculateparkingfees(7))

}
 open class car(var make:String,var model:String,var color:String,var capacity:Int){


    fun carry(people:Int){
        var x =people-capacity
    if (people <=capacity)
        println("carrying $people passengers")
        else
            println("over capacity by $x")

}
    fun identity(){
        println("I am a $color,$make,$model")
    }

   open fun calculateparkingfees(hours:Int):Int{
      return  hours * 20
    }
}
 class Bus( make:String, model:String, color:String, capacity:Int):car(make,model,color,capacity){
     fun maxtripfare(fare:Double):Double{
         var taxi=fare*capacity
         return taxi
     }

     override fun calculateparkingfees(hours: Int):Int{
       var T =  hours * capacity
         return T
     }
}

