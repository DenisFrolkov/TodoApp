package com.example.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.todoapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), BottomNavigationViewManager {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navController =
            (supportFragmentManager.findFragmentById(R.id.mainFragmentContainer) as NavHostFragment).navController
        binding.bottomNavigation.setupWithNavController(navController)
    }

    override fun setNavigationViewVisibility(isVisible: Boolean) {
        binding.bottomNavigation.isVisible = isVisible
    }
}

interface BottomNavigationViewManager {
    fun setNavigationViewVisibility(isVisible: Boolean)
}