package com.avito.android.credits.landing.di;

import android.webkit.CookieManager;
import com.avito.android.H0;
import com.avito.android.credits.landing.CreditProductsLandingFragment;
import com.avito.android.credits.landing.di.a;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.remote.interceptor.I;
import com.avito.android.remote.interceptor.InterfaceC34273b0;
import com.avito.android.remote.interceptor.M;
import com.avito.android.remote.interceptor.U0;
import com.avito.android.util.C;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import rm0.InterfaceC47681a;

/* compiled from: DaggerCreditProductsLandingComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class f {

    /* compiled from: DaggerCreditProductsLandingComponent.java */
    public static final class b implements a.InterfaceC3822a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.credits.landing.di.b f128915a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC39417a f128916b;

        public b() {
        }

        @Override // com.avito.android.credits.landing.di.a.InterfaceC3822a
        public final a.InterfaceC3822a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f128916b = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.credits.landing.di.a.InterfaceC3822a
        public final a.InterfaceC3822a b(com.avito.android.credits.landing.di.b bVar) {
            this.f128915a = bVar;
            return this;
        }

        @Override // com.avito.android.credits.landing.di.a.InterfaceC3822a
        public final com.avito.android.credits.landing.di.a build() {
            t.a(com.avito.android.credits.landing.di.b.class, this.f128915a);
            t.a(cv.b.class, this.f128916b);
            return new c(new com.avito.android.credits.landing.di.c(), this.f128915a, this.f128916b, null);
        }
    }

    /* compiled from: DaggerCreditProductsLandingComponent.java */
    public static final class c implements com.avito.android.credits.landing.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.credits.landing.di.b f128917a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f128918b;

        /* renamed from: c, reason: collision with root package name */
        public final u<CookieManager> f128919c;

        /* renamed from: d, reason: collision with root package name */
        public final u<B0> f128920d;

        /* renamed from: e, reason: collision with root package name */
        public final u<M> f128921e;

        /* renamed from: f, reason: collision with root package name */
        public final u<U0> f128922f;

        /* renamed from: g, reason: collision with root package name */
        public final u<I> f128923g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC34273b0> f128924h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC47681a> f128925i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f128926j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.cookie_provider.b> f128927k;

        /* renamed from: l, reason: collision with root package name */
        public final u<C> f128928l;

        /* renamed from: m, reason: collision with root package name */
        public final u<H0> f128929m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.cookie_provider.e> f128930n;

        /* compiled from: DaggerCreditProductsLandingComponent.java */
        public static final class a implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.credits.landing.di.b f128931a;

            public a(com.avito.android.credits.landing.di.b bVar) {
                this.f128931a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f128931a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerCreditProductsLandingComponent.java */
        public static final class b implements u<I> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.credits.landing.di.b f128932a;

            public b(com.avito.android.credits.landing.di.b bVar) {
                this.f128932a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f128932a.U2();
            }
        }

        /* compiled from: DaggerCreditProductsLandingComponent.java */
        /* renamed from: com.avito.android.credits.landing.di.f$c$c, reason: collision with other inner class name */
        public static final class C3823c implements u<M> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.credits.landing.di.b f128933a;

            public C3823c(com.avito.android.credits.landing.di.b bVar) {
                this.f128933a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f128933a.X2();
            }
        }

        /* compiled from: DaggerCreditProductsLandingComponent.java */
        public static final class d implements u<InterfaceC34273b0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.credits.landing.di.b f128934a;

            public d(com.avito.android.credits.landing.di.b bVar) {
                this.f128934a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f128934a.wd();
            }
        }

        /* compiled from: DaggerCreditProductsLandingComponent.java */
        public static final class e implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.credits.landing.di.b f128935a;

            public e(com.avito.android.credits.landing.di.b bVar) {
                this.f128935a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0M = this.f128935a.M();
                t.c(h0M);
                return h0M;
            }
        }

        /* compiled from: DaggerCreditProductsLandingComponent.java */
        /* renamed from: com.avito.android.credits.landing.di.f$c$f, reason: collision with other inner class name */
        public static final class C3824f implements u<InterfaceC47681a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.credits.landing.di.b f128936a;

            public C3824f(com.avito.android.credits.landing.di.b bVar) {
                this.f128936a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f128936a.n0();
            }
        }

        /* compiled from: DaggerCreditProductsLandingComponent.java */
        public static final class g implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.credits.landing.di.b f128937a;

            public g(com.avito.android.credits.landing.di.b bVar) {
                this.f128937a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f128937a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerCreditProductsLandingComponent.java */
        public static final class h implements u<B0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.credits.landing.di.b f128938a;

            public h(com.avito.android.credits.landing.di.b bVar) {
                this.f128938a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f128938a.s5();
            }
        }

        /* compiled from: DaggerCreditProductsLandingComponent.java */
        public static final class i implements u<U0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.credits.landing.di.b f128939a;

            public i(com.avito.android.credits.landing.di.b bVar) {
                this.f128939a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f128939a.I0();
            }
        }

        public c(com.avito.android.credits.landing.di.c cVar, com.avito.android.credits.landing.di.b bVar, cv.b bVar2, a aVar) {
            this.f128917a = bVar;
            this.f128918b = bVar2;
            this.f128919c = dagger.internal.g.d(new com.avito.android.credits.landing.di.d(cVar));
            this.f128920d = new h(bVar);
            this.f128921e = new C3823c(bVar);
            this.f128922f = new i(bVar);
            this.f128923g = new b(bVar);
            this.f128924h = new d(bVar);
            this.f128925i = new C3824f(bVar);
            u<com.avito.android.cookie_provider.b> uVarD = dagger.internal.g.d(new com.avito.android.cookie_provider.d(new g(bVar)));
            this.f128927k = uVarD;
            this.f128930n = dagger.internal.g.d(new com.avito.android.credits.landing.di.e(cVar, this.f128920d, this.f128921e, this.f128922f, this.f128923g, this.f128924h, this.f128925i, uVarD, new a(bVar), new e(bVar)));
        }

        @Override // com.avito.android.credits.landing.di.a
        public final void a(CreditProductsLandingFragment creditProductsLandingFragment) {
            com.avito.android.credits.landing.di.b bVar = this.f128917a;
            x xVarT = bVar.t();
            t.c(xVarT);
            creditProductsLandingFragment.f128889t0 = xVarT;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f128918b.u4();
            t.c(aVarU4);
            creditProductsLandingFragment.f128890u0 = aVarU4;
            creditProductsLandingFragment.f128891v0 = this.f128919c.get();
            creditProductsLandingFragment.f128892w0 = this.f128930n.get();
            creditProductsLandingFragment.f128893x0 = bVar.i3();
        }
    }

    public static a.InterfaceC3822a a() {
        return new b();
    }
}
