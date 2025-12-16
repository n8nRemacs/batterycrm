package com.avito.android.vas_performance.di.visual_legacy;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.VisualVasScreen;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.vas_performance.I;
import com.avito.android.vas_performance.K;
import com.avito.android.vas_performance.di.visual_legacy.d;
import com.avito.android.vas_performance.di.visual_legacy.j;
import com.avito.android.vas_performance.ui.visual_legacy.VisualVasFragment;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;
import kotlin.G0;
import zL0.InterfaceC50482a;

/* compiled from: DaggerLegacyVisualVasComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerLegacyVisualVasComponent.java */
    public static final class b implements j.a {
        public b() {
        }

        @Override // com.avito.android.vas_performance.di.visual_legacy.j.a
        public final j a(com.avito.android.vas_performance.screens.visual.di.e eVar, InterfaceC39417a interfaceC39417a, o oVar, VisualVasFragment visualVasFragment, com.avito.android.analytics.screens.r rVar, VisualVasScreen visualVasScreen, boolean z12) {
            interfaceC39417a.getClass();
            visualVasScreen.getClass();
            return new c(new k(), oVar, eVar, interfaceC39417a, visualVasFragment, rVar, visualVasScreen, Boolean.valueOf(z12), null);
        }
    }

    /* compiled from: DaggerLegacyVisualVasComponent.java */
    public static final class c implements j {

        /* renamed from: A, reason: collision with root package name */
        public final u<InterfaceC28373a> f320134A;

        /* renamed from: B, reason: collision with root package name */
        public final u<P0.c> f320135B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.ui.visual_legacy.m> f320136C;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.visual.di.e f320137a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f320138b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC50482a> f320139c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC35745a5> f320140d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.repository.a> f320141e;

        /* renamed from: f, reason: collision with root package name */
        public final u<C> f320142f;

        /* renamed from: g, reason: collision with root package name */
        public final u<PreloadingPromiseTestGroup> f320143g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f320144h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f320145i;

        /* renamed from: j, reason: collision with root package name */
        public final u<H> f320146j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.vas_performance.di.visual_legacy.e f320147k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28499v> f320148l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28501x> f320149m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.analytics.screens.o> f320150n;

        /* renamed from: o, reason: collision with root package name */
        public final u<TL0.d> f320151o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.preloading.j<G0, P2<HL0.b>>> f320152p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.screens.visual.item.header.d> f320153q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.vas_performance.screens.visual.item.header.c f320154r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.d> f320155s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f320156t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f320157u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f320158v;

        /* renamed from: w, reason: collision with root package name */
        public final u<Set<TV0.d<?, ?>>> f320159w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.l f320160x;

        /* renamed from: y, reason: collision with root package name */
        public final u<I> f320161y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f320162z;

        /* compiled from: DaggerLegacyVisualVasComponent.java */
        /* renamed from: com.avito.android.vas_performance.di.visual_legacy.a$c$a, reason: collision with other inner class name */
        public static final class C9923a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_performance.screens.visual.di.e f320163a;

            public C9923a(com.avito.android.vas_performance.screens.visual.di.e eVar) {
                this.f320163a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f320163a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerLegacyVisualVasComponent.java */
        public static final class b implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_performance.screens.visual.di.e f320164a;

            public b(com.avito.android.vas_performance.screens.visual.di.e eVar) {
                this.f320164a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f320164a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerLegacyVisualVasComponent.java */
        /* renamed from: com.avito.android.vas_performance.di.visual_legacy.a$c$c, reason: collision with other inner class name */
        public static final class C9924c implements u<C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_performance.screens.visual.di.e f320165a;

            public C9924c(com.avito.android.vas_performance.screens.visual.di.e eVar) {
                this.f320165a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C cJ2 = this.f320165a.j();
                t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerLegacyVisualVasComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f320166a;

            public d(cv.b bVar) {
                this.f320166a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f320166a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerLegacyVisualVasComponent.java */
        public static final class e implements u<PreloadingPromiseTestGroup> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_performance.screens.visual.di.e f320167a;

            public e(com.avito.android.vas_performance.screens.visual.di.e eVar) {
                this.f320167a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f320167a.Y1();
            }
        }

        /* compiled from: DaggerLegacyVisualVasComponent.java */
        public static final class f implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_performance.screens.visual.di.e f320168a;

            public f(com.avito.android.vas_performance.screens.visual.di.e eVar) {
                this.f320168a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f320168a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerLegacyVisualVasComponent.java */
        public static final class g implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_performance.screens.visual.di.e f320169a;

            public g(com.avito.android.vas_performance.screens.visual.di.e eVar) {
                this.f320169a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f320169a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerLegacyVisualVasComponent.java */
        public static final class h implements u<InterfaceC50482a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_performance.screens.visual.di.e f320170a;

            public h(com.avito.android.vas_performance.screens.visual.di.e eVar) {
                this.f320170a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50482a interfaceC50482aO0 = this.f320170a.o0();
                t.c(interfaceC50482aO0);
                return interfaceC50482aO0;
            }
        }

        public c(k kVar, o oVar, com.avito.android.vas_performance.screens.visual.di.e eVar, cv.b bVar, Fragment fragment, com.avito.android.analytics.screens.r rVar, Screen screen, Boolean bool, C9922a c9922a) {
            this.f320137a = eVar;
            this.f320138b = bVar;
            h hVar = new h(eVar);
            f fVar = new f(eVar);
            this.f320140d = fVar;
            this.f320141e = dagger.internal.g.d(new com.avito.android.vas_performance.repository.d(hVar, fVar));
            this.f320142f = new C9924c(eVar);
            this.f320143g = new e(eVar);
            this.f320144h = new g(eVar);
            this.f320145i = dagger.internal.l.a(screen);
            u<H> uVarD = dagger.internal.g.d(new i(this.f320145i, dagger.internal.l.a(rVar), this.f320144h));
            this.f320146j = uVarD;
            com.avito.android.vas_performance.di.visual_legacy.d dVar = d.a.f320172a;
            com.avito.android.vas_performance.di.visual_legacy.e eVar2 = new com.avito.android.vas_performance.di.visual_legacy.e(dVar);
            this.f320147k = eVar2;
            this.f320148l = dagger.internal.g.d(new com.avito.android.vas_performance.di.visual_legacy.f(uVarD, eVar2));
            this.f320149m = dagger.internal.g.d(new com.avito.android.vas_performance.di.visual_legacy.h(this.f320146j, this.f320147k));
            u<com.avito.android.analytics.screens.o> uVarD2 = dagger.internal.g.d(new com.avito.android.vas_performance.di.visual_legacy.g(this.f320146j));
            this.f320150n = uVarD2;
            u<TL0.d> uVarD3 = dagger.internal.g.d(new TL0.f(this.f320148l, this.f320149m, uVarD2, dVar));
            this.f320151o = uVarD3;
            this.f320152p = dagger.internal.g.d(new p(oVar, this.f320141e, this.f320140d, this.f320142f, this.f320143g, uVarD3));
            u<com.avito.android.vas_performance.screens.visual.item.header.d> uVarD4 = dagger.internal.g.d(com.avito.android.vas_performance.screens.visual.item.header.f.a());
            this.f320153q = uVarD4;
            this.f320154r = new com.avito.android.vas_performance.screens.visual.item.header.c(uVarD4);
            u<com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.d> uVarD5 = dagger.internal.g.d(com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.g.a());
            this.f320155s = uVarD5;
            u<com.avito.konveyor.a> uVarD6 = dagger.internal.g.d(new m(kVar, this.f320154r, new com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.c(uVarD5, new b(eVar))));
            this.f320157u = uVarD6;
            this.f320158v = B.a(new l(kVar, uVarD6));
            this.f320159w = dagger.internal.g.d(new n(kVar, this.f320153q, this.f320155s));
            this.f320160x = dagger.internal.l.a(fragment);
            this.f320161y = dagger.internal.g.d(K.a());
            this.f320162z = new d(bVar);
            this.f320134A = new C9923a(eVar);
            u<P0.c> uVarD7 = dagger.internal.g.d(new r(oVar, this.f320141e, this.f320161y, this.f320140d, this.f320151o, this.f320162z, this.f320134A, dagger.internal.l.a(bool), this.f320152p));
            this.f320135B = uVarD7;
            this.f320136C = dagger.internal.g.d(new q(oVar, this.f320160x, uVarD7));
        }

        @Override // com.avito.android.vas_performance.di.visual_legacy.j
        public final void a(VisualVasFragment visualVasFragment) {
            this.f320152p.get();
            visualVasFragment.f322083n0 = this.f320157u.get();
            visualVasFragment.f322084o0 = this.f320158v.get();
            visualVasFragment.f322085p0 = this.f320159w.get();
            visualVasFragment.f322086q0 = this.f320136C.get();
            com.avito.android.vas_performance.screens.visual.di.e eVar = this.f320137a;
            InterfaceC28373a interfaceC28373aA = eVar.a();
            t.c(interfaceC28373aA);
            visualVasFragment.f322087r0 = interfaceC28373aA;
            visualVasFragment.f322088s0 = this.f320151o.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f320138b.u4();
            t.c(aVarU4);
            visualVasFragment.f322089t0 = aVarU4;
            com.avito.android.util.text.a aVarE = eVar.e();
            t.c(aVarE);
            visualVasFragment.f322090u0 = aVarE;
        }
    }

    public static j.a a() {
        return new b();
    }
}
