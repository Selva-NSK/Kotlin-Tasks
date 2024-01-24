
package com.example.trail

// global result
val resultree : MutableList<Family> = mutableListOf()
//data class
data class Family(var id: Int, var name: String, var parent: Int? ,var subnodes : MutableList<Family> = mutableListOf())
// finding rootnodes and subsequent subnodes for thr roootnodes
fun rootnodes(List_given : List<Family>){
    List_given.forEach{node ->
        if(node.parent==null){
            resultree.add(node)
            findsubnodes(node,List_given.filter { it != node })
        }
    }
}
//finding subnodes and its subsequent by recursion
fun findsubnodes(node : Family,List_given: List<Family>){
    List_given.forEach{
        if(it.parent==node.id)
        {
            node.subnodes.add(it)
            findsubnodes(it,List_given.filter { x-> x!=it })
        }
    }
}
fun main() {
    val givenlist = mutableListOf(
        Family(1, "Node A", null),
        Family(2, "Node B", 1),
        Family(22, "Node C", 1),
        Family(4, "Node D", 2),
        Family(5, "Node E", 2),
        Family(6, "Node F", null),
        Family(35, "Node G", 6),
        Family(8, "Node H", 1)
    )
    rootnodes(givenlist)
}