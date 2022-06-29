package src.main.kotlin

/*Создайте переменную firstName с типом String, которая ссылается на строку с вашим именем.
Создайте переменную lastName с типом String, которая ссылается на строку с вашей фамилией.
Создайте переменную height с типом Double, которая хранит ваш рост в метрах и изменяется.
Создайте переменную weight с типом Float, которая хранит ваш вес в килограммах.
Создайте переменную isChild с типом Boolean, которая хранит значение, указывающее, что вы ребёнок. Значение переменной должно вычисляться исходя из значений переменных height и weight. Считайте, что человек является ребёнком, если рост меньше 150 см или вес меньше 40 кг.
Создайте переменную info, которая хранит строку с информацией о вас. В строке должна быть вся информация, доступная из переменных firstName, lastName, height, weight, isChild. Используйте для этого строковые шаблоны.
Выведите значение переменной info в консоль.
Измените значение переменной height после вывода информации из info.
Вновь вызовите вывод информации об info на экран, убедитесь, что в консоль вывелось обновлённое значение.
По желанию. Добейтесь, чтобы информация в переменной isChild обновилась.
По желанию. Добейтесь, чтобы информация на экране согласно п. 9 обновилась.*/
fun main() {
    val firstName: String = "Konstantin"
    val lastName: String = "Shamshudinov"
    var height: Double = 180.0
    val weight: Float = 89.0f
    var isChild: Boolean = (height < 150.0) || (weight < 40.0)
    var info =
        "My name - $firstName, surname - $lastName. \nMy height - $height. \nMy weight - $weight. \nAm i a child? - $isChild"
    println(info)
    println()
    height = 138.0
    isChild = (height < 150.0) || (weight < 40.0)
    info =
        "My name - $firstName, surname - $lastName. \nMy height - $height. \nMy weight - $weight. \nAm i a child? - $isChild"
    println(info)
}