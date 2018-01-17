package com.app2m.demo.mykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import showToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast(this, "我是kotlin")

    }

    fun onClickExecute(view: View?) {
        showToast(this, "clicked openMyLibraryActivity")
        println(max2(9, 77))

        val abc: Int = 33
        println(max2(abc, 7))
    }

    fun printHelloWorld(args : Array<String>) {
        println("Hello, world")
    }

    private fun max(a: Int, b: Int): Int {
        return if(a > b) a else b
    }
    private fun max2(a: Int, b: Int): Int = if (a > b) a else b

}



