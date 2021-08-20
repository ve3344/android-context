package me.lwb.context

import android.content.Context

object AppContext {
    @JvmStatic
    val context: Context
        get() = ContextHolder.contextInternal
            ?: throw NullPointerException("Context variable is not initialized!!")
}
