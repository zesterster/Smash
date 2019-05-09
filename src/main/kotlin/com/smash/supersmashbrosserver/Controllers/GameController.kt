package com.smash.supersmashbrosserver.Controllers

import com.smash.supersmashbrosserver.Models.Game
import com.smash.supersmashbrosserver.Respositories.GameRepository
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/game")
data class GameController(private val gameRepo: GameRepository) {

    @GetMapping
    fun getAllGames(): Iterable<Game> {
      return gameRepo.findAll()
    }
}
