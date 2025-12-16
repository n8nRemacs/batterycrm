package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di;

import Zx.C19616a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.b;
import com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.n;
import com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.q;
import com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.CpxPromoGeoFragment;
import com.avito.android.di.module.C30060h5;
import com.avito.android.paid_services.PaidServicesResultRepository;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import ns.InterfaceC44470a;

/* compiled from: DaggerCpxPromoGeoComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class j {

    /* compiled from: DaggerCpxPromoGeoComponent.java */
    public static final class b implements com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f127803a;

        /* renamed from: b, reason: collision with root package name */
        public final u<R0> f127804b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC44470a> f127805c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f127806d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.c f127807e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.i f127808f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f127809g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.a> f127810h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f127811i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.g f127812j;

        /* renamed from: k, reason: collision with root package name */
        public final u<C19616a> f127813k;

        /* renamed from: l, reason: collision with root package name */
        public final q f127814l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28481c> f127815m;

        /* renamed from: n, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f127816n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.h f127817o;

        /* compiled from: DaggerCpxPromoGeoComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.e f127818a;

            public a(com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.e eVar) {
                this.f127818a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f127818a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCpxPromoGeoComponent.java */
        /* renamed from: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.j$b$b, reason: collision with other inner class name */
        public static final class C3798b implements u<InterfaceC44470a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.e f127819a;

            public C3798b(com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.e eVar) {
                this.f127819a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44470a interfaceC44470aU6 = this.f127819a.u6();
                t.c(interfaceC44470aU6);
                return interfaceC44470aU6;
            }
        }

        /* compiled from: DaggerCpxPromoGeoComponent.java */
        public static final class c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f127820a;

            public c(cv.b bVar) {
                this.f127820a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f127820a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerCpxPromoGeoComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.e f127821a;

            public d(com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.e eVar) {
                this.f127821a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f127821a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerCpxPromoGeoComponent.java */
        public static final class e implements u<C19616a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.e f127822a;

            public e(com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.e eVar) {
                this.f127822a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f127822a.l1();
            }
        }

        /* compiled from: DaggerCpxPromoGeoComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.e f127823a;

            public f(com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.e eVar) {
                this.f127823a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f127823a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.e eVar, cv.b bVar, String str, String str2, r rVar, PaidServicesResultRepository paidServicesResultRepository, a aVar) {
            this.f127803a = bVar;
            this.f127804b = new d(eVar);
            this.f127805c = new C3798b(eVar);
            dagger.internal.l lVarA = dagger.internal.l.a(str);
            this.f127806d = lVarA;
            com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.c cVar = new com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.c(lVarA, this.f127804b, this.f127805c);
            this.f127807e = cVar;
            this.f127808f = new com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.i(cVar);
            this.f127809g = new a(eVar);
            u<com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.a> uVarD = dagger.internal.g.d(new com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.c(dagger.internal.l.a(str2), this.f127809g));
            this.f127810h = uVarD;
            this.f127812j = new com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.g(this.f127807e, uVarD, new com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.f(this.f127806d, this.f127805c, this.f127804b), new c(bVar));
            this.f127814l = new q(new e(eVar));
            this.f127815m = new f(eVar);
            this.f127816n = dagger.internal.g.d(new C30060h5(this.f127815m, new i(dagger.internal.l.a(rVar))));
            this.f127817o = new com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.h(new com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.l(this.f127808f, this.f127812j, n.a(), this.f127814l, this.f127816n));
        }

        @Override // com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.b
        public final void a(CpxPromoGeoFragment cpxPromoGeoFragment) {
            cpxPromoGeoFragment.f127916n0 = this.f127817o;
            cpxPromoGeoFragment.f127918p0 = this.f127816n.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f127803a.u4();
            t.c(aVarU4);
            cpxPromoGeoFragment.f127919q0 = aVarU4;
        }
    }

    /* compiled from: DaggerCpxPromoGeoComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.b.a
        public final com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.b a(String str, String str2, r rVar, PaidServicesResultRepository paidServicesResultRepository, e eVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(eVar, interfaceC39417a, str, str2, rVar, paidServicesResultRepository, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
