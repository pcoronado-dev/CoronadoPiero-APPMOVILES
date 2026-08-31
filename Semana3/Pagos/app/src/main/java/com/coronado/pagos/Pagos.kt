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
    
}