package com.avito.android.tariff_cpt.configure.landing.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff_cpt.configure.landing.TariffCptConfigureLandingFragment;
import com.avito.android.tariff_cpt.configure.landing.di.b;
import com.avito.android.tariff_cpt.configure.landing.mvi.i;
import com.avito.android.tariff_cpt.configure.landing.mvi.k;
import com.avito.android.tariff_cpt.configure.landing.mvi.m;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerTariffCptConfigureLandingComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTariffCptConfigureLandingComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.tariff_cpt.configure.landing.di.b.a
        public final com.avito.android.tariff_cpt.configure.landing.di.b a(com.avito.android.tariff_cpt.common.di.d dVar, InterfaceC39417a interfaceC39417a, r rVar, String str, String str2) {
            interfaceC39417a.getClass();
            return new c(dVar, interfaceC39417a, rVar, str, str2, null);
        }
    }

    /* compiled from: DaggerTariffCptConfigureLandingComponent.java */
    public static final class c implements com.avito.android.tariff_cpt.configure.landing.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f297739a;

        /* renamed from: b, reason: collision with root package name */
        public final l f297740b;

        /* renamed from: c, reason: collision with root package name */
        public final u<JC0.a> f297741c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f297742d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.tariff_cpt.configure.landing.domain.a> f297743e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.tariff_cpt.configure.landing.mvi.f f297744f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.tariff_cpt.configure.landing.mvi.d f297745g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f297746h;

        /* renamed from: i, reason: collision with root package name */
        public final u<C28478k> f297747i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f297748j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.tariff_cpt.configure.landing.f f297749k;

        /* compiled from: DaggerTariffCptConfigureLandingComponent.java */
        /* renamed from: com.avito.android.tariff_cpt.configure.landing.di.a$c$a, reason: collision with other inner class name */
        public static final class C9092a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f297750a;

            public C9092a(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f297750a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f297750a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerTariffCptConfigureLandingComponent.java */
        public static final class b implements u<JC0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f297751a;

            public b(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f297751a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                JC0.a aVarLl = this.f297751a.Ll();
                t.c(aVarLl);
                return aVarLl;
            }
        }

        /* compiled from: DaggerTariffCptConfigureLandingComponent.java */
        /* renamed from: com.avito.android.tariff_cpt.configure.landing.di.a$c$c, reason: collision with other inner class name */
        public static final class C9093c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f297752a;

            public C9093c(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f297752a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f297752a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.tariff_cpt.common.di.d dVar, cv.b bVar, r rVar, String str, String str2, C9091a c9091a) {
            this.f297739a = bVar;
            this.f297740b = l.b(str);
            u<com.avito.android.tariff_cpt.configure.landing.domain.a> uVarD = g.d(new com.avito.android.tariff_cpt.configure.landing.domain.c(this.f297740b, l.b(str2), new b(dVar), new C9092a(dVar)));
            this.f297743e = uVarD;
            this.f297744f = new com.avito.android.tariff_cpt.configure.landing.mvi.f(uVarD);
            this.f297745g = new com.avito.android.tariff_cpt.configure.landing.mvi.d(uVarD);
            this.f297746h = new C9093c(dVar);
            u<C28478k> uVarD2 = g.d(new d(l.a(rVar)));
            this.f297747i = uVarD2;
            this.f297748j = com.avito.android.advert.item.delivery_suggests.l.i(this.f297746h, uVarD2);
            this.f297749k = new com.avito.android.tariff_cpt.configure.landing.f(new i(this.f297744f, this.f297745g, k.a(), m.a(), this.f297748j));
        }

        @Override // com.avito.android.tariff_cpt.configure.landing.di.b
        public final void a(TariffCptConfigureLandingFragment tariffCptConfigureLandingFragment) {
            tariffCptConfigureLandingFragment.f297659n0 = this.f297749k;
            tariffCptConfigureLandingFragment.f297660o0 = this.f297748j.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f297739a.u4();
            t.c(aVarU4);
            tariffCptConfigureLandingFragment.f297661p0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
