
import kotlin.random.Random

object Channels {
    private val channelsList = listOf(
        "Первый канал",
        "Россия-1",
        "МАТЧ",
        "НТВ",
        "Культура",
        "СТС",
        "Рент-ТВ",
        "ТНТ",
        "Звезда",
        "Карусель",
        "2x2",
        "МУЗ-ТВ"
    )


    fun getRandomChannels(): List<String> {
        val randomList = mutableSetOf<String>()
        val numberOfChannels = Random.nextInt(11)
        for (i in 0..numberOfChannels) {
            randomList.add(channelsList[i])
        }
        return randomList.shuffled()
    }


}

