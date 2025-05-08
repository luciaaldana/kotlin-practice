package com.example.kotlin_practice

    fun ejercicio1() {
        // TODO: Declara una variable inmutable (val) llamada nombre de tipo String
        val nombre : String = "Lucia"
        // TODO: Declara una variable mutable (var) llamada edad de tipo Int
        var edad : Int = 30
        // TODO: Declara una variable nullable llamada direccion de tipo String
        val direccion : String? = "calle Sin Nombre 123, Argentina"

        println("$nombre tiene $edad años  y su dirección ${direccion?.let {"es $direccion"} ?: "no está disponible"}")
    }

    // Ejercicio 2: Operaciones matemáticas
    // Corrige las operaciones para obtener el resultado correcto
    // Los resultados deberian ser
    // Suma = 15
    // Multiplicación = 50
    // División = 2
    fun ejercicio2() {
        val numero1 = 10
        val numero2 = 5

        val suma = numero1 + numero2
        val multiplicacion = numero1 * numero2
        val division = numero1 / numero2

        println("Suma: $suma")
        println("Multiplicación: $multiplicacion")
        println("División: $division")
    }

    // Ejercicio 3: Operadores relacionales
    // Completa las comparaciones para que todas devuelvan true
    fun ejercicio3() {
        val a = 10
        val b = 20

        val comparacion1 = a < b  // TODO: Modifica el operador
        val comparacion2 = a != b  // TODO: Modifica el operador
        val comparacion3 = a <= b  // TODO: Modifica el operador
        }

    // Ejercicio 4: Control de flujo con if
    // Completa la función para clasificar la edad
    fun ejercicio4(edad: Int) {
        // TODO: Implementa una estructura if-else que imprima:
        // "Menor de edad" si edad < 18
        // "Adulto" si edad está entre 18 y 65
        // "Adulto mayor" si edad > 65

        if (edad < 18) {
            println("Con $edad años es menor de edad")
        } else if (edad in 18..65) {
            println("Con $edad años es un adulto")
        } else {
            println("Con $edad años es un adulto mayor")
        }
    }

    // Ejercicio 5: Control de flujo con when
    // Completa el when para clasificar las notas
    fun ejercicio5(nota: Int) {
        // TODO: Implementa una estructura when que imprima:
        // "Sobresaliente" si nota está entre 9 y 10
        // "Notable" si nota está entre 7 y 8
        // "Aprobado" si nota está entre 5 y 6
        // "Suspenso" si nota es menor a 5

        val NOTA_SOBRESALIENTE = 9..10
        val NOTA_NOTABLE = 7..8
        val NOTA_APROBADO = 5..6

        when (nota) {
            in NOTA_SOBRESALIENTE -> println("Sobresaliente")
            in NOTA_NOTABLE -> println("Notable")
            in NOTA_APROBADO -> println("Aprobado")
            else -> println("Suspenso")
        }
    }

    // Ejercicio 6: Bucles
    // Corrige el bucle para imprimir los números del 1 al 5
    fun ejercicio6() {
        for (i in 1..5) {  // ERROR: Rango incorrecto
            println(i)
        }
    }

    // Ejercicio 7: Manejo de nullables
    // Completa el código para manejar valores nulos de forma segura
    fun ejercicio7(texto: String?) {
        // TODO: Usa el operador Elvis (?:) para imprimir el texto
        // o "Texto vacío" si es null
        println(texto?: "Texto vacío")
    }

    // Ejercicio 8: While y operadores lógicos
    // Completa el bucle while para encontrar el primer número
    // que sea divisible por 2 y por 3
    fun ejercicio8() {
        var numero = 1
        // TODO: Implementa un bucle while que encuentre el primer número
        // divisible por 2 y por 3, comenzando desde numero = 1

        while(numero % 2 != 0 || numero % 3 != 0) {
            numero++
        }

        println("Primer número divisible por 2 y 3: $numero")
    }

fun operar(a:Int, b:Int, operacion:(Int, Int) -> Int): Int {
    return operacion(a,b)
}

val sumar: ( Int, Int) -> Int = { x, y -> x + y }

val encontrarEl10 = listOf(1,2,3,4,5).find {it == 10} ?: "no hay"


fun main() {
    println(encontrarEl10)
    val suma = operar(3,5){x,y-> x + y}
    println("El resultado de la suma es $suma")
    println(suma)
    println(  operar(4,6, sumar ))
    println("---- Ejercicio 1 ----")
    println("Declarar variables nombre como String, edad como Int y dirección como String nulleable")
    ejercicio1()

    println("---- Ejercicio 2 ----")
    println("Corrigir las operaciones para obtener el resultado correcto\npara n1 = 10 y n2 =5 \nsuma = 15, multiplicación = 50 y división = 2 \nResultado ")
    ejercicio2()

    println("---- Ejercicio 3 ----")
    println("Completar las comparaciones para que todas devuelvan true")
    ejercicio3()

    println("---- Ejercicio 4 ----")
    println("Estructura if-else que imprime si la persona es menor de edad, adulta o adulta mayor según la edad (16, 30 y 74)")
    ejercicio4(16)
    ejercicio4(30)
    ejercicio4(74)

    println("---- Ejercicio 5 ----")
    println("Implementar una estructura when que imprima el tipo de nota según la nota \n(Ejecutado con las notas 10, 7, 6 y 3)")
    ejercicio5(10)
    ejercicio5(7)
    ejercicio5(6)
    ejercicio5(3)

    println("---- Ejercicio 6 ----")
    println("Coregir el bucle para imprimir los números del 1 al 5. \nEl bucle tenia un rango con el operador downTo que genera un rango descendente. \nSe cambio por el opuesto 1..5")
    ejercicio6()

    println("---- Ejercicio 7 ----")
    println("Usa el operador Elvis (?:) para imprimir el texto o 'Texto vacío' si es null")
    ejercicio7(null)
    ejercicio7("Hello world!")

    println("---- Ejercicio 8 ----")
    println("Implementar un bucle while que encuentre el primer número \ndivisible por 2 y por 3, comenzando desde numero = 1")
    ejercicio8()
}
