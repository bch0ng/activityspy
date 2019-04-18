package edu.washington.bchong.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("Activity Spy", "onCreate event fired")
        if (savedInstanceState != null) {
            Log.i("Activity Spy", savedInstanceState.toString())
        }
    }

    override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity_main)
        Log.i("Activity Spy", "onStart event fired")
    }

    override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_main)
        Log.i("Activity Spy", "onResume event fired")
    }

    override fun onPause() {
        super.onPause()
        setContentView(R.layout.activity_main)
        Log.i("Activity Spy", "onPause event fired")
    }

    override fun onStop() {
        super.onStop()
        setContentView(R.layout.activity_main)
        Log.i("Activity Spy", "onStop event fired")
    }

    override fun onRestart() {
        super.onRestart()
        setContentView(R.layout.activity_main)
        Log.i("Activity Spy", "onRestart event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Activity Spy", "onDestroy event fired")
        Log.e("Activity Spy", "We’re going down, Captain!")
    }

}
