package com.avito.android.passport.profile_add.create_flow.select_vertical.di;

import Y41.l;
import Za0.InterfaceC19524a;
import androidx.recyclerview.widget.C;
import androidx.view.S0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import com.avito.android.passport.profile_add.create_flow.select_vertical.SelectVerticalArguments;
import com.avito.android.passport.profile_add.create_flow.select_vertical.SelectVerticalFragment;
import com.avito.android.passport.profile_add.create_flow.select_vertical.di.b;
import com.avito.android.passport.profile_add.create_flow.select_vertical.o;
import com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.A;
import com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.C32964b;
import com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.InterfaceC32966d;
import com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.j;
import com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.n;
import com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.t;
import com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.w;
import com.avito.android.passport.profile_add.domain.interactor.k;
import com.avito.android.passport.profile_add.domain.interactor.m;
import com.avito.android.passport.profile_add.perf_const.SelectVerticalScreen;
import com.avito.android.passport.profile_add.q;
import com.avito.android.remote.A1;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.architecture_components.D;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.u;
import kotlinx.coroutines.flow.Z1;
import sA.InterfaceC48019a;

/* compiled from: DaggerSelectVerticalComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerSelectVerticalComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.passport.profile_add.create_flow.select_vertical.di.b.a
        public final com.avito.android.passport.profile_add.create_flow.select_vertical.di.b a(com.avito.android.passport.profile_add.di.a aVar, S0 s02, SelectVerticalArguments selectVerticalArguments, r rVar, SelectVerticalScreen selectVerticalScreen, InterfaceC39417a interfaceC39417a, Z1 z12, Z1 z13, Z1 z14, D d12, l lVar, boolean z15) {
            selectVerticalArguments.getClass();
            selectVerticalScreen.getClass();
            interfaceC39417a.getClass();
            z12.getClass();
            z13.getClass();
            z14.getClass();
            d12.getClass();
            return new c(aVar, interfaceC39417a, s02, selectVerticalArguments, rVar, selectVerticalScreen, z12, z13, z14, d12, lVar, Boolean.valueOf(z15), null);
        }
    }

    /* compiled from: DaggerSelectVerticalComponent.java */
    public static final class c implements com.avito.android.passport.profile_add.create_flow.select_vertical.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<InterfaceC28481c> f211844A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.l f211845B;

        /* renamed from: C, reason: collision with root package name */
        public final u<C28478k> f211846C;

        /* renamed from: D, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f211847D;

        /* renamed from: E, reason: collision with root package name */
        public final o f211848E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.f f211849F;

        /* renamed from: G, reason: collision with root package name */
        public final u<C> f211850G;

        /* renamed from: H, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.l> f211851H;

        /* renamed from: I, reason: collision with root package name */
        public final j f211852I;

        /* renamed from: J, reason: collision with root package name */
        public final u<w> f211853J;

        /* renamed from: K, reason: collision with root package name */
        public final t f211854K;

        /* renamed from: L, reason: collision with root package name */
        public final u<InterfaceC32966d> f211855L;

        /* renamed from: M, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f211856M;

        /* renamed from: N, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f211857N;

        /* renamed from: O, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f211858O;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f211859a;

        /* renamed from: b, reason: collision with root package name */
        public final D<Navigation> f211860b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.passport.profile_add.di.a f211861c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_add.data.mapper.a> f211862d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_add.data.mapper.d> f211863e;

        /* renamed from: f, reason: collision with root package name */
        public final u<I50.a> f211864f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC34401z0> f211865g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f211866h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.passport.profile_add.create_flow.select_vertical.di.f f211867i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.passport_lib.h> f211868j;

        /* renamed from: k, reason: collision with root package name */
        public final u<r60.d> f211869k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC19524a> f211870l;

        /* renamed from: m, reason: collision with root package name */
        public final u<A1> f211871m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28373a> f211872n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_add.domain.interactor.a> f211873o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC48019a> f211874p;

        /* renamed from: q, reason: collision with root package name */
        public final u<m> f211875q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_add.create_flow.select_vertical.i> f211876r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.passport.profile_add.create_flow.select_vertical.mvi.f f211877s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_add.domain.interactor.h> f211878t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.l f211879u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.l f211880v;

        /* renamed from: w, reason: collision with root package name */
        public final M50.c f211881w;

        /* renamed from: x, reason: collision with root package name */
        public final com.avito.android.passport.profile_add.create_flow.select_vertical.mvi.d f211882x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.passport.profile_add.create_flow.select_vertical.a> f211883y;

        /* renamed from: z, reason: collision with root package name */
        public final com.avito.android.passport.profile_add.create_flow.select_vertical.mvi.m f211884z;

        /* compiled from: DaggerSelectVerticalComponent.java */
        /* renamed from: com.avito.android.passport.profile_add.create_flow.select_vertical.di.a$c$a, reason: collision with other inner class name */
        public static final class C6334a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211885a;

            public C6334a(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211885a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f211885a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSelectVerticalComponent.java */
        public static final class b implements u<InterfaceC48019a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211886a;

            public b(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211886a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48019a interfaceC48019aJl = this.f211886a.jl();
                dagger.internal.t.c(interfaceC48019aJl);
                return interfaceC48019aJl;
            }
        }

        /* compiled from: DaggerSelectVerticalComponent.java */
        /* renamed from: com.avito.android.passport.profile_add.create_flow.select_vertical.di.a$c$c, reason: collision with other inner class name */
        public static final class C6335c implements u<r60.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211887a;

            public C6335c(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211887a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f211887a.X1();
            }
        }

        /* compiled from: DaggerSelectVerticalComponent.java */
        public static final class d implements u<com.avito.android.passport_lib.h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211888a;

            public d(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211888a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.passport_lib.h hVarD4 = this.f211888a.d4();
                dagger.internal.t.c(hVarD4);
                return hVarD4;
            }
        }

        /* compiled from: DaggerSelectVerticalComponent.java */
        public static final class e implements u<I50.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211889a;

            public e(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211889a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                I50.a aVarX3 = this.f211889a.X3();
                dagger.internal.t.c(aVarX3);
                return aVarX3;
            }
        }

        /* compiled from: DaggerSelectVerticalComponent.java */
        public static final class f implements u<InterfaceC34401z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211890a;

            public f(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211890a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34401z0 interfaceC34401z0P5 = this.f211890a.P5();
                dagger.internal.t.c(interfaceC34401z0P5);
                return interfaceC34401z0P5;
            }
        }

        /* compiled from: DaggerSelectVerticalComponent.java */
        public static final class g implements u<InterfaceC19524a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211891a;

            public g(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211891a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19524a interfaceC19524aE7 = this.f211891a.e7();
                dagger.internal.t.c(interfaceC19524aE7);
                return interfaceC19524aE7;
            }
        }

        /* compiled from: DaggerSelectVerticalComponent.java */
        public static final class h implements u<A1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211892a;

            public h(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211892a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                A1 a1Xg = this.f211892a.xg();
                dagger.internal.t.c(a1Xg);
                return a1Xg;
            }
        }

        /* compiled from: DaggerSelectVerticalComponent.java */
        public static final class i implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211893a;

            public i(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211893a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f211893a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.passport.profile_add.di.a aVar, cv.b bVar, S0 s02, SelectVerticalArguments selectVerticalArguments, r rVar, Screen screen, Z1 z12, Z1 z13, Z1 z14, D d12, l lVar, Boolean bool, C6333a c6333a) {
            this.f211859a = bVar;
            this.f211860b = d12;
            this.f211861c = aVar;
            u<com.avito.android.passport.profile_add.data.mapper.a> uVarA = B.a(com.avito.android.passport.profile_add.data.mapper.c.a());
            this.f211862d = uVarA;
            this.f211863e = B.a(new com.avito.android.passport.profile_add.data.mapper.f(uVarA));
            this.f211864f = new e(aVar);
            this.f211865g = new f(aVar);
            dagger.internal.l lVarA = dagger.internal.l.a(selectVerticalArguments);
            this.f211866h = lVarA;
            com.avito.android.passport.profile_add.create_flow.select_vertical.di.f fVar = new com.avito.android.passport.profile_add.create_flow.select_vertical.di.f(lVarA);
            this.f211867i = fVar;
            d dVar = new d(aVar);
            this.f211868j = dVar;
            C6335c c6335c = new C6335c(aVar);
            this.f211869k = c6335c;
            u<I50.a> uVar = this.f211864f;
            u<InterfaceC34401z0> uVar2 = this.f211865g;
            com.avito.android.passport.profile_add.domain.interactor.g gVar = new com.avito.android.passport.profile_add.domain.interactor.g(uVar, uVar2, fVar, dVar, c6335c);
            g gVar2 = new g(aVar);
            com.avito.android.passport.profile_add.domain.interactor.d dVar2 = new com.avito.android.passport.profile_add.domain.interactor.d(fVar, uVar2, gVar2, c6335c);
            h hVar = new h(aVar);
            C6334a c6334a = new C6334a(aVar);
            this.f211872n = c6334a;
            this.f211873o = B.a(new com.avito.android.passport.profile_add.di.c(gVar, dVar2, new com.avito.android.passport.profile_add.domain.interactor.r(uVar2, hVar, gVar2, fVar, c6334a, c6335c), fVar));
            u<m> uVarD = dagger.internal.g.d(new com.avito.android.passport.profile_add.domain.interactor.o(new b(aVar), this.f211867i, this.f211869k, q.a()));
            this.f211875q = uVarD;
            this.f211876r = dagger.internal.g.d(new com.avito.android.passport.profile_add.create_flow.select_vertical.m(uVarD, this.f211863e, this.f211873o));
            this.f211877s = new com.avito.android.passport.profile_add.create_flow.select_vertical.mvi.f(dagger.internal.l.a(bool), this.f211876r);
            this.f211878t = B.a(new k(this.f211864f, this.f211868j, this.f211869k));
            this.f211879u = dagger.internal.l.a(z14);
            dagger.internal.l lVarA2 = dagger.internal.l.a(z13);
            this.f211880v = lVarA2;
            this.f211881w = new M50.c(this.f211872n, this.f211879u, lVarA2, this.f211867i);
            this.f211882x = new com.avito.android.passport.profile_add.create_flow.select_vertical.mvi.d(this.f211876r, this.f211878t, this.f211881w, this.f211866h, dagger.internal.l.a(z12));
            u<com.avito.android.passport.profile_add.create_flow.select_vertical.a> uVarD2 = dagger.internal.g.d(com.avito.android.passport.profile_add.create_flow.select_vertical.c.a());
            this.f211883y = uVarD2;
            this.f211884z = new com.avito.android.passport.profile_add.create_flow.select_vertical.mvi.m(this.f211880v, this.f211866h, uVarD2);
            this.f211844A = new i(aVar);
            this.f211845B = dagger.internal.l.a(screen);
            u<C28478k> uVarD3 = dagger.internal.g.d(new com.avito.android.passport.profile_add.di.d(dagger.internal.l.a(rVar), this.f211845B));
            this.f211846C = uVarD3;
            this.f211847D = com.avito.android.advert.item.delivery_suggests.l.i(this.f211844A, uVarD3);
            this.f211848E = new o(new com.avito.android.passport.profile_add.create_flow.select_vertical.mvi.i(this.f211877s, this.f211882x, com.avito.android.passport.profile_add.create_flow.select_vertical.mvi.k.a(), this.f211884z, this.f211847D));
            dagger.internal.f fVar2 = new dagger.internal.f();
            this.f211849F = fVar2;
            this.f211850G = dagger.internal.g.d(new com.avito.android.passport.profile_add.create_flow.select_vertical.di.h(fVar2));
            u<com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.l> uVarD4 = dagger.internal.g.d(n.a());
            this.f211851H = uVarD4;
            this.f211852I = new j(uVarD4);
            u<w> uVarD5 = dagger.internal.g.d(new A(dagger.internal.l.a(lVar)));
            this.f211853J = uVarD5;
            this.f211854K = new t(uVarD5);
            u<InterfaceC32966d> uVarD6 = dagger.internal.g.d(com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.f.a());
            this.f211855L = uVarD6;
            this.f211856M = dagger.internal.g.d(new com.avito.android.passport.profile_add.create_flow.select_vertical.di.g(this.f211852I, this.f211854K, new C32964b(uVarD6)));
            u<com.avito.android.recycler.data_aware.e> uVarD7 = dagger.internal.g.d(new com.avito.android.passport.profile_add.create_flow.select_vertical.di.e(com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.r.a()));
            this.f211857N = uVarD7;
            u<com.avito.konveyor.adapter.a> uVarD8 = dagger.internal.g.d(new com.avito.android.passport.profile_add.create_flow.select_vertical.di.d(uVarD7, this.f211850G, this.f211856M));
            this.f211858O = uVarD8;
            dagger.internal.f.a(this.f211849F, dagger.internal.g.d(new com.avito.android.passport.profile_add.create_flow.select_vertical.di.i(uVarD8, this.f211856M)));
        }

        @Override // com.avito.android.passport.profile_add.create_flow.select_vertical.di.b
        public final void a(SelectVerticalFragment selectVerticalFragment) {
            selectVerticalFragment.f211818n0 = this.f211848E;
            selectVerticalFragment.f211820p0 = this.f211847D.get();
            selectVerticalFragment.f211821q0 = (com.avito.konveyor.adapter.j) this.f211849F.get();
            selectVerticalFragment.f211822r0 = this.f211858O.get();
            selectVerticalFragment.f211823s0 = new com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.D(this.f211856M.get());
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f211859a.u4();
            dagger.internal.t.c(aVarU4);
            selectVerticalFragment.f211824t0 = aVarU4;
            selectVerticalFragment.f211825u0 = this.f211860b;
            com.avito.android.passport.profile_add.di.a aVar = this.f211861c;
            com.avito.android.util.text.a aVarE = aVar.e();
            dagger.internal.t.c(aVarE);
            selectVerticalFragment.f211826v0 = aVarE;
            G50.a aVarD6 = aVar.D6();
            dagger.internal.t.c(aVarD6);
            selectVerticalFragment.f211827w0 = aVarD6;
        }
    }

    public static b.a a() {
        return new b();
    }
}
