package com.example.horoscapp.ui.horoscope.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.example.horoscapp.databinding.ItemHoroscopeBinding
import com.example.horoscapp.domain.model.HoroscopeInfo


class HoroscopeViewHolder (view:View):RecyclerView.ViewHolder(view){

    private val binding = ItemHoroscopeBinding.bind(view)

    //misma funcion lamnda se agrega
    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected: (HoroscopeInfo) -> Unit){

        val context = binding.tvHoroscope.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvHoroscope.text=context.getString(horoscopeInfo.name)

        //cuando seleccione algo de la celda va a ejecutar la funcion lamnda
        //al que seleccione se le va aplicar la animacion
        binding.parent.setOnClickListener{
            startRotationAnimastion(binding.ivHoroscope, newlambda = {onItemSelected(horoscopeInfo)})
   //         onItemSelected (horoscopeInfo)
        }
    }
    //funcion de animacion
    private fun startRotationAnimastion(view: View,newlambda:()->Unit){
        view.animate().apply {
            duration = 500
            interpolator = LinearInterpolator()
            rotationBy(360f)
            withEndAction(newlambda)
            start()
        }

    }
}