package com.smash.supersmashbrosserver.Models

import javax.persistence.*

@Entity

data class Game(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        val name: String,
        val symbol: String,
        val color: String
)
