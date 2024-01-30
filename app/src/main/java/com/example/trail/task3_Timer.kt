package com.example.trail
import kotlinx.coroutines.*
import java.util.Calendar
fun main()
{
    val c = Calendar.getInstance()
    val hour = c.get(Calendar.HOUR_OF_DAY)
    val minute = c.get(Calendar.MINUTE)
    var seconds = c.get(Calendar.SECOND)
   runBlocking {
        timer(hour, minute, seconds)
        println("It's over")
   }
}
suspend fun timer(hour : Int, minutes: Int , seconds : Int)= coroutineScope{
    var ss = seconds
    var mm = minutes
    var hh = hour
    for (i in 1..10){
        launch {
            println("The Time is : $hh:$mm:$ss")
            ss += 1
            if(ss>=60){
                ss=0
                mm+=1
            }
            if(mm>=60){
                mm=0
                hh+=1
            }
            if(hh>=24){
                hh=0
            }
        }
        delay(1000L)
    }
}