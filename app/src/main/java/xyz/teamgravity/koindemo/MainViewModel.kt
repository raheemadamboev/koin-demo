package xyz.teamgravity.koindemo

import androidx.lifecycle.ViewModel

class MainViewModel(
    private val repository: MainRepository,
) : ViewModel() {

    fun onGetRonaldo() {
        println("raheem: ${repository.onGetRonaldo()}")
    }
}