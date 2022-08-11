package homework.homeWork8

import kotlin.random.Random

open class Animal(var energy: Int, var weight: Int, var maxAge: Int, var name: String) {


    var currentAge = 0
    val isTooOld: Boolean = currentAge >= maxAge

    fun sleep() {
        energy += 5
        tryIncrementAge()
        println("$name спит.")
    }

    fun eat() {
        energy += 3
        weight += 1
        tryIncrementAge()
        println("$name ест.")

    }

    open fun move() {
        energy -= 5
        weight -= 1
        tryIncrementAge()
        println("$name передвигается.")

    }

    private fun tryIncrementAge() {
        if (Random.nextBoolean())
            currentAge++

    }

    open fun childBirth(): Animal {
        val child = Animal(
            name = name,
            maxAge = maxAge,
            energy = Random.nextInt(1, 10),
            weight = Random.nextInt(1, 5)
        )
        println("У вас родился детеныш ${child.name}'а, возрастом до - ${child.maxAge}, запас энергии ${child.energy}, вес - ${child.weight}")

        return child
    }
}