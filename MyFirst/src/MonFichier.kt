fun updateDirty(dirty:Int, operation:(Int)->Int):Int{
    return operation(dirty)
}
fun methodeFiltre(x:Int):Int{
    return x-1
}
val methodUV:(Int)->Int = {x->x-2}

fun methodCachet():(Int)->Int = {x->x-3}

fun square(n:Int) = n*n

fun p(n:Int):Unit {
    println("Hello $n")
}
fun main(args: Array<String>) {
    println(updateDirty(15, ::methodeFiltre))
    println(updateDirty(15, methodUV))
    println(updateDirty(15, methodCachet()))
    println(updateDirty(15,{x->x-5}))
    println(updateDirty(15){x->x-6})
}

