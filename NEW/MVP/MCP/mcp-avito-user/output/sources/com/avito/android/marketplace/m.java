package com.avito.android.marketplace;

import android.net.http.SslError;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FinanceMarketplaceErrorHandlerDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/marketplace/m;", "Lcom/avito/android/marketplace/l;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f185926a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final k f185927b;

    @Inject
    public m(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k k kVar) {
        this.f185926a = interfaceC28373a;
        this.f185927b = kVar;
    }

    @Override // com.yatatsu.powerwebview.PowerWebView.c
    public final void a(@Y61.k WebView webView, @Y61.k WebResourceRequest webResourceRequest, @Y61.k WebResourceError webResourceError) {
        k kVar = this.f185927b;
        this.f185926a.c(new lY.f(kVar.f185923a, kVar.f185924b, kVar.f185925c, Integer.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString()));
    }

    @Override // com.yatatsu.powerwebview.g
    public final void c(@Y61.k WebView webView, @Y61.k SslError sslError) {
        k kVar = this.f185927b;
        this.f185926a.c(new lY.f(kVar.f185923a, kVar.f185924b, kVar.f185925c, Integer.valueOf(sslError.getPrimaryError()), "SSL error", sslError.getUrl().toString()));
    }
}
