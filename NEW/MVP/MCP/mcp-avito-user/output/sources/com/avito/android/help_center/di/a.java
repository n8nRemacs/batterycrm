package com.avito.android.help_center.di;

import Ir.C14150b;
import android.webkit.CookieManager;
import com.avito.android.C30277e1;
import com.avito.android.H0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.x;
import com.avito.android.help_center.A;
import com.avito.android.help_center.E;
import com.avito.android.help_center.G;
import com.avito.android.help_center.H;
import com.avito.android.help_center.HelpCenterFragment;
import com.avito.android.help_center.HelpCenterPresenterState;
import com.avito.android.help_center.InterfaceC30756m;
import com.avito.android.help_center.J;
import com.avito.android.help_center.di.b;
import com.avito.android.help_center.di.j;
import com.avito.android.help_center.p;
import com.avito.android.remote.interceptor.F0;
import com.avito.android.remote.interceptor.I;
import com.avito.android.remote.interceptor.InterfaceC34273b0;
import com.avito.android.remote.interceptor.InterfaceC34319z;
import com.avito.android.remote.interceptor.U0;
import com.avito.android.remote.l1;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import rm0.InterfaceC47681a;

/* compiled from: DaggerHelpCenterComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerHelpCenterComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.help_center.di.c f161626a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC39417a f161627b;

        /* renamed from: c, reason: collision with root package name */
        public String f161628c;

        /* renamed from: d, reason: collision with root package name */
        public HelpCenterPresenterState f161629d;

        public b() {
        }

        @Override // com.avito.android.help_center.di.b.a
        public final b.a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f161627b = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.help_center.di.b.a
        public final b.a b(com.avito.android.help_center.di.c cVar) {
            this.f161626a = cVar;
            return this;
        }

        @Override // com.avito.android.help_center.di.b.a
        public final com.avito.android.help_center.di.b build() {
            t.a(com.avito.android.help_center.di.c.class, this.f161626a);
            t.a(cv.b.class, this.f161627b);
            return new c(this.f161626a, this.f161627b, this.f161628c, this.f161629d, null);
        }

        @Override // com.avito.android.help_center.di.b.a
        public final b.a c(String str) {
            this.f161628c = str;
            return this;
        }

        @Override // com.avito.android.help_center.di.b.a
        public final b.a d(HelpCenterPresenterState helpCenterPresenterState) {
            this.f161629d = helpCenterPresenterState;
            return this;
        }
    }

    /* compiled from: DaggerHelpCenterComponent.java */
    public static final class c implements com.avito.android.help_center.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.help_center.di.c f161630a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC35745a5> f161631b;

        /* renamed from: c, reason: collision with root package name */
        public final u<CookieManager> f161632c = dagger.internal.g.d(j.a.f161675a);

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC34273b0> f161633d;

        /* renamed from: e, reason: collision with root package name */
        public final u<F0> f161634e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC34319z> f161635f;

        /* renamed from: g, reason: collision with root package name */
        public final u<I> f161636g;

        /* renamed from: h, reason: collision with root package name */
        public final u<l1> f161637h;

        /* renamed from: i, reason: collision with root package name */
        public final u<U0> f161638i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC47681a> f161639j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f161640k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.cookie_provider.b> f161641l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C> f161642m;

        /* renamed from: n, reason: collision with root package name */
        public final u<H0> f161643n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.cookie_provider.e> f161644o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC30756m> f161645p;

        /* renamed from: q, reason: collision with root package name */
        public final u<C30277e1> f161646q;

        /* renamed from: r, reason: collision with root package name */
        public final u<H> f161647r;

        /* renamed from: s, reason: collision with root package name */
        public final u<E> f161648s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f161649t;

        /* renamed from: u, reason: collision with root package name */
        public final u<x> f161650u;

        /* renamed from: v, reason: collision with root package name */
        public final u<InterfaceC35845m2> f161651v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.l f161652w;

        /* renamed from: x, reason: collision with root package name */
        public final u<p> f161653x;

        /* compiled from: DaggerHelpCenterComponent.java */
        /* renamed from: com.avito.android.help_center.di.a$c$a, reason: collision with other inner class name */
        public static final class C4737a implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.di.c f161654a;

            public C4737a(com.avito.android.help_center.di.c cVar) {
                this.f161654a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f161654a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerHelpCenterComponent.java */
        public static final class b implements u<InterfaceC34319z> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.di.c f161655a;

            public b(com.avito.android.help_center.di.c cVar) {
                this.f161655a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161655a.Bj();
            }
        }

        /* compiled from: DaggerHelpCenterComponent.java */
        /* renamed from: com.avito.android.help_center.di.a$c$c, reason: collision with other inner class name */
        public static final class C4738c implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.di.c f161656a;

            public C4738c(com.avito.android.help_center.di.c cVar) {
                this.f161656a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f161656a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerHelpCenterComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f161657a;

            public d(cv.b bVar) {
                this.f161657a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f161657a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerHelpCenterComponent.java */
        public static final class e implements u<I> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.di.c f161658a;

            public e(com.avito.android.help_center.di.c cVar) {
                this.f161658a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161658a.U2();
            }
        }

        /* compiled from: DaggerHelpCenterComponent.java */
        public static final class f implements u<InterfaceC34273b0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.di.c f161659a;

            public f(com.avito.android.help_center.di.c cVar) {
                this.f161659a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161659a.wd();
            }
        }

        /* compiled from: DaggerHelpCenterComponent.java */
        public static final class g implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.di.c f161660a;

            public g(com.avito.android.help_center.di.c cVar) {
                this.f161660a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0M = this.f161660a.M();
                t.c(h0M);
                return h0M;
            }
        }

        /* compiled from: DaggerHelpCenterComponent.java */
        public static final class h implements u<InterfaceC35845m2> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.di.c f161661a;

            public h(com.avito.android.help_center.di.c cVar) {
                this.f161661a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161661a.h();
            }
        }

        /* compiled from: DaggerHelpCenterComponent.java */
        public static final class i implements u<C30277e1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.di.c f161662a;

            public i(com.avito.android.help_center.di.c cVar) {
                this.f161662a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161662a.C();
            }
        }

        /* compiled from: DaggerHelpCenterComponent.java */
        public static final class j implements u<InterfaceC47681a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.di.c f161663a;

            public j(com.avito.android.help_center.di.c cVar) {
                this.f161663a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161663a.n0();
            }
        }

        /* compiled from: DaggerHelpCenterComponent.java */
        public static final class k implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.di.c f161664a;

            public k(com.avito.android.help_center.di.c cVar) {
                this.f161664a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f161664a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerHelpCenterComponent.java */
        public static final class l implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.di.c f161665a;

            public l(com.avito.android.help_center.di.c cVar) {
                this.f161665a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f161665a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerHelpCenterComponent.java */
        public static final class m implements u<F0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.di.c f161666a;

            public m(com.avito.android.help_center.di.c cVar) {
                this.f161666a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161666a.ji();
            }
        }

        /* compiled from: DaggerHelpCenterComponent.java */
        public static final class n implements u<l1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.di.c f161667a;

            public n(com.avito.android.help_center.di.c cVar) {
                this.f161667a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161667a.Wg();
            }
        }

        /* compiled from: DaggerHelpCenterComponent.java */
        public static final class o implements u<U0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.help_center.di.c f161668a;

            public o(com.avito.android.help_center.di.c cVar) {
                this.f161668a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f161668a.I0();
            }
        }

        public c(com.avito.android.help_center.di.c cVar, cv.b bVar, String str, HelpCenterPresenterState helpCenterPresenterState, C4736a c4736a) {
            this.f161630a = cVar;
            this.f161631b = new k(cVar);
            this.f161633d = new f(cVar);
            this.f161634e = new m(cVar);
            this.f161635f = new b(cVar);
            this.f161636g = new e(cVar);
            this.f161637h = new n(cVar);
            this.f161638i = new o(cVar);
            this.f161639j = new j(cVar);
            u<com.avito.android.cookie_provider.b> uVarA = B.a(new com.avito.android.cookie_provider.d(new l(cVar)));
            this.f161641l = uVarA;
            this.f161644o = B.a(new C14150b(this.f161633d, this.f161634e, this.f161635f, this.f161636g, this.f161637h, this.f161638i, this.f161639j, uVarA, new C4737a(cVar), new g(cVar)));
            this.f161645p = dagger.internal.g.d(com.avito.android.help_center.o.a());
            u<H> uVarD = dagger.internal.g.d(new J(new i(cVar)));
            this.f161647r = uVarD;
            this.f161648s = dagger.internal.g.d(new G(uVarD));
            this.f161649t = new d(bVar);
            this.f161650u = new C4738c(cVar);
            this.f161651v = new h(cVar);
            this.f161652w = dagger.internal.l.b(str);
            this.f161653x = dagger.internal.g.d(new A(this.f161652w, dagger.internal.l.b(helpCenterPresenterState), this.f161631b, this.f161632c, this.f161644o, this.f161645p, this.f161648s, this.f161649t, this.f161650u, this.f161651v, this.f161647r));
        }

        @Override // com.avito.android.help_center.di.b
        public final void a(HelpCenterFragment helpCenterFragment) {
            helpCenterFragment.f161607n0 = this.f161653x.get();
            InterfaceC28373a interfaceC28373aA = this.f161630a.a();
            t.c(interfaceC28373aA);
            helpCenterFragment.f161608o0 = interfaceC28373aA;
        }
    }

    public static b.a a() {
        return new b();
    }
}
