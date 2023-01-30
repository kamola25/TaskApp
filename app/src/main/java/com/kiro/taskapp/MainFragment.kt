package com.kiro.taskapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment


class MainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController =
            requireActivity().supportFragmentManager.findFragmentById(R.id.navHost_fragment) as NavHostFragment
        val button = view.findViewById<Button>(R.id.btn_edit)
        button.setOnClickListener {
            navController.navController.navigate(R.id.editFragment)
        }
    }

}