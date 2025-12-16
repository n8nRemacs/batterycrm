package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* loaded from: classes8.dex */
public final class yo1 extends o6 {
    @SuppressLint({"SetJavaScriptEnabled"})
    public yo1(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
