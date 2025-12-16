package com.avito.android.payment.webview.mvi.view;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.payment.o;
import com.avito.android.progress_overlay.l;
import com.yatatsu.powerwebview.PowerWebView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import v60.InterfaceC49169a;

/* compiled from: WebPaymentMviView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/webview/mvi/view/a;", "", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f214930a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final o f214931b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.cookie_provider.e f214932c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC49169a f214933d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.yatatsu.powerwebview.d f214934e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final c f214935f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final PowerWebView f214936g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final l f214937h;

    public a(@k View view, @k o oVar, @k com.avito.android.cookie_provider.e eVar, @k InterfaceC49169a interfaceC49169a, @k com.yatatsu.powerwebview.d dVar, @k c cVar, @k InterfaceC28373a interfaceC28373a, @k Y41.a<G0> aVar) {
        this.f214930a = view;
        this.f214931b = oVar;
        this.f214932c = eVar;
        this.f214933d = interfaceC49169a;
        this.f214934e = dVar;
        this.f214935f = cVar;
        View viewFindViewById = view.findViewById(R.id.web_payment_webview);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yatatsu.powerwebview.PowerWebView");
        }
        PowerWebView powerWebView = (PowerWebView) viewFindViewById;
        this.f214936g = powerWebView;
        View viewFindViewById2 = view.findViewById(R.id.web_payment_content_holder);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        l lVar = new l((ViewGroup) viewFindViewById2, R.id.web_payment_webview, interfaceC28373a, 0, 0, 24, null);
        this.f214937h = lVar;
        lVar.k(null);
        lVar.f231600j = aVar;
        powerWebView.a(dVar);
        powerWebView.requestFocus(130);
        powerWebView.setOnTouchListener(new Ha1.a(4));
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.removeAllCookies(null);
        cookieManager.flush();
        for (com.avito.android.cookie_provider.a aVar2 : eVar.a()) {
            cookieManager.setCookie(aVar2.f126169a, aVar2.f126170b);
        }
        cookieManager.flush();
        WebSettings settings = powerWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSaveFormData(false);
        settings.setAllowFileAccess(false);
        powerWebView.setFailOnSslError(true);
        InterfaceC49169a interfaceC49169a2 = this.f214933d;
        powerWebView.setWebResourceErrorHandlerDelegate(interfaceC49169a2);
        powerWebView.setSslErrorHandlerDelegate(interfaceC49169a2);
        powerWebView.addJavascriptInterface(this.f214935f, "appInterface");
    }
}
