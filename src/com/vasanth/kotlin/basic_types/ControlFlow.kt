package com.vasanth.kotlin.basic_types

/**
 * A class used to study ControlFlow.
 *
 * @author Vasanth
 */

fun main(args: Array<String>) {
    println("Control Flow.....")

    val controlFlow: ControlFlow = ControlFlow()
    controlFlow.ifExpression()
    controlFlow.whenExpression()
    controlFlow.forLoop()
    controlFlow.whileLoop()
}

class ControlFlow {

    // IF
    fun ifExpression() {
        println("IF Expression : ")

        val a: Int = 5
        val b: Int = 10;
        var max: Int

        // Traditional Usage.
        if (a > b) {
            max = a
        } else {
            max = b
        }
        println("Max of $a & $b is $max")

        // As Expression.
        max = if (a > b) a else b
        println("Max of $a & $b is $max")
    }

    // WHEN
    fun whenExpression() {
        println("WHEN Expression : ")

        // Normal Usage.
        val x: Int = 1
        when (x) {
            1 -> println("X == 1")
            2 -> println("X == 2")
            else -> {
                println("x is neither 1 nor 2")
            }
        }

        // Combining conditions.
        when (x) {
            1, 2 -> println("x == 1 or x == 2")
            else -> println("x is neither 1 nor 2")
        }

        // Use Arbitrary expressions.
        val s: String = "1"
        when (x) {
            parseInt(s) -> println("s encodes x")
            else -> println("s does not encode x")
        }

        // No Argument - Then the branch statement are simply boolean expression.
        when {
            x.rem(2) == 0 -> println("X is even")
            x.rem(2) != 0 -> println("X is odd")
            else -> println("X is funny")
        }

        // We can also in operator (Range & collection) & is operator. see documentation for example.

    }

    fun parseInt(s: String): Int? {
        var i: Int?
        try {
            i = s.toInt();
        } catch (exp: NumberFormatException) {
            i = null;
            exp.printStackTrace()
        }
        return i
    }

    // FOR
    fun forLoop() {
        println("FOR Loop : ")

        // Iterate on items
        val items: List<String> = listOf("Item1", "Item2")
        print("Items : ")
        for (item in items) {
            print("$item, ");
        }
        println()

        // Iterate on indices
        print("Items : ")
        for (index in items.indices) {
            print("${items[index]}, ")
        }
        println()
        items.forEach {item ->

        };
    }

    // While
    fun whileLoop() {
        println("WHILE Loop : ")

        val items: List<String> = listOf("Item1", "Item2")
        var index = 0;
        print("Items : ")
        while (index < items.size){
            print("${items[index]}, ")
            index++
        }
    }
}
