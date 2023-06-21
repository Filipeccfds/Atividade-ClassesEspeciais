package com.filipe.exercicio_modulo7.atividade1

class Atividade1 {
}
fun main(){
    var string = "FILIPE"
    string.myString()
}

fun String.myString(){
    for (i in this){
        var lista = mutableListOf(i)
        println(lista)
    }
}