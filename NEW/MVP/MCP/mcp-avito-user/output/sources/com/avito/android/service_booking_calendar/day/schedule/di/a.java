package com.avito.android.service_booking_calendar.day.schedule.di;

import Ys0.InterfaceC18323a;
import com.avito.android.B2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment;
import com.avito.android.service_booking_calendar.day.schedule.di.b;
import com.avito.android.service_booking_calendar.day.schedule.mvi.p;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.z;
import it0.InterfaceC42109d;
import java.util.Set;

/* compiled from: DaggerDayScheduleComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerDayScheduleComponent.java */
    public static final class b implements com.avito.android.service_booking_calendar.day.schedule.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_busy.b f275297A;

        /* renamed from: B, reason: collision with root package name */
        public final u<com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_empty.c> f275298B;

        /* renamed from: C, reason: collision with root package name */
        public final com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_empty.b f275299C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_inactive.c> f275300D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f275301E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f275302F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f275303G;

        /* renamed from: H, reason: collision with root package name */
        public final u<Set<TV0.d<?, ?>>> f275304H;

        /* renamed from: a, reason: collision with root package name */
        public final o f275305a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f275306b;

        /* renamed from: c, reason: collision with root package name */
        public final n f275307c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f275308d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f275309e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC18323a> f275310f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC35863o4> f275311g;

        /* renamed from: h, reason: collision with root package name */
        public final u<B2> f275312h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.service_booking_calendar.domain.c> f275313i;

        /* renamed from: j, reason: collision with root package name */
        public final u<R0> f275314j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.l f275315k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.l f275316l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f275317m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.service_booking_calendar.domain.use_case.d f275318n;

        /* renamed from: o, reason: collision with root package name */
        public final u<AK0.l> f275319o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC42109d> f275320p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.service_booking_calendar.domain.use_case.b> f275321q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.service_booking_calendar.day.schedule.mvi.g f275322r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.service_booking_calendar.day.schedule.mvi.b f275323s;

        /* renamed from: t, reason: collision with root package name */
        public final u<InterfaceC28373a> f275324t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.service_booking_calendar.day.schedule.mvi.c> f275325u;

        /* renamed from: v, reason: collision with root package name */
        public final p f275326v;

        /* renamed from: w, reason: collision with root package name */
        public final u<InterfaceC28481c> f275327w;

        /* renamed from: x, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f275328x;

        /* renamed from: y, reason: collision with root package name */
        public final com.avito.android.service_booking_calendar.day.schedule.n f275329y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_busy.c> f275330z;

        /* compiled from: DaggerDayScheduleComponent.java */
        /* renamed from: com.avito.android.service_booking_calendar.day.schedule.di.a$b$a, reason: collision with other inner class name */
        public static final class C8169a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final n f275331a;

            public C8169a(n nVar) {
                this.f275331a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f275331a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerDayScheduleComponent.java */
        /* renamed from: com.avito.android.service_booking_calendar.day.schedule.di.a$b$b, reason: collision with other inner class name */
        public static final class C8170b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final n f275332a;

            public C8170b(n nVar) {
                this.f275332a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f275332a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerDayScheduleComponent.java */
        public static final class c implements u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final n f275333a;

            public c(n nVar) {
                this.f275333a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f275333a.r();
            }
        }

        /* compiled from: DaggerDayScheduleComponent.java */
        public static final class d implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final n f275334a;

            public d(n nVar) {
                this.f275334a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f275334a.m();
                t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerDayScheduleComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final n f275335a;

            public e(n nVar) {
                this.f275335a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f275335a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerDayScheduleComponent.java */
        public static final class f implements u<InterfaceC18323a> {

            /* renamed from: a, reason: collision with root package name */
            public final n f275336a;

            public f(n nVar) {
                this.f275336a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC18323a interfaceC18323aH6 = this.f275336a.h6();
                t.c(interfaceC18323aH6);
                return interfaceC18323aH6;
            }
        }

        /* compiled from: DaggerDayScheduleComponent.java */
        public static final class g implements u<B2> {

            /* renamed from: a, reason: collision with root package name */
            public final n f275337a;

            public g(n nVar) {
                this.f275337a = nVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f275337a.D();
            }
        }

        public b(n nVar, o oVar, cv.b bVar, C28478k c28478k, String str, Boolean bool, Boolean bool2, Integer num, DayScheduleFragment.Companion.ScheduleType scheduleType, C8168a c8168a) {
            this.f275305a = oVar;
            this.f275306b = bVar;
            this.f275307c = nVar;
            this.f275308d = dagger.internal.l.a(str);
            this.f275309e = dagger.internal.l.a(scheduleType);
            this.f275310f = new f(nVar);
            this.f275313i = dagger.internal.g.d(new com.avito.android.service_booking_calendar.domain.f(new d(nVar), new g(nVar)));
            this.f275314j = new C8170b(nVar);
            this.f275315k = dagger.internal.l.b(num);
            this.f275316l = dagger.internal.l.a(bool);
            dagger.internal.l lVarA = dagger.internal.l.a(bool2);
            this.f275317m = lVarA;
            this.f275318n = new com.avito.android.service_booking_calendar.domain.use_case.d(this.f275310f, this.f275313i, this.f275314j, this.f275315k, this.f275316l, lVarA);
            u<InterfaceC42109d> uVarD = dagger.internal.g.d(new it0.f(new c(nVar)));
            this.f275320p = uVarD;
            u<com.avito.android.service_booking_calendar.domain.use_case.b> uVarD2 = dagger.internal.g.d(new com.avito.android.service_booking_calendar.day.schedule.di.g(this.f275309e, this.f275318n, new com.avito.android.service_booking_calendar.domain.use_case.g(this.f275315k, this.f275316l, this.f275317m, uVarD, this.f275310f, this.f275313i, this.f275314j)));
            this.f275321q = uVarD2;
            dagger.internal.l lVar = this.f275308d;
            this.f275322r = new com.avito.android.service_booking_calendar.day.schedule.mvi.g(lVar, uVarD2);
            this.f275323s = new com.avito.android.service_booking_calendar.day.schedule.mvi.b(lVar, uVarD2);
            C8169a c8169a = new C8169a(nVar);
            u<com.avito.android.service_booking_calendar.day.schedule.mvi.c> uVarD3 = dagger.internal.g.d(new com.avito.android.service_booking_calendar.day.schedule.di.d(this.f275309e, new com.avito.android.service_booking_calendar.day.schedule.mvi.e(c8169a), new com.avito.android.service_booking_calendar.day.schedule.mvi.l(lVar, c8169a)));
            this.f275325u = uVarD3;
            this.f275326v = new p(uVarD3);
            this.f275327w = new e(nVar);
            this.f275328x = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f275327w);
            this.f275329y = new com.avito.android.service_booking_calendar.day.schedule.n(new com.avito.android.service_booking_calendar.day.schedule.mvi.j(this.f275322r, this.f275323s, com.avito.android.service_booking_calendar.day.schedule.mvi.n.a(), this.f275326v, this.f275328x));
            u<com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_busy.c> uVarD4 = dagger.internal.g.d(com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_busy.f.a());
            this.f275330z = uVarD4;
            this.f275297A = new com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_busy.b(uVarD4);
            u<com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_empty.c> uVarD5 = dagger.internal.g.d(com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_empty.e.a());
            this.f275298B = uVarD5;
            this.f275299C = new com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_empty.b(uVarD5);
            u<com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_inactive.c> uVarD6 = dagger.internal.g.d(com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_inactive.e.a());
            this.f275300D = uVarD6;
            u<com.avito.konveyor.a> uVarD7 = dagger.internal.g.d(new com.avito.android.service_booking_calendar.day.schedule.di.f(this.f275297A, this.f275299C, new com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_inactive.b(uVarD6)));
            this.f275301E = uVarD7;
            u<com.avito.konveyor.adapter.h> uVarD8 = dagger.internal.g.d(new com.avito.android.service_booking_calendar.day.schedule.di.e(uVarD7));
            this.f275302F = uVarD8;
            this.f275303G = dagger.internal.g.d(new i(uVarD8, this.f275301E));
            this.f275304H = dagger.internal.g.d(new h(this.f275330z));
        }

        @Override // com.avito.android.service_booking_calendar.day.schedule.di.b
        public final void a(DayScheduleFragment dayScheduleFragment) {
            com.avito.android.service_booking_calendar.b bVarJh = this.f275305a.Jh();
            t.c(bVarJh);
            dayScheduleFragment.f275257n0 = bVarJh;
            dayScheduleFragment.f275258o0 = this.f275329y;
            dayScheduleFragment.f275261r0 = this.f275302F.get();
            dayScheduleFragment.f275262s0 = this.f275303G.get();
            z zVar = new z(1);
            zVar.b(this.f275304H.get());
            dayScheduleFragment.f275263t0 = zVar.c();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f275306b.u4();
            t.c(aVarU4);
            dayScheduleFragment.f275264u0 = aVarU4;
            this.f275307c.D();
            dayScheduleFragment.f275265v0 = this.f275328x.get();
        }
    }

    /* compiled from: DaggerDayScheduleComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.service_booking_calendar.day.schedule.di.b.a
        public final com.avito.android.service_booking_calendar.day.schedule.di.b a(C28478k c28478k, n nVar, o oVar, InterfaceC39417a interfaceC39417a, String str, boolean z12, boolean z13, Integer num, DayScheduleFragment.Companion.ScheduleType scheduleType) {
            interfaceC39417a.getClass();
            scheduleType.getClass();
            return new b(nVar, oVar, interfaceC39417a, c28478k, str, Boolean.valueOf(z12), Boolean.valueOf(z13), num, scheduleType, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
