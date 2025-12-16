package com.avito.android.advertising.adapter.items.web;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.adjust.sdk.Constants;
import com.avito.android.advertising.adapter.items.buzzoola.CommercialHtmlBannerItem;
import com.avito.android.advertising.loaders.beduin.H;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CommercialWebViewController.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/web/q;", "Lcom/avito/android/advertising/adapter/items/web/m;", "<init>", "()V", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public WebView f87696a;

    /* renamed from: b, reason: collision with root package name */
    public long f87697b = -1;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public e f87698c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f87699d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f87700e;

    @Inject
    public q() {
    }

    @Override // com.avito.android.advertising.adapter.items.web.m
    public final void a(long j12) {
        WebView webView = this.f87696a;
        if (webView == null) {
            return;
        }
        if (webView.getParent() != null) {
            D6.z(webView);
        }
        if (j12 != this.f87697b || j12 == -1) {
            return;
        }
        this.f87698c = null;
        this.f87697b = -1L;
        this.f87699d = false;
        this.f87700e = false;
        WebView webView2 = this.f87696a;
        if (webView2 != null) {
            D6.z(webView2);
            webView2.loadUrl("about:blank");
            webView2.clearHistory();
        }
    }

    @Override // com.avito.android.advertising.adapter.items.web.m
    public final void b(long j12, @Y61.k String str, @Y61.k e eVar) {
        this.f87698c = eVar;
        if (this.f87697b != j12) {
            this.f87697b = j12;
            this.f87699d = false;
            this.f87700e = false;
            WebView webView = this.f87696a;
            if (webView != null) {
                webView.loadDataWithBaseURL("https://www.avito.ru", str, "text/html", Constants.ENCODING, null);
                return;
            }
            return;
        }
        if (!this.f87699d) {
            if (this.f87700e) {
                d(null, null);
                return;
            }
            return;
        }
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
        this.f87699d = true;
    }

    @Override // com.avito.android.advertising.adapter.items.web.m
    @Y61.k
    public final WebView c(@Y61.k Context context, long j12) {
        WebView webView = this.f87696a;
        if (webView == null) {
            webView = new WebView(context);
            webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            webView.getSettings().setDomStorageEnabled(true);
            webView.getSettings().setJavaScriptEnabled(true);
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
            webView.setOnLongClickListener(new n());
            webView.setLongClickable(false);
            webView.setWebViewClient(new o(this));
            webView.setWebChromeClient(new p(this));
            this.f87696a = webView;
        }
        if (webView.getParent() != null) {
            D6.z(webView);
        }
        long j13 = this.f87697b;
        if (j12 != j13 && j13 != -1) {
            this.f87698c = null;
            this.f87697b = -1L;
            this.f87699d = false;
            this.f87700e = false;
            WebView webView2 = this.f87696a;
            if (webView2 != null) {
                D6.z(webView2);
                webView2.loadUrl("about:blank");
                webView2.clearHistory();
            }
        }
        return webView;
    }

    public final void d(Integer num, String str) {
        j jVar;
        e eVar = this.f87698c;
        if (eVar != null && (jVar = eVar.f87669c.get()) != null) {
            eVar.f87668b.k(jVar, eVar.f87667a, num, str);
        }
        this.f87700e = true;
    }
}
