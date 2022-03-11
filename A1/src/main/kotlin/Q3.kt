

class Game{
    var secret_number : Int = 0
    var high : Int = 0
    var low : Int = 0
    var win_flag :Boolean = false
    var player : Player = NULL

    fun Game(player : Player){

    }
    fun run(): Void{
        return NULL
    }
    fun hasWon() : Boolean{
        return false
    }
}

open class Player{
    var name : String = ""
    open fun next(): Int {
        return 0
    }ye
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
    override fun next(): Int{
        return 0
    }
}