package com.example.trail
fun test(str : List<String>, key : String){
    val stri: MutableSet<String> = mutableSetOf ()
    for(word in str){
        if(key in word){
            stri.add (word)
        }
    }
}
fun main() {
    val str: List<String> =
        listOf("programming", "array", "kotlin", "algorithm", "java", "programming")
    val ch = "ra"
    test(str,ch)
}