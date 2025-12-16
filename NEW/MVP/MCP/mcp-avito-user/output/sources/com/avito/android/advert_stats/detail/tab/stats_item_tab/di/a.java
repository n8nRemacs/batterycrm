package com.avito.android.advert_stats.detail.tab.stats_item_tab.di;

import Y41.l;
import android.content.res.Resources;
import androidx.recyclerview.widget.C;
import com.avito.android.advert_stats.G;
import com.avito.android.advert_stats.detail.di.C28305f;
import com.avito.android.advert_stats.detail.di.C28306g;
import com.avito.android.advert_stats.detail.di.C28307h;
import com.avito.android.advert_stats.detail.di.C28308i;
import com.avito.android.advert_stats.detail.di.C28310k;
import com.avito.android.advert_stats.detail.di.C28311l;
import com.avito.android.advert_stats.detail.di.C28312m;
import com.avito.android.advert_stats.detail.di.C28313n;
import com.avito.android.advert_stats.detail.di.C28314o;
import com.avito.android.advert_stats.detail.di.p;
import com.avito.android.advert_stats.detail.di.v;
import com.avito.android.advert_stats.detail.di.w;
import com.avito.android.advert_stats.detail.di.x;
import com.avito.android.advert_stats.detail.di.y;
import com.avito.android.advert_stats.detail.di.z;
import com.avito.android.advert_stats.detail.tab.items.chart.InterfaceC28315a;
import com.avito.android.advert_stats.detail.tab.items.chart.g;
import com.avito.android.advert_stats.detail.tab.items.chart.m;
import com.avito.android.advert_stats.detail.tab.items.chart.q;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.StatsItemTabMviFragment;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.di.b;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.i;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.L0;
import com.avito.konveyor.adapter.h;
import com.avito.konveyor.adapter.j;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;

/* compiled from: DaggerStatsItemTabComponent.java */
@e
/* loaded from: classes10.dex */
public final class a {

    /* compiled from: DaggerStatsItemTabComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.advert_stats.detail.tab.stats_item_tab.di.b.a
        public final com.avito.android.advert_stats.detail.tab.stats_item_tab.di.b a(r rVar, C28478k c28478k, l lVar, G g12, com.avito.android.advert_stats.detail.di.r rVar2, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(rVar2, interfaceC39417a, rVar, c28478k, lVar, g12, null);
        }
    }

    /* compiled from: DaggerStatsItemTabComponent.java */
    public static final class c implements com.avito.android.advert_stats.detail.tab.stats_item_tab.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f86489A;

        /* renamed from: B, reason: collision with root package name */
        public final q f86490B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.android.advert_stats.detail.tab.items.button.c> f86491C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f86492D;

        /* renamed from: E, reason: collision with root package name */
        public final com.avito.android.advert_stats.detail.tab.items.button.b f86493E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.android.advert_stats.detail.tab.items.titile.c> f86494F;

        /* renamed from: G, reason: collision with root package name */
        public final com.avito.android.advert_stats.detail.tab.items.titile.b f86495G;

        /* renamed from: H, reason: collision with root package name */
        public final u<com.avito.android.advert_stats.detail.tab.items.cost.c> f86496H;

        /* renamed from: I, reason: collision with root package name */
        public final com.avito.android.advert_stats.detail.tab.items.cost.b f86497I;

        /* renamed from: J, reason: collision with root package name */
        public final u<com.avito.android.advert_stats.detail.tab.items.cost_extended.c> f86498J;

        /* renamed from: K, reason: collision with root package name */
        public final com.avito.android.advert_stats.detail.tab.items.cost_extended.b f86499K;

        /* renamed from: L, reason: collision with root package name */
        public final u<com.avito.android.advert_stats.detail.tab.items.common_stats.c> f86500L;

        /* renamed from: M, reason: collision with root package name */
        public final com.avito.android.advert_stats.detail.tab.items.common_stats.b f86501M;

        /* renamed from: N, reason: collision with root package name */
        public final u<com.avito.android.advert_stats.detail.tab.items.cost_title.c> f86502N;

