interface Vehicle {
    fun operation(name : String) {
    }
}

interface Car:Vehicle {
    override fun operation(name : String) {
        print("$name drives on land")
    }
}

interface Boat:Vehicle {
    override fun operation(name : String) {
        print("$name drives in water")
    }
}

class AmphiCar : Car, Boat {
    override fun operation(name : String) {
        print("$name drives on land and water")
    }
}

fun main(){
    val drive1 = AmphiCar()
    var x = drive1.operation("Bunty")
    println("$x")
}