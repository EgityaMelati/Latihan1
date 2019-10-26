package com.example.latihan1.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.latihan1.R

import com.example.myapplication.R

/**
 * A simple [Fragment] subclass.
 */
class InfoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_fargment, container, false)
    }

    companion object {
        fun newInstance () : InfoFragment {
            val fragment = InfoFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

}


