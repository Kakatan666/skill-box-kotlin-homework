
class TV(val brand: String, val model: String, val inch: Double) {

    private var tvStatus: Boolean = STATUS_DEFAULT
    private var currentVolume = VOLUME_DEFAULT
    private var currentChannel = 0
    private var numberOfChannels = Channels.getRandomChannels()
    private val maxOfChannels = numberOfChannels.size - 1


    fun printStatus() {
        val actualStatus = if (tvStatus) "ON!" else "OFF!"
        println("$brand - $actualStatus")
    }

    fun turnOn() {
        tvStatus = true
    }

    fun turnOff() {
        tvStatus = false
        currentVolume = VOLUME_DEFAULT
    }

    fun printCurrentVolume() {
        when (currentVolume) {
            VOLUME_MAX -> {
                println("You reached MAX volume!")
            }
            0 -> {
                println("TV is MUTED.")
            }
            else -> {
                println("Volume is $currentVolume.")
            }
        }
    }

    fun volumeUp(up: Int) {
        val finalVolumeUp = currentVolume + up
        currentVolume = if (finalVolumeUp < VOLUME_MAX) finalVolumeUp else VOLUME_MAX
    }

    fun volumeDown(down: Int) {
        val finalVolumeDown = currentVolume - down
        currentVolume = if (finalVolumeDown < 0) 0 else finalVolumeDown
    }

    fun getChannelList() {
        println("$currentChannel-${numberOfChannels[currentChannel]}.")
    }

    fun switchToChannel(channel: Int) {
        currentChannel = if (channel > maxOfChannels) 0 else channel
        numberOfChannels[currentChannel]
        tvStatus = true
    }

    fun switchChannelsUp() {
        tvStatus = true
        if (currentChannel != maxOfChannels) {
            currentChannel++
        } else {
            currentChannel = 0
        }
    }

    fun switchChannelsDown() {
        tvStatus = true
        if (currentChannel != 0) {
            currentChannel--
        } else {
            currentChannel = maxOfChannels
        }
    }

    fun volumeCheckUp() {
        val volume = 0
        for (i in currentVolume..VOLUME_MAX step 10) {
            currentVolume = volume + i

            if (currentVolume == 100) println("MAX VOLUME!") else println("Current volume - $currentVolume.")
        }
    }

    fun channelCheckUp() {
        val channel = 0
        for (i in currentChannel..maxOfChannels) {
            currentChannel = channel + i
            println("$currentChannel-${numberOfChannels[currentChannel]}")
        }
    }

    companion object {
        private const val VOLUME_MAX: Int = 100
        private const val VOLUME_DEFAULT: Int = 20
        private const val STATUS_DEFAULT: Boolean = false
    }

}