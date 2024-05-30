package com.example.photosapplication.model

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable

@Immutable
data class Quote(
    val id: Int,
    val title: String,
    val text : String,
    val author : String,
    val book : String,
    @DrawableRes val cardImage: Int,
    @DrawableRes val authorImage: Int,
)
