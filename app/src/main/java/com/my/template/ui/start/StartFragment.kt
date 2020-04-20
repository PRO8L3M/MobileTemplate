package com.my.template.ui.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.my.template.R
import com.my.template.common.BaseFragment
import com.my.template.ext.toast
import org.koin.androidx.viewmodel.ext.android.viewModel

class StartFragment : BaseFragment() {

    private val viewModel: StartViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textFromRepo = viewModel.getText()
        toast(textFromRepo)
    }
}
