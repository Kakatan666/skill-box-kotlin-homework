package homework.homeWork8

import kotlin.random.Random

class Bird(name: String, energy: Int, weight: Int, maxAge: Int) : Animal(energy, weight, maxAge, name) {


    override fun move() {
        super.move()
        println("$name летит.")
    }

    override fun childBirth(): Bird {
        val child = Bird(
            this.name,
            this.maxAge,
            Random.nextInt(1, 10),
            Random.nextInt(1, 5)
        )
        println("У вас родился детеныш ${child.name}'а, возрастом до - ${child.maxAge}, запас энергии ${child.energy}, вес - ${child.weight}")

        return child
    }
}