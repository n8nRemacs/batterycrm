package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import java.io.ByteArrayInputStream;

/* loaded from: classes8.dex */
final class ki0 extends n00 {

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private String f387168c;

    public ki0(@j.N o00 o00Var) {
        super(o00Var);
    }

    public final void a(@j.N String str) {
        this.f387168c = str;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(@j.N WebView webView, @j.N String str) {
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public final WebResourceResponse shouldInterceptRequest(@j.N WebView webView, @j.N WebResourceRequest webResourceRequest) {
        Uri url;
        return (TextUtils.isEmpty(this.f387168c) || (url = webResourceRequest.getUrl()) == null || !"mraid.js".equals(url.getLastPathSegment())) ? super.shouldInterceptRequest(webView, webResourceRequest) : new WebResourceResponse("text/javascript", Constants.ENCODING, new ByteArrayInputStream(this.f387168c.getBytes()));
    }
}
