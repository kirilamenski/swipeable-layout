package com.ansgar.swipeableview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        swipeable_view.bottomIv = image_view
        swipeable_view.editText = edit_text
        swipeable_view.rightIVPosition = 500
    }
}
