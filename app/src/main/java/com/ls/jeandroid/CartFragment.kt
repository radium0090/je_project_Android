package com.ls.jeandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView

class CartFragment: BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        val v = inflater.inflate(R.layout.fragment_cart, container, false)
        val mWebView: WebView = v.findViewById(R.id.cart_webview) as WebView
        initWebView(mWebView)
        mWebView.loadUrl("https://japee.tokyo/cart/")
        return v
    }
}