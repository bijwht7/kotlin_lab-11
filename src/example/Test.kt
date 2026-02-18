package example

abstract class Human(val name: String){
    abstract var age: Int
    abstract fun hello()
}
class Person(name: String) : Human(name){
    override  var age: Int = 1
    override  fun hello(){
        println("My name is $name")
    }
}
data class Item(
    val id: Int,
    val name: String,
    val quantity: Int
){
    override fun toString(): String{
        return "Id предмета: $id\nИмя: $name\nКоличество: $quantity\n"
    }
}

var age: Int = 18
    set (value){
        if((value > 0) and (value < 110))
            field = value
    }

fun main(){
    println(age)
    age = 45
    println(age)
    age = -345
    println(age)
val sword = Item(1, "Sword", 1)
    val betterSword = sword.copy(quantity = 2)
    println(sword.toString())
    println(betterSword.toString())
    val(id, name, quantity) = betterSword
    println("Id предмета: $id\nИмя: $name\nКоличество: $quantity\n")
//    val denis:Human
//    val pavel:Human("Pavel")
//    val maksim: Human = Person("Maksim")
//    denis.hello()
//    maksim.hello()
    val denis: Person = Person("Denis")
    val maksim: Human = Person("Maksim")

}

abstract class Figure {
    abstract fun perimeter(): Float
    abstract fun area(): Float
}
class Rectangle(val width: Float, val height: Float) : Figure(){
    override fun perimeter(): Float {
        return 2 * (width + height)
    }

    override fun area(): Float {
        return width * height
    }
}

