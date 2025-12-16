package com.avito.android.services_portfolio.project.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.services_portfolio.project.PortfolioProjectArguments;
import com.avito.android.services_portfolio.project.di.f;
import com.avito.android.services_portfolio.project.seller.mvi.i;
import com.avito.android.services_portfolio.project.seller.mvi.k;
import com.avito.android.services_portfolio.project.seller.mvi.m;
import com.avito.android.services_portfolio.project.seller.mvi.o;
import com.avito.android.services_portfolio.project.seller.ui.PortfolioProjectSellerFragment;
import cv.InterfaceC39417a;
import cv0.InterfaceC39418a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerPortfolioProjectSellerFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: DaggerPortfolioProjectSellerFragmentComponent.java */
    /* renamed from: com.avito.android.services_portfolio.project.di.b$b, reason: collision with other inner class name */
    public static final class C8334b implements f.a {
        public C8334b() {
        }

        @Override // com.avito.android.services_portfolio.project.di.f.a
        public final f a(C28478k c28478k, PortfolioProjectArguments.SellerArgs sellerArgs, InterfaceC39417a interfaceC39417a, e eVar) {
            sellerArgs.getClass();
            interfaceC39417a.getClass();
            return new c(interfaceC39417a, eVar, c28478k, sellerArgs, null);
        }
    }

    /* compiled from: DaggerPortfolioProjectSellerFragmentComponent.java */
    public static final class c implements f {

        /* renamed from: a, reason: collision with root package name */
        public final e f280189a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f280190b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC39418a> f280191c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.services_portfolio.project.seller.domain.b f280192d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.services_portfolio.project.seller.mvi.f f280193e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f280194f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.services_portfolio.project.seller.mvi.d f280195g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f280196h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f280197i;

        /* renamed from: j, reason: collision with root package name */
        public final o f280198j;

        /* compiled from: DaggerPortfolioProjectSellerFragmentComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f280199a;

            public a(e eVar) {
                this.f280199a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f280199a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerPortfolioProjectSellerFragmentComponent.java */
        /* renamed from: com.avito.android.services_portfolio.project.di.b$c$b, reason: collision with other inner class name */
        public static final class C8335b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final e f280200a;

            public C8335b(e eVar) {
                this.f280200a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f280200a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerPortfolioProjectSellerFragmentComponent.java */
        /* renamed from: com.avito.android.services_portfolio.project.di.b$c$c, reason: collision with other inner class name */
        public static final class C8336c implements u<InterfaceC39418a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f280201a;

            public C8336c(e eVar) {
                this.f280201a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39418a interfaceC39418aW5 = this.f280201a.w5();
                t.c(interfaceC39418aW5);
                return interfaceC39418aW5;
            }
        }

        public c(cv.b bVar, e eVar, C28478k c28478k, PortfolioProjectArguments.SellerArgs sellerArgs, a aVar) {
            this.f280189a = eVar;
            this.f280190b = bVar;
            this.f280192d = new com.avito.android.services_portfolio.project.seller.domain.b(new C8336c(eVar));
            l lVarA = l.a(sellerArgs);
            com.avito.android.services_portfolio.project.seller.domain.b bVar2 = this.f280192d;
            this.f280193e = new com.avito.android.services_portfolio.project.seller.mvi.f(bVar2, lVarA);
            this.f280195g = new com.avito.android.services_portfolio.project.seller.mvi.d(bVar2, lVarA, new a(eVar));
            this.f280196h = new C8335b(eVar);
            this.f280197i = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f280196h);
            this.f280198j = new o(new i(this.f280193e, this.f280195g, k.a(), m.a(), this.f280197i));
        }

        @Override // com.avito.android.services_portfolio.project.di.f
        public final void a(PortfolioProjectSellerFragment portfolioProjectSellerFragment) {
            portfolioProjectSellerFragment.f280297n0 = this.f280198j;
            portfolioProjectSellerFragment.f280299p0 = this.f280197i.get();
            portfolioProjectSellerFragment.f280300q0 = this.f280189a.g1();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f280190b.u4();
            t.c(aVarU4);
            portfolioProjectSellerFragment.f280301r0 = aVarU4;
        }
    }

    public static f.a a() {
        return new C8334b();
    }
}
