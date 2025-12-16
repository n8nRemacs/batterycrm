package com.avito.android.autoteka.di.landing;

import Mf.C14480a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.autoteka.data.j;
import com.avito.android.autoteka.deeplinks.LandingDetails;
import com.avito.android.autoteka.di.landing.a;
import com.avito.android.autoteka.di.landing.e;
import com.avito.android.autoteka.presentation.landing.AutotekaLandingFragment;
import com.avito.android.autoteka.presentation.landing.mvi.n;
import com.avito.android.autoteka.presentation.landing.mvi.p;
import com.avito.android.autoteka.presentation.landing.mvi.r;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30060h5;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import gj.InterfaceC40691b;
import xj0.InterfaceC49957a;
import yf.l;
import yj0.InterfaceC50257a;

/* compiled from: DaggerAutotekaLandingComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class i {

    /* compiled from: DaggerAutotekaLandingComponent.java */
    public static final class b implements com.avito.android.autoteka.di.landing.a {

        /* renamed from: a, reason: collision with root package name */
        public final l f96443a;

        /* renamed from: b, reason: collision with root package name */
        public final u<gj.d> f96444b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f96445c;

        /* renamed from: d, reason: collision with root package name */
        public final u<a.b> f96446d;

        /* renamed from: e, reason: collision with root package name */
        public final u<Wi.b> f96447e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.l f96448f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f96449g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f96450h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC40691b> f96451i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC49957a> f96452j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC50257a> f96453k;

        /* renamed from: l, reason: collision with root package name */
        public final j f96454l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C14480a> f96455m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.autoteka.presentation.landing.mvi.i f96456n;

        /* renamed from: o, reason: collision with root package name */
        public final r f96457o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.autoteka.items.skeleton.landing.b f96458p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f96459q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f96460r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f96461s;

        /* compiled from: DaggerAutotekaLandingComponent.java */
        public static final class a implements u<InterfaceC50257a> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96462a;

            public a(l lVar) {
                this.f96462a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50257a interfaceC50257aKl = this.f96462a.kl();
                t.c(interfaceC50257aKl);
                return interfaceC50257aKl;
            }
        }

        /* compiled from: DaggerAutotekaLandingComponent.java */
        /* renamed from: com.avito.android.autoteka.di.landing.i$b$b, reason: collision with other inner class name */
        public static final class C2858b implements u<InterfaceC49957a> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96463a;

            public C2858b(l lVar) {
                this.f96463a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC49957a interfaceC49957aZa = this.f96463a.Za();
                t.c(interfaceC49957aZa);
                return interfaceC49957aZa;
            }
        }

        /* compiled from: DaggerAutotekaLandingComponent.java */
        public static final class c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96464a;

            public c(l lVar) {
                this.f96464a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f96464a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerAutotekaLandingComponent.java */
        public static final class d implements u<gj.d> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96465a;

            public d(l lVar) {
                this.f96465a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f96465a.El();
            }
        }

        /* compiled from: DaggerAutotekaLandingComponent.java */
        public static final class e implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f96466a;

            public e(cv.b bVar) {
                this.f96466a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f96466a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerAutotekaLandingComponent.java */
        public static final class f implements u<a.b> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f96467a;

            public f(cv.b bVar) {
                this.f96467a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                a.b bVarB = this.f96467a.b();
                t.c(bVarB);
                return bVarB;
            }
        }

        public b() {
            throw null;
        }

        public b(l lVar, cv.b bVar, C28478k c28478k, Y41.l lVar2, LandingDetails landingDetails, a aVar) {
            this.f96443a = lVar;
            this.f96444b = new d(lVar);
            this.f96445c = new e(bVar);
            this.f96446d = new f(bVar);
            this.f96447e = dagger.internal.g.d(e.a.f96437a);
            dagger.internal.l lVarA = dagger.internal.l.a(c28478k);
            this.f96448f = lVarA;
            u<ScreenPerformanceTracker> uVarD = dagger.internal.g.d(new C30060h5(new c(lVar), lVarA));
            this.f96450h = uVarD;
            u<InterfaceC40691b> uVarD2 = dagger.internal.g.d(new com.avito.android.autoteka.di.landing.d(this.f96448f, uVarD, this.f96444b, this.f96445c, this.f96446d, this.f96447e));
            this.f96451i = uVarD2;
            this.f96454l = new j(new C2858b(lVar), new a(lVar));
            this.f96455m = dagger.internal.g.d(new com.avito.android.autoteka.di.landing.f(uVarD2));
            dagger.internal.l lVarA2 = dagger.internal.l.a(landingDetails);
            j jVar = this.f96454l;
            u<C14480a> uVar = this.f96455m;
            com.avito.android.autoteka.data.landing.b bVar2 = new com.avito.android.autoteka.data.landing.b(jVar, uVar, lVarA2);
            com.avito.android.autoteka.presentation.landing.mvi.b bVar3 = new com.avito.android.autoteka.presentation.landing.mvi.b(bVar2);
            u<InterfaceC40691b> uVar2 = this.f96451i;
            n nVar = new n(uVar2);
            this.f96456n = new com.avito.android.autoteka.presentation.landing.mvi.i(uVar, uVar2, bVar2, this.f96445c);
            this.f96457o = new r(this.f96451i, new com.avito.android.autoteka.presentation.landing.mvi.l(bVar3, nVar, p.a(), this.f96456n, this.f96450h));
            this.f96458p = new com.avito.android.autoteka.items.skeleton.landing.b(com.avito.android.autoteka.items.skeleton.landing.e.a());
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new g(this.f96458p, new com.avito.android.autoteka.items.fullScreenError.landing.b(new com.avito.android.autoteka.items.fullScreenError.landing.e(dagger.internal.l.a(lVar2)))));
            this.f96459q = uVarD3;
            u<com.avito.konveyor.adapter.a> uVarD4 = dagger.internal.g.d(new com.avito.android.autoteka.di.landing.c(uVarD3));
            this.f96460r = uVarD4;
            this.f96461s = dagger.internal.g.d(new h(uVarD4, this.f96459q));
        }

        @Override // com.avito.android.autoteka.di.landing.a
        public final void a(AutotekaLandingFragment autotekaLandingFragment) {
            autotekaLandingFragment.f97311n0 = this.f96457o;
            l lVar = this.f96443a;
            autotekaLandingFragment.f97313p0 = lVar.Ad();
            autotekaLandingFragment.f97314q0 = lVar.sd();
            autotekaLandingFragment.f97315r0 = this.f96450h.get();
            autotekaLandingFragment.f97306D0 = this.f96461s.get();
            autotekaLandingFragment.f97307E0 = this.f96460r.get();
        }
    }

    /* compiled from: DaggerAutotekaLandingComponent.java */
    public static final class c implements a.InterfaceC2857a {
        public c() {
        }

        @Override // com.avito.android.autoteka.di.landing.a.InterfaceC2857a
        public final com.avito.android.autoteka.di.landing.a a(l lVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, Y41.l lVar2, LandingDetails landingDetails) {
            interfaceC39417a.getClass();
            return new b(lVar, interfaceC39417a, c28478k, lVar2, landingDetails, null);
        }
    }

    public static a.InterfaceC2857a a() {
        return new c();
    }
}
