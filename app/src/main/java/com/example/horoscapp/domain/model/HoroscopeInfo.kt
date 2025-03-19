package com.example.horoscapp.domain.model

import com.example.horoscapp.R

sealed class HoroscopeInfo (val img:Int , val name:Int){
    //lo mismp que object pero ayuda a depurar mejor y en un log muestra toda la informacion
    data object Aries:HoroscopeInfo(R.drawable.aries,R.string.aries)
    data object Taurus:HoroscopeInfo(R.drawable.tauro,R.string.taurus)
    data object Gemini:HoroscopeInfo(R.drawable.geminis,R.string.gemini)
    data object Cancer:HoroscopeInfo(R.drawable.cancer,R.string.cancer)
    data object Leo:HoroscopeInfo(R.drawable.leo,R.string.leo)
    data object Virgo:HoroscopeInfo(R.drawable.virgo,R.string.virgo)
    data object Libra:HoroscopeInfo(R.drawable.libra,R.string.libra)
    data object Scorpio:HoroscopeInfo(R.drawable.escorpio,R.string.scorpio)
    data object Saggitarius:HoroscopeInfo(R.drawable.sagitario,R.string.sagitario)
    data object Capricorn:HoroscopeInfo(R.drawable.capricornio,R.string.capricornio)
    data object Aquarius:HoroscopeInfo(R.drawable.aquario,R.string.aquario)
    data object Piscis:HoroscopeInfo(R.drawable.piscis,R.string.piscis)
}