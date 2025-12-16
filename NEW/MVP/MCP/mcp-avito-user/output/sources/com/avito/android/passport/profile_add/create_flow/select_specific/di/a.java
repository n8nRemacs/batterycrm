package com.avito.android.passport.profile_add.create_flow.select_specific.di;

import Y41.l;
import androidx.recyclerview.widget.C;
import androidx.view.S0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import com.avito.android.passport.profile_add.create_flow.select_specific.SelectSpecificArguments;
import com.avito.android.passport.profile_add.create_flow.select_specific.SelectSpecificFragment;
import com.avito.android.passport.profile_add.create_flow.select_specific.di.b;
import com.avito.android.passport.profile_add.create_flow.select_specific.mvi.k;
import com.avito.android.passport.profile_add.create_flow.select_specific.mvi.m;
import com.avito.android.passport.profile_add.create_flow.select_specific.recycler.C32960b;
import com.avito.android.passport.profile_add.create_flow.select_specific.recycler.InterfaceC32962d;
import com.avito.android.passport.profile_add.create_flow.select_specific.recycler.j;
import com.avito.android.passport.profile_add.create_flow.select_specific.recycler.n;
import com.avito.android.passport.profile_add.create_flow.select_specific.recycler.t;
import com.avito.android.passport.profile_add.create_flow.select_specific.recycler.w;
import com.avito.android.passport.profile_add.create_flow.select_specific.recycler.z;
import com.avito.android.passport.profile_add.perf_const.SelectSpecificScreen;
import com.avito.android.util.architecture_components.D;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.u;
import kotlinx.coroutines.flow.Z1;

