package com.smash.supersmashbrosserver.Respositories

import com.smash.supersmashbrosserver.Models.Fighter
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface FighterRepository: CrudRepository<Fighter, Long>
