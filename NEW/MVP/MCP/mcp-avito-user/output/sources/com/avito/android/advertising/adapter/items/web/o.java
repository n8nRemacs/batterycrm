package com.avito.android.advertising.adapter.items.web;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.avito.android.advertising.adapter.items.buzzoola.CommercialHtmlBannerItem;
import com.avito.android.advertising.loaders.beduin.H;
import com.avito.android.util.D6;
import kotlin.Metadata;
import ob.InterfaceC44739c;

/* compiled from: CommercialWebViewController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/web/o;", "Landroid/webkit/WebViewClient;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f87694a;

    public o(q qVar) {
        this.f87694a = qVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(@Y61.l WebView webView, @Y61.l String str) {
        super.onPageCommitVisible(webView, str);
        q qVar = this.f87694a;
        if (qVar.f87699d || qVar.f87700e || str == null || str.equals("about:blank")) {
            return;
        }
        e eVar = qVar.f87698c;
        if (eVar != null) {
            CommercialHtmlBannerItem commercialHtmlBannerItem = eVar.f87667a;
            commercialHtmlBannerItem.getBanner().G();
            d dVar = eVar.f87668b;
            dVar.f87661g.h();
            H h12 = dVar.f87665k;
            if (h12 != null) {
                h12.d(new H.b.c(commercialHtmlBannerItem));
            }
            j jVar = eVar.f87669c.get();
            if (jVar != null) {
                jVar.C0();
            }
        }
        qVar.f87699d = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(@Y61.l WebView webView, @Y61.l WebResourceRequest webResourceRequest, @Y61.l WebResourceError webResourceError) {
        CharSequence description;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        q qVar = this.f87694a;
        if (qVar.f87699d) {
            return;
        }
        String string = null;
        Integer numValueOf = webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null;
        if (webResourceError != null && (description = webResourceError.getDescription()) != null) {
            string = description.toString();
        }
        qVar.d(numValueOf, string);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(@Y61.l WebView webView, @Y61.l WebResourceRequest webResourceRequest, @Y61.l WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        q qVar = this.f87694a;
        if (qVar.f87699d) {
            return;
        }
        qVar.d(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null, webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(@Y61.l WebView webView, @Y61.l RenderProcessGoneDetail renderProcessGoneDetail) {
        q qVar = this.f87694a;
        qVar.d(0, "process gone");
        WebView webView2 = qVar.f87696a;
        if (webView2 == null) {
            return true;
        }
        if (webView2.getParent() != null) {
            D6.z(webView2);
        }
        webView2.destroy();
        qVar.f87696a = null;
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(@Y61.l WebView webView, @Y61.l WebResourceRequest webResourceRequest) {
        Uri url;
        InterfaceC44739c interfaceC44739c;
        if (webResourceRequest == null || !webResourceRequest.hasGesture() || webResourceRequest.isRedirect() || (url = webResourceRequest.getUrl()) == null) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        e eVar = this.f87694a.f87698c;
        if (eVar != null) {
            d dVar = eVar.f87668b;
            CommercialHtmlBannerItem commercialHtmlBannerItem = eVar.f87667a;
            dVar.f87658d.d(commercialHtmlBannerItem.getBanner());
            h31.e<InterfaceC44739c> eVar2 = eVar.f87670d.get();
            if (eVar2 != null && (interfaceC44739c = eVar2.get()) != null) {
                interfaceC44739c.C1(commercialHtmlBannerItem.getF86895d(), eVar.f87671e);
            }
            dVar.f87660f.a(eVar.f87672f.get(), url.toString());
        }
        return true;
    }
}
