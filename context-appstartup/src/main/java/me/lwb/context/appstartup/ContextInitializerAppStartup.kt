package me.lwb.context.appstartup

import android.content.Context
import androidx.startup.Initializer
import me.lwb.context.ContextHolder

class ContextInitializerAppStartup : Initializer<Unit> {
    override fun create(context: Context) {
        ContextHolder.contextInternal = context
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}