package com.hyonglow.dogglers.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Dog(
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val age: String,
    val hobby: String
) {
}