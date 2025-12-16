package com.avito.android.webview.di;

import Mu.InterfaceC14529b;
import android.app.Application;
import android.net.Uri;
import android.webkit.CookieManager;
import com.avito.android.CalledFrom;
import com.avito.android.H0;
import com.avito.android.P;
import com.avito.android.Y2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.remote.interceptor.I;
import com.avito.android.remote.interceptor.InterfaceC34316x0;
import com.avito.android.remote.interceptor.M;
import com.avito.android.remote.interceptor.P0;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.T;
import com.avito.android.util.W;
import com.avito.android.webview.WebViewActivity;
import com.avito.android.webview.di.b;
import com.avito.android.webview.di.e;
import com.avito.android.webview.v;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import rm0.InterfaceC47681a;
import vK0.C49228b;

/* compiled from: DaggerWebViewComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerWebViewComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.webview.di.c f329558a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC39417a f329559b;

        /* renamed from: c, reason: collision with root package name */
        public Uri f329560c;

        /* renamed from: d, reason: collision with root package name */
        public WebViewLinkSettings f329561d;

        /* renamed from: e, reason: collision with root package name */
        public CalledFrom f329562e;

        public b() {
        }

        @Override // com.avito.android.webview.di.b.a
        public final b.a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f329559b = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.webview.di.b.a
        public final b.a b(com.avito.android.webview.di.c cVar) {
            this.f329558a = cVar;
            return this;
        }

        @Override // com.avito.android.webview.di.b.a
        public final com.avito.android.webview.di.b build() {
            t.a(com.avito.android.webview.di.c.class, this.f329558a);
            t.a(cv.b.class, this.f329559b);
            t.a(Uri.class, this.f329560c);
            t.a(WebViewLinkSettings.class, this.f329561d);
            return new c(this.f329558a, this.f329559b, this.f329560c, this.f329561d, this.f329562e, null);
        }

        @Override // com.avito.android.webview.di.b.a
        public final b.a c(Uri uri) {
            this.f329560c = uri;
            return this;
        }

        @Override // com.avito.android.webview.di.b.a
        public final b.a d(WebViewLinkSettings webViewLinkSettings) {
            this.f329561d = webViewLinkSettings;
            return this;
        }

        @Override // com.avito.android.webview.di.b.a
        public final b.a e(CalledFrom calledFrom) {
            this.f329562e = calledFrom;
            return this;
        }
    }

    /* compiled from: DaggerWebViewComponent.java */
    public static final class c implements com.avito.android.webview.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<P> f329563A;

        /* renamed from: B, reason: collision with root package name */
        public final u<GP0.a> f329564B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.android.webview.p> f329565C;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f329566a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.webview.di.c f329567b;

        /* renamed from: c, reason: collision with root package name */
        public final u<x> f329568c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f329569d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f329570e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.l f329571f;

        /* renamed from: g, reason: collision with root package name */
        public final u<CookieManager> f329572g = dagger.internal.g.d(e.a.f329610a);

        /* renamed from: h, reason: collision with root package name */
        public final u<B0> f329573h;

        /* renamed from: i, reason: collision with root package name */
        public final u<P0> f329574i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC47681a> f329575j;

        /* renamed from: k, reason: collision with root package name */
        public final u<I> f329576k;

        /* renamed from: l, reason: collision with root package name */
        public final u<M> f329577l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f329578m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.cookie_provider.b> f329579n;

        /* renamed from: o, reason: collision with root package name */
        public final u<C> f329580o;

        /* renamed from: p, reason: collision with root package name */
        public final u<H0> f329581p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.cookie_provider.e> f329582q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC28373a> f329583r;

        /* renamed from: s, reason: collision with root package name */
        public final u<Y2> f329584s;

        /* renamed from: t, reason: collision with root package name */
        public final u<FP0.a> f329585t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC14529b> f329586u;

        /* renamed from: v, reason: collision with root package name */
        public final u<InterfaceC35745a5> f329587v;

        /* renamed from: w, reason: collision with root package name */
        public final u<Application> f329588w;

        /* renamed from: x, reason: collision with root package name */
        public final W f329589x;

        /* renamed from: y, reason: collision with root package name */
        public final u<InterfaceC34316x0> f329590y;

        /* renamed from: z, reason: collision with root package name */
        public final u<Lq.d> f329591z;

        /* compiled from: DaggerWebViewComponent.java */
        /* renamed from: com.avito.android.webview.di.a$c$a, reason: collision with other inner class name */
        public static final class C10238a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.webview.di.c f329592a;

            public C10238a(com.avito.android.webview.di.c cVar) {
                this.f329592a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f329592a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerWebViewComponent.java */
        public static final class b implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.webview.di.c f329593a;

            public b(com.avito.android.webview.di.c cVar) {
                this.f329593a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f329593a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerWebViewComponent.java */
        /* renamed from: com.avito.android.webview.di.a$c$c, reason: collision with other inner class name */
        public static final class C10239c implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.webview.di.c f329594a;

            public C10239c(com.avito.android.webview.di.c cVar) {
                this.f329594a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f329594a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerWebViewComponent.java */
        public static final class d implements u<P> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.webview.di.c f329595a;

            public d(com.avito.android.webview.di.c cVar) {
                this.f329595a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f329595a.E();
            }
        }

        /* compiled from: DaggerWebViewComponent.java */
        public static final class e implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.webview.di.c f329596a;

            public e(com.avito.android.webview.di.c cVar) {
                this.f329596a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarT = this.f329596a.t();
                t.c(xVarT);
                return xVarT;
            }
        }

        /* compiled from: DaggerWebViewComponent.java */
        public static final class f implements u<InterfaceC14529b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.webview.di.c f329597a;

            public f(com.avito.android.webview.di.c cVar) {
                this.f329597a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14529b interfaceC14529bT8 = this.f329597a.T8();
                t.c(interfaceC14529bT8);
                return interfaceC14529bT8;
            }
        }

        /* compiled from: DaggerWebViewComponent.java */
        public static final class g implements u<I> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.webview.di.c f329598a;

            public g(com.avito.android.webview.di.c cVar) {
                this.f329598a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f329598a.U2();
            }
        }

        /* compiled from: DaggerWebViewComponent.java */
        public static final class h implements u<M> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.webview.di.c f329599a;

            public h(com.avito.android.webview.di.c cVar) {
                this.f329599a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f329599a.X2();
            }
        }

        /* compiled from: DaggerWebViewComponent.java */
        public static final class i implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.webview.di.c f329600a;

            public i(com.avito.android.webview.di.c cVar) {
                this.f329600a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0M = this.f329600a.M();
                t.c(h0M);
                return h0M;
            }
        }

        /* compiled from: DaggerWebViewComponent.java */
        public static final class j implements u<InterfaceC47681a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.webview.di.c f329601a;

            public j(com.avito.android.webview.di.c cVar) {
                this.f329601a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f329601a.n0();
            }
        }

        /* compiled from: DaggerWebViewComponent.java */
        public static final class k implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.webview.di.c f329602a;

            public k(com.avito.android.webview.di.c cVar) {
                this.f329602a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f329602a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerWebViewComponent.java */
        public static final class l implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.webview.di.c f329603a;

            public l(com.avito.android.webview.di.c cVar) {
                this.f329603a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f329603a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerWebViewComponent.java */
        public static final class m implements u<InterfaceC34316x0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.webview.di.c f329604a;

            public m(com.avito.android.webview.di.c cVar) {
                this.f329604a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f329604a.xe();
            }
        }

        /* compiled from: DaggerWebViewComponent.java */
        public static final class n implements u<B0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.webview.di.c f329605a;

            public n(com.avito.android.webview.di.c cVar) {
                this.f329605a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f329605a.s5();
            }
        }

        /* compiled from: DaggerWebViewComponent.java */
        public static final class o implements u<P0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.webview.di.c f329606a;

            public o(com.avito.android.webview.di.c cVar) {
                this.f329606a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f329606a.d1();
            }
        }

        /* compiled from: DaggerWebViewComponent.java */
        public static final class p implements u<Y2> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.webview.di.c f329607a;

            public p(com.avito.android.webview.di.c cVar) {
                this.f329607a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f329607a.Di();
            }
        }

        /* compiled from: DaggerWebViewComponent.java */
        public static final class q implements u<Lq.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.webview.di.c f329608a;

            public q(com.avito.android.webview.di.c cVar) {
                this.f329608a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f329608a.Yk();
            }
        }

        public c(com.avito.android.webview.di.c cVar, cv.b bVar, Uri uri, WebViewLinkSettings webViewLinkSettings, CalledFrom calledFrom, C10237a c10237a) {
            this.f329566a = bVar;
            this.f329567b = cVar;
            this.f329568c = new e(cVar);
            this.f329569d = dagger.internal.l.a(uri);
            this.f329570e = dagger.internal.l.a(webViewLinkSettings);
            this.f329571f = dagger.internal.l.b(calledFrom);
            this.f329573h = new n(cVar);
            this.f329574i = new o(cVar);
            this.f329575j = new j(cVar);
            this.f329576k = new g(cVar);
            this.f329577l = new h(cVar);
            u<com.avito.android.cookie_provider.b> uVarD = dagger.internal.g.d(new com.avito.android.cookie_provider.d(new l(cVar)));
            this.f329579n = uVarD;
            C10239c c10239c = new C10239c(cVar);
            i iVar = new i(cVar);
            this.f329582q = dagger.internal.g.d(new com.avito.android.webview.di.f(this.f329570e, uVarD, this.f329573h, this.f329574i, this.f329575j, this.f329576k, this.f329577l, c10239c, iVar));
            C10238a c10238a = new C10238a(cVar);
            p pVar = new p(cVar);
            this.f329584s = pVar;
            this.f329585t = dagger.internal.g.d(new FP0.c(c10238a, pVar));
            this.f329586u = new f(cVar);
            this.f329587v = new k(cVar);
            this.f329589x = W.a(C49228b.a(new b(cVar)), T.f318740a);
            this.f329590y = new m(cVar);
            this.f329591z = new q(cVar);
            u<GP0.a> uVarD2 = dagger.internal.g.d(new GP0.d(new d(cVar)));
            this.f329564B = uVarD2;
            this.f329565C = dagger.internal.g.d(new v(this.f329568c, this.f329569d, this.f329570e, this.f329571f, this.f329572g, this.f329582q, this.f329585t, this.f329584s, this.f329586u, this.f329587v, this.f329589x, this.f329590y, this.f329591z, uVarD2));
        }

        @Override // com.avito.android.webview.di.b
        public final void a(WebViewActivity webViewActivity) {
            webViewActivity.f329522m = this.f329565C.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f329566a.u4();
            t.c(aVarU4);
            webViewActivity.f329523n = aVarU4;
            com.avito.android.webview.di.c cVar = this.f329567b;
            com.avito.android.deeplink_handler.mapping.checker.c cVarJ6 = cVar.j6();
            t.c(cVarJ6);
            webViewActivity.f329524o = cVarJ6;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            webViewActivity.f329525p = interfaceC28373aA;
            webViewActivity.f329526q = this.f329585t.get();
            com.avito.android.connection_quality.connectivity.a aVarU = cVar.U();
            t.c(aVarU);
            webViewActivity.f329527r = aVarU;
        }
    }

    public static b.a a() {
        return new b();
    }
}
