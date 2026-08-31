package com.coronado.pagos

fun main(){

    println("======================================")
    println("      SISTEMA DE PAGOS EN CUOTAS      ")
    println("======================================")

    print("Nombre del producto: ")
    val nombre = readln()

    print("Precio del producto: S/ ")
    val precio = readln().toDouble()

    print("Cantidad: ")
    val cantidad = readln().toInt()

    print("Pago inicial: S/ ")
    val pagoInicial = readln().toDouble()

    print("Número de cuotas (6, 12 o 24): ")
    val cuotas = readln().toInt()

    // Determinamos el interés según el número de cuotas
    val porcentajeInteres = when (cuotas) {
        6 -> 0.20
        12 -> 0.40
        24 -> 0.60
        else -> {
            println()
            println("ERROR: Solo se permiten 6, 12 o 24 cuotas.")
            return
        }
    }

}