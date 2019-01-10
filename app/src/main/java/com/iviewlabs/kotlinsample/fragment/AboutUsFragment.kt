package com.iviewlabs.kotlinsample.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.iviewlabs.kotlinsample.R
import kotlinx.android.synthetic.main.fragment_aboutus.view.*


class AboutUsFragment : Fragment()
{
    //Second fragment of Info Activity
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_aboutus,container,false)

        view.image_second_frag.setImageResource(R.drawable.lantana_7_logo)
        view.text_info_content_two.setText(R.string.sample_text)

        return view
    }
}