class Game{
    var secret_number : Int
    var high : Int
    var low : Int
    var win_flag :Boolean
    var player : Player

    fun Game(Player player){

    }
    fun run(): Void{

    }
    fun hasWon() : Boolean{

    }
}

open class Player{
    var name : String = ""
    open fun next(): Int {
        return 0
    }
}

class HumanPlayer : Player(){
    override fun next(): Int {
        return 0
    }
}

open class NaiveAI : Player(){
    override fun next(): Int {
        return 0
    }
}

class BinarySearch : NaiveAI(){
    override fun next(): Int {
        return 0
    }
}

class SuperAI : NaiveAI(){
    var next(): Int{

    }
}