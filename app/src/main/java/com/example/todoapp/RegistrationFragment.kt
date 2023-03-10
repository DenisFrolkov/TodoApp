package com.example.todoapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.todoapp.databinding.FragmentRegistrationBinding
import com.example.todoapp.extensions.validateConf
import com.example.todoapp.extensions.validateEmail
import com.example.todoapp.extensions.validateName
import com.example.todoapp.extensions.validatePass

class RegistrationFragment : Fragment() {
    private lateinit var binding: FragmentRegistrationBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegistrationBinding.inflate(inflater, container, false)

        binding.buttonRegister.setOnClickListener{
            val text = binding.textInputEditEmail.text.toString()
            val validName: String? = validateName(binding.textInputEditEmail.text)
            val validEmail: String? = validateEmail(binding.textInputEditEmail.text)
            val validPass: String? = validatePass(binding.textInputEditPassword.text)
            val validConf: String? = validateConf(binding.textInputEditEmail.text)
            binding.textInputEditName.error = validName
            binding.textInputEditEmail.error = validEmail
            binding.textInputEditPassword.error = validPass
            binding.textInputEditConfirm.error = validConf
            if(validName == null && validEmail == null && validPass == null && validConf == null){
                Toast.makeText(activity,"Success!",Toast.LENGTH_SHORT).show()
                findNavController().navigate(
                    R.id.action_registrationFragment_to_profile_graph,
                    bundleOf("email" to text)
                )
            }
        }

        binding.textViewFour.setOnClickListener{
            findNavController().navigate(R.id.action_registrationFragment_to_loginFragment)
        }
        return binding.root
    }
}