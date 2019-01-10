package com.iviewlabs.kotlinsample.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.iviewlabs.kotlinsample.R

class NoInternetFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //Load no internet fragment used when internet is not available
        val view = inflater.inflate(R.layout.fragment_no_internet, container, false)


        return view

    }
}