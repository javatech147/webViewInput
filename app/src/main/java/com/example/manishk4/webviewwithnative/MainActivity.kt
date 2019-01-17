package com.example.manishk4.webviewwithnative

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.webkit.WebViewClient
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnSubmitClickListener {
    private val TAG = MainActivity::class.java.simpleName


    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()
        webView.loadUrl("file:///android_asset/sample.html")
        webView.addJavascriptInterface(WebAppInterface(this, this), "Android")
    }

    override fun onSubmitButtonClick(email: String, password: String) {
        Log.d(TAG, "Email : $email  -- Password $password")
        Toast.makeText(this, "Email : $email\nPassword : $password", Toast.LENGTH_SHORT).show()
        textView.text = "Email : $email -- Password : $password"
    }

}
