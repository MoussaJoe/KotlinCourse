class Employees (firstName : String, lastName : String, age : Int, var  salary : Int) : Personne (firstName,lastName) {
    override fun present() {
        super.present()
        println("Prof_present")
    }

}


