package com.avito.android.car_navigator.presentation;

import Dm.InterfaceC13414a;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adjust.sdk.Constants;
import com.avito.android.util.X2;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CarNavigatorWebViewController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/car_navigator/presentation/e;", "Landroid/webkit/WebViewClient;", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f115244a;

    public e(g gVar) {
        this.f115244a = gVar;
    }

    public final boolean a(Uri uri) {
        X2.f318778a.g("CarNavigatorWebViewControllerImpl", "shouldOverrideUrlLoading :" + uri);
        boolean z12 = L.f(uri.getScheme(), "http") || L.f(uri.getScheme(), Constants.SCHEME);
        g gVar = this.f115244a;
        boolean z13 = gVar.f115253h;
        if (!z13 && !z12) {
            return g.c(gVar, uri);
        }
        if (z13) {
            return g.c(gVar, uri);
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(@Y61.k WebView webView, @Y61.k String str) {
        X2.f318778a.g("CarNavigatorWebViewControllerImpl", "onPageFinished :".concat(str));
        g gVar = this.f115244a;
        gVar.f115253h = true;
        gVar.f115247b.invoke(InterfaceC13414a.f.f3424a);
        gVar.f115249d.a(Uri.parse(str));
    }

    @Override // android.webkit.WebViewClient
    @InterfaceC42830m
    public final void onReceivedError(@Y61.k WebView webView, int i12, @Y61.k String str, @Y61.k String str2) {
        g gVar = this.f115244a;
        if (str2.equals(gVar.f115255j)) {
            gVar.f115247b.invoke(InterfaceC13414a.g.f3425a);
            X2.f318778a.g("CarNavigatorWebViewControllerImpl", "onReceivedError :" + i12 + ' ' + str);
        }
    }

    @Override // android.webkit.WebViewClient
    @InterfaceC42830m
    public final boolean shouldOverrideUrlLoading(@Y61.k WebView webView, @Y61.k String str) {
        return a(Uri.parse(str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(@Y61.k WebView webView, @Y61.k WebResourceRequest webResourceRequest) {
        return a(webResourceRequest.getUrl());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(@Y61.k WebView webView, @Y61.k WebResourceRequest webResourceRequest, @Y61.k WebResourceError webResourceError) {
        g gVar = this.f115244a;
        String str = gVar.f115255j;
        if (str != null && L.f(webResourceRequest.getUrl(), Uri.parse(str))) {
            gVar.f115247b.invoke(InterfaceC13414a.g.f3425a);
            X2.f318778a.g("CarNavigatorWebViewControllerImpl", "onReceivedError :" + webResourceError.getErrorCode() + ' ' + ((Object) webResourceError.getDescription()));
        }
    }
}
