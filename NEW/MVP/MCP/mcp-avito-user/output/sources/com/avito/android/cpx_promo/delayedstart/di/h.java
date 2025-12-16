package com.avito.android.cpx_promo.delayedstart.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cpx_promo.delayedstart.CpxPromoDelayedStartContent;
import com.avito.android.cpx_promo.delayedstart.CpxPromoDelayedStartFragment;
import com.avito.android.cpx_promo.delayedstart.di.a;
import com.avito.android.cpx_promo.delayedstart.mvi.j;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerCpxPromoDelayedStartComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class h {

    /* compiled from: DaggerCpxPromoDelayedStartComponent.java */
    public static final class b implements com.avito.android.cpx_promo.delayedstart.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f126842a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.cpx_promo.delayedstart.mvi.e f126843b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.cpx_promo.delayedstart.mvi.c f126844c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28481c> f126845d;

        /* renamed from: e, reason: collision with root package name */
        public final u<C28478k> f126846e;

        /* renamed from: f, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f126847f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.cpx_promo.delayedstart.f f126848g;

        /* compiled from: DaggerCpxPromoDelayedStartComponent.java */
        public static final class a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cpx_promo.impl.di.d f126849a;

            public a(com.avito.android.cpx_promo.impl.di.d dVar) {
                this.f126849a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f126849a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(f fVar, com.avito.android.cpx_promo.impl.di.d dVar, cv.b bVar, r rVar, CpxPromoDelayedStartContent cpxPromoDelayedStartContent, a aVar) {
            this.f126842a = bVar;
            l lVarA = l.a(cpxPromoDelayedStartContent);
            this.f126843b = new com.avito.android.cpx_promo.delayedstart.mvi.e(lVarA);
            this.f126844c = new com.avito.android.cpx_promo.delayedstart.mvi.c(lVarA);
            this.f126845d = new a(dVar);
            u<C28478k> uVarD = dagger.internal.g.d(new g(fVar, l.a(rVar)));
            this.f126846e = uVarD;
            this.f126847f = com.avito.android.advert.item.delivery_suggests.l.i(this.f126845d, uVarD);
            this.f126848g = new com.avito.android.cpx_promo.delayedstart.f(new com.avito.android.cpx_promo.delayedstart.mvi.h(this.f126843b, this.f126844c, j.a(), com.avito.android.cpx_promo.delayedstart.mvi.l.a(), this.f126847f));
        }

        @Override // com.avito.android.cpx_promo.delayedstart.di.a
        public final void a(CpxPromoDelayedStartFragment cpxPromoDelayedStartFragment) {
            cpxPromoDelayedStartFragment.f126814n0 = this.f126848g;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f126842a.u4();
            t.c(aVarU4);
            cpxPromoDelayedStartFragment.f126816p0 = aVarU4;
            cpxPromoDelayedStartFragment.f126817q0 = this.f126847f.get();
        }
    }

    /* compiled from: DaggerCpxPromoDelayedStartComponent.java */
    public static final class c implements a.InterfaceC3781a {
        public c() {
        }

        @Override // com.avito.android.cpx_promo.delayedstart.di.a.InterfaceC3781a
        public final com.avito.android.cpx_promo.delayedstart.di.a a(com.avito.android.cpx_promo.impl.di.d dVar, r rVar, InterfaceC39417a interfaceC39417a, CpxPromoDelayedStartContent cpxPromoDelayedStartContent) {
            interfaceC39417a.getClass();
            return new b(new f(), dVar, interfaceC39417a, rVar, cpxPromoDelayedStartContent, null);
        }
    }

    public static a.InterfaceC3781a a() {
        return new c();
    }
}
