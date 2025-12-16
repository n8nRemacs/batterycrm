package com.avito.android.comfortable_deal.submitting.promo.di;

import Yo.v;
import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.repository.o;
import com.avito.android.comfortable_deal.submitting.promo.PromoFragment;
import com.avito.android.comfortable_deal.submitting.promo.b;
import com.avito.android.comfortable_deal.submitting.promo.di.b;
import com.avito.android.comfortable_deal.submitting.promo.mvi.h;
import com.avito.android.comfortable_deal.submitting.promo.mvi.k;
import com.avito.android.comfortable_deal.submitting.promo.mvi.m;
import com.avito.konveyor.adapter.j;
import cp.InterfaceC39387a;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import qp.C47425b;

/* compiled from: DaggerPromoComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerPromoComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.comfortable_deal.submitting.promo.di.b.a
        public final com.avito.android.comfortable_deal.submitting.promo.di.b a(com.avito.android.comfortable_deal.submitting.promo.di.c cVar, InterfaceC39417a interfaceC39417a, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new c(interfaceC39417a, cVar, c28478k, null);
        }
    }

    /* compiled from: DaggerPromoComponent.java */
    public static final class c implements com.avito.android.comfortable_deal.submitting.promo.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f123122a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.submitting.promo.di.c f123123b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC39387a> f123124c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f123125d;

        /* renamed from: e, reason: collision with root package name */
        public final v f123126e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.submitting.promo.mvi.e f123127f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f123128g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f123129h;

        /* renamed from: i, reason: collision with root package name */
        public final u<Context> f123130i;

        /* renamed from: j, reason: collision with root package name */
        public final h f123131j;

        /* renamed from: k, reason: collision with root package name */
        public final l f123132k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.submitting.recycler.items.imageBulletItem.b f123133l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.submitting.recycler.items.titleBulletItem.b f123134m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f123135n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f123136o;

        /* renamed from: p, reason: collision with root package name */
        public final u<j> f123137p;

        /* compiled from: DaggerPromoComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.submitting.promo.di.a$c$a, reason: collision with other inner class name */
        public static final class C3666a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.submitting.promo.di.c f123138a;

            public C3666a(com.avito.android.comfortable_deal.submitting.promo.di.c cVar) {
                this.f123138a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f123138a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerPromoComponent.java */
        public static final class b implements u<InterfaceC39387a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.submitting.promo.di.c f123139a;

            public b(com.avito.android.comfortable_deal.submitting.promo.di.c cVar) {
                this.f123139a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39387a interfaceC39387aQ2 = this.f123139a.Q2();
                t.c(interfaceC39387aQ2);
                return interfaceC39387aQ2;
            }
        }

        /* compiled from: DaggerPromoComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.submitting.promo.di.a$c$c, reason: collision with other inner class name */
        public static final class C3667c implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.submitting.promo.di.c f123140a;

            public C3667c(com.avito.android.comfortable_deal.submitting.promo.di.c cVar) {
                this.f123140a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f123140a.g();
            }
        }

        /* compiled from: DaggerPromoComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.submitting.promo.di.c f123141a;

            public d(com.avito.android.comfortable_deal.submitting.promo.di.c cVar) {
                this.f123141a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f123141a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(cv.b bVar, com.avito.android.comfortable_deal.submitting.promo.di.c cVar, C28478k c28478k, C3665a c3665a) {
            this.f123122a = bVar;
            this.f123123b = cVar;
            com.avito.android.comfortable_deal.domain.f fVar = new com.avito.android.comfortable_deal.domain.f(new b(cVar));
            v vVar = new v(new C3666a(cVar));
            this.f123126e = vVar;
            this.f123127f = new com.avito.android.comfortable_deal.submitting.promo.mvi.e(fVar, vVar);
            this.f123128g = new d(cVar);
            this.f123129h = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f123128g);
            this.f123131j = new h(new o(new C47425b(new C3667c(cVar))), this.f123126e);
            this.f123132k = l.a(new com.avito.android.comfortable_deal.submitting.promo.d(new com.avito.android.comfortable_deal.submitting.promo.c(new k(this.f123127f, m.a(), com.avito.android.comfortable_deal.submitting.promo.mvi.o.a(), this.f123129h, this.f123131j))));
            this.f123133l = new com.avito.android.comfortable_deal.submitting.recycler.items.imageBulletItem.b(com.avito.android.comfortable_deal.submitting.recycler.items.imageBulletItem.d.a());
            this.f123134m = new com.avito.android.comfortable_deal.submitting.recycler.items.titleBulletItem.b(com.avito.android.comfortable_deal.submitting.recycler.items.titleBulletItem.d.a());
            u<com.avito.konveyor.a> uVarD = dagger.internal.g.d(new f(this.f123133l, this.f123134m, new com.avito.android.comfortable_deal.submitting.recycler.items.NumeratedBulletItem.b(com.avito.android.comfortable_deal.submitting.recycler.items.NumeratedBulletItem.d.a())));
            this.f123135n = uVarD;
            u<com.avito.konveyor.adapter.a> uVarD2 = dagger.internal.g.d(new e(uVarD));
            this.f123136o = uVarD2;
            this.f123137p = dagger.internal.g.d(new g(uVarD2, this.f123135n));
        }

        @Override // com.avito.android.comfortable_deal.submitting.promo.di.b
        public final void a(PromoFragment promoFragment) {
            promoFragment.f123101n0 = (b.a) this.f123132k.f393949a;
            promoFragment.f123103p0 = this.f123136o.get();
            promoFragment.f123104q0 = this.f123137p.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f123122a.u4();
            t.c(aVarU4);
            promoFragment.f123105r0 = aVarU4;
            promoFragment.f123106s0 = this.f123129h.get();
            t.c(this.f123123b.a());
        }
    }

    public static b.a a() {
        return new b();
    }
}
