package com.example.horoscapp.ui.palmistry

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.PermissionChecker
import androidx.fragment.app.Fragment
import com.example.horoscapp.databinding.FragmentPalmistryBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class PalmistryFragment : Fragment() {

    private var _binding:FragmentPalmistryBinding?  = null
    private val binding get() =_binding!!

    companion object{
        private const val CAMERA_PERMISSION = android.Manifest.permission.CAMERA
    }

    private val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ){isGranted->
        if(isGranted){
            //acepta el permiso start camera

        }else{
            Toast.makeText(
                requireContext(),
                "Acepta los permisos para una experiencia mágica",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (checkCameraPermisson()){
            //tiene permisos aceptados
        }else{
            requestPermissionLauncher.launch(CAMERA_PERMISSION)

        }

    }

    private fun checkCameraPermisson():Boolean{
        return PermissionChecker.checkSelfPermission(requireContext(),CAMERA_PERMISSION) == PermissionChecker.PERMISSION_GRANTED
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding=FragmentPalmistryBinding.inflate(layoutInflater,container,false)
        return binding.root

    }

}