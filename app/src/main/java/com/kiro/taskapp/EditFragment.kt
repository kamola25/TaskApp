package com.kiro.taskapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.kiro.taskapp.databinding.FragmentEditBinding


class EditFragment : Fragment() {

    private lateinit var binding: FragmentEditBinding
    private lateinit var navControl: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEditBinding.inflate(inflater)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClick()
        initNavController()

    }

    private fun initClick() {


        binding.add.setOnClickListener {
            if (binding.editTitle.text.isBlank()){
                binding.editTitle.error = "Error"
                binding.editDesc.error="Error"
            }else{
                val bundle= Bundle()
                bundle.putString("key", binding.editTitle.text.toString())
                bundle.putString("key1", binding.editDesc.text.toString())
                navControl.navigate(R.id.mainFragment,bundle)
                setFragmentResult("key",bundle)
            }}


    }

    private fun initNavController() {
        val navController =  (requireActivity().supportFragmentManager.
        findFragmentById(R.id.navHost_fragment) as NavHostFragment)
        navControl = navController.navController

    }


}