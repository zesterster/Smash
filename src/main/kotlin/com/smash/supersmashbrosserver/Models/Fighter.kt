package com.smash.supersmashbrosserver.Models

import javax.persistence.*
import javax.persistence.FetchType



@Entity

data class Fighter(
        @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
        val id: Long = 0,
        val image: String,
        val name: String,
        val tier: String,
        val carousel_image: String,
        val description: String,
        @JoinColumn(name = "game_id")
        @ManyToOne(fetch = FetchType.LAZY)
        val game: Game? = null
) {
        override fun toString(): String {
                return "{game: ${game?.name} ${game?.symbol} ${game?.color}}"
        }
}
