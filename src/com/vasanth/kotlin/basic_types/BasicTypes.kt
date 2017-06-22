package com.vasanth.kotlin.basic_types

/**
 * A class used to study BasicTypes.
 *
 * @author Vasanth
 */

fun main(args: Array<String>) {
    println("Basic Types.....")

    val basicTypes = BasicTypes()
    basicTypes.numbers()
    basicTypes.characters()
    basicTypes.booleans()
    basicTypes.strings()
    basicTypes.arrays();
}

class BasicTypes {

    // NUMBERS.
    fun numbers() {
        // Byte.
        val b1: Byte = 1
        println("Byte : $b1")

        // Short.
        val s1: Short = 1
        println("Short : $s1")

        // Integer.
        val i1: Int = 1
        println("Int : $i1")

        // Long.
        val l1: Long = 1
        println("Long : $l1")

        // Float.
        val f1: Float = 1.1f
        println("Float : $f1")

        // Double
        val d1: Double = 1.1
        println("Double : $d1")
    }

    // CHARACTERS.
    fun characters() {
        val c1: Char = 'a'
        println("Char : $c1")
    }

    // BOOLEANS.
    fun booleans() {
        val b1: Boolean = true
        println("Boolean : $b1")
    }

    // STRINGS.
    fun strings() {
        val s1: String = "Hi, How are you";
        println("String : $s1")

        // Raw String
        val rs1: String = """
                            Hi,
                            How are you."""
        println("String : $rs1")
    }

    // ARRAYS.
    fun arrays(){
        val a1: Array<String> = arrayOf("1", "2")
        printArray(a1)

        val a2: Array<String?> = arrayOfNulls<String>(2)
        printArray(a2)

        val a3: Array<String> = emptyArray<String>()
        printArray(a3)

        val a4: Array<String> = Array(2, {i -> i.toString()})
        printArray(a4)
    }

    fun<T> printArray(a1: Array<T>){
        print("Array : ")
        for (a in a1){
            print("$a, ");
        }
        println();
    }

}