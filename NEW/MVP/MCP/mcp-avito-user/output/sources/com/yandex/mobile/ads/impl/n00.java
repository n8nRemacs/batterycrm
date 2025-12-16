package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes8.dex */
public class n00 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final o00 f388121a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final nl1 f388122b;

    @X41.j
    public n00(@Y61.k o00 o00Var) {
        this(o00Var, 0);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(@Y61.k WebView webView, @Y61.k String str) {
        super.onPageFinished(webView, str);
        this.f388121a.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(@Y61.k WebView webView, int i12, @Y61.k String str, @Y61.k String str2) {
        this.f388121a.a(i12);
    }

    @Override // android.webkit.WebViewClient
    @SuppressLint({"WebViewClientOnReceivedSslError"})
    public final void onReceivedSslError(@Y61.k WebView webView, @Y61.k SslErrorHandler sslErrorHandler, @Y61.k SslError sslError) {
        if (this.f388122b.a(webView.getContext(), sslError)) {
            sslErrorHandler.proceed();
        } else {
            this.f388121a.a(-11);
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(@Y61.k WebView webView, @Y61.k String str) {
        this.f388121a.a(webView.getContext(), str);
        return true;
    }

    public /* synthetic */ n00(o00 o00Var, int i12) {
        this(o00Var, e11.b());
    }

    @Override // android.webkit.WebViewClient
    @j.X
    public final void onReceivedError(@Y61.l WebView webView, @Y61.l WebResourceRequest webResourceRequest, @Y61.k WebResourceError webResourceError) {
        this.f388121a.a(webResourceError.getErrorCode());
    }

    @X41.j
    public n00(@Y61.k o00 o00Var, @Y61.k nl1 nl1Var) {
        this.f388121a = o00Var;
        this.f388122b = nl1Var;
    }
}
