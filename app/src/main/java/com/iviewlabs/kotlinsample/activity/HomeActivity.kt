package com.iviewlabs.kotlinsample.activity

import android.app.Activity
import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.Window
import android.view.WindowManager
import com.iviewlabs.kotlinsample.R
import kotlinx.android.synthetic.main.activity_home.*

open class HomeActivity : Activity() {

    private var mSnackBar: Snackbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //For full screen activity
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_home)

      /*  //News Circle Button Click Event
        circle_news.setOnClickListener {
            val intentToNews = Intent(this, MainActivity::class.java)
            intentToNews.putExtra("id", 2);
            startActivity(intentToNews)
        }


        //Deaf Circle Button Click Event
        circle_deaf.setOnClickListener {
            val intentToDeafPeople = Intent(this, MainActivity::class.java)
            intentToDeafPeople.putExtra("id", 1)
            startActivity(intentToDeafPeople)
        }


        //Event Circle Button Click Event
        circle_events.setOnClickListener {
            val intentToEvent = Intent(this, MainActivity::class.java)
            intentToEvent.putExtra("id", 0)
            startActivity(intentToEvent)
        }

        //Contact Circle Button Click Event
        circle_contact.setOnClickListener {
            val intentToContact: Intent = Intent(this, ContactActivity::class.java)
            startActivity(intentToContact)
        }
*/
        //Info Circle Button Click Event
        circle_info.setOnClickListener {
            val intentToInfo = Intent(this, InfoActivity::class.java)
            startActivity(intentToInfo)
        }

        //Top Right Corner Share Button Click Event
      /*  text_share.setOnClickListener {

            val shareBody = "Click here to download سمعي http://18.223.204.243/?d=t"

            val sharingIntent = Intent(android.content.Intent.ACTION_SEND)
            sharingIntent.setType("plain/text")
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Download سمعي")
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody)
            startActivity(Intent.createChooser(sharingIntent, "Choose Share Option"))

        }
*/
        //Set Custome Font for Footer Text
        val face = Typeface.createFromAsset(this.assets, "fonts/gillsansstd_light.otf")
        text_footer.setTypeface(face)

    }
}
