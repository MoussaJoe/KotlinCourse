
    data class Person(val nom : String, var age : Int)
    fun  main (args : Array<String>){
        val p1 = Person("A", 10)
        val p2 = Person("B", 10)

        println(p1 == p2)
        println(p1.equals(p2))
        println(p1 === p2)
    }
