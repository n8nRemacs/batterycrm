package com.avito.android.str_calendar.booking_calendar.di;

import Y41.l;
import android.content.Context;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.T0;
import com.avito.android.J0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.d1;
import com.avito.android.str_calendar.booking_calendar.StrBookingCalendarFragment;
import com.avito.android.str_calendar.booking_calendar.di.b;
import com.avito.android.str_calendar.booking_calendar.model.StrBookingCalendarInitParameters;
import com.avito.android.str_calendar.booking_calendar.mvi.A;
import com.avito.android.str_calendar.booking_calendar.mvi.C35086e;
import com.avito.android.str_calendar.booking_calendar.mvi.C35088g;
import com.avito.android.str_calendar.booking_calendar.mvi.E;
import com.avito.android.str_calendar.booking_calendar.mvi.F;
import com.avito.android.str_calendar.booking_calendar.mvi.H;
import com.avito.android.str_calendar.booking_calendar.mvi.InterfaceC35089h;
import com.avito.android.str_calendar.booking_calendar.mvi.o;
import com.avito.android.str_calendar.booking_calendar.mvi.p;
import com.avito.android.str_calendar.booking_calendar.mvi.y;
import com.avito.android.util.L0;
import com.avito.android.util.R0;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import lE.C43624b;
import yy0.InterfaceC50323a;

/* compiled from: DaggerStrBookingCalendarComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerStrBookingCalendarComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.str_calendar.booking_calendar.di.b.a
        public final com.avito.android.str_calendar.booking_calendar.di.b a(com.avito.android.str_calendar.booking_calendar.di.c cVar, r rVar, StrBookingCalendarInitParameters strBookingCalendarInitParameters, ActivityC22955m activityC22955m, l lVar) {
            return new c(new h(), new d(), cVar, rVar, strBookingCalendarInitParameters, activityC22955m, lVar, null);
        }
    }

    /* compiled from: DaggerStrBookingCalendarComponent.java */
    public static final class c implements com.avito.android.str_calendar.booking_calendar.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<Context> f286232A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.android.widget_filters_shared.a> f286233B;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.str_calendar.booking_calendar.di.c f286234a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f286235b;

        /* renamed from: c, reason: collision with root package name */
        public final u<d1> f286236c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC50323a> f286237d;

        /* renamed from: e, reason: collision with root package name */
        public final u<C43624b> f286238e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f286239f;

        /* renamed from: g, reason: collision with root package name */
        public final u<R0> f286240g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f286241h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.str_calendar.booking_calendar.h> f286242i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC35089h> f286243j;

        /* renamed from: k, reason: collision with root package name */
        public final u<p> f286244k;

        /* renamed from: l, reason: collision with root package name */
        public final C35088g f286245l;

        /* renamed from: m, reason: collision with root package name */
        public final C35086e f286246m;

        /* renamed from: n, reason: collision with root package name */
        public final u<J0> f286247n;

        /* renamed from: o, reason: collision with root package name */
        public final u<F> f286248o;

        /* renamed from: p, reason: collision with root package name */
        public final E f286249p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC28481c> f286250q;

        /* renamed from: r, reason: collision with root package name */
        public final u<C28478k> f286251r;

        /* renamed from: s, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f286252s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.str_calendar.booking_calendar.p f286253t;

        /* renamed from: u, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286254u;

        /* renamed from: v, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286255v;

        /* renamed from: w, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f286256w;

        /* renamed from: x, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f286257x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f286258y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f286259z;

        /* compiled from: DaggerStrBookingCalendarComponent.java */
        /* renamed from: com.avito.android.str_calendar.booking_calendar.di.a$c$a, reason: collision with other inner class name */
        public static final class C8575a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.booking_calendar.di.c f286260a;

            public C8575a(com.avito.android.str_calendar.booking_calendar.di.c cVar) {
                this.f286260a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f286260a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerStrBookingCalendarComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.booking_calendar.di.c f286261a;

            public b(com.avito.android.str_calendar.booking_calendar.di.c cVar) {
                this.f286261a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f286261a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerStrBookingCalendarComponent.java */
        /* renamed from: com.avito.android.str_calendar.booking_calendar.di.a$c$c, reason: collision with other inner class name */
        public static final class C8576c implements u<InterfaceC50323a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.booking_calendar.di.c f286262a;

            public C8576c(com.avito.android.str_calendar.booking_calendar.di.c cVar) {
                this.f286262a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50323a interfaceC50323aDk = this.f286262a.dk();
                t.c(interfaceC50323aDk);
                return interfaceC50323aDk;
            }
        }

        /* compiled from: DaggerStrBookingCalendarComponent.java */
        public static final class d implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.booking_calendar.di.c f286263a;

            public d(com.avito.android.str_calendar.booking_calendar.di.c cVar) {
                this.f286263a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f286263a.g();
            }
        }

        /* compiled from: DaggerStrBookingCalendarComponent.java */
        public static final class e implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.booking_calendar.di.c f286264a;

            public e(com.avito.android.str_calendar.booking_calendar.di.c cVar) {
                this.f286264a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f286264a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerStrBookingCalendarComponent.java */
        public static final class f implements u<J0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.booking_calendar.di.c f286265a;

            public f(com.avito.android.str_calendar.booking_calendar.di.c cVar) {
                this.f286265a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                J0 j0F0 = this.f286265a.f0();
                t.c(j0F0);
                return j0F0;
            }
        }

        /* compiled from: DaggerStrBookingCalendarComponent.java */
        public static final class g implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.booking_calendar.di.c f286266a;

            public g(com.avito.android.str_calendar.booking_calendar.di.c cVar) {
                this.f286266a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f286266a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerStrBookingCalendarComponent.java */
        public static final class h implements u<d1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.booking_calendar.di.c f286267a;

            public h(com.avito.android.str_calendar.booking_calendar.di.c cVar) {
                this.f286267a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                d1 d1VarA0 = this.f286267a.a0();
                t.c(d1VarA0);
                return d1VarA0;
            }
        }

        /* compiled from: DaggerStrBookingCalendarComponent.java */
        public static final class i implements u<C43624b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.booking_calendar.di.c f286268a;

            public i(com.avito.android.str_calendar.booking_calendar.di.c cVar) {
                this.f286268a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f286268a.J();
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.str_calendar.booking_calendar.di.h hVar, com.avito.android.str_calendar.booking_calendar.di.d dVar, com.avito.android.str_calendar.booking_calendar.di.c cVar, r rVar, StrBookingCalendarInitParameters strBookingCalendarInitParameters, T0 t02, l lVar, C8574a c8574a) {
            this.f286234a = cVar;
            this.f286235b = dagger.internal.l.a(strBookingCalendarInitParameters);
            this.f286236c = new h(cVar);
            this.f286237d = new C8576c(cVar);
            this.f286238e = new i(cVar);
            this.f286239f = new g(cVar);
            this.f286240g = new e(cVar);
            this.f286241h = new C8575a(cVar);
            this.f286242i = dagger.internal.g.d(com.avito.android.str_calendar.booking_calendar.j.a());
            u<InterfaceC35089h> uVarD = dagger.internal.g.d(new com.avito.android.str_calendar.booking_calendar.mvi.l(this.f286240g, this.f286238e));
            this.f286243j = uVarD;
            u<p> uVarD2 = dagger.internal.g.d(new y(uVarD, this.f286236c, this.f286237d, this.f286238e, this.f286239f, this.f286240g, this.f286241h, this.f286242i));
            this.f286244k = uVarD2;
            this.f286245l = new C35088g(this.f286235b, uVarD2, this.f286239f);
            u<com.avito.android.str_calendar.booking_calendar.h> uVar = this.f286242i;
            this.f286246m = new C35086e(uVarD2, uVar);
            u<F> uVarD3 = dagger.internal.g.d(new H(uVar, new f(cVar)));
            this.f286248o = uVarD3;
            this.f286249p = new E(uVarD3);
            this.f286250q = new b(cVar);
            u<C28478k> uVarD4 = dagger.internal.g.d(new com.avito.android.str_calendar.booking_calendar.di.i(hVar, dagger.internal.l.a(rVar)));
            this.f286251r = uVarD4;
            this.f286252s = dagger.internal.g.d(new j(hVar, this.f286250q, uVarD4));
            this.f286253t = new com.avito.android.str_calendar.booking_calendar.p(new o(this.f286245l, this.f286246m, A.a(), this.f286249p, this.f286252s));
            this.f286254u = dagger.internal.g.d(new com.avito.android.str_calendar.booking_calendar.items.day.c(new com.avito.android.str_calendar.booking_calendar.items.day.f(dagger.internal.l.a(lVar))));
            this.f286255v = dagger.internal.g.d(new com.avito.android.str_calendar.booking_calendar.items.empty.c(com.avito.android.str_calendar.booking_calendar.items.empty.e.a()));
            this.f286256w = dagger.internal.g.d(new com.avito.android.str_calendar.booking_calendar.items.month.c(com.avito.android.str_calendar.booking_calendar.items.month.e.a()));
            A.b bVarA = dagger.internal.A.a(3, 0);
            u<TV0.b<?, ?>> uVar2 = this.f286254u;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar2);
            list.add(this.f286255v);
            list.add(this.f286256w);
            u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new com.avito.android.str_calendar.booking_calendar.di.f(dVar, bVarA.b()));
            this.f286257x = uVarD5;
            u<com.avito.konveyor.adapter.a> uVarD6 = dagger.internal.g.d(new com.avito.android.str_calendar.booking_calendar.di.e(dVar, uVarD5));
            this.f286258y = uVarD6;
            this.f286259z = dagger.internal.g.d(new com.avito.android.str_calendar.booking_calendar.di.g(dVar, uVarD6, this.f286257x));
            this.f286232A = new d(cVar);
            this.f286233B = dagger.internal.g.d(new k(hVar, this.f286232A, dagger.internal.l.a(t02)));
        }

        @Override // com.avito.android.str_calendar.booking_calendar.di.b
        public final void a(StrBookingCalendarFragment strBookingCalendarFragment) {
            strBookingCalendarFragment.f286202n0 = this.f286253t;
            strBookingCalendarFragment.f286204p0 = this.f286252s.get();
            com.avito.android.str_calendar.booking_calendar.di.c cVar = this.f286234a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            strBookingCalendarFragment.f286205q0 = interfaceC28373aA;
            L0 l0Z = cVar.z();
            t.c(l0Z);
            strBookingCalendarFragment.f286206r0 = l0Z;
            strBookingCalendarFragment.f286207s0 = this.f286242i.get();
            strBookingCalendarFragment.f286208t0 = this.f286257x.get();
            strBookingCalendarFragment.f286209u0 = this.f286258y.get();
            strBookingCalendarFragment.f286210v0 = this.f286259z.get();
            strBookingCalendarFragment.f286211w0 = this.f286233B.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
