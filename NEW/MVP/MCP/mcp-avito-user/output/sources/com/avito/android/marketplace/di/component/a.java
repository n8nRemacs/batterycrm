package com.avito.android.marketplace.di.component;

import com.avito.android.H0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import com.avito.android.marketplace.FinanceMarketplaceActivity;
import com.avito.android.marketplace.di.component.b;
import com.avito.android.marketplace.k;
import com.avito.android.marketplace.m;
import com.avito.android.marketplace.mvi.components.g;
import com.avito.android.marketplace.mvi.components.i;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import kY.C42645b;

/* compiled from: DaggerFinanceMarketplaceComponent.java */
@e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerFinanceMarketplaceComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.marketplace.di.component.b.a
        public final com.avito.android.marketplace.di.component.b a(com.avito.android.marketplace.di.component.c cVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, String str, k kVar) {
            interfaceC39417a.getClass();
            str.getClass();
            return new c(cVar, interfaceC39417a, c28478k, str, kVar, null);
        }
    }

    /* compiled from: DaggerFinanceMarketplaceComponent.java */
    public static final class c implements com.avito.android.marketplace.di.component.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.marketplace.di.component.c f185900a;

        /* renamed from: b, reason: collision with root package name */
        public final k f185901b;

        /* renamed from: c, reason: collision with root package name */
        public final cv.b f185902c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f185903d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.marketplace.mvi.components.b f185904e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.marketplace.u f185905f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f185906g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f185907h;

        /* renamed from: i, reason: collision with root package name */
        public final u<B0> f185908i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f185909j;

        /* renamed from: k, reason: collision with root package name */
        public final u<C> f185910k;

        /* renamed from: l, reason: collision with root package name */
        public final u<H0> f185911l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.cookie_provider.e> f185912m;

        /* compiled from: DaggerFinanceMarketplaceComponent.java */
        /* renamed from: com.avito.android.marketplace.di.component.a$c$a, reason: collision with other inner class name */
        public static final class C5452a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.marketplace.di.component.c f185913a;

            public C5452a(com.avito.android.marketplace.di.component.c cVar) {
                this.f185913a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f185913a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerFinanceMarketplaceComponent.java */
        public static final class b implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.marketplace.di.component.c f185914a;

            public b(com.avito.android.marketplace.di.component.c cVar) {
                this.f185914a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f185914a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerFinanceMarketplaceComponent.java */
        /* renamed from: com.avito.android.marketplace.di.component.a$c$c, reason: collision with other inner class name */
        public static final class C5453c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f185915a;

            public C5453c(cv.b bVar) {
                this.f185915a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f185915a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerFinanceMarketplaceComponent.java */
        public static final class d implements u<H0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.marketplace.di.component.c f185916a;

            public d(com.avito.android.marketplace.di.component.c cVar) {
                this.f185916a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                H0 h0M = this.f185916a.M();
                t.c(h0M);
                return h0M;
            }
        }

        /* compiled from: DaggerFinanceMarketplaceComponent.java */
        public static final class e implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.marketplace.di.component.c f185917a;

            public e(com.avito.android.marketplace.di.component.c cVar) {
                this.f185917a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f185917a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerFinanceMarketplaceComponent.java */
        public static final class f implements u<B0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.marketplace.di.component.c f185918a;

            public f(com.avito.android.marketplace.di.component.c cVar) {
                this.f185918a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f185918a.s5();
            }
        }

        public c(com.avito.android.marketplace.di.component.c cVar, cv.b bVar, C28478k c28478k, String str, k kVar, C5451a c5451a) {
            this.f185900a = cVar;
            this.f185901b = kVar;
            this.f185902c = bVar;
            this.f185904e = new com.avito.android.marketplace.mvi.components.b(new C5453c(bVar));
            this.f185905f = new com.avito.android.marketplace.u(new g(com.avito.android.marketplace.mvi.components.d.a(), this.f185904e, i.a(), com.avito.android.marketplace.mvi.components.k.a()));
            this.f185906g = new C5452a(cVar);
            this.f185907h = com.avito.android.actions_sheet.a.D(l.a(c28478k), this.f185906g);
            this.f185912m = dagger.internal.g.d(new C42645b(new f(cVar), new com.avito.android.cookie_provider.d(new e(cVar)), new b(cVar), new d(cVar)));
        }

        @Override // com.avito.android.marketplace.di.component.b
        public final void a(FinanceMarketplaceActivity financeMarketplaceActivity) {
            financeMarketplaceActivity.f185849m = this.f185905f;
            financeMarketplaceActivity.f185851o = this.f185907h.get();
            financeMarketplaceActivity.f185852p = this.f185912m.get();
            com.avito.android.marketplace.di.component.c cVar = this.f185900a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            financeMarketplaceActivity.f185853q = interfaceC28373aA;
            InterfaceC28373a interfaceC28373aA2 = cVar.a();
            t.c(interfaceC28373aA2);
            financeMarketplaceActivity.f185854r = new m(interfaceC28373aA2, this.f185901b);
            InterfaceC35745a5 interfaceC35745a5D = cVar.d();
            t.c(interfaceC35745a5D);
            financeMarketplaceActivity.f185855s = interfaceC35745a5D;
            x xVarQ = cVar.q();
            t.c(xVarQ);
            financeMarketplaceActivity.f185856t = xVarQ;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f185902c.u4();
            t.c(aVarU4);
            financeMarketplaceActivity.f185857u = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