/* compiled from: DaggerSelectSpecificComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerSelectSpecificComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.passport.profile_add.create_flow.select_specific.di.b.a
        public final com.avito.android.passport.profile_add.create_flow.select_specific.di.b a(com.avito.android.passport.profile_add.di.a aVar, S0 s02, SelectSpecificArguments selectSpecificArguments, InterfaceC39417a interfaceC39417a, Z1 z12, Z1 z13, Z1 z14, D d12, r rVar, SelectSpecificScreen selectSpecificScreen, l lVar, boolean z15) {
            selectSpecificArguments.getClass();
            interfaceC39417a.getClass();
            z12.getClass();
            z13.getClass();
            z14.getClass();
            d12.getClass();
            selectSpecificScreen.getClass();
            return new c(aVar, interfaceC39417a, s02, selectSpecificArguments, z12, z13, z14, d12, rVar, selectSpecificScreen, lVar, Boolean.valueOf(z15), null);
        }
    }

    /* compiled from: DaggerSelectSpecificComponent.java */
    public static final class c implements com.avito.android.passport.profile_add.create_flow.select_specific.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_add.create_flow.select_specific.recycler.l> f211662A;

        /* renamed from: B, reason: collision with root package name */
        public final j f211663B;

        /* renamed from: C, reason: collision with root package name */
        public final u<w> f211664C;

        /* renamed from: D, reason: collision with root package name */
        public final t f211665D;

        /* renamed from: E, reason: collision with root package name */
        public final u<InterfaceC32962d> f211666E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f211667F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f211668G;

        /* renamed from: H, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f211669H;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f211670a;

        /* renamed from: b, reason: collision with root package name */
        public final D<Navigation> f211671b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.passport.profile_add.di.a f211672c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.passport.profile_add.create_flow.select_specific.mvi.f f211673d;

        /* renamed from: e, reason: collision with root package name */
        public final u<I50.a> f211674e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.passport_lib.h> f211675f;

        /* renamed from: g, reason: collision with root package name */
        public final u<r60.d> f211676g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_add.domain.interactor.h> f211677h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28373a> f211678i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.l f211679j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.l f211680k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.l f211681l;

        /* renamed from: m, reason: collision with root package name */
        public final M50.c f211682m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.l f211683n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.passport.profile_add.create_flow.select_specific.mvi.d f211684o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f211685p;

        /* renamed from: q, reason: collision with root package name */
        public final k f211686q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_add.create_flow.select_specific.f> f211687r;

        /* renamed from: s, reason: collision with root package name */
        public final m f211688s;

        /* renamed from: t, reason: collision with root package name */
        public final u<InterfaceC28481c> f211689t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.l f211690u;

        /* renamed from: v, reason: collision with root package name */
        public final u<C28478k> f211691v;

        /* renamed from: w, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f211692w;

        /* renamed from: x, reason: collision with root package name */
        public final com.avito.android.passport.profile_add.create_flow.select_specific.j f211693x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.f f211694y;

        /* renamed from: z, reason: collision with root package name */
        public final u<C> f211695z;

        /* compiled from: DaggerSelectSpecificComponent.java */
        /* renamed from: com.avito.android.passport.profile_add.create_flow.select_specific.di.a$c$a, reason: collision with other inner class name */
        public static final class C6330a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211696a;

            public C6330a(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211696a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f211696a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSelectSpecificComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f211697a;

            public b(cv.b bVar) {
                this.f211697a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f211697a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerSelectSpecificComponent.java */
        /* renamed from: com.avito.android.passport.profile_add.create_flow.select_specific.di.a$c$c, reason: collision with other inner class name */
        public static final class C6331c implements u<r60.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211698a;

            public C6331c(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211698a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f211698a.X1();
            }
        }

        /* compiled from: DaggerSelectSpecificComponent.java */
        public static final class d implements u<com.avito.android.passport_lib.h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211699a;

            public d(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211699a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.passport_lib.h hVarD4 = this.f211699a.d4();
                dagger.internal.t.c(hVarD4);
                return hVarD4;
            }
        }

        /* compiled from: DaggerSelectSpecificComponent.java */
        public static final class e implements u<I50.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211700a;

            public e(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211700a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                I50.a aVarX3 = this.f211700a.X3();
                dagger.internal.t.c(aVarX3);
                return aVarX3;
            }
        }

        /* compiled from: DaggerSelectSpecificComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211701a;

            public f(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211701a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f211701a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.passport.profile_add.di.a aVar, cv.b bVar, S0 s02, SelectSpecificArguments selectSpecificArguments, Z1 z12, Z1 z13, Z1 z14, D d12, r rVar, Screen screen, l lVar, Boolean bool, C6329a c6329a) {
            this.f211670a = bVar;
            this.f211671b = d12;
            this.f211672c = aVar;
            this.f211673d = new com.avito.android.passport.profile_add.create_flow.select_specific.mvi.f(dagger.internal.l.a(bool));
            this.f211677h = B.a(new com.avito.android.passport.profile_add.domain.interactor.k(new e(aVar), new d(aVar), new C6331c(aVar)));
            this.f211678i = new C6330a(aVar);
            this.f211679j = dagger.internal.l.a(z14);
            this.f211680k = dagger.internal.l.a(z13);
            dagger.internal.l lVarA = dagger.internal.l.a(selectSpecificArguments);
            this.f211681l = lVarA;
            this.f211682m = new M50.c(this.f211678i, this.f211679j, this.f211680k, new com.avito.android.passport.profile_add.create_flow.select_specific.di.f(lVarA));
            dagger.internal.l lVarA2 = dagger.internal.l.a(z12);
            this.f211683n = lVarA2;
            this.f211684o = new com.avito.android.passport.profile_add.create_flow.select_specific.mvi.d(this.f211677h, this.f211682m, this.f211681l, lVarA2);
            this.f211686q = new k(new b(bVar));
            u<com.avito.android.passport.profile_add.create_flow.select_specific.f> uVarD = dagger.internal.g.d(com.avito.android.passport.profile_add.create_flow.select_specific.h.a());
            this.f211687r = uVarD;
            this.f211688s = new m(this.f211681l, this.f211683n, uVarD);
            this.f211689t = new f(aVar);
            this.f211690u = dagger.internal.l.a(screen);
            u<C28478k> uVarD2 = dagger.internal.g.d(new com.avito.android.passport.profile_add.di.d(dagger.internal.l.a(rVar), this.f211690u));
            this.f211691v = uVarD2;
            u<ScreenPerformanceTracker> uVarD3 = dagger.internal.g.d(new C30060h5(this.f211689t, uVarD2));
            this.f211692w = uVarD3;
            this.f211693x = new com.avito.android.passport.profile_add.create_flow.select_specific.j(new com.avito.android.passport.profile_add.create_flow.select_specific.mvi.i(this.f211673d, this.f211684o, this.f211686q, this.f211688s, uVarD3));
            dagger.internal.f fVar = new dagger.internal.f();
            this.f211694y = fVar;
            this.f211695z = dagger.internal.g.d(new h(fVar));
            u<com.avito.android.passport.profile_add.create_flow.select_specific.recycler.l> uVarD4 = dagger.internal.g.d(n.a());
            this.f211662A = uVarD4;
            this.f211663B = new j(uVarD4);
            u<w> uVarD5 = dagger.internal.g.d(new z(dagger.internal.l.a(lVar)));
            this.f211664C = uVarD5;
            this.f211665D = new t(uVarD5);
            u<InterfaceC32962d> uVarD6 = dagger.internal.g.d(com.avito.android.passport.profile_add.create_flow.select_specific.recycler.f.a());
            this.f211666E = uVarD6;
            this.f211667F = dagger.internal.g.d(new g(this.f211663B, this.f211665D, new C32960b(uVarD6)));
            u<com.avito.android.recycler.data_aware.e> uVarD7 = dagger.internal.g.d(new com.avito.android.passport.profile_add.create_flow.select_specific.di.e(com.avito.android.passport.profile_add.create_flow.select_specific.recycler.r.a()));
            this.f211668G = uVarD7;
            u<com.avito.konveyor.adapter.a> uVarD8 = dagger.internal.g.d(new com.avito.android.passport.profile_add.create_flow.select_specific.di.d(uVarD7, this.f211695z, this.f211667F));
            this.f211669H = uVarD8;
            dagger.internal.f.a(this.f211694y, dagger.internal.g.d(new i(uVarD8, this.f211667F)));
        }

        @Override // com.avito.android.passport.profile_add.create_flow.select_specific.di.b
        public final void a(SelectSpecificFragment selectSpecificFragment) {
            selectSpecificFragment.f211628n0 = this.f211693x;
            selectSpecificFragment.f211630p0 = (com.avito.konveyor.adapter.j) this.f211694y.get();
            selectSpecificFragment.f211631q0 = this.f211669H.get();
            selectSpecificFragment.f211632r0 = new com.avito.android.passport.profile_add.create_flow.select_specific.recycler.C(this.f211667F.get());
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f211670a.u4();
            dagger.internal.t.c(aVarU4);
            selectSpecificFragment.f211633s0 = aVarU4;
            selectSpecificFragment.f211634t0 = this.f211671b;
            G50.a aVarD6 = this.f211672c.D6();
            dagger.internal.t.c(aVarD6);
            selectSpecificFragment.f211635u0 = aVarD6;
            selectSpecificFragment.f211627B0 = this.f211692w.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
