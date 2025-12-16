package com.avito.android.tariff.cpx.level.feature.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff.cpx.level.feature.TariffCpxLevelFeatureFragment;
import com.avito.android.tariff.cpx.level.feature.di.b;
import com.avito.android.tariff.cpx.level.feature.domain.TariffCpxLevelFeatureContent;
import com.avito.android.tariff.cpx.level.feature.mvi.j;
import com.avito.android.tariff.cpx.level.feature.mvi.n;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import v50.g;

/* compiled from: DaggerTariffCpxLevelFeatureComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTariffCpxLevelFeatureComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.tariff.cpx.level.feature.di.b.a
        public final com.avito.android.tariff.cpx.level.feature.di.b a(r rVar, WA0.b bVar, InterfaceC39417a interfaceC39417a, TariffCpxLevelFeatureContent tariffCpxLevelFeatureContent) {
            interfaceC39417a.getClass();
            return new c(bVar, interfaceC39417a, rVar, tariffCpxLevelFeatureContent, null);
        }
    }

    /* compiled from: DaggerTariffCpxLevelFeatureComponent.java */
    public static final class c implements com.avito.android.tariff.cpx.level.feature.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final WA0.b f296952a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f296953b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.level.feature.mvi.g f296954c;

        /* renamed from: d, reason: collision with root package name */
        public final u<g.b> f296955d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f296956e;

        /* renamed from: f, reason: collision with root package name */
        public final u<v50.g> f296957f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.level.feature.mvi.e f296958g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f296959h;

        /* renamed from: i, reason: collision with root package name */
        public final u<C28478k> f296960i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f296961j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.tariff.cpx.level.feature.d f296962k;

        /* compiled from: DaggerTariffCpxLevelFeatureComponent.java */
        /* renamed from: com.avito.android.tariff.cpx.level.feature.di.a$c$a, reason: collision with other inner class name */
        public static final class C9046a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f296963a;

            public C9046a(cv.b bVar) {
                this.f296963a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f296963a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerTariffCpxLevelFeatureComponent.java */
        public static final class b implements u<g.b> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f296964a;

            public b(WA0.b bVar) {
                this.f296964a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f296964a.S1();
            }
        }

        /* compiled from: DaggerTariffCpxLevelFeatureComponent.java */
        /* renamed from: com.avito.android.tariff.cpx.level.feature.di.a$c$c, reason: collision with other inner class name */
        public static final class C9047c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final WA0.b f296965a;

            public C9047c(WA0.b bVar) {
                this.f296965a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f296965a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(WA0.b bVar, cv.b bVar2, r rVar, TariffCpxLevelFeatureContent tariffCpxLevelFeatureContent, C9045a c9045a) {
            this.f296952a = bVar;
            this.f296953b = bVar2;
            this.f296954c = new com.avito.android.tariff.cpx.level.feature.mvi.g(l.a(tariffCpxLevelFeatureContent));
            u<v50.g> uVarD = dagger.internal.g.d(new f(new b(bVar), new C9046a(bVar2)));
            this.f296957f = uVarD;
            this.f296958g = new com.avito.android.tariff.cpx.level.feature.mvi.e(uVarD);
            this.f296959h = new C9047c(bVar);
            u<C28478k> uVarD2 = dagger.internal.g.d(new g(l.a(rVar)));
            this.f296960i = uVarD2;
            this.f296961j = com.avito.android.advert.item.delivery_suggests.l.i(this.f296959h, uVarD2);
            this.f296962k = new com.avito.android.tariff.cpx.level.feature.d(new j(this.f296954c, this.f296958g, com.avito.android.tariff.cpx.level.feature.mvi.l.a(), n.a(), this.f296961j));
        }

        @Override // com.avito.android.tariff.cpx.level.feature.di.b
        public final void a(TariffCpxLevelFeatureFragment tariffCpxLevelFeatureFragment) {
            tariffCpxLevelFeatureFragment.f296926h0 = this.f296962k;
            tariffCpxLevelFeatureFragment.f296928j0 = this.f296961j.get();
            InterfaceC28373a interfaceC28373aA = this.f296952a.a();
            t.c(interfaceC28373aA);
            tariffCpxLevelFeatureFragment.f296929k0 = interfaceC28373aA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f296953b.u4();
            t.c(aVarU4);
            tariffCpxLevelFeatureFragment.f296930l0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
