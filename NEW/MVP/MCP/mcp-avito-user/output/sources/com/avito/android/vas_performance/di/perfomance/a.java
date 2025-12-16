package com.avito.android.vas_performance.di.perfomance;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.PerformanceVasScreen;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_performance.C36058l;
import com.avito.android.vas_performance.InterfaceC36056j;
import com.avito.android.vas_performance.di.perfomance.k;
import com.avito.android.vas_performance.ui.PerformanceVasFragment;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.z;
import java.util.List;
import java.util.Set;
import zL0.InterfaceC50482a;

/* compiled from: DaggerPerformanceVasComponentNew.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerPerformanceVasComponentNew.java */
    public static final class b implements k.a {
        public b() {
        }

        @Override // com.avito.android.vas_performance.di.perfomance.k.a
        public final k a(n nVar, InterfaceC39417a interfaceC39417a, q qVar, PerformanceVasFragment performanceVasFragment, com.avito.android.analytics.screens.r rVar, PerformanceVasScreen performanceVasScreen) {
            interfaceC39417a.getClass();
            performanceVasScreen.getClass();
            return new c(new com.avito.android.vas_performance.di.perfomance.b(), qVar, nVar, interfaceC39417a, performanceVasFragment, rVar, performanceVasScreen, null);
        }
    }

    /* compiled from: DaggerPerformanceVasComponentNew.java */
    public static final class c implements k {

        /* renamed from: A, reason: collision with root package name */
        public final u<InterfaceC28499v> f319995A;

        /* renamed from: B, reason: collision with root package name */
        public final u<InterfaceC28501x> f319996B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.android.analytics.screens.o> f319997C;

        /* renamed from: D, reason: collision with root package name */
        public final u<TL0.a> f319998D;

        /* renamed from: E, reason: collision with root package name */
        public final u<AK0.l> f319999E;

        /* renamed from: F, reason: collision with root package name */
        public final u<P0.c> f320000F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.o> f320001G;

        /* renamed from: a, reason: collision with root package name */
        public final n f320002a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f320003b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.ui.items.header.c> f320004c;

        /* renamed from: d, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f320005d;

        /* renamed from: e, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f320006e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.ui.items.tabs.e> f320007f;

        /* renamed from: g, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f320008g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.ui.items.vas.d> f320009h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f320010i;

        /* renamed from: j, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f320011j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.ui.items.info_action.d> f320012k;

        /* renamed from: l, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f320013l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.ui.items.lightning_block.d> f320014m;

        /* renamed from: n, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f320015n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.ui.items.additional_info_block.d> f320016o;

        /* renamed from: p, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f320017p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f320018q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f320019r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.l f320020s;

        /* renamed from: t, reason: collision with root package name */
        public final u<InterfaceC50482a> f320021t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC35745a5> f320022u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.vas_performance.repository.a> f320023v;

        /* renamed from: w, reason: collision with root package name */
        public final u<InterfaceC36056j> f320024w;

        /* renamed from: x, reason: collision with root package name */
        public final u<InterfaceC28481c> f320025x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.l f320026y;

        /* renamed from: z, reason: collision with root package name */
        public final u<H> f320027z;

        /* compiled from: DaggerPerformanceVasComponentNew.java */
        /* renamed from: com.avito.android.vas_performance.di.perfomance.a$c$a, reason: collision with other inner class name */
        public static final class C9918a implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final n f320028a;

            public C9918a(n nVar) {
                this.f320028a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f320028a.e();
                t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerPerformanceVasComponentNew.java */
        public static final class b implements u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final n f320029a;

            public b(n nVar) {
                this.f320029a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f320029a.r();
            }
        }

        /* compiled from: DaggerPerformanceVasComponentNew.java */
        /* renamed from: com.avito.android.vas_performance.di.perfomance.a$c$c, reason: collision with other inner class name */
        public static final class C9919c implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final n f320030a;

            public C9919c(n nVar) {
                this.f320030a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f320030a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerPerformanceVasComponentNew.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final n f320031a;

            public d(n nVar) {
                this.f320031a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f320031a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerPerformanceVasComponentNew.java */
        public static final class e implements u<InterfaceC50482a> {

            /* renamed from: a, reason: collision with root package name */
            public final n f320032a;

            public e(n nVar) {
                this.f320032a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50482a interfaceC50482aO0 = this.f320032a.o0();
                t.c(interfaceC50482aO0);
                return interfaceC50482aO0;
            }
        }

        public c(com.avito.android.vas_performance.di.perfomance.b bVar, q qVar, n nVar, cv.b bVar2, Fragment fragment, com.avito.android.analytics.screens.r rVar, Screen screen, C9917a c9917a) {
            this.f320002a = nVar;
            this.f320003b = bVar2;
            u<com.avito.android.vas_performance.ui.items.header.c> uVarD = dagger.internal.g.d(new com.avito.android.vas_performance.di.perfomance.d(bVar));
            this.f320004c = uVarD;
            this.f320005d = dagger.internal.g.d(new com.avito.android.vas_performance.di.perfomance.c(bVar, uVarD));
            this.f320006e = B.a(com.avito.android.konveyor_adapter_module.d.a());
            u<com.avito.android.vas_performance.ui.items.tabs.e> uVarD2 = dagger.internal.g.d(com.avito.android.vas_performance.ui.items.tabs.h.a());
            this.f320007f = uVarD2;
            this.f320008g = dagger.internal.g.d(new com.avito.android.vas_performance.ui.items.tabs.d(uVarD2));
            u<com.avito.android.vas_performance.ui.items.vas.d> uVarD3 = dagger.internal.g.d(com.avito.android.vas_performance.ui.items.vas.g.a());
            this.f320009h = uVarD3;
            this.f320011j = dagger.internal.g.d(new com.avito.android.vas_performance.ui.items.vas.b(uVarD3, new C9918a(nVar)));
            u<com.avito.android.vas_performance.ui.items.info_action.d> uVarD4 = dagger.internal.g.d(com.avito.android.vas_performance.ui.items.info_action.g.a());
            this.f320012k = uVarD4;
            this.f320013l = dagger.internal.g.d(new com.avito.android.vas_performance.ui.items.info_action.c(uVarD4));
            u<com.avito.android.vas_performance.ui.items.lightning_block.d> uVarD5 = dagger.internal.g.d(com.avito.android.vas_performance.ui.items.lightning_block.e.a());
            this.f320014m = uVarD5;
            this.f320015n = dagger.internal.g.d(new com.avito.android.vas_performance.ui.items.lightning_block.c(uVarD5));
            u<com.avito.android.vas_performance.ui.items.additional_info_block.d> uVarD6 = dagger.internal.g.d(com.avito.android.vas_performance.ui.items.additional_info_block.e.a());
            this.f320016o = uVarD6;
            this.f320017p = dagger.internal.g.d(new com.avito.android.vas_performance.ui.items.additional_info_block.c(uVarD6));
            A.b bVarA = A.a(6, 1);
            u<TV0.b<?, ?>> uVar = this.f320005d;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            bVarA.f393938b.add(this.f320006e);
            list.add(this.f320008g);
            list.add(this.f320011j);
            list.add(this.f320013l);
            list.add(this.f320015n);
            list.add(this.f320017p);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f320018q = uVarK;
            this.f320019r = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f320020s = dagger.internal.l.a(fragment);
            e eVar = new e(nVar);
            C9919c c9919c = new C9919c(nVar);
            this.f320022u = c9919c;
            this.f320023v = dagger.internal.g.d(new com.avito.android.vas_performance.repository.d(eVar, c9919c));
            this.f320024w = dagger.internal.g.d(C36058l.a());
            this.f320025x = new d(nVar);
            this.f320026y = dagger.internal.l.a(screen);
            u<H> uVarD7 = dagger.internal.g.d(new j(this.f320026y, dagger.internal.l.a(rVar), this.f320025x));
            this.f320027z = uVarD7;
            this.f319995A = dagger.internal.g.d(new g(uVarD7));
            this.f319996B = dagger.internal.g.d(new i(this.f320027z));
            u<com.avito.android.analytics.screens.o> uVarD8 = dagger.internal.g.d(new h(this.f320027z));
            this.f319997C = uVarD8;
            u<TL0.a> uVarD9 = dagger.internal.g.d(new TL0.c(uVarD8, this.f319995A, this.f319996B));
            this.f319998D = uVarD9;
            u<P0.c> uVarD10 = dagger.internal.g.d(new s(qVar, this.f320023v, this.f320022u, this.f320024w, uVarD9, new b(nVar)));
            this.f320000F = uVarD10;
            this.f320001G = dagger.internal.g.d(new r(qVar, this.f320020s, uVarD10));
        }

        @Override // com.avito.android.vas_performance.di.perfomance.k
        public final void a(PerformanceVasFragment performanceVasFragment) {
            performanceVasFragment.f321386n0 = this.f320018q.get();
            performanceVasFragment.f321387o0 = this.f320019r.get();
            performanceVasFragment.f321388p0 = this.f320001G.get();
            InterfaceC28373a interfaceC28373aA = this.f320002a.a();
            t.c(interfaceC28373aA);
            performanceVasFragment.f321389q0 = interfaceC28373aA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f320003b.u4();
            t.c(aVarU4);
            performanceVasFragment.f321390r0 = aVarU4;
            z zVar = new z(6);
            zVar.a(this.f320007f.get());
            zVar.a(this.f320009h.get());
            zVar.a(this.f320012k.get());
            zVar.a(this.f320004c.get());
            zVar.a(this.f320014m.get());
            zVar.a(this.f320016o.get());
            performanceVasFragment.f321391s0 = zVar.c();
            performanceVasFragment.f321392t0 = this.f319998D.get();
        }
    }

    public static k.a a() {
        return new b();
    }
}
