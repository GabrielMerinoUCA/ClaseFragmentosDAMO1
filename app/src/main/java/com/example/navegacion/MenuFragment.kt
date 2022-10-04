package com.example.navegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.navegacion.databinding.FragmentMenuBinding

/**
 * A simple [Fragment] subclass.
 * Use the [MenuFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MenuFragment : Fragment() {
    private lateinit var fBinding: FragmentMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        iniciar()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fBinding = FragmentMenuBinding.inflate(layoutInflater)

        return fBinding.root
    }

    private fun iniciar() {
        fBinding.btnSumar.setOnClickListener {
            it.findNavController().navigate(R.id.menu_suma)
        }
        fBinding.btnRestar.setOnClickListener {
            it.findNavController().navigate(R.id.menu_resta)
        }
    }

}