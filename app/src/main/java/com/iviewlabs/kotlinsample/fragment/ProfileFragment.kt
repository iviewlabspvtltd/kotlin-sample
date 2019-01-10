package com.iviewlabs.kotlinsample.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.iviewlabs.kotlinsample.R

import kotlinx.android.synthetic.main.fragment_profile.view.*

class ProfileFragment : Fragment() {
    //First Fragment of Info Activity
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        view.blurred.setBlurredImage(R.drawable.image_author)
        view.small_circle_image.setImageResource(R.drawable.image_author)
        view.text_info_content_one.setText(R.string.sample_text)
        view.text_profile.setText("جيمس بوند")

        return view
    }

}