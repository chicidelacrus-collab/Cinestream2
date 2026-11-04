package com.cinestream

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class CinestreamPlugin: Plugin() {
    override fun load(context: Context) {
        // Registers CineStream as an active provider in CloudStream 3
        registerMainAPI(CinestreamProvider())
    }
}
