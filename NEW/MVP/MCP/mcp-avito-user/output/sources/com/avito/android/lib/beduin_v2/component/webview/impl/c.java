package com.avito.android.lib.beduin_v2.component.webview.impl;

import Y61.l;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: WebViewWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/webview/impl/c;", "Landroid/webkit/WebViewClient;", "_design-modules_beduin-v2_renderer_component_webview"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public boolean f175981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f175982b;

    public c(e eVar) {
        this.f175982b = eVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(@l WebView webView, @l String str) {
        Y41.a<G0> aVar;
        if (this.f175981a) {
            return;
        }
        e eVar = this.f175982b;
        b bVar = eVar.f175988f;
        if (bVar != null && (aVar = bVar.f175972f) != null) {
            aVar.invoke();
        }
        eVar.f175984b.setVisibility(0);
        eVar.f175985c.setVisibility(8);
        eVar.f175987e.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(@l WebView webView, @l String str, @l Bitmap bitmap) {
        this.f175981a = false;
        e eVar = this.f175982b;
        b bVar = eVar.f175988f;
        eVar.a(bVar != null ? bVar.f175970d : null);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(@l WebView webView, @l WebResourceRequest webResourceRequest, @l WebResourceError webResourceError) {
        Y41.l<Boolean, G0> lVar;
        G0 g02;
        Y41.l<Boolean, G0> lVar2;
        this.f175981a = true;
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        e eVar = this.f175982b;
        b bVar = eVar.f175988f;
        if (bVar != null && bVar.f175969c != null) {
            eVar.f175985c.setVisibility(8);
            eVar.f175984b.setVisibility(8);
            eVar.f175987e.setVisibility(0);
            b bVar2 = eVar.f175988f;
            if (bVar2 == null || (lVar2 = bVar2.f175973g) == null) {
                g02 = null;
            } else {
                lVar2.invoke(Boolean.TRUE);
                g02 = G0.f406611a;
            }
            if (g02 != null) {
                return;
            }
        }
        b bVar3 = eVar.f175988f;
        if (bVar3 == null || (lVar = bVar3.f175973g) == null) {
            return;
        }
        lVar.invoke(Boolean.FALSE);
        G0 g03 = G0.f406611a;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(@l WebView webView, @l WebResourceRequest webResourceRequest) {
        Uri url;
        String string;
        Y41.l<String, G0> lVar;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
            return false;
        }
        e eVar = this.f175982b;
        Y41.l<? super Uri, Boolean> lVar2 = eVar.f175989g;
        if (!(lVar2 != null ? lVar2.invoke(webResourceRequest.getUrl()).booleanValue() : false)) {
            return false;
        }
        b bVar = eVar.f175988f;
        if (bVar != null && (lVar = bVar.f175971e) != null) {
            lVar.invoke(string);
        }
        return true;
    }
}
