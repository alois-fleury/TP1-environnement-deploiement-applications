package org.example

fun addInt(x:Int,y:Int):Int{
    return x + y
}

fun puissance(x:Int,y:Int): Int {
    var result = 1
    for(i in 1..y){
        result *= x
    }
    return result
}

fun carre(x:Int):Int{
    return x*x
}

fun pourcentage(x:Int):Double{
    return x.toDouble()/100
}