package com.avito.android.vas_performance.screens.visual.di;

import androidx.fragment.app.Fragment;
import androidx.view.S0;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.util.C;
import com.avito.android.util.R0;
import com.avito.android.vas_performance.screens.visual.VisualVasFragment;
import com.avito.android.vas_performance.screens.visual.di.b;
import com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import zL0.InterfaceC50482a;

/* compiled from: DaggerVisualVasComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerVisualVasComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.vas_performance.screens.visual.di.b.a
        public final com.avito.android.vas_performance.screens.visual.di.b a(e eVar, InterfaceC39417a interfaceC39417a, S0 s02, VisualVasFragment visualVasFragment, r rVar, String str, String str2, Y41.l lVar) {
            interfaceC39417a.getClass();
            return new c(new l(), eVar, interfaceC39417a, s02, visualVasFragment, rVar, str, str2, lVar, null);
        }
    }

    /* compiled from: DaggerVisualVasComponent.java */
    public static final class c implements com.avito.android.vas_performance.screens.visual.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.visual.di.e f320991a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f320992b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f320993c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f320994d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC50482a> f320995e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f320996f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.screens.visual.mvi.domain.d> f320997g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.visual.mvi.f f320998h;

        /* renamed from: i, reason: collision with root package name */
        public final u<C> f320999i;

        /* renamed from: j, reason: collision with root package name */
        public final u<PreloadingPromiseTestGroup> f321000j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.l f321001k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28373a> f321002l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C28478k> f321003m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.arch.mvi.b<VisualVasInternalAction>> f321004n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.screens.visual.item.header.d> f321005o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.visual.item.header.c f321006p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.screens.visual.item.item.d> f321007q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f321008r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f321009s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f321010t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.screens.visual.mvi.domain.a> f321011u;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.visual.mvi.d f321012v;

        /* renamed from: w, reason: collision with root package name */
        public final u<InterfaceC28481c> f321013w;

        /* renamed from: x, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f321014x;

        /* renamed from: y, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.visual.i f321015y;

        /* compiled from: DaggerVisualVasComponent.java */
        /* renamed from: com.avito.android.vas_performance.screens.visual.di.a$c$a, reason: collision with other inner class name */
        public static final class C9943a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_performance.screens.visual.di.e f321016a;

            public C9943a(com.avito.android.vas_performance.screens.visual.di.e eVar) {
                this.f321016a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f321016a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerVisualVasComponent.java */
        public static final class b implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_performance.screens.visual.di.e f321017a;

            public b(com.avito.android.vas_performance.screens.visual.di.e eVar) {
                this.f321017a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f321017a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerVisualVasComponent.java */
        /* renamed from: com.avito.android.vas_performance.screens.visual.di.a$c$c, reason: collision with other inner class name */
        public static final class C9944c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_performance.screens.visual.di.e f321018a;

            public C9944c(com.avito.android.vas_performance.screens.visual.di.e eVar) {
                this.f321018a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f321018a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerVisualVasComponent.java */
        public static final class d implements u<PreloadingPromiseTestGroup> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_performance.screens.visual.di.e f321019a;

            public d(com.avito.android.vas_performance.screens.visual.di.e eVar) {
                this.f321019a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f321019a.Y1();
            }
        }

        /* compiled from: DaggerVisualVasComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_performance.screens.visual.di.e f321020a;

            public e(com.avito.android.vas_performance.screens.visual.di.e eVar) {
                this.f321020a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f321020a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerVisualVasComponent.java */
        public static final class f implements u<InterfaceC50482a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_performance.screens.visual.di.e f321021a;

            public f(com.avito.android.vas_performance.screens.visual.di.e eVar) {
                this.f321021a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50482a interfaceC50482aO0 = this.f321021a.o0();
                t.c(interfaceC50482aO0);
                return interfaceC50482aO0;
            }
        }

        public c() {
            throw null;
        }

        public c(l lVar, com.avito.android.vas_performance.screens.visual.di.e eVar, cv.b bVar, S0 s02, Fragment fragment, r rVar, String str, String str2, Y41.l lVar2, C9942a c9942a) {
            this.f320991a = eVar;
            this.f320992b = bVar;
            this.f320993c = dagger.internal.l.a(str);
            this.f320994d = dagger.internal.l.a(str2);
            f fVar = new f(eVar);
            this.f320995e = fVar;
            C9944c c9944c = new C9944c(eVar);
            this.f320996f = c9944c;
            u<com.avito.android.vas_performance.screens.visual.mvi.domain.d> uVarD = dagger.internal.g.d(new com.avito.android.vas_performance.screens.visual.mvi.domain.f(fVar, c9944c));
            this.f320997g = uVarD;
            this.f320998h = new com.avito.android.vas_performance.screens.visual.mvi.f(this.f320993c, this.f320994d, uVarD);
            this.f320999i = new b(eVar);
            this.f321000j = new d(eVar);
            this.f321001k = dagger.internal.l.a(s02);
            this.f321002l = new C9943a(eVar);
            u<C28478k> uVarD2 = dagger.internal.g.d(new o(lVar, dagger.internal.l.a(rVar)));
            this.f321003m = uVarD2;
            this.f321004n = dagger.internal.g.d(new n(lVar, this.f320998h, this.f320999i, this.f321000j, this.f321001k, this.f321002l, uVarD2));
            u<com.avito.android.vas_performance.screens.visual.item.header.d> uVarD3 = dagger.internal.g.d(com.avito.android.vas_performance.screens.visual.item.header.f.a());
            this.f321005o = uVarD3;
            this.f321006p = new com.avito.android.vas_performance.screens.visual.item.header.c(uVarD3);
            u<com.avito.android.vas_performance.screens.visual.item.item.d> uVarD4 = dagger.internal.g.d(new com.avito.android.vas_performance.screens.visual.item.item.g(dagger.internal.l.a(lVar2)));
            this.f321007q = uVarD4;
            u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new j(this.f321006p, new com.avito.android.vas_performance.screens.visual.item.item.c(uVarD4)));
            this.f321008r = uVarD5;
            u<com.avito.konveyor.adapter.a> uVarD6 = dagger.internal.g.d(new i(uVarD5));
            this.f321009s = uVarD6;
            this.f321010t = dagger.internal.g.d(new k(uVarD6, this.f321008r));
            u<com.avito.android.vas_performance.screens.visual.mvi.domain.a> uVarD7 = dagger.internal.g.d(new com.avito.android.vas_performance.screens.visual.mvi.domain.c(this.f320995e, this.f320996f));
            this.f321011u = uVarD7;
            this.f321012v = new com.avito.android.vas_performance.screens.visual.mvi.d(this.f320993c, this.f320994d, uVarD7, this.f320997g, this.f321002l);
            this.f321014x = dagger.internal.g.d(new C30060h5(new e(eVar), this.f321003m));
            this.f321015y = new com.avito.android.vas_performance.screens.visual.i(new com.avito.android.vas_performance.screens.visual.mvi.i(this.f321004n, this.f321012v, com.avito.android.vas_performance.screens.visual.mvi.k.a(), com.avito.android.vas_performance.screens.visual.mvi.n.a(), this.f321014x));
        }

        @Override // com.avito.android.vas_performance.screens.visual.di.b
        public final void a(VisualVasFragment visualVasFragment) {
            visualVasFragment.f320957n0 = this.f321004n.get();
            visualVasFragment.f320958o0 = this.f321009s.get();
            visualVasFragment.f320959p0 = this.f321010t.get();
            visualVasFragment.f320960q0 = this.f321015y;
            com.avito.android.vas_performance.screens.visual.di.e eVar = this.f320991a;
            InterfaceC28373a interfaceC28373aA = eVar.a();
            t.c(interfaceC28373aA);
            visualVasFragment.f320962s0 = interfaceC28373aA;
            visualVasFragment.f320963t0 = this.f321014x.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f320992b.u4();
            t.c(aVarU4);
            visualVasFragment.f320964u0 = aVarU4;
            com.avito.android.util.text.a aVarE = eVar.e();
            t.c(aVarE);
            visualVasFragment.f320965v0 = aVarE;
        }
    }

    public static b.a a() {
        return new b();
    }
}
