package com.avito.android.service_booking_schedule_repetition_impl.di;

import Kt0.InterfaceC14349a;
import Lt0.InterfaceC14438a;
import android.app.Application;
import android.content.SharedPreferences;
import com.avito.android.J0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.service_booking_schedule_repetition_impl.ServiceBookingScheduleRepetitionSheet;
import com.avito.android.service_booking_schedule_repetition_impl.di.b;
import com.avito.android.service_booking_schedule_repetition_impl.e;
import com.avito.android.service_booking_schedule_repetition_impl.k;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.RepetitionSchedule;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.m;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.o;
import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import ut0.InterfaceC49110a;
import ys0.InterfaceC50291b;

/* compiled from: DaggerServiceBookingScheduleRepetitionComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerServiceBookingScheduleRepetitionComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.service_booking_schedule_repetition_impl.di.b.a
        public final com.avito.android.service_booking_schedule_repetition_impl.di.b a(C28478k c28478k, RepetitionSchedule repetitionSchedule, com.avito.android.service_booking_schedule_repetition_impl.di.c cVar) {
            return new c(cVar, c28478k, repetitionSchedule, null);
        }
    }

    /* compiled from: DaggerServiceBookingScheduleRepetitionComponent.java */
    public static final class c implements com.avito.android.service_booking_schedule_repetition_impl.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l f277556a = l.a(new com.avito.android.service_booking_schedule_repetition_impl.l(k.a()));

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f277557b;

        /* renamed from: c, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f277558c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC14349a> f277559d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f277560e;

        /* renamed from: f, reason: collision with root package name */
        public final l f277561f;

        /* renamed from: g, reason: collision with root package name */
        public final u<J0> f277562g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC50291b> f277563h;

        /* renamed from: i, reason: collision with root package name */
        public final u<Lt0.e> f277564i;

        /* renamed from: j, reason: collision with root package name */
        public final u<Application> f277565j;

        /* renamed from: k, reason: collision with root package name */
        public final u<SharedPreferences> f277566k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.service_booking.data.preferences.a> f277567l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC14438a> f277568m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.service_booking_day_settings.breaks.a> f277569n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.b> f277570o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.service_booking_schedule_repetition_impl.mvi.h f277571p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC49110a> f277572q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.f> f277573r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.service_booking_schedule_repetition_impl.mvi.f f277574s;

        /* renamed from: t, reason: collision with root package name */
        public final u<InterfaceC28373a> f277575t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.i> f277576u;

        /* renamed from: v, reason: collision with root package name */
        public final o f277577v;

        /* renamed from: w, reason: collision with root package name */
        public final com.avito.android.service_booking_schedule_repetition_impl.c f277578w;

        /* compiled from: DaggerServiceBookingScheduleRepetitionComponent.java */
        /* renamed from: com.avito.android.service_booking_schedule_repetition_impl.di.a$c$a, reason: collision with other inner class name */
        public static final class C8242a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_schedule_repetition_impl.di.c f277579a;

            public C8242a(com.avito.android.service_booking_schedule_repetition_impl.di.c cVar) {
                this.f277579a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f277579a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerServiceBookingScheduleRepetitionComponent.java */
        public static final class b implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_schedule_repetition_impl.di.c f277580a;

            public b(com.avito.android.service_booking_schedule_repetition_impl.di.c cVar) {
                this.f277580a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f277580a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerServiceBookingScheduleRepetitionComponent.java */
        /* renamed from: com.avito.android.service_booking_schedule_repetition_impl.di.a$c$c, reason: collision with other inner class name */
        public static final class C8243c implements u<com.avito.android.service_booking_day_settings.breaks.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_schedule_repetition_impl.di.c f277581a;

            public C8243c(com.avito.android.service_booking_schedule_repetition_impl.di.c cVar) {
                this.f277581a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f277581a.n5();
            }
        }

        /* compiled from: DaggerServiceBookingScheduleRepetitionComponent.java */
        public static final class d implements u<InterfaceC50291b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_schedule_repetition_impl.di.c f277582a;

            public d(com.avito.android.service_booking_schedule_repetition_impl.di.c cVar) {
                this.f277582a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC50291b interfaceC50291bBd = this.f277582a.bd();
                t.c(interfaceC50291bBd);
                return interfaceC50291bBd;
            }
        }

        /* compiled from: DaggerServiceBookingScheduleRepetitionComponent.java */
        public static final class e implements u<InterfaceC49110a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_schedule_repetition_impl.di.c f277583a;

            public e(com.avito.android.service_booking_schedule_repetition_impl.di.c cVar) {
                this.f277583a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC49110a interfaceC49110aR7 = this.f277583a.R7();
                t.c(interfaceC49110aR7);
                return interfaceC49110aR7;
            }
        }

        /* compiled from: DaggerServiceBookingScheduleRepetitionComponent.java */
        public static final class f implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_schedule_repetition_impl.di.c f277584a;

            public f(com.avito.android.service_booking_schedule_repetition_impl.di.c cVar) {
                this.f277584a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f277584a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerServiceBookingScheduleRepetitionComponent.java */
        public static final class g implements u<J0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_schedule_repetition_impl.di.c f277585a;

            public g(com.avito.android.service_booking_schedule_repetition_impl.di.c cVar) {
                this.f277585a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                J0 j0F0 = this.f277585a.f0();
                t.c(j0F0);
                return j0F0;
            }
        }

        /* compiled from: DaggerServiceBookingScheduleRepetitionComponent.java */
        public static final class h implements u<InterfaceC14349a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_schedule_repetition_impl.di.c f277586a;

            public h(com.avito.android.service_booking_schedule_repetition_impl.di.c cVar) {
                this.f277586a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14349a interfaceC14349aPh = this.f277586a.ph();
                t.c(interfaceC14349aPh);
                return interfaceC14349aPh;
            }
        }

        /* compiled from: DaggerServiceBookingScheduleRepetitionComponent.java */
        public static final class i implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.service_booking_schedule_repetition_impl.di.c f277587a;

            public i(com.avito.android.service_booking_schedule_repetition_impl.di.c cVar) {
                this.f277587a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f277587a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.service_booking_schedule_repetition_impl.di.c cVar, C28478k c28478k, RepetitionSchedule repetitionSchedule, C8241a c8241a) {
            this.f277557b = new i(cVar);
            this.f277558c = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f277557b);
            this.f277559d = new h(cVar);
            this.f277560e = new f(cVar);
            this.f277561f = l.a(repetitionSchedule);
            this.f277564i = dagger.internal.g.d(new Lt0.g(new g(cVar), new d(cVar)));
            u<SharedPreferences> uVarD = dagger.internal.g.d(new Cs0.c(new b(cVar)));
            this.f277566k = uVarD;
            u<com.avito.android.service_booking.data.preferences.a> uVarD2 = dagger.internal.g.d(new com.avito.android.service_booking.data.preferences.c(uVarD));
            this.f277567l = uVarD2;
            u<InterfaceC14438a> uVarD3 = dagger.internal.g.d(new Lt0.c(uVarD2));
            this.f277568m = uVarD3;
            C8243c c8243c = new C8243c(cVar);
            this.f277569n = c8243c;
            u<com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.b> uVarD4 = dagger.internal.g.d(new com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.d(this.f277561f, uVarD3, this.f277559d, this.f277560e, this.f277564i, c8243c));
            this.f277570o = uVarD4;
            this.f277571p = new com.avito.android.service_booking_schedule_repetition_impl.mvi.h(uVarD4);
            u<com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.f> uVarD5 = dagger.internal.g.d(new com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.h(this.f277561f, new e(cVar), this.f277560e, this.f277569n));
            this.f277573r = uVarD5;
            u<com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.b> uVar = this.f277570o;
            l lVar = this.f277561f;
            this.f277574s = new com.avito.android.service_booking_schedule_repetition_impl.mvi.f(lVar, uVarD5, uVar);
            u<com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.i> uVarD6 = dagger.internal.g.d(new com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.k(lVar, new C8242a(cVar)));
            this.f277576u = uVarD6;
            this.f277577v = new o(this.f277561f, uVarD6, this.f277567l);
            this.f277578w = new com.avito.android.service_booking_schedule_repetition_impl.c(new com.avito.android.service_booking_schedule_repetition_impl.mvi.k(this.f277571p, this.f277574s, m.a(), this.f277577v, this.f277558c));
        }

        @Override // com.avito.android.service_booking_schedule_repetition_impl.di.b
        public final void a(ServiceBookingScheduleRepetitionSheet serviceBookingScheduleRepetitionSheet) {
            serviceBookingScheduleRepetitionSheet.f277535h0 = (e.c) this.f277556a.f393949a;
            serviceBookingScheduleRepetitionSheet.f277536i0 = this.f277558c.get();
            serviceBookingScheduleRepetitionSheet.f277537j0 = this.f277578w;
        }
    }

    public static b.a a() {
        return new b();
    }
}
