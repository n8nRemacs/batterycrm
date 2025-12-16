package com.avito.android.str_calendar.seller.calandar_parameters.di;

import android.content.res.Resources;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.d1;
import com.avito.android.str_calendar.seller.calandar_parameters.C35095f;
import com.avito.android.str_calendar.seller.calandar_parameters.C35097h;
import com.avito.android.str_calendar.seller.calandar_parameters.K;
import com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment;
import com.avito.android.str_calendar.seller.calandar_parameters.di.k;
import com.avito.android.str_calendar.seller.calandar_parameters.mvi.q;
import com.avito.android.str_calendar.seller.calandar_parameters.mvi.s;
import com.avito.android.str_calendar.seller.calandar_parameters.mvi.v;
import com.avito.android.str_calendar.seller.calandar_parameters.mvi.x;
import com.avito.android.str_calendar.seller.calandar_parameters.t;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.P3;
import com.avito.android.util.R0;
import com.avito.android.validation.C36024o;
import com.avito.android.validation.InterfaceC36020m;
import com.avito.android.validation.f1;
import com.avito.android.validation.g1;
import com.avito.android.validation.i1;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.u;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import lE.C43624b;
import qy0.C47463a;
import qy0.C47464b;

/* compiled from: DaggerStrCalendarParametersComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class b {

    /* compiled from: DaggerStrCalendarParametersComponent.java */
    /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.di.b$b, reason: collision with other inner class name */
    public static final class C8599b implements k.a {
        public C8599b() {
        }

        @Override // com.avito.android.str_calendar.seller.calandar_parameters.di.k.a
        public final k a(InterfaceC39417a interfaceC39417a, com.avito.android.str_calendar.seller.core.di.c cVar, n nVar, Y41.l lVar, C28478k c28478k, Date date, Date date2, String str, Resources resources, boolean z12) {
            interfaceC39417a.getClass();
            return new c(new l(), new d(), nVar, interfaceC39417a, cVar, lVar, c28478k, date, date2, str, resources, Boolean.valueOf(z12), null);
        }
    }

    /* compiled from: DaggerStrCalendarParametersComponent.java */
    public static final class c implements com.avito.android.str_calendar.seller.calandar_parameters.di.k {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.analytics.provider.a> f286750A;

        /* renamed from: B, reason: collision with root package name */
        public final u<Cy0.b> f286751B;

        /* renamed from: C, reason: collision with root package name */
        public final com.avito.android.str_calendar.seller.calandar_parameters.domain.o f286752C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.l f286753D;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.l f286754E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.l f286755F;

        /* renamed from: G, reason: collision with root package name */
        public final com.avito.android.str_calendar.seller.calandar_parameters.mvi.j f286756G;

        /* renamed from: H, reason: collision with root package name */
        public final u<AK0.l> f286757H;

        /* renamed from: I, reason: collision with root package name */
        public final u<C47463a> f286758I;

        /* renamed from: J, reason: collision with root package name */
        public final u<C35095f> f286759J;

        /* renamed from: K, reason: collision with root package name */
        public final u<C43624b> f286760K;

        /* renamed from: L, reason: collision with root package name */
        public final com.avito.android.str_calendar.seller.calandar_parameters.mvi.h f286761L;

        /* renamed from: M, reason: collision with root package name */
        public final s f286762M;

        /* renamed from: N, reason: collision with root package name */
        public final u<v> f286763N;

        /* renamed from: O, reason: collision with root package name */
        public final u<com.avito.android.str_calendar.seller.calandar_parameters.domain.children.g> f286764O;

        /* renamed from: P, reason: collision with root package name */
        public final com.avito.android.str_calendar.seller.calandar_parameters.mvi.u f286765P;

        /* renamed from: Q, reason: collision with root package name */
        public final u<InterfaceC28481c> f286766Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f286767R;

        /* renamed from: S, reason: collision with root package name */
        public final K f286768S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.l f286769T;

        /* renamed from: U, reason: collision with root package name */
        public final u<com.avito.android.str_calendar.seller.warning_dialog.e> f286770U;

        /* renamed from: V, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286771V;

        /* renamed from: W, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286772W;

        /* renamed from: X, reason: collision with root package name */
        public final com.avito.android.str_calendar.seller.calandar_parameters.items.input.h f286773X;

        /* renamed from: Y, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286774Y;

        /* renamed from: Z, reason: collision with root package name */
        public final com.avito.android.str_calendar.seller.calandar_parameters.items.header.g f286775Z;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.str_calendar.seller.core.di.c f286776a;

        /* renamed from: a0, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286777a0;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f286778b;

        /* renamed from: b0, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286779b0;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.str_calendar.seller.calandar_parameters.di.n f286780c;

        /* renamed from: c0, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286781c0;

        /* renamed from: d, reason: collision with root package name */
        public final u<d1> f286782d;

        /* renamed from: d0, reason: collision with root package name */
        public final com.avito.android.str_calendar.seller.calandar_parameters.items.carousel.b f286783d0;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f286784e;

        /* renamed from: e0, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286785e0;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.l f286786f;

        /* renamed from: f0, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286787f0;

        /* renamed from: g, reason: collision with root package name */
        public final u<g1> f286788g;

        /* renamed from: g0, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286789g0;

        /* renamed from: h, reason: collision with root package name */
        public final u<hJ.i> f286790h;

        /* renamed from: h0, reason: collision with root package name */
        public final com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.h f286791h0;

        /* renamed from: i, reason: collision with root package name */
        public final u<hJ.e> f286792i;

        /* renamed from: i0, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286793i0;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.validation.d1> f286794j;

        /* renamed from: j0, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286795j0;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC36020m> f286796k;

        /* renamed from: k0, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286797k0;

        /* renamed from: l, reason: collision with root package name */
        public final u<R0> f286798l;

        /* renamed from: l0, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286799l0;

        /* renamed from: m, reason: collision with root package name */
        public final u<t> f286800m;

        /* renamed from: m0, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286801m0;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f286802n;

        /* renamed from: n0, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286803n0;

        /* renamed from: o, reason: collision with root package name */
        public final u<Locale> f286804o;

        /* renamed from: o0, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286805o0;

        /* renamed from: p, reason: collision with root package name */
        public final u<hJ.g> f286806p;

        /* renamed from: p0, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286807p0;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.str_calendar.seller.calandar_parameters.domain.children.a> f286808q;

        /* renamed from: q0, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286809q0;

        /* renamed from: r, reason: collision with root package name */
        public final u<Q1> f286810r;

        /* renamed from: r0, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f286811r0;

        /* renamed from: s, reason: collision with root package name */
        public final u<u3.l<SimpleTestGroupWithNone>> f286812s;

        /* renamed from: s0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f286813s0;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.str_calendar.seller.calandar_parameters.s> f286814t;

        /* renamed from: t0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f286815t0;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC35863o4> f286816u;

        /* renamed from: u0, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286817u0;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.d> f286818v;

        /* renamed from: v0, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f286819v0;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.str_calendar.seller.calandar_parameters.mvi.k> f286820w;

        /* renamed from: w0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f286821w0;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.android.str_calendar.seller.calandar_parameters.domain.children.j> f286822x;

        /* renamed from: x0, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f286823x0;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.a> f286824y;

        /* renamed from: z, reason: collision with root package name */
        public final u<InterfaceC28373a> f286825z;

        /* compiled from: DaggerStrCalendarParametersComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calandar_parameters.di.n f286826a;

            public a(com.avito.android.str_calendar.seller.calandar_parameters.di.n nVar) {
                this.f286826a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f286826a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerStrCalendarParametersComponent.java */
        /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.di.b$c$b, reason: collision with other inner class name */
        public static final class C8600b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calandar_parameters.di.n f286827a;

            public C8600b(com.avito.android.str_calendar.seller.calandar_parameters.di.n nVar) {
                this.f286827a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f286827a.f();
                dagger.internal.t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerStrCalendarParametersComponent.java */
        /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.di.b$c$c, reason: collision with other inner class name */
        public static final class C8601c implements u<com.avito.android.analytics.provider.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calandar_parameters.di.n f286828a;

            public C8601c(com.avito.android.str_calendar.seller.calandar_parameters.di.n nVar) {
                this.f286828a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.provider.a aVarV = this.f286828a.v();
                dagger.internal.t.c(aVarV);
                return aVarV;
            }
        }

        /* compiled from: DaggerStrCalendarParametersComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calandar_parameters.di.n f286829a;

            public d(com.avito.android.str_calendar.seller.calandar_parameters.di.n nVar) {
                this.f286829a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f286829a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerStrCalendarParametersComponent.java */
        public static final class e implements u<hJ.e> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calandar_parameters.di.n f286830a;

            public e(com.avito.android.str_calendar.seller.calandar_parameters.di.n nVar) {
                this.f286830a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.e eVarS = this.f286830a.S();
                dagger.internal.t.c(eVarS);
                return eVarS;
            }
        }

        /* compiled from: DaggerStrCalendarParametersComponent.java */
        public static final class f implements u<hJ.g> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calandar_parameters.di.n f286831a;

            public f(com.avito.android.str_calendar.seller.calandar_parameters.di.n nVar) {
                this.f286831a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.g gVarP0 = this.f286831a.p0();
                dagger.internal.t.c(gVarP0);
                return gVarP0;
            }
        }

        /* compiled from: DaggerStrCalendarParametersComponent.java */
        public static final class g implements u<hJ.i> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calandar_parameters.di.n f286832a;

            public g(com.avito.android.str_calendar.seller.calandar_parameters.di.n nVar) {
                this.f286832a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                hJ.i iVarY = this.f286832a.Y();
                dagger.internal.t.c(iVarY);
                return iVarY;
            }
        }

        /* compiled from: DaggerStrCalendarParametersComponent.java */
        public static final class h implements u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calandar_parameters.di.n f286833a;

            public h(com.avito.android.str_calendar.seller.calandar_parameters.di.n nVar) {
                this.f286833a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f286833a.locale();
            }
        }

        /* compiled from: DaggerStrCalendarParametersComponent.java */
        public static final class i implements u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calandar_parameters.di.n f286834a;

            public i(com.avito.android.str_calendar.seller.calandar_parameters.di.n nVar) {
                this.f286834a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f286834a.r();
            }
        }

        /* compiled from: DaggerStrCalendarParametersComponent.java */
        public static final class j implements u<Q1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calandar_parameters.di.n f286835a;

            public j(com.avito.android.str_calendar.seller.calandar_parameters.di.n nVar) {
                this.f286835a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f286835a.z0();
            }
        }

        /* compiled from: DaggerStrCalendarParametersComponent.java */
        public static final class k implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calandar_parameters.di.n f286836a;

            public k(com.avito.android.str_calendar.seller.calandar_parameters.di.n nVar) {
                this.f286836a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f286836a.m();
                dagger.internal.t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerStrCalendarParametersComponent.java */
        public static final class l implements u<u3.l<SimpleTestGroupWithNone>> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calandar_parameters.di.n f286837a;

            public l(com.avito.android.str_calendar.seller.calandar_parameters.di.n nVar) {
                this.f286837a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.l<SimpleTestGroupWithNone> lVarO0 = this.f286837a.O0();
                dagger.internal.t.c(lVarO0);
                return lVarO0;
            }
        }

        /* compiled from: DaggerStrCalendarParametersComponent.java */
        public static final class m implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calandar_parameters.di.n f286838a;

            public m(com.avito.android.str_calendar.seller.calandar_parameters.di.n nVar) {
                this.f286838a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f286838a.l();
                dagger.internal.t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerStrCalendarParametersComponent.java */
        public static final class n implements u<d1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calandar_parameters.di.n f286839a;

            public n(com.avito.android.str_calendar.seller.calandar_parameters.di.n nVar) {
                this.f286839a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                d1 d1VarA0 = this.f286839a.a0();
                dagger.internal.t.c(d1VarA0);
                return d1VarA0;
            }
        }

        /* compiled from: DaggerStrCalendarParametersComponent.java */
        public static final class o implements u<C43624b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calandar_parameters.di.n f286840a;

            public o(com.avito.android.str_calendar.seller.calandar_parameters.di.n nVar) {
                this.f286840a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f286840a.J();
            }
        }

        /* compiled from: DaggerStrCalendarParametersComponent.java */
        public static final class p implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calandar_parameters.di.n f286841a;

            public p(com.avito.android.str_calendar.seller.calandar_parameters.di.n nVar) {
                this.f286841a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f286841a.o();
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.str_calendar.seller.calandar_parameters.di.l lVar, com.avito.android.str_calendar.seller.calandar_parameters.di.d dVar, com.avito.android.str_calendar.seller.calandar_parameters.di.n nVar, cv.b bVar, com.avito.android.str_calendar.seller.core.di.c cVar, Y41.l lVar2, C28478k c28478k, Date date, Date date2, String str, Resources resources, Boolean bool, a aVar) {
            this.f286776a = cVar;
            this.f286778b = bVar;
            this.f286780c = nVar;
            this.f286782d = new n(nVar);
            this.f286784e = new p(nVar);
            dagger.internal.l lVarA = dagger.internal.l.a(resources);
            this.f286786f = lVarA;
            u<g1> uVarD = dagger.internal.g.d(new i1(lVarA));
            this.f286788g = uVarD;
            g gVar = new g(nVar);
            e eVar = new e(nVar);
            this.f286792i = eVar;
            u<com.avito.android.validation.d1> uVarD2 = dagger.internal.g.d(new f1(uVarD, gVar, eVar));
            this.f286794j = uVarD2;
            this.f286796k = dagger.internal.g.d(new C36024o(uVarD2));
            this.f286798l = new d(nVar);
            this.f286800m = dagger.internal.g.d(com.avito.android.str_calendar.seller.calandar_parameters.v.a());
            this.f286802n = new m(nVar);
            this.f286804o = new h(nVar);
            this.f286806p = new f(nVar);
            u<com.avito.android.str_calendar.seller.calandar_parameters.domain.children.a> uVarD3 = dagger.internal.g.d(com.avito.android.str_calendar.seller.calandar_parameters.domain.children.f.a());
            this.f286808q = uVarD3;
            this.f286814t = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.di.m(lVar, P3.f318722a, this.f286802n, this.f286804o, this.f286786f, this.f286792i, this.f286806p, uVarD3, new j(nVar), new l(nVar)));
            u<com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.d> uVarD4 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.f(new k(nVar)));
            this.f286818v = uVarD4;
            this.f286820w = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.mvi.m(uVarD4, this.f286814t, this.f286808q));
            this.f286822x = dagger.internal.g.d(com.avito.android.str_calendar.seller.calandar_parameters.domain.children.l.a());
            this.f286824y = dagger.internal.g.d(com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.c.a());
            u<Cy0.b> uVarD5 = dagger.internal.g.d(new Cy0.d(new a(nVar), new C8601c(nVar)));
            this.f286751B = uVarD5;
            this.f286752C = new com.avito.android.str_calendar.seller.calandar_parameters.domain.o(uVarD5, this.f286782d, this.f286784e, this.f286796k, this.f286798l, this.f286800m, this.f286820w, this.f286822x, this.f286824y);
            this.f286753D = dagger.internal.l.a(str);
            this.f286754E = dagger.internal.l.b(date);
            this.f286755F = dagger.internal.l.b(date2);
            this.f286756G = new com.avito.android.str_calendar.seller.calandar_parameters.mvi.j(this.f286752C, this.f286753D, this.f286754E, this.f286755F, dagger.internal.l.a(bool));
            u<C47463a> uVarD6 = dagger.internal.g.d(new C47464b(new i(nVar)));
            this.f286758I = uVarD6;
            u<C35095f> uVarD7 = dagger.internal.g.d(new C35097h(uVarD6));
            this.f286759J = uVarD7;
            this.f286761L = new com.avito.android.str_calendar.seller.calandar_parameters.mvi.h(this.f286752C, this.f286751B, uVarD7, new o(nVar));
            this.f286762M = new s(com.avito.android.str_calendar.seller.calandar_parameters.domain.s.a(), this.f286759J);
            this.f286763N = dagger.internal.g.d(new x(this.f286820w, this.f286800m));
            u<com.avito.android.str_calendar.seller.calandar_parameters.domain.children.g> uVarD8 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.domain.children.i(this.f286808q));
            this.f286764O = uVarD8;
            this.f286765P = new com.avito.android.str_calendar.seller.calandar_parameters.mvi.u(uVarD8, this.f286820w, this.f286763N, this.f286818v);
            this.f286766Q = new C8600b(nVar);
            u<ScreenPerformanceTracker> uVarS = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f286766Q);
            this.f286767R = uVarS;
            this.f286768S = new K(new q(this.f286756G, this.f286761L, this.f286762M, this.f286765P, uVarS));
            dagger.internal.l lVarA2 = dagger.internal.l.a(lVar2);
            this.f286769T = lVarA2;
            this.f286770U = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.domain.q(lVarA2));
            this.f286771V = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.items.chips.b(new com.avito.android.str_calendar.seller.calandar_parameters.items.chips.e(this.f286769T)));
            this.f286772W = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.items.radiogroup.b(new com.avito.android.str_calendar.seller.calandar_parameters.items.radiogroup.e(this.f286769T)));
            com.avito.android.str_calendar.seller.calandar_parameters.items.input.h hVar = new com.avito.android.str_calendar.seller.calandar_parameters.items.input.h(this.f286769T);
            this.f286773X = hVar;
            this.f286774Y = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.items.input.b(hVar));
            com.avito.android.str_calendar.seller.calandar_parameters.items.header.g gVar2 = new com.avito.android.str_calendar.seller.calandar_parameters.items.header.g(this.f286769T);
            this.f286775Z = gVar2;
            this.f286777a0 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.items.header.d(gVar2));
            this.f286779b0 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.items.header.b(this.f286775Z));
            this.f286781c0 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.items.disclaimer.d(new com.avito.android.str_calendar.seller.calandar_parameters.items.disclaimer.g(this.f286769T)));
            this.f286783d0 = new com.avito.android.str_calendar.seller.calandar_parameters.items.carousel.b(new com.avito.android.str_calendar.seller.calandar_parameters.items.carousel.f(this.f286769T));
            this.f286785e0 = dagger.internal.g.d(this.f286783d0);
            this.f286787f0 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.items.dialog.b(new com.avito.android.str_calendar.seller.calandar_parameters.items.dialog.e(this.f286769T, this.f286800m)));
            this.f286789g0 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.items.link.b(new com.avito.android.str_calendar.seller.calandar_parameters.items.link.e(this.f286769T, this.f286800m)));
            com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.h hVar2 = new com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.h(this.f286769T);
            this.f286791h0 = hVar2;
            this.f286793i0 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.e(hVar2));
            this.f286795j0 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.b(this.f286791h0));
            this.f286797k0 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.items.doubleselect.b(new com.avito.android.str_calendar.seller.calandar_parameters.items.doubleselect.f(this.f286769T)));
            this.f286799l0 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.b(new com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.j(this.f286769T)));
            this.f286801m0 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.items.duration_discount.b(new com.avito.android.str_calendar.seller.calandar_parameters.items.duration_discount.e(this.f286769T)));
            this.f286803n0 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.items.early_booking_discount.b(new com.avito.android.str_calendar.seller.calandar_parameters.items.early_booking_discount.e(this.f286769T)));
            this.f286805o0 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.items.variable_length.header.d(new com.avito.android.str_calendar.seller.calandar_parameters.items.variable_length.header.g(this.f286769T)));
            this.f286807p0 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.items.variable_length.add_button.b(new com.avito.android.str_calendar.seller.calandar_parameters.items.variable_length.add_button.e(this.f286769T)));
            this.f286809q0 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement.b(new com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement.e(this.f286769T, this.f286773X)));
            A.b bVarA = A.a(18, 0);
            u<TV0.b<?, ?>> uVar = this.f286771V;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f286772W);
            list.add(this.f286774Y);
            list.add(this.f286777a0);
            list.add(this.f286779b0);
            list.add(this.f286781c0);
            list.add(this.f286785e0);
            list.add(this.f286787f0);
            list.add(this.f286789g0);
            list.add(this.f286793i0);
            list.add(this.f286795j0);
            list.add(this.f286797k0);
            list.add(this.f286799l0);
            list.add(this.f286801m0);
            list.add(this.f286803n0);
            list.add(this.f286805o0);
            list.add(this.f286807p0);
            list.add(this.f286809q0);
            u<com.avito.konveyor.a> uVarD9 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.di.i(dVar, bVarA.b()));
            this.f286811r0 = uVarD9;
            u<com.avito.konveyor.adapter.a> uVarD10 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.di.e(dVar, uVarD9));
            this.f286813s0 = uVarD10;
            this.f286815t0 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.di.j(dVar, uVarD10, this.f286811r0, com.avito.android.str_calendar.seller.calandar_parameters.x.a()));
            this.f286817u0 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.items.checkmark.b(new com.avito.android.str_calendar.seller.calandar_parameters.items.checkmark.e(this.f286769T)));
            A.b bVarA2 = A.a(1, 0);
            bVarA2.f393937a.add(this.f286817u0);
            u<com.avito.konveyor.a> uVarD11 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.di.g(dVar, bVarA2.b()));
            this.f286819v0 = uVarD11;
            u<com.avito.konveyor.adapter.a> uVarD12 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.di.f(dVar, uVarD11));
            this.f286821w0 = uVarD12;
            this.f286823x0 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calandar_parameters.di.h(dVar, uVarD12, this.f286819v0, com.avito.android.str_calendar.seller.calandar_parameters.x.a()));
        }

        @Override // com.avito.android.str_calendar.seller.calandar_parameters.di.k
        public final void a(StrCalendarParametersFragment strCalendarParametersFragment) {
            strCalendarParametersFragment.f286689n0 = this.f286768S;
            strCalendarParametersFragment.f286691p0 = this.f286767R.get();
            com.avito.android.str_calendar.seller.core.c cVarZb = this.f286776a.zb();
            dagger.internal.t.c(cVarZb);
            strCalendarParametersFragment.f286692q0 = cVarZb;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f286778b.u4();
            dagger.internal.t.c(aVarU4);
            strCalendarParametersFragment.f286693r0 = aVarU4;
            com.avito.android.str_calendar.seller.calandar_parameters.di.n nVar = this.f286780c;
            InterfaceC28373a interfaceC28373aA = nVar.a();
            dagger.internal.t.c(interfaceC28373aA);
            strCalendarParametersFragment.f286694s0 = interfaceC28373aA;
            strCalendarParametersFragment.f286695t0 = this.f286770U.get();
            strCalendarParametersFragment.f286696u0 = nVar.yc();
            strCalendarParametersFragment.f286697v0 = this.f286815t0.get();
            strCalendarParametersFragment.f286698w0 = this.f286811r0.get();
            strCalendarParametersFragment.f286699x0 = this.f286823x0.get();
        }
    }

    public static k.a a() {
        return new C8599b();
    }
}
