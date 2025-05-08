package com.example.kotlin_practice

class PersonConstructor(val name: String, private var age: Int) {

    init {
        println("Initializing person: $name")
    }

    // Secondary constructor adding hobby
    private var hobby: String = "None"

    constructor(name: String, age: Int, hobby: String) : this(name, age) {
        this.hobby = hobby
        println("Hobby set to: $hobby")
    }

    // Protected method (accessible in subclasses)
    protected fun isAdult(): Boolean = age >= 18

    // Public method
    fun introduce() {
        println("My name is $name and I am $age years old.")
    }

    fun printProfile() {
        val adultStatus = if (isAdult()) "Yes" else "No"
        println("Profile → Name: $name, Age: $age, Hobby: $hobby, Is adult: $adultStatus")
    }
}
