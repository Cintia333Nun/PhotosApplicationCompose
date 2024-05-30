package com.example.photosapplication.utils

import android.content.Context

object FavoritesManager {
    private const val PREF_NAME = "Favorites"
    private const val KEY_PREFIX = "quote_"

    fun markAsFavorite(context: Context, quoteId: Int) {
        val sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        sharedPreferences.edit().putBoolean(KEY_PREFIX + quoteId, true).apply()
    }

    fun removeAsFavorite(context: Context, quoteId: Int) {
        val sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        sharedPreferences.edit().remove(KEY_PREFIX + quoteId).apply()
    }

    fun isFavorite(context: Context, quoteId: Int): Boolean {
        val sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean(KEY_PREFIX + quoteId, false)
    }
}
