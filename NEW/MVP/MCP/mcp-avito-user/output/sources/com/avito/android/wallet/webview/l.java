package com.avito.android.wallet.webview;

import android.net.http.SslError;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WalletWebViewErrorHandlerDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/webview/l;", "Lcom/avito/android/wallet/webview/k;", "<init>", "()V", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l implements k {
    @Inject
    public l() {
    }

    @Override // com.yatatsu.powerwebview.g
    public final void c(@Y61.k WebView webView, @Y61.k SslError sslError) {
    }

    @Override // com.yatatsu.powerwebview.PowerWebView.c
    public final void a(@Y61.k WebView webView, @Y61.k WebResourceRequest webResourceRequest, @Y61.k WebResourceError webResourceError) {
    }
}
