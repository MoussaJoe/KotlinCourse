import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

/*class Personne {
    val firstname : String = "A"
    val lastName : String = "B"
    var age : Int = 0
}*/
//Ceci au dessus est une facon de creer des classes on a aussi d'autres facons
open class Personne (val firstName : String, val lastName: String, var age : Int) {

    lateinit var marriedName : String  //lateinit est applique juste pour les objets
    var single : Boolean = true
        get() = field

        set(value) {
            field = value
        }
    open fun present() {}

    fun isGettingMarried(){
        this.single = false
    }
    fun greet(p : Personne){
        //p dit bonjour à this
        println("${p.firstName} dit bonjour à ${this.firstName}")
    }
    //On peut aussi creer un constructeur secondaire en fonction du constructeur primaire ci dessus
    //syntaxe :
    constructor (firstName: String, lastName: String) : this(firstName, lastName, 18)


    init {
        println("Creation d'objet personne")
    }

}


fun main(args:Array<String>){
    var p1: Personne = Personne("Mamadou","Dou")
    println(p1.lastName)
    var p2: Personne = Personne("Joseph","Joe")
    println(p2.lastName)

    p1.isGettingMarried()
    println(p1.single)
    p1.greet(p2)
}
