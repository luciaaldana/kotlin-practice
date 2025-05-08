package com.example.kotlin_practice

// TASK 1 ::::::::::::::::::::::::::::::::::::::::::::::::::::;

// Escribí una función que reciba dos números y retorne su suma.
fun sum (a: Int, b: Int): Int {
    val sum = a + b
    println("La suma de $a y $b es igual $sum")
    return sum
}

// Creá una función que tenga parámetros opcionales
fun greeting(name: String, greeting: String? = "Hola") {
    println("$greeting, $name!")
}

// Implementá:
// 1- Una función de una sola expresión:
fun getSum (a: Int, b: Int) = a + b

// 2- Una función inline :
inline fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun task1() {
    println("TASK 1 ::::::::::::::::::::::::::::::::::::::::::::::::::::")
    sum(a = 2, b = 4)
    greeting(name = "Lucia")
    println("La función de una sola expresión getSum \n recibe a = 2 y b = 7 \n ejecutada desde la función inline operate \n el resultado de la suma es ${operate(2,7, ::getSum)}")
}

// TASK 2 ::::::::::::::::::::::::::::::::::::::::::::::::::::
// Definir una función lambda que reciba un número y retorne su cuadrado
val square: (Int) -> Int = { it * it }

// Usar map y filter para transformar una lista de números
val numberList = listOf(1,2,3,4,5,6)

val evenNumber = numberList.filter {it % 2 == 0}

val double = numberList.map {it * 2}

// Crear una función de orden superior que reciba otra función como parámetro.
fun getDouble(list: List<Int>, operator: (List<Int>) -> List<Int>): List<Int> {
    return operator(list)
}

fun task2() {
    println("TASK 2 ::::::::::::::::::::::::::::::::::::::::::::::::::::")
    println("El cuadrado de 5 es ${square(5)}")
    println("Usando filter para obtener los números pares de la lista de números (1,2,3,4,5 y 6). \n Números pares: $evenNumber")
    println("Usando map para obtener el doble de los números de la lista de números (1,2,3,4,5 y 6). \n Dobles: $double")
    val doubleList = getDouble(list = numberList){ double}
    println("Obteniendo el doble de los números desde una función de ordern superior... \n Dobles obtenidos $doubleList")
}

// TASK 3 ::::::::::::::::::::::::::::::::::::::::::::::::::::

fun task3() {
    println("TASK 3 ::::::::::::::::::::::::::::::::::::::::::::::::::::")
    println("Declarar una clase Persona con propiedades nombre y edad.\n Agregar un método que imprima esa información.\n Instanciar objetos de esa clase y mostralos.\n")
    val person1 = Person("Lucia", 30)
    val person2 = Person("Carlos", 35)

    person1.introduce()
    person2.introduce()
}

// TASK 4 ::::::::::::::::::::::::::::::::::::::::::::::::::::


fun task4() {
    println("TASK 4 y 5 ::::::::::::::::::::::::::::::::::::::::::::::::::::")
    println("Implementar un contructor primario y secundario. Usar un bloque Init para inicializar valores, aplicar modificadores de acceso")
    val person1 = PersonConstructor("Lucia", 30)
    person1.introduce()
    person1.printProfile()

}


fun main() {
    task1()
    task2()
    task3()
    task4()
    println("Probá todas las implementaciones desde main()")
}