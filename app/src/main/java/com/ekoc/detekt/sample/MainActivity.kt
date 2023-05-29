package com.ekoc.detekt.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ContextOrderSample().foo("", this)
        EmptyClass()
        WildCardImportClass()
    }
}
