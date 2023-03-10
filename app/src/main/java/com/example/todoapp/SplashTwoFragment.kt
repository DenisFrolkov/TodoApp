package com.example.todoapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.todoapp.databinding.FragmentSplashTwoBinding

class SplashTwoFragment : Fragment() {
    private lateinit var binding: FragmentSplashTwoBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashTwoBinding.inflate(inflater, container, false)
        binding.signButton.setOnClickListener{
            findNavController().navigate(R.id.action_splashPagerFragment_to_loginFragment)
        }

        binding.registrationButton.setOnClickListener{
            findNavController().navigate(R.id.action_splashPagerFragment_to_registrationFragment)
        }
        return binding.root
    }
}