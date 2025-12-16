package com.avito.android.service_booking_calendar.flexible.di;

import Cd.D;
import Cd.F;
import Ys0.InterfaceC18323a;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.service_booking_calendar.flexible.ServiceBookingFlexibleCalendarFragment;
import com.avito.android.service_booking_calendar.flexible.content.b;
import com.avito.android.service_booking_calendar.flexible.di.c;
import com.avito.android.service_booking_calendar.flexible.di.l;
import com.avito.android.service_booking_calendar.flexible.header.a;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.q;
import it0.InterfaceC42109d;

/* compiled from: DaggerFlexibleCalendarComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerFlexibleCalendarComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.service_booking_calendar.flexible.di.c.a
        public final com.avito.android.service_booking_calendar.flexible.di.c a(C28478k c28478k, d dVar, InterfaceC39417a interfaceC39417a, ServiceBookingFlexibleCalendarFragment serviceBookingFlexibleCalendarFragment, FragmentManager fragmentManager, String str) {
            interfaceC39417a.getClass();
            return new c(dVar, interfaceC39417a, c28478k, serviceBookingFlexibleCalendarFragment, fragmentManager, str, null);
        }
    }

    /* compiled from: DaggerFlexibleCalendarComponent.java */
    public static final class c implements com.avito.android.service_booking_calendar.flexible.di.c {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_calendar.b> f275745A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_calendar.flexible.header.toolbar.c> f275746B;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f275747C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f275748D;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.j> f275749E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.f f275750F;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_calendar.flexible.header.recycler.f> f275751G;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f275752H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.j> f275753I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<C> f275754J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.h> f275755K;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.e> f275756L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.f f275757M;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f275758N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.j> f275759O;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.u<C> f275760P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.h> f275761Q;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<RecyclerView.t> f275762R;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.l f275763S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.l f275764T;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_calendar.flexible.data.mvi.m> f275765U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_calendar.flexible.content.h> f275766V;

        /* renamed from: a, reason: collision with root package name */
        public final T0 f275767a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f275768b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f275769c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC18323a> f275770d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_calendar.day.schedule.domain.d> f275771e = dagger.internal.g.d(com.avito.android.service_booking_calendar.day.schedule.domain.f.a());

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_calendar.day.schedule.domain.a> f275772f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_calendar.flexible.data.domain.g> f275773g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<R0> f275774h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<AK0.l> f275775i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC42109d> f275776j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_calendar.flexible.header.mvi.domain.g> f275777k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_calendar.flexible.data.domain.d> f275778l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.service_booking_calendar.flexible.data.mvi.e f275779m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.service_booking_calendar.flexible.data.mvi.c f275780n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f275781o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_calendar.flexible.data.domain.a> f275782p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.service_booking_calendar.flexible.data.mvi.l f275783q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.service_booking_calendar.flexible.data.mvi.h f275784r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_calendar.flexible.header.mvi.domain.a> f275785s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.service_booking_calendar.flexible.header.mvi.g f275786t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f275787u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f275788v;

        /* renamed from: w, reason: collision with root package name */
        public final com.avito.android.service_booking_calendar.flexible.header.mvi.j f275789w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_utils.ux_feedback.h> f275790x;

        /* renamed from: y, reason: collision with root package name */
        public final com.avito.android.service_booking_calendar.flexible.c f275791y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<D> f275792z;

        /* compiled from: DaggerFlexibleCalendarComponent.java */
        /* renamed from: com.avito.android.service_booking_calendar.flexible.di.a$c$a, reason: collision with other inner class name */
        public static final class C8180a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_calendar.flexible.di.d f275793a;

            public C8180a(com.avito.android.service_booking_calendar.flexible.di.d dVar) {
                this.f275793a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f275793a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerFlexibleCalendarComponent.java */
        public static final class b implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_calendar.flexible.di.d f275794a;

            public b(com.avito.android.service_booking_calendar.flexible.di.d dVar) {
                this.f275794a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f275794a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerFlexibleCalendarComponent.java */
        /* renamed from: com.avito.android.service_booking_calendar.flexible.di.a$c$c, reason: collision with other inner class name */
        public static final class C8181c implements dagger.internal.u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_calendar.flexible.di.d f275795a;

            public C8181c(com.avito.android.service_booking_calendar.flexible.di.d dVar) {
                this.f275795a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f275795a.r();
            }
        }

        /* compiled from: DaggerFlexibleCalendarComponent.java */
        public static final class d implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_calendar.flexible.di.d f275796a;

            public d(com.avito.android.service_booking_calendar.flexible.di.d dVar) {
                this.f275796a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f275796a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerFlexibleCalendarComponent.java */
        public static final class e implements dagger.internal.u<InterfaceC18323a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_calendar.flexible.di.d f275797a;

            public e(com.avito.android.service_booking_calendar.flexible.di.d dVar) {
                this.f275797a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC18323a interfaceC18323aH6 = this.f275797a.h6();
                dagger.internal.t.c(interfaceC18323aH6);
                return interfaceC18323aH6;
            }
        }

        public c(com.avito.android.service_booking_calendar.flexible.di.d dVar, cv.b bVar, C28478k c28478k, T0 t02, FragmentManager fragmentManager, String str, C8179a c8179a) {
            this.f275767a = t02;
            this.f275768b = bVar;
            this.f275769c = dagger.internal.l.a(t02);
            this.f275770d = new e(dVar);
            dagger.internal.u<com.avito.android.service_booking_calendar.day.schedule.domain.a> uVarD = dagger.internal.g.d(new com.avito.android.service_booking_calendar.day.schedule.domain.c(dagger.internal.l.b(str)));
            this.f275772f = uVarD;
            this.f275773g = dagger.internal.g.d(new com.avito.android.service_booking_calendar.flexible.data.domain.i(uVarD));
            this.f275774h = new b(dVar);
            dagger.internal.u<InterfaceC42109d> uVarD2 = dagger.internal.g.d(new it0.f(new C8181c(dVar)));
            this.f275776j = uVarD2;
            dagger.internal.u<com.avito.android.service_booking_calendar.flexible.header.mvi.domain.g> uVarD3 = dagger.internal.g.d(new com.avito.android.service_booking_calendar.flexible.header.mvi.domain.i(uVarD2));
            this.f275777k = uVarD3;
            dagger.internal.u<com.avito.android.service_booking_calendar.flexible.data.domain.d> uVarD4 = dagger.internal.g.d(new com.avito.android.service_booking_calendar.flexible.data.domain.f(uVarD3, this.f275770d, this.f275771e, this.f275773g, this.f275774h));
            this.f275778l = uVarD4;
            this.f275779m = new com.avito.android.service_booking_calendar.flexible.data.mvi.e(uVarD4);
            this.f275780n = new com.avito.android.service_booking_calendar.flexible.data.mvi.c(uVarD4);
            dagger.internal.u<com.avito.android.service_booking_calendar.flexible.data.domain.a> uVarD5 = dagger.internal.g.d(new com.avito.android.service_booking_calendar.flexible.data.domain.c(new C8180a(dVar)));
            this.f275782p = uVarD5;
            this.f275783q = new com.avito.android.service_booking_calendar.flexible.data.mvi.l(uVarD5);
            this.f275784r = new com.avito.android.service_booking_calendar.flexible.data.mvi.h(this.f275779m, this.f275780n, com.avito.android.service_booking_calendar.flexible.data.mvi.j.a(), this.f275783q);
            dagger.internal.u<com.avito.android.service_booking_calendar.flexible.header.mvi.domain.a> uVarD6 = dagger.internal.g.d(new com.avito.android.service_booking_calendar.flexible.header.mvi.domain.e(this.f275776j, this.f275774h));
            this.f275785s = uVarD6;
            this.f275786t = new com.avito.android.service_booking_calendar.flexible.header.mvi.g(uVarD6);
            this.f275787u = new d(dVar);
            this.f275788v = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f275787u);
            this.f275789w = new com.avito.android.service_booking_calendar.flexible.header.mvi.j(this.f275786t, com.avito.android.service_booking_calendar.flexible.header.mvi.l.a(), com.avito.android.service_booking_calendar.flexible.header.mvi.n.a(), this.f275788v);
            dagger.internal.u<com.avito.android.service_booking_utils.ux_feedback.h> uVarD7 = dagger.internal.g.d(com.avito.android.service_booking_utils.ux_feedback.j.a());
            this.f275790x = uVarD7;
            this.f275791y = new com.avito.android.service_booking_calendar.flexible.c(this.f275784r, this.f275789w, new com.avito.android.service_booking_calendar.flexible.content.mvi.h(new com.avito.android.service_booking_calendar.flexible.content.mvi.e(uVarD7), com.avito.android.service_booking_calendar.flexible.content.mvi.j.a(), com.avito.android.service_booking_calendar.flexible.content.mvi.l.a()));
            q.b bVarA = dagger.internal.q.a(1);
            bVarA.a(com.avito.android.service_booking_calendar.flexible.b.class, this.f275791y);
            dagger.internal.u<D> uVarA = B.a(new F(bVarA.b()));
            this.f275792z = uVarA;
            this.f275745A = dagger.internal.g.d(new s(this.f275769c, uVarA));
            dagger.internal.u<com.avito.android.service_booking_calendar.flexible.header.toolbar.c> uVarD8 = dagger.internal.g.d(com.avito.android.service_booking_calendar.flexible.header.toolbar.f.a());
            this.f275746B = uVarD8;
            dagger.internal.u<com.avito.konveyor.a> uVarD9 = dagger.internal.g.d(new v(new com.avito.android.service_booking_calendar.flexible.header.toolbar.b(uVarD8)));
            this.f275747C = uVarD9;
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarD10 = dagger.internal.g.d(new u(uVarD9));
            this.f275748D = uVarD10;
            this.f275749E = dagger.internal.g.d(new w(uVarD10, this.f275747C));
            this.f275750F = new dagger.internal.f();
            dagger.internal.u<com.avito.android.service_booking_calendar.flexible.header.recycler.f> uVarD11 = dagger.internal.g.d(com.avito.android.service_booking_calendar.flexible.header.recycler.i.a());
            this.f275751G = uVarD11;
            dagger.internal.u<com.avito.konveyor.a> uVarD12 = dagger.internal.g.d(new o(new com.avito.android.service_booking_calendar.flexible.header.recycler.week.b(uVarD11)));
            this.f275752H = uVarD12;
            dagger.internal.u<com.avito.konveyor.adapter.j> uVarD13 = dagger.internal.g.d(new q(this.f275750F, uVarD12));
            this.f275753I = uVarD13;
            this.f275754J = dagger.internal.g.d(new p(uVarD13));
            this.f275755K = dagger.internal.g.d(new n(this.f275752H));
            dagger.internal.u<com.avito.android.recycler.data_aware.e> uVarD14 = dagger.internal.g.d(new f(com.avito.android.service_booking_calendar.flexible.header.recycler.e.a(), com.avito.android.service_booking_calendar.flexible.header.recycler.b.a()));
            this.f275756L = uVarD14;
            dagger.internal.f.a(this.f275750F, dagger.internal.g.d(new m(uVarD14, this.f275754J, this.f275755K)));
            this.f275757M = new dagger.internal.f();
            dagger.internal.u<com.avito.android.service_booking_calendar.flexible.header.recycler.f> uVar = this.f275751G;
            dagger.internal.u<com.avito.konveyor.a> uVarD15 = dagger.internal.g.d(new i(new com.avito.android.service_booking_calendar.flexible.header.recycler.month.h(uVar), new com.avito.android.service_booking_calendar.flexible.header.recycler.month.d(uVar), new com.avito.android.service_booking_calendar.flexible.header.recycler.month.f(uVar), new com.avito.android.service_booking_calendar.flexible.header.recycler.month.b(uVar)));
            this.f275758N = uVarD15;
            dagger.internal.u<com.avito.konveyor.adapter.j> uVarD16 = dagger.internal.g.d(new k(this.f275757M, uVarD15));
            this.f275759O = uVarD16;
            this.f275760P = dagger.internal.g.d(new j(uVarD16));
            dagger.internal.u<com.avito.konveyor.adapter.h> uVarD17 = dagger.internal.g.d(new h(this.f275758N));
            this.f275761Q = uVarD17;
            dagger.internal.f.a(this.f275757M, dagger.internal.g.d(new g(uVarD17, this.f275760P, this.f275756L)));
            dagger.internal.u<RecyclerView.t> uVarD18 = dagger.internal.g.d(l.a.f275812a);
            this.f275762R = uVarD18;
            this.f275763S = dagger.internal.l.a(new com.avito.android.service_booking_calendar.flexible.header.f(new com.avito.android.service_booking_calendar.flexible.header.e(this.f275748D, this.f275749E, this.f275750F, this.f275753I, this.f275757M, this.f275759O, this.f275758N, uVarD18, this.f275751G, this.f275746B)));
            this.f275764T = dagger.internal.l.a(new com.avito.android.service_booking_calendar.flexible.content.f(new com.avito.android.service_booking_calendar.flexible.content.e(dagger.internal.l.a(fragmentManager))));
            this.f275765U = dagger.internal.g.d(com.avito.android.service_booking_calendar.flexible.data.mvi.o.a());
            this.f275766V = dagger.internal.g.d(com.avito.android.service_booking_calendar.flexible.content.j.a());
        }

        @Override // com.avito.android.service_booking_calendar.day.schedule.di.o
        public final com.avito.android.service_booking_calendar.b Jh() {
            return this.f275745A.get();
        }

        @Override // com.avito.android.service_booking_calendar.flexible.di.c
        public final void Rf(ServiceBookingFlexibleCalendarFragment serviceBookingFlexibleCalendarFragment) {
            D d12 = this.f275792z.get();
            r.f275821a.getClass();
            serviceBookingFlexibleCalendarFragment.f275610n0 = (com.avito.android.service_booking_calendar.flexible.a) new P0(this.f275767a, d12).a(com.avito.android.service_booking_calendar.flexible.b.class);
            serviceBookingFlexibleCalendarFragment.f275611o0 = (a.e) this.f275763S.f393949a;
            serviceBookingFlexibleCalendarFragment.f275612p0 = (b.a) this.f275764T.f393949a;
            serviceBookingFlexibleCalendarFragment.f275613q0 = this.f275788v.get();
            serviceBookingFlexibleCalendarFragment.f275614r0 = this.f275765U.get();
            serviceBookingFlexibleCalendarFragment.f275615s0 = this.f275766V.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f275768b.u4();
            dagger.internal.t.c(aVarU4);
            serviceBookingFlexibleCalendarFragment.f275616t0 = aVarU4;
        }
    }

    public static c.a a() {
        return new b();
    }
}
