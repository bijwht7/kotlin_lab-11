package example

interface Movable{
    var speed: Int
    val model: String
    val number: String
    fun move ()
    fun stop(){
        println("Останавливается...")
    }
}
interface VideoPlayable{
    fun play() = println("Play video")
}
interface AudioPlayable{
    fun play() = println("Play audio")
}

interface Worket{
    fun work()
}
interface Student{
    fun study()
}
class Car(
    override val model: String,
    override val number: String
): Movable {
    override var speed = 60
    override fun move(){
        println("Едет на машине со скоростью $speed км/ч")
    }
}
class Aircraft(
    override val model: String,
    override val number: String
) : Movable {
    override var speed = 600
    override fun move() {
        println("Летим на самолете со скоростью $speed км/ч")
    }
    override fun stop() = println("Приземляемся...")
}
class WorkingStudent(val name: String) : Worket, Student {
    override fun work() = println("$name работает")
    override fun study() = println("$name учится")
}
class MediaPlayer : VideoPlayable, AudioPlayable {
    override fun play(){
        println("Play audio and video")
        super<VideoPlayable>.play()
        super<AudioPlayable>.play()
    }

}

fun main(){
    val player = MediaPlayer()
    player.play()
    val car = Car("LADA", "134LAD")
    val aircraft = Aircraft("Boeing", "737")
    val pavel = WorkingStudent("Pavel")
    pavel.work()
    pavel.study()
    fun travel(obj: Movable) = obj.move()
//    val car: Movable = Car()
//    val aircraft: Movable = Aircraft()
    travel(car)
    travel(aircraft)

//    car.move()
    aircraft.move()
    aircraft.stop()

}
