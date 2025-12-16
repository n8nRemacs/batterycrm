package com.avito.android.credits.credit_partner_screen.webview;

import Y61.k;
import android.net.http.SslError;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import javax.inject.Inject;
import kotlin.Metadata;
import xs.C49989b;

/* compiled from: CreditPartnerWebViewErrorHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/credit_partner_screen/webview/b;", "Lcom/avito/android/credits/credit_partner_screen/webview/a;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C49989b f128845a;

    @Inject
    public b(@k C49989b c49989b) {
        this.f128845a = c49989b;
    }

    @Override // com.yatatsu.powerwebview.PowerWebView.c
    public final void a(@k WebView webView, @k WebResourceRequest webResourceRequest, @k WebResourceError webResourceError) {
        this.f128845a.a(webResourceError.getErrorCode(), webResourceError.getDescription().toString());
    }

    @Override // com.yatatsu.powerwebview.g
    public final void c(@k WebView webView, @k SslError sslError) {
        this.f128845a.a(sslError.getPrimaryError(), "SSL error");
    }
}
