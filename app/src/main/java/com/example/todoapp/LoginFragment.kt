package com.example.todoapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.todoapp.databinding.FragmentLoginBinding
import com.example.todoapp.extensions.validateEmail
import com.example.todoapp.extensions.validatePass

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.buttonSign.setOnClickListener{
            val text = binding.textInputEditEmail.text.toString()
            val validEmail: String? = validateEmail(binding.textInputEditEmail.text)
            val validPass: String? = validatePass(binding.textInputEditPassword.text)
            binding.textInputEditEmail.error = validEmail
            binding.textInputEditPassword.error = validPass
            if(validEmail == null && validPass == null){
                Toast.makeText(activity,"Success!",Toast.LENGTH_SHORT).show()
                findNavController().navigate(
                    R.id.action_loginFragment_to_profile_graph,
                    bundleOf("email" to text)
                )
            }
        }
        binding.textViewFour.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_registrationFragment)
        }
        return binding.root
    }
}