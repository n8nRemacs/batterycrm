package com.avito.android.str_seller_orders_calendar.strorderscalendar.di;

import Iz0.InterfaceC14179a;
import Vz0.InterfaceC15733a;
import Y41.l;
import com.avito.android.J0;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.d1;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.di.c;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.di.items.j;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.di.items.k;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.di.items.m;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.di.items.n;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.di.items.o;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.di.items.q;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.di.items.s;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.A;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.C;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.F;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.v;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.y;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.p;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;
import kotlinx.coroutines.flow.Y1;
import yF0.InterfaceC50108b;

/* compiled from: DaggerStrOrdersCalendarComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerStrOrdersCalendarComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.str_seller_orders_calendar.strorderscalendar.di.c.a
        public final com.avito.android.str_seller_orders_calendar.strorderscalendar.di.c a(h hVar, InterfaceC39417a interfaceC39417a, r rVar, l lVar, int i12) {
            interfaceC39417a.getClass();
            return new c(new d(), new com.avito.android.str_seller_orders_calendar.strorderscalendar.di.items.r(), new n(), new j(), hVar, interfaceC39417a, rVar, lVar, Integer.valueOf(i12), null);
        }
    }

    /* compiled from: DaggerStrOrdersCalendarComponent.java */
    public static final class c implements com.avito.android.str_seller_orders_calendar.strorderscalendar.di.c {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f290592A;

        /* renamed from: B, reason: collision with root package name */
        public final u<Y1<Float>> f290593B;

        /* renamed from: C, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f290594C;

        /* renamed from: D, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f290595D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f290596E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f290597F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f290598G;

        /* renamed from: H, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f290599H;

        /* renamed from: I, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f290600I;

        /* renamed from: J, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f290601J;

        /* renamed from: K, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f290602K;

        /* renamed from: L, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f290603L;

        /* renamed from: M, reason: collision with root package name */
        public final u<SK0.b> f290604M;

        /* renamed from: N, reason: collision with root package name */
        public final u<InterfaceC15733a> f290605N;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f290606a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h f290607b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f290608c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f290609d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC14179a> f290610e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f290611f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C28478k> f290612g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f290613h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28373a> f290614i;

        /* renamed from: j, reason: collision with root package name */
        public final u<R0> f290615j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.f f290616k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.c f290617l;

        /* renamed from: m, reason: collision with root package name */
        public final u<d1> f290618m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.str_core.c> f290619n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC50108b> f290620o;

        /* renamed from: p, reason: collision with root package name */
        public final u<E> f290621p;

        /* renamed from: q, reason: collision with root package name */
        public final u<J0> f290622q;

        /* renamed from: r, reason: collision with root package name */
        public final C f290623r;

        /* renamed from: s, reason: collision with root package name */
        public final p f290624s;

        /* renamed from: t, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f290625t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.l f290626u;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign.j f290627v;

        /* renamed from: w, reason: collision with root package name */
        public final u<com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign.a> f290628w;

        /* renamed from: x, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f290629x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f290630y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f290631z;

        /* compiled from: DaggerStrOrdersCalendarComponent.java */
        /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.di.a$c$a, reason: collision with other inner class name */
        public static final class C8790a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h f290632a;

            public C8790a(com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h hVar) {
                this.f290632a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f290632a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerStrOrdersCalendarComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h f290633a;

            public b(com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h hVar) {
                this.f290633a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f290633a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerStrOrdersCalendarComponent.java */
        /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.di.a$c$c, reason: collision with other inner class name */
        public static final class C8791c implements u<SK0.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h f290634a;

            public C8791c(com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h hVar) {
                this.f290634a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                SK0.b bVarP = this.f290634a.p();
                t.c(bVarP);
                return bVarP;
            }
        }

        /* compiled from: DaggerStrOrdersCalendarComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h f290635a;

            public d(com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h hVar) {
                this.f290635a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f290635a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerStrOrdersCalendarComponent.java */
        public static final class e implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h f290636a;

            public e(com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h hVar) {
                this.f290636a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f290636a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerStrOrdersCalendarComponent.java */
        public static final class f implements u<J0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h f290637a;

            public f(com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h hVar) {
                this.f290637a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                J0 j0F0 = this.f290637a.f0();
                t.c(j0F0);
                return j0F0;
            }
        }

        /* compiled from: DaggerStrOrdersCalendarComponent.java */
        public static final class g implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h f290638a;

            public g(com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h hVar) {
                this.f290638a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f290638a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerStrOrdersCalendarComponent.java */
        public static final class h implements u<d1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h f290639a;

            public h(com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h hVar) {
                this.f290639a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                d1 d1VarA0 = this.f290639a.a0();
                t.c(d1VarA0);
                return d1VarA0;
            }
        }

        /* compiled from: DaggerStrOrdersCalendarComponent.java */
        public static final class i implements u<InterfaceC14179a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h f290640a;

            public i(com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h hVar) {
                this.f290640a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14179a interfaceC14179aOk = this.f290640a.ok();
                t.c(interfaceC14179aOk);
                return interfaceC14179aOk;
            }
        }

        /* compiled from: DaggerStrOrdersCalendarComponent.java */
        public static final class j implements u<InterfaceC50108b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h f290641a;

            public j(com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h hVar) {
                this.f290641a = hVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f290641a.tm();
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.str_seller_orders_calendar.strorderscalendar.di.d dVar, com.avito.android.str_seller_orders_calendar.strorderscalendar.di.items.r rVar, n nVar, com.avito.android.str_seller_orders_calendar.strorderscalendar.di.items.j jVar, com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h hVar, cv.b bVar, r rVar2, l lVar, Integer num, C8789a c8789a) {
            this.f290606a = bVar;
            this.f290607b = hVar;
            this.f290608c = dagger.internal.l.a(num);
            this.f290609d = new g(hVar);
            this.f290610e = new i(hVar);
            this.f290611f = new d(hVar);
            u<C28478k> uVarD = dagger.internal.g.d(new com.avito.android.str_seller_orders_calendar.strorderscalendar.di.f(dVar, dagger.internal.l.a(rVar2)));
            this.f290612g = uVarD;
            u<ScreenPerformanceTracker> uVarD2 = dagger.internal.g.d(new com.avito.android.str_seller_orders_calendar.strorderscalendar.di.g(dVar, this.f290611f, uVarD));
            this.f290613h = uVarD2;
            b bVar2 = new b(hVar);
            this.f290614i = bVar2;
            e eVar = new e(hVar);
            this.f290615j = eVar;
            u<InterfaceC14179a> uVar = this.f290610e;
            com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.usecase.c cVar = new com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.usecase.c(uVarD2, uVar, bVar2, eVar);
            com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.f fVar = new com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.f(eVar);
            this.f290616k = fVar;
            this.f290617l = new com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.c(uVar, uVarD2, cVar, eVar, fVar);
            u<com.avito.android.str_core.c> uVarD3 = dagger.internal.g.d(new com.avito.android.str_core.f(new h(hVar)));
            this.f290619n = uVarD3;
            j jVar2 = new j(hVar);
            dagger.internal.l lVar2 = this.f290608c;
            u<com.avito.android.server_time.f> uVar2 = this.f290609d;
            com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.c cVar2 = this.f290617l;
            u<R0> uVar3 = this.f290615j;
            v vVar = new v(lVar2, uVar2, cVar2, uVarD3, uVar3, jVar2);
            com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.r rVar3 = new com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.r(cVar2, uVar3, this.f290616k, new Hz0.c(this.f290614i, new C8790a(hVar)));
            this.f290623r = new C(new F(new f(hVar)));
            this.f290624s = new p(new y(vVar, rVar3, A.a(), this.f290623r, this.f290613h, this.f290615j));
            this.f290625t = dagger.internal.g.d(new com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_stub.b(com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_stub.d.a()));
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f290626u = lVarA;
            this.f290627v = new com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign.j(lVarA);
            u<com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign.a> uVarD4 = dagger.internal.g.d(com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign.b.a());
            this.f290628w = uVarD4;
            this.f290629x = dagger.internal.g.d(new com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign.d(this.f290627v, uVarD4));
            A.b bVarA = dagger.internal.A.a(2, 0);
            u<TV0.b<?, ?>> uVar4 = this.f290625t;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar4);
            list.add(this.f290629x);
            u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new com.avito.android.str_seller_orders_calendar.strorderscalendar.di.items.t(rVar, bVarA.b()));
            this.f290630y = uVarD5;
            u<com.avito.konveyor.adapter.a> uVarD6 = dagger.internal.g.d(new s(rVar, uVarD5));
            this.f290631z = uVarD6;
            this.f290592A = dagger.internal.g.d(new com.avito.android.str_seller_orders_calendar.strorderscalendar.di.items.u(rVar, uVarD6, this.f290630y, com.avito.android.str_seller_orders_calendar.strorderscalendar.b.a()));
            u<Y1<Float>> uVarD7 = dagger.internal.g.d(new com.avito.android.str_seller_orders_calendar.strorderscalendar.di.e(dVar));
            this.f290593B = uVarD7;
            this.f290594C = dagger.internal.g.d(new com.avito.android.str_seller_orders_calendar.strorderscalendar.items.flat_info.c(new com.avito.android.str_seller_orders_calendar.strorderscalendar.items.flat_info.i(this.f290626u, uVarD7)));
            this.f290595D = dagger.internal.g.d(new com.avito.android.str_seller_orders_calendar.strorderscalendar.items.flat_info_stub.c(com.avito.android.str_seller_orders_calendar.strorderscalendar.items.flat_info_stub.e.a()));
            A.b bVarA2 = dagger.internal.A.a(2, 0);
            u<TV0.b<?, ?>> uVar5 = this.f290594C;
            List<u<T>> list2 = bVarA2.f393937a;
            list2.add(uVar5);
            list2.add(this.f290595D);
            u<com.avito.konveyor.a> uVarD8 = dagger.internal.g.d(new com.avito.android.str_seller_orders_calendar.strorderscalendar.di.items.p(nVar, bVarA2.b()));
            this.f290596E = uVarD8;
            u<com.avito.konveyor.adapter.a> uVarD9 = dagger.internal.g.d(new o(nVar, uVarD8));
            this.f290597F = uVarD9;
            this.f290598G = dagger.internal.g.d(new q(nVar, uVarD9, this.f290596E));
            this.f290599H = dagger.internal.g.d(new com.avito.android.str_seller_orders_calendar.strorderscalendar.items.date_item.b(com.avito.android.str_seller_orders_calendar.strorderscalendar.items.date_item.d.a()));
            this.f290600I = dagger.internal.g.d(new com.avito.android.str_seller_orders_calendar.strorderscalendar.items.date_stub_item.c(com.avito.android.str_seller_orders_calendar.strorderscalendar.items.date_stub_item.e.a()));
            A.b bVarA3 = dagger.internal.A.a(2, 0);
            u<TV0.b<?, ?>> uVar6 = this.f290599H;
            List<u<T>> list3 = bVarA3.f393937a;
            list3.add(uVar6);
            list3.add(this.f290600I);
            u<com.avito.konveyor.a> uVarD10 = dagger.internal.g.d(new com.avito.android.str_seller_orders_calendar.strorderscalendar.di.items.l(jVar, bVarA3.b()));
            this.f290601J = uVarD10;
            u<com.avito.konveyor.adapter.a> uVarD11 = dagger.internal.g.d(new k(jVar, uVarD10));
            this.f290602K = uVarD11;
            this.f290603L = dagger.internal.g.d(new m(jVar, uVarD11, this.f290601J));
            this.f290605N = dagger.internal.g.d(new Vz0.c(new C8791c(hVar)));
        }

        @Override // com.avito.android.str_seller_orders_calendar.strorderscalendar.di.c
        public final void a(StrOrdersCalendarFragment strOrdersCalendarFragment) {
            strOrdersCalendarFragment.f290492n0 = this.f290624s;
            strOrdersCalendarFragment.f290494p0 = this.f290613h.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f290606a.u4();
            t.c(aVarU4);
            strOrdersCalendarFragment.f290495q0 = aVarU4;
            com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h hVar = this.f290607b;
            strOrdersCalendarFragment.f290496r0 = hVar.Gm();
            strOrdersCalendarFragment.f290497s0 = this.f290592A.get();
            strOrdersCalendarFragment.f290498t0 = this.f290598G.get();
            strOrdersCalendarFragment.f290499u0 = this.f290603L.get();
            com.avito.android.util.C cJ2 = hVar.j();
            t.c(cJ2);
            strOrdersCalendarFragment.f290500v0 = cJ2;
            strOrdersCalendarFragment.f290501w0 = this.f290593B.get();
            strOrdersCalendarFragment.f290502x0 = this.f290605N.get();
        }
    }

    public static c.a a() {
        return new b();
    }
}
