package com.example.udemyfollow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

//LIFE CYCLE IN ANDROID DEV

class MainActivity : AppCompatActivity() {
//    ON CREATE
    override fun onCreate(savedInstanceState: Bundle?) {  //start the application
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"Oncreate Function",Toast.LENGTH_LONG)
        Log.i("Info","Oncreated Function Executed")

    }

//    ON START
    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"OnStart Function",Toast.LENGTH_LONG)
        Log.i("Info","OnStart Function Executed")
    }

//    ON RESUME
    override fun onResume() {  //load users data
        super.onResume()
        Toast.makeText(this,"OnResume Function",Toast.LENGTH_LONG)
        Log.i("Info","OnResume Function Executed")
    }

//    ON PAUSE
    override fun onPause() {   //save users data
        super.onPause()
    Toast.makeText(this,"OnPause Function",Toast.LENGTH_LONG)
    Log.i("Info","OnPause Function Executed")
    }

//    ON STOP
    override fun onStop() {
        super.onStop()
    Toast.makeText(this,"OnStop Function",Toast.LENGTH_LONG)
    Log.i("Info","OnStop Function Executed")
    }

//    On DESTROY
    override fun onDestroy() {  //do the last thing or close the app running
        super.onDestroy()
    Toast.makeText(this,"OnDestroy Function",Toast.LENGTH_LONG)
    Log.i("Info","OnDestroy Function Executed")
    }

}