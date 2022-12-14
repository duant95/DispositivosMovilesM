package com.dispositivosmoviles.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.dispositivosmoviles.R
import com.dispositivosmoviles.databinding.FragmentUpdateLugarBinding
import com.dispositivosmoviles.model.Lugar
import com.dispositivosmoviles.viewmodel.HomeViewModel


class DeleteLugarFragment : Fragment() {

    //Borra Argumentos
    private val args by navArgs<UpdateLugarFragmentArgs>()

    private  var _binding: FragmentUpdateLugarBinding? = null
    private  val binding get() = _binding!!
    private lateinit var homeViewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel = ViewModelProvider(this).get(HomeViewModel :: class.java)
        _binding = FragmentUpdateLugarBinding.inflate(inflater, container, false)

        //cargar los valores edit
        binding.etNombre.setText(args.lugar.nombre)
        binding.etTelefono.setText(args.lugar.telefono)
        binding.etCorreoLugar.setText(args.lugar.correo)
        binding.etWeb.setText(args.lugar.web)

        binding.btUpdateLugar.setOnClickListener{updateLugar()}

        // Inflate the layout for this fragment
        return binding.root
    }

    private  fun updateLugar (){
        val nombre = binding.etNombre.text.toString()
        val correo = binding.etCorreoLugar.text.toString()
        val telefono = binding.etTelefono.text.toString()
        val web = binding.etWeb.text.toString()
        if(nombre.isEmpty()){
            Toast.makeText(requireContext(),getString(R.string.msg_data),Toast.LENGTH_LONG).show()
        }
            else if(correo.isEmpty()){
            Toast.makeText(requireContext(),getString(R.string.msg_data),Toast.LENGTH_LONG).show()
            }
            else {
            val lugar = Lugar(args.lugar.id,nombre,correo,web,telefono)
            homeViewModel.saveLugar(lugar)
            Toast.makeText(requireContext(),getString(R.string.msg_lugar_updated),Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_updateLugarFragment_to_nav_home)
        }
            //nnj

        //dwei

            //deje
    }
}