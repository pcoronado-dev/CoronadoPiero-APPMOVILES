package com.coronado.pagos

import java.util.Calendar
import java.text.SimpleDateFormat

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

    var montoPendiente = montoInicial - pagoInicial

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

    println("-----------------------------------------------------------------------")

    //Se modifico el resultado para que se vea de forma horizontal y se añadio la fecha(automatica por el sistema)
    println(
        "%-5s %-15s %-15s %-15s %-15s".format(
            "N",
            "FECHA",
            "MONTO PEND.",
            "P.MENSUAL",
            "RESTA DEL PAGO"
        )
    )

    println("-----------------------------------------------------------------------")

    val fechaCompra = Calendar.getInstance()
    val formato = SimpleDateFormat("dd/MM/yyyy")

    var monto = totalPagar

    for (i in 1..cuotas) {

        val montoActual = monto

        monto -= cuotaMensual

        if (monto < 0) {
            monto = 0.0
        }

        val resta = monto //Se añadio el dato de resta para corregir el anterior error

        val fechaCuota = fechaCompra.clone() as Calendar
        fechaCuota.add(Calendar.MONTH, i)

        val fecha = formato.format(fechaCuota.time)

        println(
            "%-5d %-15s S/ %-12.2f S/ %-12.2f S/ %-12.2f".format(
                i,
                fecha,
                montoActual,
                cuotaMensual,
                resta
            )
        )
    }

    println("=======================================================================")


}