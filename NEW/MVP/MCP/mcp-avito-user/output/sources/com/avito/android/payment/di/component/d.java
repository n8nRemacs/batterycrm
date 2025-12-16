package com.avito.android.payment.di.component;

import android.app.Activity;
import com.avito.android.H0;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import com.avito.android.payment.WebPaymentResourceProviderImpl;
import com.avito.android.payment.di.component.i;
import com.avito.android.payment.di.module.X;
import com.avito.android.payment.di.module.Y;
import com.avito.android.payment.webview.mvi.WebPaymentMviActivity;
import com.avito.android.payment.webview.mvi.k;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.remote.interceptor.I;
import com.avito.android.remote.interceptor.M;
import com.avito.android.remote.interceptor.P0;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import rm0.InterfaceC47681a;
import v60.InterfaceC49169a;

/* compiled from: DaggerWebPaymentMviComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class d {

    /* compiled from: DaggerWebPaymentMviComponent.java */
    public static final class b implements i.a {
        public b() {
        }

        @Override // com.avito.android.payment.di.component.i.a
        public final i a(e eVar, InterfaceC39417a interfaceC39417a, WebPaymentMviActivity webPaymentMviActivity, C28478k c28478k, com.avito.android.payment.webview.mvi.a aVar, WebPaymentResourceProviderImpl webPaymentResourceProviderImpl) {
            interfaceC39417a.getClass();
            return new c(eVar, interfaceC39417a, webPaymentMviActivity, c28478k, aVar, webPaymentResourceProviderImpl, null);
        }
    }

    /* compiled from: DaggerWebPaymentMviComponent.java */
    public static final class c implements com.avito.android.payment.di.component.i {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.payment.di.component.e f214151a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.payment.o f214152b;

        /* renamed from: c, reason: collision with root package name */
        public final u<x> f214153c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.deeplink_events.registry.d> f214154d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f214155e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f214156f;

        /* renamed from: g, reason: collision with root package name */
        public final u<E> f214157g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f214158h;

        /* renamed from: i, reason: collision with root package name */
        public final u<Gson> f214159i;

        /* renamed from: j, reason: collision with root package name */
        public final u<R0> f214160j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.payment.webview.mvi.component.g f214161k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.payment.webview.mvi.component.n f214162l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f214163m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28481c> f214164n;

        /* renamed from: o, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f214165o;

        /* renamed from: p, reason: collision with root package name */
        public final u<M> f214166p;

        /* renamed from: q, reason: collision with root package name */
        public final u<P0> f214167q;

        /* renamed from: r, reason: collision with root package name */
        public final u<B0> f214168r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f214169s;

        /* renamed from: t, reason: collision with root package name */
        public final u<I> f214170t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC47681a> f214171u;

        /* renamed from: v, reason: collision with root package name */
        public final u<C> f214172v;

        /* renamed from: w, reason: collision with root package name */
        public final u<H0> f214173w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.cookie_provider.e> f214174x;

        /* renamed from: y, reason: collision with root package name */
        public final u<InterfaceC49169a> f214175y;

        /* compiled from: DaggerWebPaymentMviComponent.java */
        public static final class a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214176a;

            public a(com.avito.android.payment.di.component.e eVar) {
                this.f214176a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f214176a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerWebPaymentMviComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214177a;

            public b(com.avito.android.payment.di.component.e eVar) {
                this.f214177a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f214177a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerWebPaymentMviComponent.java */
        /* renamed from: com.avito.android.payment.di.component.d$c$c, reason: collision with other inner class name */
        public static final class C6427c implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214178a;

            public C6427c(com.avito.android.payment.di.component.e eVar) {
                this.f214178a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f214178a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerWebPaymentMviComponent.java */
        /* renamed from: com.avito.android.payment.di.component.d$c$d, reason: collision with other inner class name */
        public static final class C6428d implements u<com.avito.android.deeplink_events.registry.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214179a;

            public C6428d(com.avito.android.payment.di.component.e eVar) {
                this.f214179a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_events.registry.d dVarA6 = this.f214179a.a6();
                t.c(dVarA6);
                return dVarA6;
            }
        }

        /* compiled from: DaggerWebPaymentMviComponent.java */
        public static final class e implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214180a;

            public e(com.avito.android.payment.di.component.e eVar) {
                this.f214180a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f214180a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerWebPaymentMviComponent.java */
        public static final class f implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f214181a;

            public f(cv.b bVar) {
                this.f214181a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f214181a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerWebPaymentMviComponent.java */
        public static final class g implements u<I> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214182a;

            public g(com.avito.android.payment.di.component.e eVar) {
                this.f214182a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f214182a.U2();
            }
        }

        /* compiled from: DaggerWebPaymentMviComponent.java */
        public static final class h implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214183a;

            public h(com.avito.android.payment.di.component.e eVar) {
                this.f214183a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0I0 = this.f214183a.i0();
                t.c(r0I0);
                return r0I0;
            }
        }

        /* compiled from: DaggerWebPaymentMviComponent.java */
        public static final class i implements u<M> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214184a;

            public i(com.avito.android.payment.di.component.e eVar) {
                this.f214184a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f214184a.X2();
            }
        }

        /* compiled from: DaggerWebPaymentMviComponent.java */
        public static final class j implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214185a;

            public j(com.avito.android.payment.di.component.e eVar) {
                this.f214185a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f214185a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerWebPaymentMviComponent.java */
        public static final class k implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214186a;

            public k(com.avito.android.payment.di.component.e eVar) {
                this.f214186a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0M = this.f214186a.M();
                t.c(h0M);
                return h0M;
            }
        }

        /* compiled from: DaggerWebPaymentMviComponent.java */
        public static final class l implements u<InterfaceC47681a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214187a;

            public l(com.avito.android.payment.di.component.e eVar) {
                this.f214187a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f214187a.n0();
            }
        }

        /* compiled from: DaggerWebPaymentMviComponent.java */
        public static final class m implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214188a;

            public m(com.avito.android.payment.di.component.e eVar) {
                this.f214188a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f214188a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerWebPaymentMviComponent.java */
        public static final class n implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214189a;

            public n(com.avito.android.payment.di.component.e eVar) {
                this.f214189a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f214189a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerWebPaymentMviComponent.java */
        public static final class o implements u<B0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214190a;

            public o(com.avito.android.payment.di.component.e eVar) {
                this.f214190a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f214190a.s5();
            }
        }

        /* compiled from: DaggerWebPaymentMviComponent.java */
        public static final class p implements u<P0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.payment.di.component.e f214191a;

            public p(com.avito.android.payment.di.component.e eVar) {
                this.f214191a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f214191a.d1();
            }
        }

        public c(com.avito.android.payment.di.component.e eVar, cv.b bVar, Activity activity, C28478k c28478k, com.avito.android.payment.webview.mvi.a aVar, com.avito.android.payment.o oVar, a aVar2) {
            this.f214151a = eVar;
            this.f214152b = oVar;
            this.f214153c = new e(eVar);
            this.f214154d = new C6428d(eVar);
            this.f214155e = new f(bVar);
            this.f214156f = new b(eVar);
            this.f214157g = new a(eVar);
            dagger.internal.l lVarA = dagger.internal.l.a(aVar);
            this.f214158h = lVarA;
            j jVar = new j(eVar);
            h hVar = new h(eVar);
            u<x> uVar = this.f214153c;
            u<com.avito.android.deeplink_events.registry.d> uVar2 = this.f214154d;
            u<com.avito.android.deeplink_handler.handler.composite.a> uVar3 = this.f214155e;
            u<InterfaceC28373a> uVar4 = this.f214156f;
            u<E> uVar5 = this.f214157g;
            this.f214161k = new com.avito.android.payment.webview.mvi.component.g(lVarA, uVar, uVar2, uVar3, uVar4, uVar5, jVar, hVar);
            this.f214162l = new com.avito.android.payment.webview.mvi.component.n(lVarA, uVar5, uVar4);
            this.f214163m = dagger.internal.l.a(new com.avito.android.payment.webview.mvi.m(new com.avito.android.payment.webview.mvi.l(new com.avito.android.payment.webview.mvi.component.l(com.avito.android.payment.webview.mvi.component.i.a(), this.f214161k, this.f214162l, com.avito.android.payment.webview.mvi.component.p.a()))));
            this.f214164n = new m(eVar);
            this.f214165o = com.avito.android.actions_sheet.a.D(dagger.internal.l.a(c28478k), this.f214164n);
            this.f214174x = dagger.internal.g.d(new X(new i(eVar), new p(eVar), new o(eVar), new com.avito.android.cookie_provider.d(new n(eVar)), new g(eVar), new l(eVar), new C6427c(eVar), new k(eVar)));
            this.f214175y = dagger.internal.g.d(new Y(this.f214158h, this.f214156f));
        }

        @Override // com.avito.android.payment.di.component.i
        public final void a(WebPaymentMviActivity webPaymentMviActivity) {
            webPaymentMviActivity.f214830m = (k.a) this.f214163m.f393949a;
            com.avito.android.payment.di.component.e eVar = this.f214151a;
            InterfaceC28373a interfaceC28373aA = eVar.a();
            t.c(interfaceC28373aA);
            webPaymentMviActivity.f214831n = interfaceC28373aA;
            webPaymentMviActivity.f214832o = this.f214165o.get();
            InterfaceC35745a5 interfaceC35745a5D = eVar.d();
            t.c(interfaceC35745a5D);
            webPaymentMviActivity.f214833p = interfaceC35745a5D;
            x xVarQ = eVar.q();
            t.c(xVarQ);
            webPaymentMviActivity.f214834q = xVarQ;
            eVar.Y9();
            webPaymentMviActivity.f214835r = this.f214174x.get();
            webPaymentMviActivity.f214836s = this.f214175y.get();
            E eI2 = eVar.i();
            t.c(eI2);
            webPaymentMviActivity.f214837t = eI2;
            com.avito.android.payment.o oVar = this.f214152b;
            webPaymentMviActivity.f214838u = new com.avito.android.payment.webview.mvi.view.f(oVar);
            webPaymentMviActivity.f214839v = oVar;
        }
    }

    public static i.a a() {
        return new b();
    }
}
