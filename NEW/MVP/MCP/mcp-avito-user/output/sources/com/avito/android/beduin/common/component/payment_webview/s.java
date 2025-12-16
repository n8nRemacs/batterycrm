package com.avito.android.beduin.common.component.payment_webview;

import android.net.http.SslError;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.avito.android.beduin.common.component.payment_webview.C28793a;
import com.yatatsu.powerwebview.PowerWebView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: WebPaymentErrorHandlerDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_webview/s;", "Lcom/yatatsu/powerwebview/PowerWebView$c;", "Lcom/yatatsu/powerwebview/g;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s implements PowerWebView.c, com.yatatsu.powerwebview.g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.q<Integer, String, String, G0> f101894a;

    /* JADX WARN: Multi-variable type inference failed */
    public s(@Y61.k Y41.q<? super Integer, ? super String, ? super String, G0> qVar) {
        this.f101894a = qVar;
    }

    @Override // com.yatatsu.powerwebview.PowerWebView.c
    public final void a(@Y61.k WebView webView, @Y61.k WebResourceRequest webResourceRequest, @Y61.k WebResourceError webResourceError) {
        ((C28793a.e) this.f101894a).invoke(Integer.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // com.yatatsu.powerwebview.g
    public final void c(@Y61.k WebView webView, @Y61.k SslError sslError) {
        ((C28793a.e) this.f101894a).invoke(Integer.valueOf(sslError.getPrimaryError()), "SSL error", sslError.getUrl());
    }
}
