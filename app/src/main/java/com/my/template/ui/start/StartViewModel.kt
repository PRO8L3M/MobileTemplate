package com.my.template.ui.start

import androidx.lifecycle.ViewModel
import com.my.template.data.repository.Repository

class StartViewModel(private val repository: Repository) : ViewModel() {

    fun getText() = repository.text
}