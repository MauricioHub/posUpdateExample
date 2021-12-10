package com.apspos.android.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apspos.android.R
import com.github.javiersantos.appupdater.AppUpdater
import com.github.javiersantos.appupdater.enums.Display


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appUpdater = AppUpdater(this)
        appUpdater.setDisplay(Display.DIALOG)
        appUpdater.start()
    }
}