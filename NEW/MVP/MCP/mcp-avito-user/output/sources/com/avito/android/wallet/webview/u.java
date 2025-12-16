package com.avito.android.wallet.webview;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.yatatsu.powerwebview.PowerWebView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WalletWebViewView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/webview/u;", "", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f329451a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cookie_provider.e f329452b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final k f329453c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.yatatsu.powerwebview.d f329454d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final q f329455e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final WalletWebViewOpenParams f329456f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f329457g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final PowerWebView f329458h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f329459i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.modal.a f329460j;

    public u(@Y61.k View view, @Y61.k com.avito.android.cookie_provider.e eVar, @Y61.k k kVar, @Y61.k com.yatatsu.powerwebview.d dVar, @Y61.k q qVar, @Y61.k WalletWebViewOpenParams walletWebViewOpenParams, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Y41.a aVar) {
        this.f329451a = view;
        this.f329452b = eVar;
        this.f329453c = kVar;
        this.f329454d = dVar;
        this.f329455e = qVar;
        this.f329456f = walletWebViewOpenParams;
        this.f329457g = interfaceC28373a;
        View viewFindViewById = view.findViewById(R.id.wallet_webview);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yatatsu.powerwebview.PowerWebView");
        }
        PowerWebView powerWebView = (PowerWebView) viewFindViewById;
        this.f329458h = powerWebView;
        View viewFindViewById2 = view.findViewById(R.id.content_holder);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById2, R.id.wallet_webview, null, 0, 0, 28, null);
        this.f329459i = lVar;
        lVar.k(null);
        lVar.f231600j = aVar;
        powerWebView.a(dVar);
        powerWebView.requestFocus(130);
        powerWebView.setOnTouchListener(new Ha1.a(5));
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.flush();
        cookieManager.setAcceptCookie(true);
        for (com.avito.android.cookie_provider.a aVar2 : eVar.a()) {
            cookieManager.setCookie(aVar2.f126169a, aVar2.f126170b);
        }
        if (!this.f329456f.f329374g) {
            cookieManager.removeAllCookies(null);
            cookieManager.flush();
        }
        WebSettings settings = powerWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSaveFormData(false);
        settings.setAllowFileAccess(false);
        powerWebView.setFailOnSslError(true);
        k kVar2 = this.f329453c;
        powerWebView.setWebResourceErrorHandlerDelegate(kVar2);
        powerWebView.setSslErrorHandlerDelegate(kVar2);
    }
}
