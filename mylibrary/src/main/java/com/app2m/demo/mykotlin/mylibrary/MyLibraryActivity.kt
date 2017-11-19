package com.app2m.demo.mykotlin.mylibrary

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MyLibraryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        DataBindingUtil.setContentView<>(this, R.layout.activity_my_library)
        setContentView(R.layout.activity_my_library)
    }
}
