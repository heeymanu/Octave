package xyz.gnarbot.gnar.utils

import java.io.File

class SoundManager {

    var map : HashMap<String, String> = HashMap()

    fun loadSounds() {
        for(s in File("/home/Gnar/sounds").listFiles()) {
            print(s)
            map[s.name.replace(".mp3", "").replace("sounds\\", "")] = s.path
        }
    }

}