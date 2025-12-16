package com.avito.android.profile.remove.di;

import androidx.view.P0;
import com.avito.android.account.E;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30065i;
import com.avito.android.profile.remove.ProfileRemoveActivity;
import com.avito.android.profile.remove.analytics.ProfileRemoveAnalytics;
import com.avito.android.profile.remove.di.b;
import com.avito.android.profile.remove.k;
import com.avito.android.profile.remove.m;
import com.avito.android.profile.remove.o;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerProfileRemoveComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerProfileRemoveComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.profile.remove.di.b.a
        public final com.avito.android.profile.remove.di.b a(ProfileRemoveActivity profileRemoveActivity, com.avito.android.profile.remove.di.c cVar, InterfaceC39417a interfaceC39417a, r rVar) {
            profileRemoveActivity.getClass();
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, profileRemoveActivity, rVar, null);
        }
    }

    /* compiled from: DaggerProfileRemoveComponent.java */
    public static final class c implements com.avito.android.profile.remove.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.profile.remove.di.c f223881a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f223882b;

        /* renamed from: c, reason: collision with root package name */
        public final l f223883c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC34401z0> f223884d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC35863o4> f223885e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f223886f;

        /* renamed from: g, reason: collision with root package name */
        public final u<E> f223887g;

        /* renamed from: h, reason: collision with root package name */
        public final H90.a f223888h;

        /* renamed from: i, reason: collision with root package name */
        public final u<R0> f223889i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.profile.remove.e> f223890j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.profile.remove.mvi.d f223891k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f223892l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.profile.remove.mvi.b f223893m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28481c> f223894n;

        /* renamed from: o, reason: collision with root package name */
        public final u<C28478k> f223895o;

        /* renamed from: p, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f223896p;

        /* renamed from: q, reason: collision with root package name */
        public final u<P0.c> f223897q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.profile.remove.i> f223898r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.profile.remove.screen.e> f223899s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.profile.remove.screen.f> f223900t;

        /* renamed from: u, reason: collision with root package name */
        public final u<m> f223901u;

        /* renamed from: v, reason: collision with root package name */
        public final u<InterfaceC27663a> f223902v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.profile.remove.confirm.h> f223903w;

        /* renamed from: x, reason: collision with root package name */
        public final u<o> f223904x;

        /* compiled from: DaggerProfileRemoveComponent.java */
        /* renamed from: com.avito.android.profile.remove.di.a$c$a, reason: collision with other inner class name */
        public static final class C6781a implements u<InterfaceC27663a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.remove.di.c f223905a;

            public C6781a(com.avito.android.profile.remove.di.c cVar) {
                this.f223905a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC27663a interfaceC27663aW0 = this.f223905a.w0();
                t.c(interfaceC27663aW0);
                return interfaceC27663aW0;
            }
        }

        /* compiled from: DaggerProfileRemoveComponent.java */
        public static final class b implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.remove.di.c f223906a;

            public b(com.avito.android.profile.remove.di.c cVar) {
                this.f223906a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f223906a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerProfileRemoveComponent.java */
        /* renamed from: com.avito.android.profile.remove.di.a$c$c, reason: collision with other inner class name */
        public static final class C6782c implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.remove.di.c f223907a;

            public C6782c(com.avito.android.profile.remove.di.c cVar) {
                this.f223907a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f223907a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerProfileRemoveComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f223908a;

            public d(cv.b bVar) {
                this.f223908a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f223908a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerProfileRemoveComponent.java */
        public static final class e implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.remove.di.c f223909a;

            public e(com.avito.android.profile.remove.di.c cVar) {
                this.f223909a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f223909a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerProfileRemoveComponent.java */
        public static final class f implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.remove.di.c f223910a;

            public f(com.avito.android.profile.remove.di.c cVar) {
                this.f223910a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4C8 = this.f223910a.C8();
                t.c(interfaceC35863o4C8);
                return interfaceC35863o4C8;
            }
        }

        /* compiled from: DaggerProfileRemoveComponent.java */
        public static final class g implements u<InterfaceC34401z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.remove.di.c f223911a;

            public g(com.avito.android.profile.remove.di.c cVar) {
                this.f223911a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34401z0 interfaceC34401z0B = this.f223911a.B();
                t.c(interfaceC34401z0B);
                return interfaceC34401z0B;
            }
        }

        /* compiled from: DaggerProfileRemoveComponent.java */
        public static final class h implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile.remove.di.c f223912a;

            public h(com.avito.android.profile.remove.di.c cVar) {
                this.f223912a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f223912a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.profile.remove.di.c cVar, cv.b bVar, ProfileRemoveActivity profileRemoveActivity, r rVar, C6780a c6780a) {
            this.f223881a = cVar;
            this.f223882b = bVar;
            this.f223883c = l.a(profileRemoveActivity);
            g gVar = new g(cVar);
            this.f223884d = gVar;
            f fVar = new f(cVar);
            this.f223885e = fVar;
            C6782c c6782c = new C6782c(cVar);
            this.f223886f = c6782c;
            H90.a aVar = new H90.a(c6782c, new b(cVar));
            this.f223888h = aVar;
            e eVar = new e(cVar);
            this.f223889i = eVar;
            u<com.avito.android.profile.remove.e> uVarD = dagger.internal.g.d(new com.avito.android.profile.remove.g(gVar, fVar, aVar, eVar));
            this.f223890j = uVarD;
            this.f223891k = new com.avito.android.profile.remove.mvi.d(uVarD);
            this.f223893m = new com.avito.android.profile.remove.mvi.b(uVarD, this.f223885e, new d(bVar), this.f223886f);
            this.f223894n = new h(cVar);
            u<C28478k> uVarD2 = dagger.internal.g.d(new com.avito.android.profile.remove.di.e(l.a(rVar)));
            this.f223895o = uVarD2;
            this.f223896p = dagger.internal.g.d(new C30065i(this.f223894n, uVarD2));
            u<P0.c> uVarD3 = dagger.internal.g.d(new k(new com.avito.android.profile.remove.mvi.g(this.f223891k, this.f223893m, com.avito.android.profile.remove.mvi.i.a(), com.avito.android.profile.remove.mvi.k.a(), this.f223896p)));
            this.f223897q = uVarD3;
            u<com.avito.android.profile.remove.i> uVarD4 = dagger.internal.g.d(new j(this.f223883c, uVarD3));
            this.f223898r = uVarD4;
            this.f223899s = dagger.internal.g.d(new com.avito.android.profile.remove.di.h(uVarD4));
            this.f223900t = dagger.internal.g.d(new com.avito.android.profile.remove.di.g(this.f223898r));
            this.f223901u = dagger.internal.g.d(new i(this.f223883c));
            this.f223903w = dagger.internal.g.d(new com.avito.android.profile.remove.confirm.j(this.f223884d, new C6781a(cVar), this.f223888h, this.f223889i));
            this.f223904x = dagger.internal.g.d(new com.avito.android.profile.remove.di.f(this.f223883c));
        }

        @Override // com.avito.android.profile.remove.screen.di.c
        public final com.avito.android.profile.remove.screen.e Fh() {
            return this.f223899s.get();
        }

        @Override // com.avito.android.profile.remove.di.b
        public final void T9(com.avito.android.profile.remove.confirm.c cVar) {
            cVar.f223810G = this.f223903w.get();
            com.avito.android.profile.remove.di.c cVar2 = this.f223881a;
            InterfaceC28373a interfaceC28373aA = cVar2.a();
            t.c(interfaceC28373aA);
            E eI2 = cVar2.i();
            t.c(eI2);
            cVar.f223811H = new ProfileRemoveAnalytics(eI2, interfaceC28373aA);
            R0 r0C = cVar2.c();
            t.c(r0C);
            cVar.f223812I = r0C;
            cVar.f223813J = cVar2.o();
            cVar.f223814K = this.f223904x.get();
        }

        @Override // com.avito.android.profile.remove.screen.di.c
        public final com.avito.android.profile.remove.screen.f Tj() {
            return this.f223900t.get();
        }

        @Override // com.avito.android.profile.remove.di.b
        public final void Zf(ProfileRemoveActivity profileRemoveActivity) {
            profileRemoveActivity.f223758m = this.f223898r.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f223882b.u4();
            t.c(aVarU4);
            profileRemoveActivity.f223759n = aVarU4;
            profileRemoveActivity.f223760o = this.f223896p.get();
        }

        @Override // com.avito.android.profile.remove.screen.di.c
        public final InterfaceC28373a a() {
            InterfaceC28373a interfaceC28373aA = this.f223881a.a();
            t.c(interfaceC28373aA);
            return interfaceC28373aA;
        }

        @Override // com.avito.android.profile.remove.screen.di.c
        public final InterfaceC28481c b() {
            InterfaceC28481c interfaceC28481cB = this.f223881a.b();
            t.c(interfaceC28481cB);
            return interfaceC28481cB;
        }

        @Override // com.avito.android.profile.remove.screen.di.c
        public final com.avito.android.util.text.a e() {
            com.avito.android.util.text.a aVarE = this.f223881a.e();
            t.c(aVarE);
            return aVarE;
        }

        @Override // com.avito.android.profile.remove.screen.di.c
        public final E i() {
            E eI2 = this.f223881a.i();
            t.c(eI2);
            return eI2;
        }
    }

    public static b.a a() {
        return new b();
    }
}
