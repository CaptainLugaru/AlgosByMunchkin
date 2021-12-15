package me.lugaru.fundamentals.objects

import kotlin.random.Random

// This doesn't make any sense because we're in definition - where would this execute?
// println("Hello")

// We can just put stuff into package...

/*
This makes sense; it can be grabbed from main, and it is (please see).
The x is a REFERENCE. Meaning it's a pointer to the String object containing text "Hello
That object is immutable. This reference is "val" and cannot change.
 */
val x: String = "Hello"

/*
This is better: known at compile time so just copied everywhere for performance and clarity
 */
const val Y: String = "World"

/* Type can always be inferred by the compiler when it's looking on the right side... */
const val Z = "!"

/**
 * Now this is cool!
 * 1. """ - means that inside is a block string - exactly as we see
 * we call string literal: https://kotlinlang.org/docs/basic-types.html#string-literals
 * 2. block strings understand parameter expansion like the $x
 *
 */
var greeting ="""
    $x $Y$Z    
""".trimIndent()

fun `01-01 basic types and variables`() {
    // Basic Types and References to Objects

    val userName = "Lugaru"
    println("Hello, $userName!")
    println(x)          // "x" is grabbed by reference stored in the pointer
    println(Y)          // "Y" is copied straight into here - constants are 'inlined' that way
    println(greeting)


    val hello = x
    val welcome = "Welcome, " + userName
    val greetTemplated = "$hello, $userName"
    val greetInterpolated = "${userName.uppercase()}, ${hello.lowercase()}"
    println(
        """
        $x
        $welcome
        $greetTemplated
        $greetInterpolated
    """.trimIndent()
    )

    // More Here: https://kotlinlang.org/docs/basic-types.html

    val anInt = 1
    val aDouble = 1.0
    val aLong = 1L
    val aFloat = 1.0f

//    val ( aBoolean, anotherBoolean) = Pair{ Random.nextBoolean() }
//    val anotherBoolean = !aBoolean
//    val anExpressionBoolean = aBoolean && anotherBoolean || aBoolean
}