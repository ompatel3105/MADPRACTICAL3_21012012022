package com.example.madpractical3_21012012022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import com.example.madpractical3_21012012022.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //setSupportActionBar(binding.toolbar)

        Intent(this, LoginActivity::class.java).also {startActivity(it)}
    }
}