        /* renamed from: O, reason: collision with root package name */
        public final com.avito.android.advert_stats.detail.tab.items.cost_title.b f86503O;

        /* renamed from: P, reason: collision with root package name */
        public final u<com.avito.android.advert_stats.detail.tab.items.contact.c> f86504P;

        /* renamed from: Q, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f86505Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<h> f86506R;

        /* renamed from: S, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f86507S;

        /* renamed from: T, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f86508T;

        /* renamed from: U, reason: collision with root package name */
        public final u<Set<TV0.d<?, ?>>> f86509U;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.advert_stats.detail.di.r f86510a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f86511b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f86512c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.b f86513d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC35863o4> f86514e;

        /* renamed from: f, reason: collision with root package name */
        public final i f86515f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f86516g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f86517h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.advert_stats.detail.tab.stats_item_tab.f f86518i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.f f86519j;

        /* renamed from: k, reason: collision with root package name */
        public final u<C> f86520k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.l f86521l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.advert_stats.detail.tab.items.funnel.c> f86522m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.advert_stats.detail.tab.items.funnel.b f86523n;

        /* renamed from: o, reason: collision with root package name */
        public final u<Resources> f86524o;

        /* renamed from: p, reason: collision with root package name */
        public final u<L0> f86525p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.advert_stats.detail.tab.items.chart.r> f86526q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.advert_stats.detail.tab.items.chart.u> f86527r;

        /* renamed from: s, reason: collision with root package name */
        public final u<m> f86528s;

        /* renamed from: t, reason: collision with root package name */
        public final u<InterfaceC28315a> f86529t;

        /* renamed from: u, reason: collision with root package name */
        public final u<g> f86530u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.advert_stats.detail.tab.items.chart.e> f86531v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f86532w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f86533x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.advert_stats.detail.tab.items.chart.l> f86534y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f86535z;

        /* compiled from: DaggerStatsItemTabComponent.java */
        /* renamed from: com.avito.android.advert_stats.detail.tab.stats_item_tab.di.a$c$a, reason: collision with other inner class name */
        public static final class C2582a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_stats.detail.di.r f86536a;

