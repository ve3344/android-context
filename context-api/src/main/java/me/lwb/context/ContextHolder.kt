package me.lwb.context

import android.content.Context

@Suppress("StaticFieldLeak")
object ContextHolder {
    var contextInternal: Context? = null
}