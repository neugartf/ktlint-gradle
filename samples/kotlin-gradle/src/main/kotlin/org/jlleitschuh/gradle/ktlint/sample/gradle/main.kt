package org.jlleitschuh.gradle.ktlint.sample.gradle

fun main(args: Array<String>) {
    Child(1, 2, 3, 4, 5, 6)
}

abstract class Parent<T : Related>(
    private var test: Int,
    test2: Int,
    var test3: Int,
    test4: Int,
    var test5: Int,
    test6: Int
)

interface Parent2

open class Related

class Child constructor(
    test: Int,
    test2: Int,
    test3: Int,
    test4: Int,
    test5: Int,
    test6: Int
) : Parent<Related>(
    test,
    test2,
    test3,
    test4,
    test5,
    test6
),
    Parent2 {

    fun test() {
        println("test")
    }
}
