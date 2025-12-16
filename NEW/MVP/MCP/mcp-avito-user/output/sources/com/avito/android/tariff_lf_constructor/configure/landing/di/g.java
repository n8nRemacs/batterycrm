package com.avito.android.tariff_lf_constructor.configure.landing.di;

import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff_lf_constructor.configure.landing.ConstructorLandingFragment;
import com.avito.android.tariff_lf_constructor.configure.landing.di.a;
import com.avito.android.tariff_lf_constructor.configure.landing.mvi.o;
import com.avito.konveyor.adapter.j;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import gD0.InterfaceC40574b;
import pD0.InterfaceC46937a;

/* compiled from: DaggerConstructorLandingComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class g {

    /* compiled from: DaggerConstructorLandingComponent.java */
    public static final class b implements com.avito.android.tariff_lf_constructor.configure.landing.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f299661a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC46937a> f299662b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.tariff_lf_constructor.configure.landing.mvi.g f299663c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f299664d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.tariff_lf_constructor.configure.landing.mvi.e f299665e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f299666f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C28478k> f299667g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f299668h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.tariff_lf_constructor.configure.landing.e f299669i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.landing.items.header.d> f299670j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.tariff_lf_constructor.configure.landing.items.header.c f299671k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.tariff_lf_constructor.configure.landing.items.landing_feature.d> f299672l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f299673m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f299674n;

        /* renamed from: o, reason: collision with root package name */
        public final u<j> f299675o;

        /* compiled from: DaggerConstructorLandingComponent.java */
        public static final class a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f299676a;

            public a(cv.b bVar) {
                this.f299676a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f299676a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerConstructorLandingComponent.java */
        /* renamed from: com.avito.android.tariff_lf_constructor.configure.landing.di.g$b$b, reason: collision with other inner class name */
        public static final class C9168b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f299677a;

            public C9168b(InterfaceC40574b interfaceC40574b) {
                this.f299677a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f299677a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerConstructorLandingComponent.java */
        public static final class c implements u<InterfaceC46937a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40574b f299678a;

            public c(InterfaceC40574b interfaceC40574b) {
                this.f299678a = interfaceC40574b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC46937a interfaceC46937aJd = this.f299678a.Jd();
                t.c(interfaceC46937aJd);
                return interfaceC46937aJd;
            }
        }

        public b(InterfaceC40574b interfaceC40574b, cv.b bVar, Fragment fragment, r rVar, a aVar) {
            this.f299661a = bVar;
            com.avito.android.tariff_lf_constructor.configure.landing.domain.b bVar2 = new com.avito.android.tariff_lf_constructor.configure.landing.domain.b(new c(interfaceC40574b));
            this.f299663c = new com.avito.android.tariff_lf_constructor.configure.landing.mvi.g(bVar2);
            this.f299665e = new com.avito.android.tariff_lf_constructor.configure.landing.mvi.e(bVar2, new a(bVar));
            this.f299666f = new C9168b(interfaceC40574b);
            u<C28478k> uVarD = dagger.internal.g.d(new e(l.a(rVar)));
            this.f299667g = uVarD;
            this.f299668h = com.avito.android.advert.item.delivery_suggests.l.i(this.f299666f, uVarD);
            this.f299669i = new com.avito.android.tariff_lf_constructor.configure.landing.e(new com.avito.android.tariff_lf_constructor.configure.landing.mvi.j(this.f299663c, this.f299665e, com.avito.android.tariff_lf_constructor.configure.landing.mvi.l.a(), o.a(), this.f299668h));
            u<com.avito.android.tariff_lf_constructor.configure.landing.items.header.d> uVarD2 = dagger.internal.g.d(com.avito.android.tariff_lf_constructor.configure.landing.items.header.f.a());
            this.f299670j = uVarD2;
            this.f299671k = new com.avito.android.tariff_lf_constructor.configure.landing.items.header.c(uVarD2);
            u<com.avito.android.tariff_lf_constructor.configure.landing.items.landing_feature.d> uVarD3 = dagger.internal.g.d(com.avito.android.tariff_lf_constructor.configure.landing.items.landing_feature.f.a());
            this.f299672l = uVarD3;
            u<com.avito.konveyor.a> uVarD4 = dagger.internal.g.d(new d(this.f299671k, new com.avito.android.tariff_lf_constructor.configure.landing.items.landing_feature.c(uVarD3)));
            this.f299673m = uVarD4;
            u<com.avito.konveyor.adapter.a> uVarD5 = dagger.internal.g.d(new com.avito.android.tariff_lf_constructor.configure.landing.di.c(uVarD4));
            this.f299674n = uVarD5;
            this.f299675o = dagger.internal.g.d(new f(uVarD5, this.f299673m));
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.landing.di.a
        public final void a(ConstructorLandingFragment constructorLandingFragment) {
            constructorLandingFragment.f299625h0 = this.f299669i;
            constructorLandingFragment.f299627j0 = this.f299668h.get();
            constructorLandingFragment.f299628k0 = this.f299674n.get();
            constructorLandingFragment.f299629l0 = this.f299675o.get();
            constructorLandingFragment.f299630m0 = this.f299673m.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f299661a.u4();
            t.c(aVarU4);
            constructorLandingFragment.f299631n0 = aVarU4;
        }
    }

    /* compiled from: DaggerConstructorLandingComponent.java */
    public static final class c implements a.InterfaceC9167a {
        public c() {
        }

        @Override // com.avito.android.tariff_lf_constructor.configure.landing.di.a.InterfaceC9167a
        public final com.avito.android.tariff_lf_constructor.configure.landing.di.a a(ConstructorLandingFragment constructorLandingFragment, InterfaceC40574b interfaceC40574b, InterfaceC39417a interfaceC39417a, r rVar) {
            interfaceC39417a.getClass();
            return new b(interfaceC40574b, interfaceC39417a, constructorLandingFragment, rVar, null);
        }
    }

    public static a.InterfaceC9167a a() {
        return new c();
    }
}
