package com.example.manishk4.webviewwithnative

import android.content.Context
import android.webkit.JavascriptInterface

/** Instantiate the interface and set the context  */
class WebAppInterface(private val mContext: Context, private val onSubmitClickListener: OnSubmitClickListener) {

    @JavascriptInterface
    fun formData(email: String, password: String) {
        onSubmitClickListener.onSubmitButtonClick(email, password)
    }
}