package com.iviewlabs.kotlinsample.activity

import android.annotation.SuppressLint
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.iviewlabs.kotlinsample.R
import com.iviewlabs.kotlinsample.utils.ConnectivityReceiver
import com.iviewlabs.kotlinsample.fragment.NoInternetFragment

@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity(), ConnectivityReceiver.ConnectivityReceiverListener {

    private var mSnackBar: Snackbar? = null
    private val receiver = ConnectivityReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Register Broadcast Receive
        this.registerReceiver(receiver,
                IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION))
    }


    private fun showMessage(isConnected: Boolean) {

        //Is Internet Connected
        if (!isConnected) {

            val messageToUser = "You are offline now." //TODO
            //SnackBar to Show Message if user is offline
            mSnackBar = Snackbar.make(findViewById(R.id.rootLayoutMain), messageToUser, Snackbar.LENGTH_LONG) //Assume "rootLayout" as the root layout of every activity.
            mSnackBar?.duration = Snackbar.LENGTH_INDEFINITE
            mSnackBar?.show()
            //Change fragment with no internet fragment when internet is not available
            supportFragmentManager.beginTransaction().replace(R.id.rootLayoutMain, NoInternetFragment()).commit()

        } else {

            //If user is online Snackbar dismissed
            mSnackBar?.dismiss()
        }

    }

    override fun onResume() {
        super.onResume()
        ConnectivityReceiver.connectivityReceiverListener = this
    }


    override fun onDestroy() {
        super.onDestroy()
        this.unregisterReceiver(receiver)
    }
    /**
     * Callback will be called when there is change
     */
    override fun onNetworkConnectionChanged(isConnected: Boolean) {
        showMessage(isConnected)
    }
}