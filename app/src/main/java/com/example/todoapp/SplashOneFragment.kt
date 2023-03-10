package com.example.todoapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.todoapp.databinding.FragmentSplashOneBinding

class SplashOneFragment : Fragment() {
    private lateinit var binding: FragmentSplashOneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashOneBinding.inflate(inflater, container, false)

        return binding.root
    }
}