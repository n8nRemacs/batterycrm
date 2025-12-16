package com.avito.android.installments.form.di;

import com.avito.android.H0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import com.avito.android.deep_linking.links.UxFeedbackActions;
import com.avito.android.deep_linking.x;
import com.avito.android.installments.form.InstallmentsFormActivity;
import com.avito.android.installments.form.di.b;
import com.avito.android.installments.form.w;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.remote.interceptor.I;
import com.avito.android.remote.interceptor.M;
import com.avito.android.remote.interceptor.P0;
import com.avito.android.remote.interceptor.U0;
import com.avito.android.util.C;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Map;
import rm0.InterfaceC47681a;

/* compiled from: DaggerInstallmentsFormComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerInstallmentsFormComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.installments.form.di.b.a
        public final com.avito.android.installments.form.di.b a(com.avito.android.installments.form.di.c cVar, InterfaceC39417a interfaceC39417a, String str, String str2, boolean z12, Map map, Map map2, UxFeedbackActions uxFeedbackActions, r rVar, Boolean bool) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, str, str2, Boolean.valueOf(z12), map, map2, uxFeedbackActions, rVar, bool, null);
        }
    }

    /* compiled from: DaggerInstallmentsFormComponent.java */
    public static final class c implements com.avito.android.installments.form.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.l f172630A;

        /* renamed from: B, reason: collision with root package name */
        public final u<x> f172631B;

        /* renamed from: C, reason: collision with root package name */
        public final u<Gson> f172632C;

        /* renamed from: D, reason: collision with root package name */
        public final u<UN.a> f172633D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f172634E;

        /* renamed from: F, reason: collision with root package name */
        public final com.avito.android.installments.form.u f172635F;

        /* renamed from: a, reason: collision with root package name */
        public final String f172636a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, ?> f172637b;

        /* renamed from: c, reason: collision with root package name */
        public final Map<String, ? extends Map<String, Integer>> f172638c;

        /* renamed from: d, reason: collision with root package name */
        public final UxFeedbackActions f172639d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.installments.form.di.c f172640e;

        /* renamed from: f, reason: collision with root package name */
        public final u<M> f172641f;

        /* renamed from: g, reason: collision with root package name */
        public final u<P0> f172642g;

        /* renamed from: h, reason: collision with root package name */
        public final u<B0> f172643h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f172644i;

        /* renamed from: j, reason: collision with root package name */
        public final u<U0> f172645j;

        /* renamed from: k, reason: collision with root package name */
        public final u<I> f172646k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC47681a> f172647l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C> f172648m;

        /* renamed from: n, reason: collision with root package name */
        public final u<H0> f172649n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.cookie_provider.e> f172650o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC28481c> f172651p;

        /* renamed from: q, reason: collision with root package name */
        public final u<H> f172652q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC28499v> f172653r;

        /* renamed from: s, reason: collision with root package name */
        public final u<InterfaceC28501x> f172654s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.analytics.screens.o> f172655t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.installments.form.m> f172656u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.l f172657v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.l f172658w;

        /* renamed from: x, reason: collision with root package name */
        public final u<SV0.a> f172659x;

        /* renamed from: y, reason: collision with root package name */
        public final com.avito.android.installments.form.l f172660y;

        /* renamed from: z, reason: collision with root package name */
        public final com.avito.android.installments.form.mvi.g f172661z;

        /* compiled from: DaggerInstallmentsFormComponent.java */
        /* renamed from: com.avito.android.installments.form.di.a$c$a, reason: collision with other inner class name */
        public static final class C5089a implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.installments.form.di.c f172662a;

            public C5089a(com.avito.android.installments.form.di.c cVar) {
                this.f172662a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f172662a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerInstallmentsFormComponent.java */
        public static final class b implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.installments.form.di.c f172663a;

            public b(com.avito.android.installments.form.di.c cVar) {
                this.f172663a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarT = this.f172663a.t();
                t.c(xVarT);
                return xVarT;
            }
        }

        /* compiled from: DaggerInstallmentsFormComponent.java */
        /* renamed from: com.avito.android.installments.form.di.a$c$c, reason: collision with other inner class name */
        public static final class C5090c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f172664a;

            public C5090c(cv.b bVar) {
                this.f172664a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f172664a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerInstallmentsFormComponent.java */
        public static final class d implements u<I> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.installments.form.di.c f172665a;

            public d(com.avito.android.installments.form.di.c cVar) {
                this.f172665a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f172665a.U2();
            }
        }

        /* compiled from: DaggerInstallmentsFormComponent.java */
        public static final class e implements u<M> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.installments.form.di.c f172666a;

            public e(com.avito.android.installments.form.di.c cVar) {
                this.f172666a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f172666a.X2();
            }
        }

        /* compiled from: DaggerInstallmentsFormComponent.java */
        public static final class f implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.installments.form.di.c f172667a;

            public f(com.avito.android.installments.form.di.c cVar) {
                this.f172667a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f172667a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerInstallmentsFormComponent.java */
        public static final class g implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.installments.form.di.c f172668a;

            public g(com.avito.android.installments.form.di.c cVar) {
                this.f172668a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0M = this.f172668a.M();
                t.c(h0M);
                return h0M;
            }
        }

        /* compiled from: DaggerInstallmentsFormComponent.java */
        public static final class h implements u<SV0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.installments.form.di.c f172669a;

            public h(com.avito.android.installments.form.di.c cVar) {
                this.f172669a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SV0.a aVarF4 = this.f172669a.F4();
                t.c(aVarF4);
                return aVarF4;
            }
        }

        /* compiled from: DaggerInstallmentsFormComponent.java */
        public static final class i implements u<UN.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.installments.form.di.c f172670a;

            public i(com.avito.android.installments.form.di.c cVar) {
                this.f172670a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f172670a.W6();
            }
        }

        /* compiled from: DaggerInstallmentsFormComponent.java */
        public static final class j implements u<InterfaceC47681a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.installments.form.di.c f172671a;

            public j(com.avito.android.installments.form.di.c cVar) {
                this.f172671a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f172671a.n0();
            }
        }

        /* compiled from: DaggerInstallmentsFormComponent.java */
        public static final class k implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.installments.form.di.c f172672a;

            public k(com.avito.android.installments.form.di.c cVar) {
                this.f172672a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f172672a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerInstallmentsFormComponent.java */
        public static final class l implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.installments.form.di.c f172673a;

            public l(com.avito.android.installments.form.di.c cVar) {
                this.f172673a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f172673a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerInstallmentsFormComponent.java */
        public static final class m implements u<B0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.installments.form.di.c f172674a;

            public m(com.avito.android.installments.form.di.c cVar) {
                this.f172674a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f172674a.s5();
            }
        }

        /* compiled from: DaggerInstallmentsFormComponent.java */
        public static final class n implements u<P0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.installments.form.di.c f172675a;

            public n(com.avito.android.installments.form.di.c cVar) {
                this.f172675a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f172675a.d1();
            }
        }

        /* compiled from: DaggerInstallmentsFormComponent.java */
        public static final class o implements u<U0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.installments.form.di.c f172676a;

            public o(com.avito.android.installments.form.di.c cVar) {
                this.f172676a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f172676a.I0();
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.installments.form.di.c cVar, cv.b bVar, String str, String str2, Boolean bool, Map map, Map map2, UxFeedbackActions uxFeedbackActions, r rVar, Boolean bool2, C5088a c5088a) {
            this.f172636a = str;
            this.f172637b = map;
            this.f172638c = map2;
            this.f172639d = uxFeedbackActions;
            this.f172640e = cVar;
            this.f172650o = dagger.internal.g.d(new com.avito.android.installments.form.di.e(new e(cVar), new n(cVar), new m(cVar), new com.avito.android.cookie_provider.d(new l(cVar)), new o(cVar), new d(cVar), new j(cVar), new C5089a(cVar), new g(cVar)));
            this.f172651p = new k(cVar);
            u<H> uVarD = dagger.internal.g.d(new com.avito.android.installments.form.di.j(dagger.internal.l.a(rVar), this.f172651p));
            this.f172652q = uVarD;
            this.f172653r = dagger.internal.g.d(new com.avito.android.installments.form.di.g(uVarD));
            this.f172654s = dagger.internal.g.d(new com.avito.android.installments.form.di.i(this.f172652q));
            u<com.avito.android.analytics.screens.o> uVarD2 = dagger.internal.g.d(new com.avito.android.installments.form.di.h(this.f172652q));
            this.f172655t = uVarD2;
            this.f172656u = dagger.internal.g.d(new com.avito.android.installments.form.o(uVarD2, this.f172653r, this.f172654s));
            this.f172657v = dagger.internal.l.b(str);
            this.f172658w = dagger.internal.l.b(str2);
            dagger.internal.l lVarA = dagger.internal.l.a(bool);
            com.avito.android.installments.form.l lVar = new com.avito.android.installments.form.l(new h(cVar));
            this.f172660y = lVar;
            this.f172661z = new com.avito.android.installments.form.mvi.g(this.f172657v, this.f172658w, lVarA, lVar);
            this.f172630A = dagger.internal.l.b(bool2);
            this.f172635F = new com.avito.android.installments.form.u(new com.avito.android.installments.form.mvi.j(this.f172661z, new com.avito.android.installments.form.mvi.e(this.f172630A, this.f172660y, dagger.internal.l.b(uxFeedbackActions), new b(cVar), new f(cVar), new i(cVar)), new com.avito.android.installments.form.mvi.l(new C5090c(bVar)), com.avito.android.installments.form.mvi.n.a()));
        }

        @Override // com.avito.android.installments.form.di.b
        public final void a(InstallmentsFormActivity installmentsFormActivity) {
            com.avito.android.installments.form.di.c cVar = this.f172640e;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            Gson gsonS = cVar.s();
            t.c(gsonS);
            com.avito.android.credits.web_logger.c cVar2 = new com.avito.android.credits.web_logger.c(this.f172637b, this.f172638c, this.f172639d, interfaceC28373aA, gsonS);
            String str = this.f172636a;
            installmentsFormActivity.f172579n = new com.avito.android.credits.web_handler.b(str, cVar2);
            InterfaceC28373a interfaceC28373aA2 = cVar.a();
            t.c(interfaceC28373aA2);
            installmentsFormActivity.f172580o = new w(interfaceC28373aA2, str, this.f172637b);
            installmentsFormActivity.f172581p = this.f172650o.get();
            x xVarT = cVar.t();
            t.c(xVarT);
            installmentsFormActivity.f172582q = xVarT;
            installmentsFormActivity.f172583r = this.f172656u.get();
            installmentsFormActivity.f172584s = this.f172635F;
        }
    }

    public static b.a a() {
        return new b();
    }
}
