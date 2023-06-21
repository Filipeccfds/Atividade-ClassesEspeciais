package com.filipe.exercicio_modulo7.atividade3e4

class Atividade3 {
}

fun main() {
    UtilityHelper.setCurrentDay(DayOfWeek.MONDAY)
    UtilityHelper.printDay()
    UtilityHelper.isWeekend()
    UtilityHelper.setCurrentDay(DayOfWeek.SUNDAY)
    UtilityHelper.printDay()
    UtilityHelper.isWeekend()
}

object UtilityHelper{
    private var currentDay: DayOfWeek = DayOfWeek.SUNDAY

    fun setCurrentDay(newDay: DayOfWeek){
            currentDay = newDay

    }
    fun printDay() = println(currentDay )

    fun isWeekend() = when(currentDay){
        DayOfWeek.SUNDAY -> println( true)
        DayOfWeek.SATURDAY -> println( true)
        else -> println( false)
    }

}

enum class DayOfWeek(val day:String){
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY( "Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday ")
}

