package com.ekoc.detekt.sample

import android.content.Context

class ContextOrderSample {

    //FAIL
    fun foo(bar: String, context: Context){

    }

    //SUCCESS
    fun foo(context: Context, bar: String){

    }
}
