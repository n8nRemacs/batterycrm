package com.avito.android.tariff.cpx.info.limits.di;

import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.tariff.cpx.info.limits.TariffCpxInfoLimitsFragment;
import com.avito.android.tariff.cpx.info.limits.di.b;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerTariffCpxInfoLimitsComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTariffCpxInfoLimitsComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.tariff.cpx.info.limits.di.b.a
        public final com.avito.android.tariff.cpx.info.limits.di.b a(r rVar, e eVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(eVar, interfaceC39417a, rVar, null);
        }
    }

    /* compiled from: DaggerTariffCpxInfoLimitsComponent.java */
    public static final class c implements com.avito.android.tariff.cpx.info.limits.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f296580a;

        /* renamed from: b, reason: collision with root package name */
        public final u<RB0.a> f296581b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f296582c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.info.limits.mvi.d f296583d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.info.limits.mvi.b f296584e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f296585f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f296586g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.info.limits.h f296587h;

        /* compiled from: DaggerTariffCpxInfoLimitsComponent.java */
        /* renamed from: com.avito.android.tariff.cpx.info.limits.di.a$c$a, reason: collision with other inner class name */
        public static final class C9028a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final e f296588a;

            public C9028a(e eVar) {
                this.f296588a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f296588a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerTariffCpxInfoLimitsComponent.java */
        public static final class b implements u<RB0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f296589a;

            public b(e eVar) {
                this.f296589a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                RB0.a aVarB6 = this.f296589a.B6();
                t.c(aVarB6);
                return aVarB6;
            }
        }

        /* compiled from: DaggerTariffCpxInfoLimitsComponent.java */
        /* renamed from: com.avito.android.tariff.cpx.info.limits.di.a$c$c, reason: collision with other inner class name */
        public static final class C9029c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final e f296590a;

            public C9029c(e eVar) {
                this.f296590a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f296590a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(e eVar, cv.b bVar, r rVar, C9027a c9027a) {
            this.f296580a = bVar;
            com.avito.android.tariff.cpx.info.limits.mvi.domain.b bVar2 = new com.avito.android.tariff.cpx.info.limits.mvi.domain.b(new b(eVar), new C9028a(eVar));
            this.f296583d = new com.avito.android.tariff.cpx.info.limits.mvi.d(bVar2);
            this.f296584e = new com.avito.android.tariff.cpx.info.limits.mvi.b(bVar2);
            this.f296585f = new C9029c(eVar);
            this.f296586g = dagger.internal.g.d(new C30060h5(this.f296585f, new i(l.a(rVar))));
            this.f296587h = new com.avito.android.tariff.cpx.info.limits.h(new com.avito.android.tariff.cpx.info.limits.mvi.g(this.f296583d, this.f296584e, com.avito.android.tariff.cpx.info.limits.mvi.i.a(), com.avito.android.tariff.cpx.info.limits.mvi.l.a(), this.f296586g));
        }

        @Override // com.avito.android.tariff.cpx.info.limits.di.b
        public final void a(TariffCpxInfoLimitsFragment tariffCpxInfoLimitsFragment) {
            tariffCpxInfoLimitsFragment.f296560n0 = this.f296587h;
            tariffCpxInfoLimitsFragment.f296562p0 = this.f296586g.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f296580a.u4();
            t.c(aVarU4);
            tariffCpxInfoLimitsFragment.f296563q0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
