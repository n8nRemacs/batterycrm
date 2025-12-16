package com.yandex.mobile.ads.impl;

import android.webkit.WebView;

/* loaded from: classes8.dex */
final class vp1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ WebView f390963b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f390964c;

    public vp1(WebView webView, String str) {
        this.f390963b = webView;
        this.f390964c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f390963b.loadUrl(this.f390964c);
    }
}
