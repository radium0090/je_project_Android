package com.ls.jeandroid


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class HomeFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        val v = inflater.inflate(R.layout.fragment_home, container, false)
        val mWebView: WebView = v.findViewById(R.id.home_webview) as WebView
        mWebView.webViewClient = WebViewClient()
        mWebView.loadUrl("https://quinz.me")
        return v
    }
}