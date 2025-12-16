package com.avito.android.advertising.adapter.items.web;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.Metadata;

/* compiled from: CommercialWebViewController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/web/p;", "Landroid/webkit/WebChromeClient;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f87695a;

    public p(q qVar) {
        this.f87695a = qVar;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(@Y61.l WebView webView, int i12) {
        e eVar;
        super.onProgressChanged(webView, i12);
        q qVar = this.f87695a;
        if (qVar.f87700e || (eVar = qVar.f87698c) == null || i12 != 100) {
            return;
        }
        eVar.f87667a.getBannerInfo().f87893x = Integer.valueOf(i12);
    }
}
