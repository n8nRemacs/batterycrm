package com.avito.android.re_agent_landing.landing.di;

import Nh0.InterfaceC14577a;
import Y41.l;
import androidx.recyclerview.widget.C;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.re_agent_landing.landing.ReAgentProfileCreateLandingArgs;
import com.avito.android.re_agent_landing.landing.ReAgentProfileCreateLandingFragment;
import com.avito.android.re_agent_landing.landing.di.b;
import com.avito.android.re_agent_landing.landing.di.f;
import com.avito.android.re_agent_landing.landing.mvi.k;
import com.avito.android.util.R0;
import com.avito.konveyor.adapter.j;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;

/* compiled from: DaggerReAgentProfileCreateLandingComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerReAgentProfileCreateLandingComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.re_agent_landing.landing.di.b.a
        public final com.avito.android.re_agent_landing.landing.di.b a(com.avito.android.re_agent_landing.di.c cVar, InterfaceC39417a interfaceC39417a, ReAgentProfileCreateLandingArgs reAgentProfileCreateLandingArgs, C28478k c28478k, l lVar) {
            interfaceC39417a.getClass();
            reAgentProfileCreateLandingArgs.getClass();
            return new c(cVar, interfaceC39417a, reAgentProfileCreateLandingArgs, c28478k, lVar, null);
        }
    }

    /* compiled from: DaggerReAgentProfileCreateLandingComponent.java */
    public static final class c implements com.avito.android.re_agent_landing.landing.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f250579a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC14577a> f250580b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f250581c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.re_agent_landing.landing.interactor.a> f250582d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f250583e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.re_agent_landing.landing.mvi.d f250584f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.re_agent_landing.landing.mvi.b f250585g;

        /* renamed from: h, reason: collision with root package name */
        public final k f250586h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f250587i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f250588j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.re_agent_landing.landing.f f250589k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.f f250590l;

        /* renamed from: m, reason: collision with root package name */
        public final u<C> f250591m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.l f250592n;

        /* renamed from: o, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f250593o;

        /* renamed from: p, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f250594p;

        /* renamed from: q, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f250595q;

        /* renamed from: r, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f250596r;

        /* renamed from: s, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f250597s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f250598t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f250599u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f250600v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f250601w;

        /* compiled from: DaggerReAgentProfileCreateLandingComponent.java */
        /* renamed from: com.avito.android.re_agent_landing.landing.di.a$c$a, reason: collision with other inner class name */
        public static final class C7512a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.re_agent_landing.di.c f250602a;

            public C7512a(com.avito.android.re_agent_landing.di.c cVar) {
                this.f250602a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f250602a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerReAgentProfileCreateLandingComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.re_agent_landing.di.c f250603a;

            public b(com.avito.android.re_agent_landing.di.c cVar) {
                this.f250603a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f250603a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerReAgentProfileCreateLandingComponent.java */
        /* renamed from: com.avito.android.re_agent_landing.landing.di.a$c$c, reason: collision with other inner class name */
        public static final class C7513c implements u<InterfaceC14577a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.re_agent_landing.di.c f250604a;

            public C7513c(com.avito.android.re_agent_landing.di.c cVar) {
                this.f250604a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14577a interfaceC14577aYe = this.f250604a.Ye();
                t.c(interfaceC14577aYe);
                return interfaceC14577aYe;
            }
        }

        /* compiled from: DaggerReAgentProfileCreateLandingComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.re_agent_landing.di.c f250605a;

            public d(com.avito.android.re_agent_landing.di.c cVar) {
                this.f250605a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f250605a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.re_agent_landing.di.c cVar, cv.b bVar, ReAgentProfileCreateLandingArgs reAgentProfileCreateLandingArgs, C28478k c28478k, l lVar, C7511a c7511a) {
            this.f250579a = bVar;
            this.f250582d = B.a(new com.avito.android.re_agent_landing.landing.interactor.c(new C7513c(cVar), new b(cVar)));
            this.f250583e = new C7512a(cVar);
            dagger.internal.l lVarA = dagger.internal.l.a(reAgentProfileCreateLandingArgs);
            u<com.avito.android.re_agent_landing.landing.interactor.a> uVar = this.f250582d;
            this.f250584f = new com.avito.android.re_agent_landing.landing.mvi.d(lVarA, uVar, this.f250583e);
            this.f250585g = new com.avito.android.re_agent_landing.landing.mvi.b(uVar);
            this.f250586h = new k(com.avito.android.re_agent_landing.landing.mvi.builder.c.a());
            this.f250587i = new d(cVar);
            this.f250588j = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f250587i);
            this.f250589k = new com.avito.android.re_agent_landing.landing.f(new com.avito.android.re_agent_landing.landing.mvi.g(this.f250584f, this.f250585g, com.avito.android.re_agent_landing.landing.mvi.i.a(), this.f250586h, this.f250588j));
            dagger.internal.f fVar = new dagger.internal.f();
            this.f250590l = fVar;
            this.f250591m = dagger.internal.g.d(new h(fVar));
            dagger.internal.l lVarA2 = dagger.internal.l.a(lVar);
            this.f250592n = lVarA2;
            this.f250593o = dagger.internal.g.d(new com.avito.android.re_agent_landing.landing.items.action_block.b(new com.avito.android.re_agent_landing.landing.items.action_block.g(lVarA2, this.f250583e)));
            this.f250594p = dagger.internal.g.d(new com.avito.android.re_agent_landing.landing.items.header.b(com.avito.android.re_agent_landing.landing.items.header.f.a()));
            this.f250595q = dagger.internal.g.d(new com.avito.android.re_agent_landing.landing.items.info_block.b(com.avito.android.re_agent_landing.landing.items.info_block.f.a()));
            this.f250596r = dagger.internal.g.d(new com.avito.android.re_agent_landing.landing.items.question.b(new com.avito.android.re_agent_landing.landing.items.question.f(this.f250592n)));
            this.f250597s = dagger.internal.g.d(new com.avito.android.re_agent_landing.landing.items.top_block.b(new com.avito.android.re_agent_landing.landing.items.top_block.g(this.f250592n)));
            A.b bVarA = A.a(5, 0);
            u<TV0.b<?, ?>> uVar2 = this.f250593o;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar2);
            list.add(this.f250594p);
            list.add(this.f250595q);
            list.add(this.f250596r);
            list.add(this.f250597s);
            u<com.avito.konveyor.a> uVarD = dagger.internal.g.d(new g(bVarA.b()));
            this.f250598t = uVarD;
            this.f250599u = dagger.internal.g.d(new com.avito.android.re_agent_landing.landing.di.d(uVarD));
            u<com.avito.android.recycler.data_aware.e> uVarD2 = dagger.internal.g.d(f.a.f250611a);
            this.f250600v = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new e(uVarD2, this.f250591m, this.f250599u));
            this.f250601w = uVarD3;
            dagger.internal.f.a(this.f250590l, dagger.internal.g.d(new i(uVarD3, this.f250598t)));
        }

        @Override // com.avito.android.re_agent_landing.landing.di.b
        public final void a(ReAgentProfileCreateLandingFragment reAgentProfileCreateLandingFragment) {
            reAgentProfileCreateLandingFragment.f250557n0 = this.f250589k;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f250579a.u4();
            t.c(aVarU4);
            reAgentProfileCreateLandingFragment.f250559p0 = aVarU4;
            reAgentProfileCreateLandingFragment.f250560q0 = this.f250588j.get();
            reAgentProfileCreateLandingFragment.f250561r0 = (j) this.f250590l.get();
            reAgentProfileCreateLandingFragment.f250562s0 = this.f250601w.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
