package com.example.weatherapp

import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by Shaheer cs on 24/07/2024.
 */
@HiltViewModel
class MainActivityViewModel @Inject constructor() : ViewModel() {

    private val _closeEvent = MutableSharedFlow<Unit>()
    val closeFlow = _closeEvent.asSharedFlow()

    init {
        viewModelScope.launch {
            _closeEvent.emit(Unit)
        }
    }
}