package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun log(msg:String) {
        Log.d(tag,msg)
    }
//startとresumeとpauseはセットで出てくる
    override fun onStart() {
        super.onStart()
        log("onStart")
    }

    override fun onResume() {
        super.onResume()
        log("onResume")
    }

    override fun onPause() {
        super.onPause()
        log("onPause")
    }
//ホームボタンを押すと出てくる
    override fun onStop() {
        super.onStop()
        log("onStop")
    }
//ホーム画面に戻り再度アプリ起動時に出た
    override fun onRestart() {
        super.onRestart()
        log("onRestart")
    }
//戻るボタンで出た
    override fun onDestroy() {
        super.onDestroy()
        log("onDestroy")
    }

}