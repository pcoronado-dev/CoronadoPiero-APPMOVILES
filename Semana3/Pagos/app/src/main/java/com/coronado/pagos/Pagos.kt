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

    print("Numero de cuotas (6, 12 o 24): ")
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
    // Se agrego Validaciones y Calculos del pago
    if (precio <= 0) {
        println("ERROR: El precio debe ser mayor que 0.")
        return
    }

    if (cantidad <= 0) {
        println("ERROR: La cantidad debe ser mayor que 0.")
        return
    }

    if (pagoInicial < 0) {
        println("ERROR: El pago inicial no puede ser negativo.")
        return
    }

    val montoInicial = precio * cantidad

    if (pagoInicial > montoInicial) {
        println("ERROR: El pago inicial supera el monto de compra.")
        return
    }

    val montoPendiente = montoInicial - pagoInicial

    val interes = montoPendiente * porcentajeInteres

    val totalPagar = montoPendiente + interes

    val cuotaMensual = totalPagar / cuotas

    println()
    println("======================================")
    println("             RESULTADOS")
    println("======================================")

    println("Producto           : $nombre")
    println("Precio             : S/ %.2f".format(precio))
    println("Cantidad           : $cantidad")
    println("Monto inicial      : S/ %.2f".format(montoInicial))

    println("--------------------------------------")

    println("Pago inicial       : S/ %.2f".format(pagoInicial))
    println("Monto pendiente    : S/ %.2f".format(montoPendiente))

    println("Numero de cuotas   : $cuotas")
    println("Interes            : %.0f%%".format(porcentajeInteres * 100))
    println("Interes generado   : S/ %.2f".format(interes))

    println("--------------------------------------")

    println("Total a pagar      : S/ %.2f".format(totalPagar))
    println("Cuota mensual      : S/ %.2f".format(cuotaMensual))

    println("======================================")


}