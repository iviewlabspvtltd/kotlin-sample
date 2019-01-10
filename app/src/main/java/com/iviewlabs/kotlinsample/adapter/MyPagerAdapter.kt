package com.iviewlabs.kotlinsample.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.iviewlabs.kotlinsample.fragment.ProfileFragment
import com.iviewlabs.kotlinsample.fragment.AboutUsFragment

class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    //Find which fragment has to load from the Fragment Pager
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                ProfileFragment()
            }
            else -> AboutUsFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }

    //Set title as per fragment choosen
    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "أول"
            else -> "ثانيا"
        }
    }
}