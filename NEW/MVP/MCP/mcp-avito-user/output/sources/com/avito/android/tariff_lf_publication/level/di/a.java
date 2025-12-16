package com.avito.android.tariff_lf_publication.level.di;

import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.tariff_lf_publication.level.TariffLfPublicationLevelFragment;
import com.avito.android.tariff_lf_publication.level.di.b;
import com.avito.android.tariff_lf_publication.level.i;
import com.avito.android.tariff_lf_publication.level.mvi.k;
import com.avito.android.tariff_lf_publication.level.mvi.m;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerTariffLfPublicationLevelComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerTariffLfPublicationLevelComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.tariff_lf_publication.level.di.b.a
        public final com.avito.android.tariff_lf_publication.level.di.b a(KD0.b bVar, InterfaceC39417a interfaceC39417a, r rVar, String str) {
            interfaceC39417a.getClass();
            return new c(bVar, interfaceC39417a, rVar, str, null);
        }
    }

    /* compiled from: DaggerTariffLfPublicationLevelComponent.java */
    public static final class c implements com.avito.android.tariff_lf_publication.level.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f300890a;

        /* renamed from: b, reason: collision with root package name */
        public final u<OD0.a> f300891b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f300892c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_publication.level.domain.a> f300893d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.tariff_lf_publication.level.mvi.f f300894e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.tariff_lf_publication.level.mvi.d f300895f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f300896g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f300897h;

        /* renamed from: i, reason: collision with root package name */
        public final i f300898i;

        /* compiled from: DaggerTariffLfPublicationLevelComponent.java */
        /* renamed from: com.avito.android.tariff_lf_publication.level.di.a$c$a, reason: collision with other inner class name */
        public static final class C9206a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final KD0.b f300899a;

            public C9206a(KD0.b bVar) {
                this.f300899a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f300899a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerTariffLfPublicationLevelComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final KD0.b f300900a;

            public b(KD0.b bVar) {
                this.f300900a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f300900a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerTariffLfPublicationLevelComponent.java */
        /* renamed from: com.avito.android.tariff_lf_publication.level.di.a$c$c, reason: collision with other inner class name */
        public static final class C9207c implements u<OD0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final KD0.b f300901a;

            public C9207c(KD0.b bVar) {
                this.f300901a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                OD0.a aVarMo1if = this.f300901a.mo1if();
                t.c(aVarMo1if);
                return aVarMo1if;
            }
        }

        public c(KD0.b bVar, cv.b bVar2, r rVar, String str, C9205a c9205a) {
            this.f300890a = bVar2;
            u<com.avito.android.tariff_lf_publication.level.domain.a> uVarD = dagger.internal.g.d(new com.avito.android.tariff_lf_publication.level.domain.c(l.a(str), new C9207c(bVar), new C9206a(bVar)));
            this.f300893d = uVarD;
            this.f300894e = new com.avito.android.tariff_lf_publication.level.mvi.f(uVarD);
            this.f300895f = new com.avito.android.tariff_lf_publication.level.mvi.d(uVarD);
            this.f300896g = new b(bVar);
            this.f300897h = dagger.internal.g.d(new C30060h5(this.f300896g, new h(l.a(rVar))));
            this.f300898i = new i(new com.avito.android.tariff_lf_publication.level.mvi.i(this.f300894e, this.f300895f, k.a(), m.a(), this.f300897h));
        }

        @Override // com.avito.android.tariff_lf_publication.level.di.b
        public final void a(TariffLfPublicationLevelFragment tariffLfPublicationLevelFragment) {
            tariffLfPublicationLevelFragment.f300870n0 = this.f300898i;
            tariffLfPublicationLevelFragment.f300871o0 = this.f300897h.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f300890a.u4();
            t.c(aVarU4);
            tariffLfPublicationLevelFragment.f300872p0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
