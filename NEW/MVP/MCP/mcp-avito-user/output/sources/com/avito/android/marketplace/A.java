package com.avito.android.marketplace;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.yatatsu.powerwebview.PowerWebView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FinanceMarketplaceWebView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/marketplace/A;", "", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f185833a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cookie_provider.e f185834b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l f185835c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.yatatsu.powerwebview.d f185836d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final s f185837e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f185838f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final FinanceMarketplaceOpenParams f185839g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Y41.l<? super ValueCallback<Uri[]>, G0> f185840h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final PowerWebView f185841i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f185842j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.modal.a f185843k;

    public A(@Y61.k View view, @Y61.k com.avito.android.cookie_provider.e eVar, @Y61.k l lVar, @Y61.k com.yatatsu.powerwebview.d dVar, @Y61.k s sVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k FinanceMarketplaceOpenParams financeMarketplaceOpenParams, @Y61.k Y41.l lVar2, @Y61.k Y41.a aVar) {
        this.f185833a = view;
        this.f185834b = eVar;
        this.f185835c = lVar;
        this.f185836d = dVar;
        this.f185837e = sVar;
        this.f185838f = interfaceC28373a;
        this.f185839g = financeMarketplaceOpenParams;
        this.f185840h = lVar2;
        View viewFindViewById = view.findViewById(R.id.finance_marketplace_webview);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yatatsu.powerwebview.PowerWebView");
        }
        PowerWebView powerWebView = (PowerWebView) viewFindViewById;
        this.f185841i = powerWebView;
        View viewFindViewById2 = view.findViewById(R.id.content_holder);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar3 = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById2, R.id.finance_marketplace_webview, interfaceC28373a, 0, 0, 24, null);
        this.f185842j = lVar3;
        lVar3.k(null);
        lVar3.f231600j = aVar;
        powerWebView.a(dVar);
        powerWebView.requestFocus(130);
        powerWebView.setOnTouchListener(new Ha1.a(2));
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.flush();
        cookieManager.setAcceptCookie(true);
        for (com.avito.android.cookie_provider.a aVar2 : eVar.a()) {
            cookieManager.setCookie(aVar2.f126169a, aVar2.f126170b);
        }
        if (!this.f185839g.f185875h) {
            cookieManager.removeAllCookies(null);
            cookieManager.flush();
        }
        powerWebView.setWebChromeClient(new w(this));
        WebSettings settings = powerWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSaveFormData(false);
        settings.setAllowFileAccess(false);
        powerWebView.setFailOnSslError(true);
        l lVar4 = this.f185835c;
        powerWebView.setWebResourceErrorHandlerDelegate(lVar4);
        powerWebView.setSslErrorHandlerDelegate(lVar4);
    }
}
