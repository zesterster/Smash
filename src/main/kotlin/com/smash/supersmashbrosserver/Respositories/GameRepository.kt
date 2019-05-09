package com.smash.supersmashbrosserver.Respositories

import com.smash.supersmashbrosserver.Models.Game
import org.springframework.data.repository.CrudRepository

interface GameRepository: CrudRepository<Game, Long>
