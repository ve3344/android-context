package me.lwb.context.androidstartup

import android.content.Context
import com.rousetime.android_startup.AndroidStartup
import com.rousetime.android_startup.Startup
import me.lwb.context.ContextHolder

class ContextInitializerAndroidStartup : AndroidStartup<Unit>() {

    override fun callCreateOnMainThread(): Boolean = true

    override fun waitOnMainThread(): Boolean = false

    override fun create(context: Context) {
        ContextHolder.contextInternal = context
    }

    override fun dependencies(): List<Class<out Startup<*>>>? {
        return null
    }

}