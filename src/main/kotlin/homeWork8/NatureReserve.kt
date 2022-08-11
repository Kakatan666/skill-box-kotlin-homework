package homework.homeWork8

import kotlin.random.Random

class NatureReserve {
    var listOfCreatures = mutableListOf(
        Bird("Каркуша", 2, 3, 4),
        Bird("Каллибри", 5, 1, 5),
        Bird("Воробобушек", 10, 4, 8),
        Bird("Птахатыч", 3, 2, 10),
        Bird("Клювокрыл", 4, 10, 9),
        Fish("Глистоласт", 2, 2, 2),
        Fish("Жабральник", 4, 3, 4),
        Fish("Форельник", 5, 2, 6),
        Dog("Блохинатор", 7, 6, 11),
        Dog("Жопонюх", 8, 4, 8)
    )

    fun circleOfLive(){
        print("Введите кол-во жизненных циклов: ")
        val n: Int = readLine()?.toIntOrNull()!!
        val newCreaturesList = mutableListOf<Animal>()
        for (i in 1..n){
            if (listOfCreatures.size ==0){
                println("Животных нет")
            return
            }else{
                listOfCreatures.forEach {
                    when(Random.nextInt(0,4)){
                        0->it.eat()
                        1->it.eat()
                        2->it.eat()
                        3->{
                            newCreaturesList.add(it.childBirth())
                        }
                    }
                }
                listOfCreatures.addAll(newCreaturesList)
                listOfCreatures.removeAll{animal -> animal.isTooOld }
            }
            println("Родилось ${newCreaturesList.size} животных.")
            println("Всего ${listOfCreatures.size} животных.")
        }
    }
}