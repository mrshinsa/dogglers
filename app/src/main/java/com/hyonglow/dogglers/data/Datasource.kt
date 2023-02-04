package com.hyonglow.dogglers.data

import com.hyonglow.dogglers.R
import com.hyonglow.dogglers.model.Dog

object Datasource {

    val dogs : List<Dog> = listOf(
        Dog(R.drawable.bella, "Bella", "1yo old", "Sleeping"),
        Dog(R.drawable.faye, "Faye", "3yo old", "Running"),
        Dog(R.drawable.frankie, "Frankie", "2yo old", "Eating"),
        Dog(R.drawable.leroy, "Leroy", "1yo old", "Jumping"),
        Dog(R.drawable.nox, "Nox", "3yo old", "Following"),
        Dog(R.drawable.tzeitel, "Tzeitel", "1yo old", "Barking")
    )
}