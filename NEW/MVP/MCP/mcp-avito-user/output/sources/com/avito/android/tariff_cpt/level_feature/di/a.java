package com.avito.android.tariff_cpt.level_feature.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.tariff_cpt.level_feature.TariffCptLevelFeatureFragment;
import com.avito.android.tariff_cpt.level_feature.di.b;
import com.avito.android.tariff_cpt.level_feature.domain.TariffCptLevelFeatureContent;
import com.avito.android.tariff_cpt.level_feature.mvi.j;
import com.avito.android.tariff_cpt.level_feature.mvi.n;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import v50.g;

/* compiled from: DaggerTariffCptLevelFeatureComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTariffCptLevelFeatureComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.tariff_cpt.level_feature.di.b.a
        public final com.avito.android.tariff_cpt.level_feature.di.b a(com.avito.android.tariff_cpt.common.di.d dVar, InterfaceC39417a interfaceC39417a, r rVar, TariffCptLevelFeatureContent tariffCptLevelFeatureContent) {
            interfaceC39417a.getClass();
            return new c(dVar, interfaceC39417a, rVar, tariffCptLevelFeatureContent, null);
        }
    }

    /* compiled from: DaggerTariffCptLevelFeatureComponent.java */
    public static final class c implements com.avito.android.tariff_cpt.level_feature.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.tariff_cpt.common.di.d f298451a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f298452b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.tariff_cpt.level_feature.mvi.g f298453c;

        /* renamed from: d, reason: collision with root package name */
        public final u<g.b> f298454d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f298455e;

        /* renamed from: f, reason: collision with root package name */
        public final u<v50.g> f298456f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.tariff_cpt.level_feature.mvi.e f298457g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f298458h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f298459i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.tariff_cpt.level_feature.c f298460j;

        /* compiled from: DaggerTariffCptLevelFeatureComponent.java */
        /* renamed from: com.avito.android.tariff_cpt.level_feature.di.a$c$a, reason: collision with other inner class name */
        public static final class C9118a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f298461a;

            public C9118a(cv.b bVar) {
                this.f298461a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f298461a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerTariffCptLevelFeatureComponent.java */
        public static final class b implements u<g.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f298462a;

            public b(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f298462a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f298462a.S1();
            }
        }

        /* compiled from: DaggerTariffCptLevelFeatureComponent.java */
        /* renamed from: com.avito.android.tariff_cpt.level_feature.di.a$c$c, reason: collision with other inner class name */
        public static final class C9119c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.tariff_cpt.common.di.d f298463a;

            public C9119c(com.avito.android.tariff_cpt.common.di.d dVar) {
                this.f298463a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f298463a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.tariff_cpt.common.di.d dVar, cv.b bVar, r rVar, TariffCptLevelFeatureContent tariffCptLevelFeatureContent, C9117a c9117a) {
            this.f298451a = dVar;
            this.f298452b = bVar;
            this.f298453c = new com.avito.android.tariff_cpt.level_feature.mvi.g(l.a(tariffCptLevelFeatureContent));
            u<v50.g> uVarD = dagger.internal.g.d(new f(new b(dVar), new C9118a(bVar)));
            this.f298456f = uVarD;
            this.f298457g = new com.avito.android.tariff_cpt.level_feature.mvi.e(uVarD);
            this.f298458h = new C9119c(dVar);
            this.f298459i = dagger.internal.g.d(new C30060h5(this.f298458h, new g(l.a(rVar))));
            this.f298460j = new com.avito.android.tariff_cpt.level_feature.c(new j(this.f298453c, this.f298457g, com.avito.android.tariff_cpt.level_feature.mvi.l.a(), n.a(), this.f298459i));
        }

        @Override // com.avito.android.tariff_cpt.level_feature.di.b
        public final void a(TariffCptLevelFeatureFragment tariffCptLevelFeatureFragment) {
            tariffCptLevelFeatureFragment.f298423h0 = this.f298460j;
            tariffCptLevelFeatureFragment.f298424i0 = this.f298459i.get();
            com.avito.android.tariff_cpt.common.di.d dVar = this.f298451a;
            InterfaceC28373a interfaceC28373aA = dVar.a();
            t.c(interfaceC28373aA);
            tariffCptLevelFeatureFragment.f298425j0 = interfaceC28373aA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f298452b.u4();
            t.c(aVarU4);
            tariffCptLevelFeatureFragment.f298426k0 = aVarU4;
            com.avito.android.util.text.a aVarE = dVar.e();
            t.c(aVarE);
            tariffCptLevelFeatureFragment.f298427l0 = aVarE;
        }
    }

    public static b.a a() {
        return new b();
    }
}
