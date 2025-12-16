package com.avito.android.str_calendar.seller.calendar.di;

import Hy0.C14052d;
import Y41.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.remote.d1;
import com.avito.android.str_calendar.seller.calendar.StrSellerCalendarFragment;
import com.avito.android.str_calendar.seller.calendar.data.h;
import com.avito.android.str_calendar.seller.calendar.data.i;
import com.avito.android.str_calendar.seller.calendar.data.m;
import com.avito.android.str_calendar.seller.calendar.data.o;
import com.avito.android.str_calendar.seller.calendar.di.b;
import com.avito.android.str_calendar.seller.calendar.k;
import com.avito.android.str_calendar.seller.calendar.mvi.j;
import com.avito.android.str_calendar.seller.calendar.mvi.n;
import com.avito.android.str_calendar.seller.calendar.mvi.p;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;

/* compiled from: DaggerStrSellerCalendarComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerStrSellerCalendarComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.str_calendar.seller.calendar.di.b.a
        public final com.avito.android.str_calendar.seller.calendar.di.b a(com.avito.android.str_calendar.seller.calendar.di.c cVar, InterfaceC39417a interfaceC39417a, com.avito.android.str_calendar.seller.core.di.c cVar2, l lVar, C28478k c28478k, String str, String str2, String str3, boolean z12) {
            interfaceC39417a.getClass();
            return new c(new d(), cVar, cVar2, interfaceC39417a, lVar, c28478k, str, str2, str3, Boolean.valueOf(z12), null);
        }
    }

    /* compiled from: DaggerStrSellerCalendarComponent.java */
    public static final class c implements com.avito.android.str_calendar.seller.calendar.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f287547A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f287548B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f287549C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f287550D;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.str_calendar.seller.calendar.di.c f287551a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.str_calendar.seller.core.di.c f287552b;

        /* renamed from: c, reason: collision with root package name */
        public final cv.b f287553c;

        /* renamed from: d, reason: collision with root package name */
        public final u<d1> f287554d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f287555e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f287556f;

        /* renamed from: g, reason: collision with root package name */
        public final C14052d f287557g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.str_calendar.seller.calendar.data.b f287558h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f287559i;

        /* renamed from: j, reason: collision with root package name */
        public final u<m> f287560j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.l f287561k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.l f287562l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f287563m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.str_calendar.seller.calendar.mvi.g f287564n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.analytics.provider.a> f287565o;

        /* renamed from: p, reason: collision with root package name */
        public final u<Cy0.b> f287566p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.str_calendar.seller.calendar.mvi.e f287567q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.str_calendar.seller.calendar.data.f> f287568r;

        /* renamed from: s, reason: collision with root package name */
        public final u<i> f287569s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.str_calendar.seller.calendar.data.c> f287570t;

        /* renamed from: u, reason: collision with root package name */
        public final n f287571u;

        /* renamed from: v, reason: collision with root package name */
        public final u<InterfaceC28481c> f287572v;

        /* renamed from: w, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f287573w;

        /* renamed from: x, reason: collision with root package name */
        public final k f287574x;

        /* renamed from: y, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f287575y;

        /* renamed from: z, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f287576z;

        /* compiled from: DaggerStrSellerCalendarComponent.java */
        /* renamed from: com.avito.android.str_calendar.seller.calendar.di.a$c$a, reason: collision with other inner class name */
        public static final class C8638a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calendar.di.c f287577a;

            public C8638a(com.avito.android.str_calendar.seller.calendar.di.c cVar) {
                this.f287577a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f287577a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerStrSellerCalendarComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calendar.di.c f287578a;

            public b(com.avito.android.str_calendar.seller.calendar.di.c cVar) {
                this.f287578a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f287578a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerStrSellerCalendarComponent.java */
        /* renamed from: com.avito.android.str_calendar.seller.calendar.di.a$c$c, reason: collision with other inner class name */
        public static final class C8639c implements u<com.avito.android.analytics.provider.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calendar.di.c f287579a;

            public C8639c(com.avito.android.str_calendar.seller.calendar.di.c cVar) {
                this.f287579a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.analytics.provider.a aVarV = this.f287579a.v();
                t.c(aVarV);
                return aVarV;
            }
        }

        /* compiled from: DaggerStrSellerCalendarComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calendar.di.c f287580a;

            public d(com.avito.android.str_calendar.seller.calendar.di.c cVar) {
                this.f287580a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f287580a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerStrSellerCalendarComponent.java */
        public static final class e implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calendar.di.c f287581a;

            public e(com.avito.android.str_calendar.seller.calendar.di.c cVar) {
                this.f287581a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f287581a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        /* compiled from: DaggerStrSellerCalendarComponent.java */
        public static final class f implements u<d1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_calendar.seller.calendar.di.c f287582a;

            public f(com.avito.android.str_calendar.seller.calendar.di.c cVar) {
                this.f287582a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                d1 d1VarA0 = this.f287582a.a0();
                t.c(d1VarA0);
                return d1VarA0;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.str_calendar.seller.calendar.di.d dVar, com.avito.android.str_calendar.seller.calendar.di.c cVar, com.avito.android.str_calendar.seller.core.di.c cVar2, cv.b bVar, l lVar, C28478k c28478k, String str, String str2, String str3, Boolean bool, C8637a c8637a) {
            this.f287551a = cVar;
            this.f287552b = cVar2;
            this.f287553c = bVar;
            f fVar = new f(cVar);
            d dVar2 = new d(cVar);
            C8638a c8638a = new C8638a(cVar);
            this.f287556f = c8638a;
            C14052d c14052d = new C14052d(c8638a);
            this.f287557g = c14052d;
            this.f287558h = new com.avito.android.str_calendar.seller.calendar.data.b(fVar, dVar2, c14052d);
            this.f287560j = dagger.internal.g.d(new o(new e(cVar)));
            this.f287561k = dagger.internal.l.a(str);
            this.f287562l = dagger.internal.l.b(str2);
            this.f287563m = dagger.internal.l.b(str3);
            this.f287564n = new com.avito.android.str_calendar.seller.calendar.mvi.g(this.f287558h, this.f287560j, this.f287561k, this.f287562l, this.f287563m, dagger.internal.l.a(bool));
            u<Cy0.b> uVarD = dagger.internal.g.d(new Cy0.d(this.f287556f, new C8639c(cVar)));
            this.f287566p = uVarD;
            com.avito.android.str_calendar.seller.calendar.data.b bVar2 = this.f287558h;
            u<m> uVar = this.f287560j;
            this.f287567q = new com.avito.android.str_calendar.seller.calendar.mvi.e(bVar2, uVar, this.f287557g, uVarD);
            this.f287568r = dagger.internal.g.d(new h(uVar));
            this.f287569s = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calendar.data.k(this.f287560j));
            u<com.avito.android.str_calendar.seller.calendar.data.c> uVarD2 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calendar.data.e(this.f287560j));
            this.f287570t = uVarD2;
            this.f287571u = new n(this.f287568r, this.f287569s, new p(uVarD2));
            this.f287572v = new b(cVar);
            this.f287573w = dagger.internal.g.d(new C30060h5(this.f287572v, dagger.internal.l.a(c28478k)));
            this.f287574x = new k(new j(this.f287564n, this.f287567q, com.avito.android.str_calendar.seller.calendar.mvi.l.a(), this.f287571u, this.f287573w));
            this.f287575y = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calendar.konveyor.items.day.c(new com.avito.android.str_calendar.seller.calendar.konveyor.items.day.g(dagger.internal.l.a(lVar))));
            this.f287576z = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calendar.konveyor.items.empty.c(com.avito.android.str_calendar.seller.calendar.konveyor.items.empty.f.a()));
            this.f287547A = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calendar.konveyor.items.month.c(com.avito.android.str_calendar.seller.calendar.konveyor.items.month.e.a()));
            A.b bVarA = A.a(3, 0);
            u<TV0.b<?, ?>> uVar2 = this.f287575y;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar2);
            list.add(this.f287576z);
            list.add(this.f287547A);
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calendar.di.f(dVar, bVarA.b()));
            this.f287548B = uVarD3;
            u<com.avito.konveyor.adapter.a> uVarD4 = dagger.internal.g.d(new com.avito.android.str_calendar.seller.calendar.di.e(dVar, uVarD3));
            this.f287549C = uVarD4;
            this.f287550D = dagger.internal.g.d(new g(dVar, uVarD4, this.f287548B, com.avito.android.str_calendar.seller.calendar.konveyor.f.a()));
        }

        @Override // com.avito.android.str_calendar.seller.calendar.di.b
        public final void a(StrSellerCalendarFragment strSellerCalendarFragment) {
            strSellerCalendarFragment.f287478n0 = this.f287574x;
            strSellerCalendarFragment.f287480p0 = this.f287573w.get();
            InterfaceC28373a interfaceC28373aA = this.f287551a.a();
            t.c(interfaceC28373aA);
            strSellerCalendarFragment.f287481q0 = interfaceC28373aA;
            strSellerCalendarFragment.f287482r0 = this.f287548B.get();
            strSellerCalendarFragment.f287483s0 = this.f287550D.get();
            strSellerCalendarFragment.f287484t0 = new com.avito.android.str_calendar.seller.calendar.konveyor.g(this.f287549C.get(), this.f287548B.get());
            com.avito.android.str_calendar.seller.core.c cVarZb = this.f287552b.zb();
            t.c(cVarZb);
            strSellerCalendarFragment.f287485u0 = cVarZb;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f287553c.u4();
            t.c(aVarU4);
            strSellerCalendarFragment.f287486v0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
