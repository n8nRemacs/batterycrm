package com.avito.android.webview;

import HP0.a;
import Mu.InterfaceC14529b;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.webkit.CookieManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.Toolbar;
import com.adjust.sdk.Constants;
import com.avito.android.CalledFrom;
import com.avito.android.R;
import com.avito.android.Y2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.avito.android.remote.interceptor.InterfaceC34316x0;
import com.avito.android.util.C35769c6;
import com.avito.android.util.C35777d6;
import com.avito.android.util.C35835l0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.TypefaceType;
import com.avito.android.util.U;
import com.avito.android.util.X2;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WebViewPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/webview/u;", "Lcom/avito/android/webview/p;", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class u implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f329645a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public Uri f329646b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final WebViewLinkSettings f329647c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final CalledFrom f329648d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final CookieManager f329649e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cookie_provider.e f329650f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final FP0.a f329651g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Y2 f329652h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14529b f329653i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f329654j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final U f329655k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34316x0 f329656l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Lq.d f329657m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final GP0.a f329658n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public D f329659o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public WebViewActivity f329660p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f329661q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f329662r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f329663s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f329664t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f329665u;

    /* compiled from: WebViewPresenter.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/webview/u$a", "Landroid/webkit/WebViewClient;", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends WebViewClient {
        public a() {
        }

        public final boolean a(Uri uri) {
            X2.f318778a.g("WebViewPresenter", "shouldOverrideUrlLoading :" + uri);
            boolean z12 = L.f(uri.getScheme(), "http") || L.f(uri.getScheme(), Constants.SCHEME);
            boolean zF2 = L.f(uri.getHost(), "play.google.com");
            u uVar = u.this;
            if ((!zF2 && !L.f(uri.getHost(), "apps.rustore.ru")) || !uVar.f329647c.f133876k) {
                boolean z13 = uVar.f329663s;
                boolean zH2 = (z13 || !uVar.f329647c.f133875j || z12) ? (z13 && !(uVar.f329664t && z12)) ? u.h(uVar, uri) : false : u.h(uVar, uri);
                if (uVar.f329664t) {
                    uVar.f329664t = false;
                }
                return zH2;
            }
            WebViewActivity webViewActivity = uVar.f329660p;
            if (webViewActivity != null) {
                webViewActivity.a2(uri);
            }
            WebViewActivity webViewActivity2 = uVar.f329660p;
            if (webViewActivity2 != null) {
                webViewActivity2.finish();
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(@Y61.k WebView webView, @Y61.k String str) {
            D d12;
            X2.f318778a.g("WebViewPresenter", "onPageFinished :".concat(str));
            u uVar = u.this;
            if (uVar.f329647c.f133877l && (d12 = uVar.f329659o) != null) {
                String title = webView.getTitle();
                if (title == null) {
                    title = "";
                }
                Toolbar toolbar = d12.f329514d;
                if (toolbar != null) {
                    Context context = toolbar.getContext();
                    TypefaceType typefaceType = TypefaceType.f318743c;
                    int i12 = C35777d6.f318863a;
                    SpannableString spannableStringValueOf = SpannableString.valueOf(title);
                    spannableStringValueOf.setSpan(new C35769c6(androidx.core.content.res.i.c(C35835l0.j(R.attr.fontRegular, context), context)), 0, spannableStringValueOf.length(), 33);
                    toolbar.setTitle(spannableStringValueOf);
                }
            }
            if (uVar.f329647c.f133870e || uVar.f329662r) {
                return;
            }
            uVar.f329662r = false;
            uVar.f329663s = true;
            D d13 = uVar.f329659o;
            if (d13 != null) {
                d13.f329517g.b();
            }
            uVar.f329651g.a(uVar.f329646b);
        }

        @Override // android.webkit.WebViewClient
        @InterfaceC42830m
        public final void onReceivedError(@Y61.k WebView webView, int i12, @Y61.k String str, @Y61.k String str2) {
            u uVar = u.this;
            if (str2.equals(uVar.f329646b.toString())) {
                uVar.f329662r = true;
                D d12 = uVar.f329659o;
                if (d12 != null) {
                    d12.b();
                }
                X2.f318778a.g("WebViewPresenter", "onReceivedError :" + i12 + ' ' + str);
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
            Uri url = webResourceRequest.getUrl();
            u uVar = u.this;
            if (L.f(url, uVar.f329646b)) {
                uVar.f329662r = true;
                D d12 = uVar.f329659o;
                if (d12 != null) {
                    d12.b();
                }
                X2.f318778a.g("WebViewPresenter", "onReceivedError :" + webResourceError.getErrorCode() + ' ' + ((Object) webResourceError.getDescription()));
            }
        }
    }

    /* compiled from: WebViewPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHP0/a;", "it", "Lkotlin/G0;", "invoke", "(LHP0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<HP0.a, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(HP0.a aVar) {
            HP0.a aVar2 = aVar;
            boolean zEquals = aVar2.equals(a.b.f7081a);
            u uVar = u.this;
            if (zEquals) {
                WebViewActivity webViewActivity = uVar.f329660p;
                if (webViewActivity != null) {
                    webViewActivity.finish();
                }
            } else if (aVar2.equals(a.C0406a.f7080a)) {
                WebViewActivity webViewActivity2 = uVar.f329660p;
                if (webViewActivity2 != null) {
                    webViewActivity2.setResult(-1, new Intent().putExtra("should_refresh_screen", true));
                    webViewActivity2.finish();
                }
            } else if (aVar2 instanceof a.d) {
                WebViewActivity webViewActivity3 = uVar.f329660p;
                if (webViewActivity3 != null) {
                    a.d dVar = (a.d) aVar2;
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.SUBJECT", dVar.f7084b);
                    intent.putExtra("android.intent.extra.TEXT", dVar.f7085c);
                    webViewActivity3.startActivity(Intent.createChooser(intent, dVar.f7083a));
                }
            } else if (aVar2 instanceof a.c) {
                uVar.f329655k.a(((a.c) aVar2).f7082a);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public u(@Y61.k com.avito.android.deep_linking.x xVar, @Y61.k Uri uri, @Y61.k WebViewLinkSettings webViewLinkSettings, @Y61.l CalledFrom calledFrom, @Y61.k CookieManager cookieManager, @Y61.k com.avito.android.cookie_provider.e eVar, @Y61.k FP0.a aVar, @Y61.k Y2 y22, @Y61.k InterfaceC14529b interfaceC14529b, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k U u12, @Y61.k InterfaceC34316x0 interfaceC34316x0, @Y61.k Lq.d dVar, @Y61.k GP0.a aVar2) {
        this.f329645a = xVar;
        this.f329646b = uri;
        this.f329647c = webViewLinkSettings;
        this.f329648d = calledFrom;
        this.f329649e = cookieManager;
        this.f329650f = eVar;
        this.f329651g = aVar;
        this.f329652h = y22;
        this.f329653i = interfaceC14529b;
        this.f329654j = interfaceC35745a5;
        this.f329655k = u12;
        this.f329656l = interfaceC34316x0;
        this.f329657m = dVar;
        this.f329658n = aVar2;
        kotlin.reflect.n<Object> nVar = Y2.f67590f[0];
        if (((Boolean) y22.f67591b.a().invoke()).booleanValue()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean h(com.avito.android.webview.u r7, android.net.Uri r8) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.webview.u.h(com.avito.android.webview.u, android.net.Uri):boolean");
    }

    public static final void i(u uVar, String str) {
        uVar.getClass();
        X2.f318778a.g("WebViewPresenter", "openUrlInWebView :" + str);
        uVar.f329664t = true;
        D d12 = uVar.f329659o;
        if (d12 != null) {
            d12.f329515e.loadUrl(str);
        }
    }

    @Override // com.avito.android.webview.p
    public final void K() {
        if (this.f329647c.f133868c) {
            this.f329649e.removeAllCookies(null);
        }
        D d12 = this.f329659o;
        if (d12 != null) {
            d12.a(null);
        }
        this.f329659o = null;
        io.reactivex.rxjava3.internal.observers.y yVar = this.f329661q;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f329661q = null;
    }

    @Override // com.avito.android.webview.x.a
    public final void a() {
        WebViewActivity webViewActivity = this.f329660p;
        if (webViewActivity != null) {
            webViewActivity.finish();
        }
    }

    @Override // com.avito.android.webview.p
    public final void b(@Y61.k Uri uri) {
        this.f329646b = uri;
        j0();
    }

    @Override // com.avito.android.webview.p
    public final void c(@Y61.k D d12) {
        this.f329659o = d12;
        d12.a(new r(1, this, u.class, "onScrolled", "onScrolled(Ljava/lang/String;)V", 0));
        WebViewLinkSettings webViewLinkSettings = this.f329647c;
        if (webViewLinkSettings.f133868c || webViewLinkSettings.f133867b) {
            CookieManager cookieManager = this.f329649e;
            cookieManager.setAcceptCookie(true);
            for (com.avito.android.cookie_provider.a aVar : this.f329650f.getCookies()) {
                cookieManager.setCookie(aVar.f126169a, aVar.f126170b);
            }
        }
        k();
    }

    @Override // com.avito.android.webview.x.a
    public final boolean d() {
        return this.f329647c.f133867b;
    }

    @Override // com.avito.android.webview.p
    public final void e(@Y61.k WebViewActivity webViewActivity) {
        this.f329660p = webViewActivity;
    }

    @Override // com.avito.android.webview.p
    public final void f() {
        this.f329660p = null;
    }

    @Override // com.avito.android.webview.x.a
    public final boolean g() {
        return this.f329647c.f133874i;
    }

    @Override // com.avito.android.webview.p
    public final void i0() {
        D d12 = this.f329659o;
        if (d12 != null ? d12.f329515e.canGoBack() : false) {
            D d13 = this.f329659o;
            if (d13 != null) {
                d13.f329515e.goBack();
                return;
            }
            return;
        }
        WebViewActivity webViewActivity = this.f329660p;
        if (webViewActivity != null) {
            webViewActivity.finish();
        }
    }

    public final boolean j(DeepLink deepLink) {
        WebViewActivity webViewActivity;
        if (deepLink instanceof NoMatchLink) {
            return false;
        }
        this.f329651g.d(this.f329648d, deepLink);
        WebViewActivity webViewActivity2 = this.f329660p;
        if (webViewActivity2 != null) {
            webViewActivity2.a(deepLink);
        }
        if (deepLink instanceof WebViewLink) {
            return true;
        }
        WebViewLinkSettings webViewLinkSettings = this.f329647c;
        if (webViewLinkSettings.f133869d || webViewLinkSettings.f133867b || (webViewActivity = this.f329660p) == null) {
            return true;
        }
        webViewActivity.finish();
        return true;
    }

    @Override // com.avito.android.webview.x.a
    public final void j0() {
        this.f329662r = false;
        k();
    }

    public final void k() {
        D d12 = this.f329659o;
        if (d12 != null) {
            C42670a.d(d12.f329517g);
        }
        D d13 = this.f329659o;
        if (d13 != null) {
            String string = this.f329646b.toString();
            kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
            Map<String, String> map = this.f329647c.f133873h;
            if (map != null) {
                dVar.putAll(map);
            }
            Y2 y22 = this.f329652h;
            y22.getClass();
            kotlin.reflect.n<Object> nVar = Y2.f67590f[3];
            if (((Boolean) y22.f67594e.a().invoke()).booleanValue()) {
                InterfaceC34316x0 interfaceC34316x0 = this.f329656l;
                String f253555a = interfaceC34316x0.getF253555a();
                if (f253555a != null) {
                }
                Lq.d dVar2 = this.f329657m;
                String f253555a2 = dVar2.getF253555a();
                if (f253555a2 != null) {
                }
                GP0.a aVar = this.f329658n;
                String f253555a3 = aVar.getF253555a();
                if (f253555a3 != null) {
                }
            }
            G0 g02 = G0.f406611a;
            kotlin.collections.builders.d dVarB = dVar.b();
            if (dVarB.isEmpty()) {
                dVarB = null;
            }
            a aVar2 = new a();
            q qVar = new q(this);
            C36151d c36151d = new C36151d(this.f329651g, new b());
            h hVar = d13.f329516f;
            WebViewWithScrollListener webViewWithScrollListener = d13.f329515e;
            if (hVar == null) {
                d13.f329516f = new h(webViewWithScrollListener, d13.f329514d, d13.f329511a.d());
            }
            webViewWithScrollListener.setWebViewClient(aVar2);
            webViewWithScrollListener.setWebChromeClient(qVar);
            webViewWithScrollListener.addJavascriptInterface(c36151d, "appInterface");
            if (dVarB != null) {
                webViewWithScrollListener.loadUrl(string, new LinkedHashMap(dVarB));
            } else {
                webViewWithScrollListener.loadUrl(string);
            }
        }
    }
}
