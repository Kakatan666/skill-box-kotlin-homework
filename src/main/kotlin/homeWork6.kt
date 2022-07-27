/*Введите число N с клавиатуры. Вводимые символы должны проверяться на соответствие условию N > 0.
В случае невыполнения условия программа должна указывать на ошибку ввода и предлагать ввести число до тех пор, пока не будет введено корректное значение.
Введите следующие N телефонных номеров пользователей. Каждый номер должен представлять из себя строку.
Сохраните введённые номера в список. Используйте для этого MutableList. Заносите в него значения с помощью цикла.
Вынесите шаги 2 и 3 в функцию, которая принимает число N и возвращает список из N номеров телефонов, введённых с клавиатуры.
Выведите в консоль только номера телефонов, начинающиеся с приставки +7.
Для этого отфильтруйте список с помощью функции filter и распечатайте его.
Выведите в консоль количество уникальных введённых номеров.
Для этого преобразуйте список в множество c помощью функции toSet() и получите размер множества size.
Вычислите и распечатайте сумму длин всех номеров телефонов с помощью агрегирующей функции коллекции sumOf.
Создайте изменяемое представление — MutableMap. Для каждого уникального номера из множества введите имя человека и заполните Map так,
чтобы в качестве ключа выступал номер телефона, а в качестве значения — введённое с консоли имя человека.
Выведите содержимое Map в консоль в следующем виде:
Абонент: Андрей. Номер телефона: +79110123456
Абонент: Олег. Номер телефона: +79229876543
По желанию выведите содержимое Map, отсортированное по номерам телефона.
По желанию выведите содержимое Map, отсортированное по имени абонента.
*/

fun main() {
    print("N")
    var n = readLine()?.toIntOrNull() ?: return
    while (n < 0) {
        print("Enter number higher!")
        n = readLine()?.toIntOrNull() ?: return
    }

    val startWith = phoneBook(n).filter { it.startsWith("+7") }
    startWith.forEach { println(it) }
    println(startWith.toSet().size)
    println(startWith.sumOf { it.toLong() })

    val names = mutableMapOf<String, String>()
    startWith.forEach {
        print("Enter name to number: $it: ")
        val name = readLine()!!
        names[it] = name
    }

    val sortedByNumber = names.toSortedMap()
    sortedByNumber.entries.sortedBy { it.key }.forEach { sortedByNumber[it.key] = it.value }
    sortedByNumber.forEach { println("Number: ${it.key}.Abonent: ${it.value}.") }
    println("")
    val sortedByName = names.toSortedMap()
    sortedByNumber.entries.sortedBy { it.key }.forEach { sortedByNumber[it.value] = it.key }
    sortedByName.forEach { println("Number: ${it.key}.Abonent: ${it.value}.") }

}

fun phoneBook(number: Int): MutableList<String> {
    val phoneBook = mutableListOf<String>()
    var n: String
    for (i in 0 until number) {
        print("Enter phone number: ")
        n = readLine()!!
        phoneBook.add(n)
    }
    return phoneBook
}
