package com.example.horoscapp.ui.horoscope


import androidx.lifecycle.ViewModel
import com.example.horoscapp.data.providers.HoroscopeProvider
import com.example.horoscapp.domain.model.HoroscopeInfo
import com.example.horoscapp.domain.model.HoroscopeInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor( horoscopeProvider: HoroscopeProvider):ViewModel() {

    //horoscope puede leer desde afura pero no editar _horoscope
    private var _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope:StateFlow<List<HoroscopeInfo>> = _horoscope

    init {
        _horoscope.value = horoscopeProvider.getHoroscope()

    }
}