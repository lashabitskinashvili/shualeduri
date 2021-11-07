package com.example.myapplication

class Person {
    var name:String = ""
    var gvari:String = ""
    var age:Int = 0
    var fosta:String = ""
    fun description(){
        println(name)
        println(gvari)
        println(age)
        println(fosta)
    }

    override fun toString(): String {
        return description().toString()
    }
}


fun main (){
    var person1 == Person()
    person1.name = "lasha"
    person1.gvari = "bitskinashvili"
    person1.age = 18
    person1.fosta ="lasha.bitskinashvili.1@btu.edu.ge"
    println(person1)


}