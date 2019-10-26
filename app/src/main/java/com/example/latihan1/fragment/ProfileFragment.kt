package com.example.latihan1.fragment


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.latihan1.R

import com.example.myapplication.R
import org.jetbrains.anko.find
import org.jetbrains.anko.support.v4.toast

/**
 * A simple [Fragment] subclass.
 */
class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_profile, container, false)
        val btn: Button = view.find(R.id.detail)
        btn.setOnClickListener(this)
        return view
    }

    companion object  {
            fun newInstance(): ProfileFragment {
                val fragment = ProfileFragment ()
                val args = Bundle()
                fragment.arguments = args
                return fragment
            }
        }

    override fun onClick(v: View?){
        when (v?.id) {
            toast ("Masuk ke Detail Activity")
        }

        else -> {
            val intent = Intent(this@ProfileFragment.context, DetailProfileActivity: class.java)
            startActivity(intent)
        }
    }
    }

