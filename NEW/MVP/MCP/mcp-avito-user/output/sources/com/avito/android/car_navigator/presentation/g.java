package com.avito.android.car_navigator.presentation;

import Am.InterfaceC13051a;
import Dm.InterfaceC13414a;
import Y41.l;
import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.avito.android.car_navigator.link.CarNavigatorSettings;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.x;
import com.avito.android.util.X2;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CarNavigatorWebViewController.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/car_navigator/presentation/g;", "Lcom/avito/android/car_navigator/presentation/d;", "_avito_car-navigator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CarNavigatorSettings f115246a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<InterfaceC13414a, G0> f115247b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x f115248c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13051a f115249d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final CookieManager f115250e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cookie_provider.e f115251f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public WebView f115252g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f115253h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f115254i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public String f115255j;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@Y61.k CarNavigatorSettings carNavigatorSettings, @Y61.k l<? super InterfaceC13414a, G0> lVar, @Y61.k x xVar, @Y61.k InterfaceC13051a interfaceC13051a, @Y61.k CookieManager cookieManager, @Y61.k com.avito.android.cookie_provider.e eVar) {
        this.f115246a = carNavigatorSettings;
        this.f115247b = lVar;
        this.f115248c = xVar;
        this.f115249d = interfaceC13051a;
        this.f115250e = cookieManager;
        this.f115251f = eVar;
    }

    public static final boolean c(g gVar, Uri uri) {
        gVar.getClass();
        X2.f318778a.g("CarNavigatorWebViewControllerImpl", "openLink uri:" + uri);
        String scheme = uri.getScheme();
        CarNavigatorSettings carNavigatorSettings = gVar.f115246a;
        boolean z12 = false;
        l<InterfaceC13414a, G0> lVar = gVar.f115247b;
        if (scheme != null && scheme.hashCode() == -1014226716 && scheme.equals("ru.avito")) {
            DeepLink deepLinkE = gVar.f115248c.e(uri);
            if (!(deepLinkE instanceof NoMatchLink)) {
                lVar.invoke(new InterfaceC13414a.d(deepLinkE, null, 2, null));
                if (!carNavigatorSettings.f115193d) {
                    lVar.invoke(new InterfaceC13414a.C0189a(false, 1, null));
                }
                z12 = true;
            }
            return z12;
        }
        if (gVar.f115254i) {
            return true;
        }
        lVar.invoke(new InterfaceC13414a.e(uri));
        if (carNavigatorSettings.f115193d) {
            return true;
        }
        lVar.invoke(new InterfaceC13414a.C0189a(false, 1, null));
        gVar.f115254i = true;
        return true;
    }

    @Override // com.avito.android.car_navigator.presentation.d
    public final void Q7(@Y61.k WebView webView) {
        this.f115252g = webView;
        CarNavigatorSettings carNavigatorSettings = this.f115246a;
        if (carNavigatorSettings.f115192c || carNavigatorSettings.f115191b) {
            CookieManager cookieManager = this.f115250e;
            cookieManager.setAcceptCookie(true);
            for (com.avito.android.cookie_provider.a aVar : this.f115251f.getCookies()) {
                cookieManager.setCookie(aVar.f126169a, aVar.f126170b);
            }
        }
    }

    @Override // com.avito.android.car_navigator.presentation.d
    public final void a(@Y61.k String str) {
        this.f115255j = str;
        WebView webView = this.f115252g;
        if (webView != null) {
            webView.setWebViewClient(new e(this));
            webView.addJavascriptInterface(new b(this.f115249d, new f(this)), "appInterface");
            webView.loadUrl(str);
        }
    }

    @Override // com.avito.android.car_navigator.presentation.d
    public final void b() {
        if (this.f115246a.f115192c) {
            this.f115250e.removeAllCookies(null);
        }
        WebView webView = this.f115252g;
        if (webView != null) {
            webView.stopLoading();
        }
        this.f115252g = null;
    }

    @Override // com.avito.android.car_navigator.presentation.d
    public final boolean i0() {
        WebView webView = this.f115252g;
        if (!(webView != null ? webView.canGoBack() : false)) {
            return false;
        }
        WebView webView2 = this.f115252g;
        if (webView2 != null) {
            webView2.goBack();
        }
        return true;
    }
}
