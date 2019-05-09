package com.smash.supersmashbrosserver.Controllers

import com.smash.supersmashbrosserver.Models.Fighter
import com.smash.supersmashbrosserver.Respositories.FighterRepository
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin
@RequestMapping("/fighter")
class FighterController(private val fightersRepo: FighterRepository){

    @GetMapping
    fun findAllFighters(): Iterable<Fighter>{
       return fightersRepo.findAll()
    }
}
