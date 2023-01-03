package com.afsal.chat.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.afsal.chat.R
import com.afsal.chat.databinding.FragmentCallsBinding


class CallsFragment  :BaseFragment<FragmentCallsBinding>(
    FragmentCallsBinding::inflate) {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calls, container, false)
    }


}