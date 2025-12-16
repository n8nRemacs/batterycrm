package com.avito.android.services_portfolio.project.di;

import com.avito.android.C29640d;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.services_portfolio.project.PortfolioProjectArguments;
import com.avito.android.services_portfolio.project.buyer.mvi.i;
import com.avito.android.services_portfolio.project.buyer.mvi.k;
import com.avito.android.services_portfolio.project.buyer.mvi.m;
import com.avito.android.services_portfolio.project.buyer.mvi.o;
import com.avito.android.services_portfolio.project.buyer.ui.PortfolioProjectBuyerFragment;
import com.avito.android.services_portfolio.project.di.c;
import cv.InterfaceC39417a;
import cv0.InterfaceC39418a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import ov0.InterfaceC44945a;

/* compiled from: DaggerPortfolioProjectBuyerFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerPortfolioProjectBuyerFragmentComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.services_portfolio.project.di.c.a
        public final com.avito.android.services_portfolio.project.di.c a(C28478k c28478k, PortfolioProjectArguments.BuyerArgs buyerArgs, InterfaceC39417a interfaceC39417a, d dVar) {
            buyerArgs.getClass();
            interfaceC39417a.getClass();
            return new c(interfaceC39417a, dVar, c28478k, buyerArgs, null);
        }
    }

    /* compiled from: DaggerPortfolioProjectBuyerFragmentComponent.java */
    public static final class c implements com.avito.android.services_portfolio.project.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.services_portfolio.project.di.d f280172a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f280173b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC39418a> f280174c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC44945a> f280175d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.services_portfolio.project.buyer.domain.b f280176e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.services_portfolio.project.buyer.mvi.f f280177f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f280178g;

        /* renamed from: h, reason: collision with root package name */
        public final u<C29640d> f280179h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.services_portfolio.project.buyer.mvi.d f280180i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28481c> f280181j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f280182k;

        /* renamed from: l, reason: collision with root package name */
        public final o f280183l;

        /* compiled from: DaggerPortfolioProjectBuyerFragmentComponent.java */
        /* renamed from: com.avito.android.services_portfolio.project.di.a$c$a, reason: collision with other inner class name */
        public static final class C8332a implements u<C29640d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.services_portfolio.project.di.d f280184a;

            public C8332a(com.avito.android.services_portfolio.project.di.d dVar) {
                this.f280184a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f280184a.Q();
            }
        }

        /* compiled from: DaggerPortfolioProjectBuyerFragmentComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.services_portfolio.project.di.d f280185a;

            public b(com.avito.android.services_portfolio.project.di.d dVar) {
                this.f280185a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f280185a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerPortfolioProjectBuyerFragmentComponent.java */
        /* renamed from: com.avito.android.services_portfolio.project.di.a$c$c, reason: collision with other inner class name */
        public static final class C8333c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.services_portfolio.project.di.d f280186a;

            public C8333c(com.avito.android.services_portfolio.project.di.d dVar) {
                this.f280186a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f280186a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerPortfolioProjectBuyerFragmentComponent.java */
        public static final class d implements u<InterfaceC39418a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.services_portfolio.project.di.d f280187a;

            public d(com.avito.android.services_portfolio.project.di.d dVar) {
                this.f280187a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39418a interfaceC39418aW5 = this.f280187a.w5();
                t.c(interfaceC39418aW5);
                return interfaceC39418aW5;
            }
        }

        /* compiled from: DaggerPortfolioProjectBuyerFragmentComponent.java */
        public static final class e implements u<InterfaceC44945a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.services_portfolio.project.di.d f280188a;

            public e(com.avito.android.services_portfolio.project.di.d dVar) {
                this.f280188a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f280188a.ta();
            }
        }

        public c(cv.b bVar, com.avito.android.services_portfolio.project.di.d dVar, C28478k c28478k, PortfolioProjectArguments.BuyerArgs buyerArgs, C8331a c8331a) {
            this.f280172a = dVar;
            this.f280173b = bVar;
            this.f280176e = new com.avito.android.services_portfolio.project.buyer.domain.b(new d(dVar), new e(dVar));
            l lVarA = l.a(buyerArgs);
            com.avito.android.services_portfolio.project.buyer.domain.b bVar2 = this.f280176e;
            this.f280177f = new com.avito.android.services_portfolio.project.buyer.mvi.f(bVar2, lVarA);
            this.f280180i = new com.avito.android.services_portfolio.project.buyer.mvi.d(bVar2, new gv0.b(new b(dVar), new C8332a(dVar)), lVarA);
            this.f280181j = new C8333c(dVar);
            this.f280182k = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f280181j);
            this.f280183l = new o(new i(this.f280177f, this.f280180i, k.a(), m.a(), this.f280182k));
        }

        @Override // com.avito.android.services_portfolio.project.di.c
        public final void a(PortfolioProjectBuyerFragment portfolioProjectBuyerFragment) {
            portfolioProjectBuyerFragment.f280065n0 = this.f280183l;
            portfolioProjectBuyerFragment.f280067p0 = this.f280182k.get();
            portfolioProjectBuyerFragment.f280068q0 = this.f280172a.F0();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f280173b.u4();
            t.c(aVarU4);
            portfolioProjectBuyerFragment.f280069r0 = aVarU4;
        }
    }

    public static c.a a() {
        return new b();
    }
}