            public C2582a(com.avito.android.advert_stats.detail.di.r rVar) {
                this.f86536a = rVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f86536a.a();
            }
        }

        /* compiled from: DaggerStatsItemTabComponent.java */
        public static final class b implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_stats.detail.di.r f86537a;

            public b(com.avito.android.advert_stats.detail.di.r rVar) {
                this.f86537a = rVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f86537a.e();
            }
        }

        /* compiled from: DaggerStatsItemTabComponent.java */
        /* renamed from: com.avito.android.advert_stats.detail.tab.stats_item_tab.di.a$c$c, reason: collision with other inner class name */
        public static final class C2583c implements u<L0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_stats.detail.di.r f86538a;

            public C2583c(com.avito.android.advert_stats.detail.di.r rVar) {
                this.f86538a = rVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f86538a.z();
            }
        }

        /* compiled from: DaggerStatsItemTabComponent.java */
        public static final class d implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_stats.detail.di.r f86539a;

            public d(com.avito.android.advert_stats.detail.di.r rVar) {
                this.f86539a = rVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f86539a.m();
            }
        }

        /* compiled from: DaggerStatsItemTabComponent.java */
        public static final class e implements u<Resources> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_stats.detail.di.r f86540a;

            public e(com.avito.android.advert_stats.detail.di.r rVar) {
                this.f86540a = rVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Resources resourcesO9 = this.f86540a.O9();
                t.c(resourcesO9);
                return resourcesO9;
            }
        }

        /* compiled from: DaggerStatsItemTabComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert_stats.detail.di.r f86541a;

            public f(com.avito.android.advert_stats.detail.di.r rVar) {
                this.f86541a = rVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f86541a.b();
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.advert_stats.detail.di.r rVar, cv.b bVar, r rVar2, C28478k c28478k, l lVar, G g12, C2581a c2581a) {
            this.f86510a = rVar;
            this.f86511b = bVar;
            this.f86513d = new com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.b(new C2582a(rVar));
            this.f86515f = new i(new d(rVar));
            this.f86516g = new f(rVar);
            this.f86517h = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f86516g);
            this.f86518i = new com.avito.android.advert_stats.detail.tab.stats_item_tab.f(new com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.e(this.f86513d, com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.g.a(), this.f86515f, this.f86517h));
            dagger.internal.f fVar = new dagger.internal.f();
            this.f86519j = fVar;
            this.f86520k = dagger.internal.g.d(new y(fVar));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f86521l = lVarA;
            u<com.avito.android.advert_stats.detail.tab.items.funnel.c> uVarD = dagger.internal.g.d(new com.avito.android.advert_stats.detail.tab.items.funnel.e(lVarA));
            this.f86522m = uVarD;
            this.f86523n = new com.avito.android.advert_stats.detail.tab.items.funnel.b(uVarD);
            u<com.avito.android.advert_stats.detail.tab.items.chart.r> uVarD2 = dagger.internal.g.d(new C28314o(new e(rVar), new C2583c(rVar)));
            this.f86526q = uVarD2;
            this.f86527r = dagger.internal.g.d(new com.avito.android.advert_stats.detail.tab.items.chart.y(this.f86521l, uVarD2));
            this.f86528s = dagger.internal.g.d(C28313n.a());
            u<InterfaceC28315a> uVarD3 = dagger.internal.g.d(new C28310k(this.f86527r));
            this.f86529t = uVarD3;
            u<g> uVarD4 = dagger.internal.g.d(new C28306g(uVarD3, this.f86526q));
            this.f86530u = uVarD4;
            u<com.avito.android.advert_stats.detail.tab.items.chart.e> uVarD5 = dagger.internal.g.d(new C28305f(uVarD4));
            this.f86531v = uVarD5;
            u<com.avito.konveyor.a> uVarD6 = dagger.internal.g.d(new C28308i(uVarD5));
            this.f86532w = uVarD6;
            u<com.avito.konveyor.adapter.a> uVarD7 = dagger.internal.g.d(new C28307h(uVarD6));
            this.f86533x = uVarD7;
            u<com.avito.android.advert_stats.detail.tab.items.chart.l> uVarD8 = dagger.internal.g.d(new C28312m(uVarD7, this.f86528s, this.f86532w));
            this.f86534y = uVarD8;
            u<com.avito.konveyor.a> uVarD9 = dagger.internal.g.d(new p(uVarD8));
            this.f86535z = uVarD9;
            u<com.avito.konveyor.adapter.a> uVarD10 = dagger.internal.g.d(new C28311l(uVarD9));
            this.f86489A = uVarD10;
            this.f86490B = new q(uVarD10, this.f86527r, this.f86535z, this.f86526q);
            u<com.avito.android.advert_stats.detail.tab.items.button.c> uVarD11 = dagger.internal.g.d(new com.avito.android.advert_stats.detail.tab.items.button.e(this.f86521l));
            this.f86491C = uVarD11;
            b bVar2 = new b(rVar);
            this.f86492D = bVar2;
            this.f86493E = new com.avito.android.advert_stats.detail.tab.items.button.b(uVarD11, bVar2);
            u<com.avito.android.advert_stats.detail.tab.items.titile.c> uVarD12 = dagger.internal.g.d(com.avito.android.advert_stats.detail.tab.items.titile.e.a());
            this.f86494F = uVarD12;
            this.f86495G = new com.avito.android.advert_stats.detail.tab.items.titile.b(uVarD12, this.f86492D);
            u<com.avito.android.advert_stats.detail.tab.items.cost.c> uVarD13 = dagger.internal.g.d(com.avito.android.advert_stats.detail.tab.items.cost.e.a());
            this.f86496H = uVarD13;
            this.f86497I = new com.avito.android.advert_stats.detail.tab.items.cost.b(uVarD13);
            u<com.avito.android.advert_stats.detail.tab.items.cost_extended.c> uVarD14 = dagger.internal.g.d(com.avito.android.advert_stats.detail.tab.items.cost_extended.e.a());
            this.f86498J = uVarD14;
            u<com.avito.android.util.text.a> uVar = this.f86492D;
            dagger.internal.l lVar2 = this.f86521l;
            this.f86499K = new com.avito.android.advert_stats.detail.tab.items.cost_extended.b(lVar2, uVarD14, uVar);
            u<com.avito.android.advert_stats.detail.tab.items.common_stats.c> uVarD15 = dagger.internal.g.d(new com.avito.android.advert_stats.detail.tab.items.common_stats.e(lVar2));
            this.f86500L = uVarD15;
            this.f86501M = new com.avito.android.advert_stats.detail.tab.items.common_stats.b(uVarD15, this.f86492D);
            u<com.avito.android.advert_stats.detail.tab.items.cost_title.c> uVarD16 = dagger.internal.g.d(com.avito.android.advert_stats.detail.tab.items.cost_title.e.a());
            this.f86502N = uVarD16;
            this.f86503O = new com.avito.android.advert_stats.detail.tab.items.cost_title.b(uVarD16, this.f86492D);
            u<com.avito.android.advert_stats.detail.tab.items.contact.c> uVarD17 = dagger.internal.g.d(com.avito.android.advert_stats.detail.tab.items.contact.e.a());
            this.f86504P = uVarD17;
            u<com.avito.konveyor.a> uVarD18 = dagger.internal.g.d(new w(this.f86523n, this.f86490B, this.f86493E, this.f86495G, this.f86497I, this.f86499K, this.f86501M, this.f86503O, new com.avito.android.advert_stats.detail.tab.items.contact.b(uVarD17)));
            this.f86505Q = uVarD18;
            this.f86506R = dagger.internal.g.d(new com.avito.android.advert_stats.detail.di.t(uVarD18));
            u<com.avito.android.recycler.data_aware.e> uVarD19 = dagger.internal.g.d(new v(com.avito.android.advert_stats.detail.tab.g.a(), com.avito.android.advert_stats.detail.tab.i.a()));
            this.f86507S = uVarD19;
            u<com.avito.konveyor.adapter.a> uVarD20 = dagger.internal.g.d(new com.avito.android.advert_stats.detail.di.u(uVarD19, this.f86520k, this.f86506R));
            this.f86508T = uVarD20;
            dagger.internal.f.a(this.f86519j, dagger.internal.g.d(new z(uVarD20, this.f86505Q)));
            this.f86509U = dagger.internal.g.d(new x(this.f86522m, this.f86527r, this.f86491C));
        }

        @Override // com.avito.android.advert_stats.detail.di.r
        public final Resources O9() {
            Resources resourcesO9 = this.f86510a.O9();
            t.c(resourcesO9);
            return resourcesO9;
        }

        @Override // com.avito.android.advert_stats.detail.di.r
        public final InterfaceC28373a a() {
            return this.f86510a.a();
        }

        @Override // com.avito.android.advert_stats.detail.di.r
        public final InterfaceC28481c b() {
            return this.f86510a.b();
        }

        @Override // com.avito.android.advert_stats.detail.di.r
        public final com.avito.android.util.text.a e() {
            return this.f86510a.e();
        }

        @Override // com.avito.android.advert_stats.detail.tab.stats_item_tab.di.b
        public final void fb(StatsItemTabMviFragment statsItemTabMviFragment) {
            statsItemTabMviFragment.f86467n0 = this.f86518i;
            statsItemTabMviFragment.f86469p0 = this.f86517h.get();
            statsItemTabMviFragment.f86470q0 = (j) this.f86519j.get();
            statsItemTabMviFragment.f86471r0 = this.f86508T.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f86511b.u4();
            t.c(aVarU4);
            statsItemTabMviFragment.f86472s0 = aVarU4;
            statsItemTabMviFragment.f86473t0 = this.f86509U.get();
        }

        @Override // com.avito.android.advert_stats.detail.di.r
        public final InterfaceC35863o4 m() {
            return this.f86510a.m();
        }

        @Override // com.avito.android.advert_stats.detail.di.r
        public final L0 z() {
            return this.f86510a.z();
        }
    }

    public static b.a a() {
        return new b();
    }
}
