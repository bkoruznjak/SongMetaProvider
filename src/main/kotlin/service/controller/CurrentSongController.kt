package service.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import service.data.CurrentSong

@RestController
class CurrentSongController {

    @GetMapping("/playing")
    fun getCurrentSong(@RequestParam(value = "client", defaultValue = "0") clientId: String,
                       @RequestParam(value = "entries", defaultValue = "10") amountOfEntries: String) =
            CurrentSong(1, "Nedeljko Bajić Baja", "Oficir s ružom", "http://tekstomanija.com/wp-content/uploads/2016/08/Tekstomanija-Nedeljko-Baji%C4%87-Baja-Ljubavnik.jpg?x38675")
}