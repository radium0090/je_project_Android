package com.ls.jeandroid


import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class HomeFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        val v = inflater.inflate(R.layout.fragment_home, container, false)
        val mWebView: WebView = v.findViewById(R.id.home_webview) as WebView
        mWebView.webViewClient = WebViewClient()

        setWebView(mWebView)
        val urlStr = activity?.intent?.getStringExtra("url")
        Log.d("ssssssssss", urlStr)
        //"https://www.digicafe.jp"
        mWebView.loadUrl(urlStr)

        return v
    }

    @SuppressLint("SetJavaScriptEnabled")
    fun setWebView(webView: WebView) {
        val setting = webView.settings
        setting.javaScriptEnabled = true
        setting.javaScriptCanOpenWindowsAutomatically = true
        setting.allowFileAccess = true// 设置允许访问文件数据
        setting.setSupportZoom(true)//支持缩放
        setting.javaScriptCanOpenWindowsAutomatically = true
        setting.cacheMode = WebSettings.LOAD_NO_CACHE
        setting.domStorageEnabled = true
        setting.databaseEnabled = true
    }
}