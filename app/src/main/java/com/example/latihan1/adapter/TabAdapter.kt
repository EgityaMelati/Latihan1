package com.example.latihan1.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.latihan1.fragment.Fragment1
import com.example.latihan1.fragment.Fragment2

class TabAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private val pages = listOf(
        Fragment1(),
        Fragment2()
    )

    override fun getItem(position: Int): Fragment {
        return pages [position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "CHAT"
            else -> "PANGGILAN"
        }
    }
}