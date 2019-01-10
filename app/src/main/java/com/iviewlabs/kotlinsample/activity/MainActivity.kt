package com.iviewlabs.kotlinsample.activity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.ActionBar
import android.view.MenuItem
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import com.iviewlabs.kotlinsample.R
import com.iviewlabs.kotlinsample.R.id.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main)

        //Set Custom Actionbar
        supportActionBar!!.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM)
        supportActionBar!!.setCustomView(R.layout.actionbar_layout)


        //Get Intent for Navigation
        val intentMain = this.intent.extras
        val position = intentMain.getInt("id", 0)

        //Bottom Navigation Menu Setup Method Call
        setupBottomNavigatin(position)
    }

    //Navigation Setup Method
    fun setupBottomNavigatin(i: Int) {
        if (bottom_navigation != null) {

            val menu = bottom_navigation.menu
            selectNavigation(menu.getItem(i))

            bottom_navigation.setOnNavigationItemSelectedListener {

                selectNavigation(it)
                false
            }

        }
    }

    //As Per Menu Select Fragment will be Selected
    fun selectNavigation(item: MenuItem) {
        item.isChecked = true

        when (item.itemId) {

            navigation_news -> {
               // loadFragment(NewsFragment())
            }

            navigation_deaf -> {
              //  loadFragment(DeafFragment())
            }

            navigation_events -> {
               // loadFragment(EventFragment())
            }

            navigation_home -> {
                finish()
            }
            else -> {
                Toast.makeText(this, "noting", Toast.LENGTH_SHORT).show()
            }
        }

    }

    //Selected Fragment Loaded
    fun loadFragment(fragment: Fragment): Boolean {

        if (fragment != null) {
            supportFragmentManager.beginTransaction().replace(R.id.rootLayoutMain, fragment).commit()
        }
        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}


