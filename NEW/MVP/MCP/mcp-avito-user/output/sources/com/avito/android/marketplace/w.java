package com.avito.android.marketplace;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.Metadata;

/* compiled from: FinanceMarketplaceWebView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/marketplace/w;", "Landroid/webkit/WebChromeClient;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class w extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f185961a;

    public w(A a12) {
        this.f185961a = a12;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(@Y61.l WebView webView, @Y61.k ValueCallback<Uri[]> valueCallback, @Y61.l WebChromeClient.FileChooserParams fileChooserParams) {
        this.f185961a.f185840h.invoke(valueCallback);
        return true;
    }
}
