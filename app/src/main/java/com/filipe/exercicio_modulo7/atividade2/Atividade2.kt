package com.filipe.exercicio_modulo7.atividade2

class Atividade2 {
}

fun main() {
    val segunda: dayOfWeek = dayOfWeek.SATURDAY
    println(segunda.day)
}

enum class dayOfWeek(val day:String){
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY( "Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday ")
}