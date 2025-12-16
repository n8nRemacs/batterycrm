package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class h2 extends jf {

    public final class a extends WebChromeClient {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<Context> f385884a;

        public a(Context context) {
            this.f385884a = new WeakReference<>(context);
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i12) {
            h2 h2Var = h2.this;
            WeakReference<Context> weakReference = this.f385884a;
            h2Var.getClass();
            c cVar = weakReference.get() instanceof c ? (c) weakReference.get() : null;
            if (cVar != null) {
                cVar.a(webView, i12);
            }
        }
    }

    public final class b extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<Context> f385886a;

        /* renamed from: b, reason: collision with root package name */
        private final ol1 f385887b = e11.b();

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final hc1 f385888c = new hc1();

        public b(Context context) {
            this.f385886a = new WeakReference<>(context);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            h2 h2Var = h2.this;
            WeakReference<Context> weakReference = this.f385886a;
            h2Var.getClass();
            c cVar = weakReference.get() instanceof c ? (c) weakReference.get() : null;
            if (cVar != null) {
                cVar.e();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            h2 h2Var = h2.this;
            WeakReference<Context> weakReference = this.f385886a;
            h2Var.getClass();
            c cVar = weakReference.get() instanceof c ? (c) weakReference.get() : null;
            if (cVar != null) {
                cVar.h();
            }
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"WebViewClientOnReceivedSslError"})
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (this.f385887b.a(webView.getContext(), sslError)) {
                sslErrorHandler.proceed();
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (fc1.b(str) || !URLUtil.isNetworkUrl(str)) {
                return this.f385888c.a(webView.getContext(), str);
            }
            return false;
        }
    }

    public interface c {
        void a(WebView webView, int i12);

        void e();

        void h();
    }

    public h2(Context context) {
        super(context);
        a(context);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void a(Context context) {
        setBackgroundColor(-1);
        setInitialScale(1);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        g();
        setScrollbarFadingEnabled(true);
        setDrawingCacheEnabled(true);
        setWebChromeClient(new a(context));
        setWebViewClient(new b(context));
    }
}
