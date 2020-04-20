package com.jozze.neostore

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers

class MainViewModel(application: Application) : AndroidViewModel(application) {

    val getTodo = liveData(Dispatchers.IO) {
        emit(TodoRepository().getTodo(1))
    }
}