package com.app2m.demo.mykotlin

import showToast
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast(this, "我是kotlin")
    }

    fun openMyLibraryActivity(view: View?) {
        showToast(this, "clicked openMyLibraryActivity")
    }
}
