package com.example.trail

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() =runBlocking()
{
    val timer = 10
    println("Timer Starts : From $timer")
    timer(timer)
    println("Timer Ends")
}

suspend fun timer(time : Int) = coroutineScope{
    for(i in time downTo 1) {
        launch {
            println("Timer : It's $i")
        }
        delay(1000L)
    }
}