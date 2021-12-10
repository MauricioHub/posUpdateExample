package com.apspos.android.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apspos.android.R
import com.apspos.android.databinding.ActivityMainBinding
import com.github.javiersantos.appupdater.AppUpdater
import com.github.javiersantos.appupdater.enums.Display
import com.github.javiersantos.appupdater.enums.UpdateFrom


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.textView.text = "Hello World !!!!!"
        }

        val appUpdater = AppUpdater(this)
        appUpdater.setDisplay(Display.DIALOG)
        appUpdater.setUpdateFrom(UpdateFrom.GITHUB)
        appUpdater.setGitHubUserAndRepo("MauricioHub", "posUpdateExample")
        appUpdater.start()
    }
}