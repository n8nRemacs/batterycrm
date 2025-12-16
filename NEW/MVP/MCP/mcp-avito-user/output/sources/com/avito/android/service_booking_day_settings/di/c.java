package com.avito.android.service_booking_day_settings.di;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.fragment.app.FragmentManager;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.R0;
import com.avito.android.service_booking_day_settings.daysettings.DaySettingsFragment;
import com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.w;
import com.avito.android.service_booking_day_settings.daysettings.v;
import com.avito.android.service_booking_day_settings.daysettings.x;
import com.avito.android.service_booking_day_settings.di.g;
import com.avito.android.util.InterfaceC35863o4;
import cv.InterfaceC39417a;
import dagger.internal.B;
import ut0.InterfaceC49110a;
import vt0.InterfaceC49381a;
import wt0.InterfaceC49682a;

/* compiled from: DaggerDaySettingsComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class c {

    /* compiled from: DaggerDaySettingsComponent.java */
    public static final class b implements com.avito.android.service_booking_day_settings.di.g {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.d> f277103A;

        /* renamed from: B, reason: collision with root package name */
        public final com.avito.android.service_booking_day_settings.daysettings.mvi.f f277104B;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f277105C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC49682a> f277106D;

        /* renamed from: E, reason: collision with root package name */
        public final iu0.d f277107E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.mvi.breaks.d> f277108F;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.mvi.breaks.a> f277109G;

        /* renamed from: H, reason: collision with root package name */
        public final com.avito.android.service_booking_day_settings.daysettings.mvi.o f277110H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f277111I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f277112J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.l f277113K;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.l f277114L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.l f277115M;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.adapter.d> f277116N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f277117O;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f277118P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.j> f277119Q;

        /* renamed from: a, reason: collision with root package name */
        public final i f277120a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f277121b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f277122c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<R0> f277123d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC49381a> f277124e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.R0> f277125f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.k> f277126g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.h> f277127h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.a> f277128i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.u> f277129j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.r> f277130k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<Application> f277131l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.data.preferences.a> f277132m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35863o4> f277133n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.domain.breaks.a> f277134o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.domain.breaks.e> f277135p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.e> f277136q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<SharedPreferences> f277137r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking.data.preferences.a> f277138s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.n> f277139t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.a> f277140u;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.service_booking_day_settings.daysettings.mvi.h f277141v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.a> f277142w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC49110a> f277143x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_day_settings.breaks.a> f277144y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.service_booking_utils.ux_feedback.h> f277145z;

        /* compiled from: DaggerDaySettingsComponent.java */
        public static final class a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final i f277146a;

            public a(i iVar) {
                this.f277146a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f277146a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerDaySettingsComponent.java */
        /* renamed from: com.avito.android.service_booking_day_settings.di.c$b$b, reason: collision with other inner class name */
        public static final class C8227b implements dagger.internal.u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final i f277147a;

            public C8227b(i iVar) {
                this.f277147a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f277147a.k();
                dagger.internal.t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerDaySettingsComponent.java */
        /* renamed from: com.avito.android.service_booking_day_settings.di.c$b$c, reason: collision with other inner class name */
        public static final class C8228c implements dagger.internal.u<com.avito.android.service_booking_day_settings.breaks.a> {

            /* renamed from: a, reason: collision with root package name */
            public final i f277148a;

            public C8228c(i iVar) {
                this.f277148a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f277148a.n5();
            }
        }

        /* compiled from: DaggerDaySettingsComponent.java */
        public static final class d implements dagger.internal.u<InterfaceC49110a> {

            /* renamed from: a, reason: collision with root package name */
            public final i f277149a;

            public d(i iVar) {
                this.f277149a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC49110a interfaceC49110aR7 = this.f277149a.R7();
                dagger.internal.t.c(interfaceC49110aR7);
                return interfaceC49110aR7;
            }
        }

        /* compiled from: DaggerDaySettingsComponent.java */
        public static final class e implements dagger.internal.u<com.avito.android.util.R0> {

            /* renamed from: a, reason: collision with root package name */
            public final i f277150a;

            public e(i iVar) {
                this.f277150a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.R0 r0C = this.f277150a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerDaySettingsComponent.java */
        public static final class f implements dagger.internal.u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final i f277151a;

            public f(i iVar) {
                this.f277151a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f277151a.m();
                dagger.internal.t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerDaySettingsComponent.java */
        public static final class g implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final i f277152a;

            public g(i iVar) {
                this.f277152a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0F2 = this.f277152a.f2();
                dagger.internal.t.c(r0F2);
                return r0F2;
            }
        }

        /* compiled from: DaggerDaySettingsComponent.java */
        public static final class h implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final i f277153a;

            public h(i iVar) {
                this.f277153a = iVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f277153a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(i iVar, cv.b bVar, C28478k c28478k, Y41.l lVar, Y41.q qVar, Y41.q qVar2, String str, FragmentManager fragmentManager, a aVar) {
            this.f277120a = iVar;
            this.f277121b = bVar;
            this.f277122c = dagger.internal.l.a(str);
            this.f277124e = B.a(new com.avito.android.service_booking_day_settings.di.f(new g(iVar)));
            this.f277125f = new e(iVar);
            this.f277126g = dagger.internal.g.d(com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.m.a());
            this.f277127h = dagger.internal.g.d(com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.j.a());
            this.f277128i = dagger.internal.g.d(com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.c.a());
            this.f277129j = dagger.internal.g.d(w.a());
            this.f277130k = dagger.internal.g.d(com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.t.a());
            C8227b c8227b = new C8227b(iVar);
            this.f277131l = c8227b;
            this.f277132m = dagger.internal.g.d(new com.avito.android.service_booking_day_settings.daysettings.data.preferences.c(new k(c8227b)));
            f fVar = new f(iVar);
            this.f277133n = fVar;
            this.f277134o = dagger.internal.g.d(new com.avito.android.service_booking_day_settings.daysettings.domain.breaks.c(fVar));
            dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.domain.breaks.e> uVarD = dagger.internal.g.d(com.avito.android.service_booking_day_settings.daysettings.domain.breaks.g.a());
            this.f277135p = uVarD;
            this.f277136q = dagger.internal.g.d(new com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.g(uVarD, this.f277133n, this.f277134o));
            dagger.internal.u<SharedPreferences> uVarD2 = dagger.internal.g.d(new Cs0.c(this.f277131l));
            this.f277137r = uVarD2;
            dagger.internal.u<com.avito.android.service_booking.data.preferences.a> uVarD3 = dagger.internal.g.d(new com.avito.android.service_booking.data.preferences.c(uVarD2));
            this.f277138s = uVarD3;
            dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.n> uVarD4 = dagger.internal.g.d(new com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters.p(uVarD3));
            this.f277139t = uVarD4;
            dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.a> uVarD5 = dagger.internal.g.d(new com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.c(uVarD4, this.f277124e, this.f277125f, this.f277126g, this.f277127h, this.f277128i, this.f277129j, this.f277130k, this.f277132m, this.f277136q));
            this.f277140u = uVarD5;
            this.f277141v = new com.avito.android.service_booking_day_settings.daysettings.mvi.h(this.f277122c, uVarD5);
            this.f277142w = dagger.internal.g.d(com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.c.a());
            this.f277143x = new d(iVar);
            this.f277144y = new C8228c(iVar);
            dagger.internal.u<com.avito.android.service_booking_utils.ux_feedback.h> uVarD6 = dagger.internal.g.d(com.avito.android.service_booking_utils.ux_feedback.j.a());
            this.f277145z = uVarD6;
            dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.d> uVarD7 = dagger.internal.g.d(new com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.f(uVarD6, this.f277143x, this.f277125f, this.f277144y, this.f277140u));
            this.f277103A = uVarD7;
            dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.a> uVar = this.f277142w;
            dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.a> uVar2 = this.f277140u;
            dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.domain.breaks.e> uVar3 = this.f277135p;
            dagger.internal.l lVar2 = this.f277122c;
            this.f277104B = new com.avito.android.service_booking_day_settings.daysettings.mvi.f(lVar2, uVarD7, uVar, uVar2, uVar3, this.f277145z);
            a aVar2 = new a(iVar);
            this.f277105C = aVar2;
            this.f277106D = dagger.internal.g.d(new wt0.c(lVar2, aVar2));
            this.f277107E = new iu0.d(this.f277105C);
            this.f277108F = dagger.internal.g.d(com.avito.android.service_booking_day_settings.daysettings.mvi.breaks.f.a());
            dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.mvi.breaks.a> uVarD8 = dagger.internal.g.d(com.avito.android.service_booking_day_settings.daysettings.mvi.breaks.c.a());
            this.f277109G = uVarD8;
            this.f277110H = new com.avito.android.service_booking_day_settings.daysettings.mvi.o(this.f277132m, this.f277138s, this.f277106D, this.f277107E, this.f277133n, this.f277108F, uVarD8);
            this.f277111I = new h(iVar);
            this.f277112J = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f277111I);
            this.f277113K = dagger.internal.l.a(new x(new com.avito.android.service_booking_day_settings.daysettings.w(new com.avito.android.service_booking_day_settings.daysettings.mvi.k(this.f277141v, this.f277104B, com.avito.android.service_booking_day_settings.daysettings.mvi.m.a(), this.f277110H, this.f277112J))));
            this.f277114L = dagger.internal.l.a(lVar);
            this.f277115M = dagger.internal.l.a(qVar);
            dagger.internal.u<com.avito.android.service_booking_day_settings.daysettings.adapter.d> uVarD9 = dagger.internal.g.d(new s(this.f277114L, this.f277115M, dagger.internal.l.a(qVar2)));
            this.f277116N = uVarD9;
            dagger.internal.u<com.avito.konveyor.a> uVarD10 = dagger.internal.g.d(new u(new com.avito.android.service_booking_day_settings.daysettings.adapter.c(uVarD9)));
            this.f277117O = uVarD10;
            dagger.internal.u<com.avito.konveyor.adapter.a> uVarD11 = dagger.internal.g.d(new t(uVarD10));
            this.f277118P = uVarD11;
            this.f277119Q = dagger.internal.g.d(new v(uVarD11, this.f277117O));
        }

        @Override // com.avito.android.service_booking_day_settings.di.g
        public final void Z9(DaySettingsFragment daySettingsFragment) {
            daySettingsFragment.f276692n0 = (v.a) this.f277113K.f393949a;
            daySettingsFragment.f276694p0 = this.f277112J.get();
            dagger.internal.t.c(this.f277120a.a());
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f277121b.u4();
            dagger.internal.t.c(aVarU4);
            daySettingsFragment.f276695q0 = aVarU4;
            daySettingsFragment.f276696r0 = this.f277118P.get();
            daySettingsFragment.f276697s0 = this.f277119Q.get();
        }
    }

    /* compiled from: DaggerDaySettingsComponent.java */
    /* renamed from: com.avito.android.service_booking_day_settings.di.c$c, reason: collision with other inner class name */
    public static final class C8229c implements g.a {
        public C8229c() {
        }

        @Override // com.avito.android.service_booking_day_settings.di.g.a
        public final g a(C28478k c28478k, InterfaceC39417a interfaceC39417a, i iVar, Y41.l lVar, Y41.q qVar, Y41.q qVar2, String str, FragmentManager fragmentManager) {
            interfaceC39417a.getClass();
            str.getClass();
            return new b(iVar, interfaceC39417a, c28478k, lVar, qVar, qVar2, str, fragmentManager, null);
        }
    }

    public static g.a a() {
        return new C8229c();
    }
}
