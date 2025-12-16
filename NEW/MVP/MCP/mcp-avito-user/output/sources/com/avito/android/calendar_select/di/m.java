package com.avito.android.calendar_select.di;

import Ul.C15534c;
import Ul.InterfaceC15532a;
import Wl.InterfaceC15773a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.calendar_select.CalendarSettings;
import com.avito.android.calendar_select.di.b;
import com.avito.android.calendar_select.di.h;
import com.avito.android.calendar_select.di.k;
import com.avito.android.calendar_select.presentation.mvicalendarselect.CalendarSelectFragment;
import com.avito.android.calendar_select.presentation.view.data.n;
import com.avito.android.calendar_select.presentation.view.data.p;
import com.avito.android.util.R0;
import dagger.internal.t;
import dagger.internal.u;
import java.time.LocalDate;
import kotlin.G0;

/* compiled from: DaggerCalendarSelectComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class m {

    /* compiled from: DaggerCalendarSelectComponent.java */
    public static final class b implements com.avito.android.calendar_select.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.calendar_select.presentation.view.konveyor.items.month.d> f113335a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.calendar_select.presentation.view.konveyor.items.month.c> f113336b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.calendar_select.presentation.view.konveyor.items.day.d> f113337c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.calendar_select.presentation.view.konveyor.items.day.c f113338d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.calendar_select.presentation.view.konveyor.items.empty.d> f113339e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.calendar_select.presentation.view.konveyor.items.empty.c> f113340f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f113341g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC15532a> f113342h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f113343i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28481c> f113344j;

        /* renamed from: k, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f113345k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.l f113346l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC15773a> f113347m;

        /* renamed from: n, reason: collision with root package name */
        public final u<n> f113348n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.calendar_select.presentation.view.data.g> f113349o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.calendar_select.domain.b> f113350p;

        /* renamed from: q, reason: collision with root package name */
        public final u<R0> f113351q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC28373a> f113352r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.calendar_select.domain.e> f113353s;

        /* renamed from: t, reason: collision with root package name */
        public final com.avito.android.calendar_select.presentation.mvicalendarselect.i f113354t;

        /* compiled from: DaggerCalendarSelectComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.calendar_select.di.a f113355a;

            public a(com.avito.android.calendar_select.di.a aVar) {
                this.f113355a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f113355a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCalendarSelectComponent.java */
        /* renamed from: com.avito.android.calendar_select.di.m$b$b, reason: collision with other inner class name */
        public static final class C3324b implements u<InterfaceC15773a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.calendar_select.di.a f113356a;

            public C3324b(com.avito.android.calendar_select.di.a aVar) {
                this.f113356a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC15773a interfaceC15773aPi = this.f113356a.Pi();
                t.c(interfaceC15773aPi);
                return interfaceC15773aPi;
            }
        }

        /* compiled from: DaggerCalendarSelectComponent.java */
        public static final class c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.calendar_select.di.a f113357a;

            public c(com.avito.android.calendar_select.di.a aVar) {
                this.f113357a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f113357a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerCalendarSelectComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.calendar_select.di.a f113358a;

            public d(com.avito.android.calendar_select.di.a aVar) {
                this.f113358a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f113358a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.calendar_select.di.a aVar, CalendarSettings calendarSettings, C28478k c28478k, Y41.l lVar, a aVar2) {
            u<com.avito.android.calendar_select.presentation.view.konveyor.items.month.d> uVarD = dagger.internal.g.d(k.a.f113334a);
            this.f113335a = uVarD;
            this.f113336b = dagger.internal.g.d(new j(uVarD));
            u<com.avito.android.calendar_select.presentation.view.konveyor.items.day.d> uVarD2 = dagger.internal.g.d(new f(dagger.internal.l.a(lVar)));
            this.f113337c = uVarD2;
            this.f113338d = new com.avito.android.calendar_select.presentation.view.konveyor.items.day.c(uVarD2);
            u<com.avito.android.calendar_select.presentation.view.konveyor.items.empty.d> uVarD3 = dagger.internal.g.d(h.a.f113329a);
            this.f113339e = uVarD3;
            u<com.avito.android.calendar_select.presentation.view.konveyor.items.empty.c> uVarD4 = dagger.internal.g.d(new g(uVarD3));
            this.f113340f = uVarD4;
            u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new i(this.f113336b, this.f113338d, uVarD4));
            this.f113341g = uVarD5;
            u<InterfaceC15532a> uVarD6 = dagger.internal.g.d(new C15534c(uVarD5));
            this.f113342h = uVarD6;
            this.f113343i = dagger.internal.g.d(new e(uVarD6, this.f113341g));
            this.f113344j = new d(aVar);
            this.f113345k = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f113344j);
            this.f113346l = dagger.internal.l.a(calendarSettings);
            this.f113347m = new C3324b(aVar);
            u<n> uVarD7 = dagger.internal.g.d(p.a());
            this.f113348n = uVarD7;
            u<com.avito.android.calendar_select.presentation.view.data.g> uVarD8 = dagger.internal.g.d(new com.avito.android.calendar_select.presentation.view.data.i(uVarD7));
            this.f113349o = uVarD8;
            u<com.avito.android.calendar_select.domain.b> uVarD9 = dagger.internal.g.d(new com.avito.android.calendar_select.domain.d(this.f113346l, uVarD8));
            this.f113350p = uVarD9;
            c cVar = new c(aVar);
            a aVar3 = new a(aVar);
            u<com.avito.android.calendar_select.domain.e> uVarD10 = dagger.internal.g.d(new com.avito.android.calendar_select.domain.g(this.f113346l, uVarD9, this.f113347m, cVar, aVar3));
            this.f113353s = uVarD10;
            this.f113354t = new com.avito.android.calendar_select.presentation.mvicalendarselect.i(new com.avito.android.calendar_select.presentation.mvicalendarselect.mvi.i(new com.avito.android.calendar_select.presentation.mvicalendarselect.mvi.f(this.f113346l, uVarD10, this.f113349o), new com.avito.android.calendar_select.presentation.mvicalendarselect.mvi.d(uVarD10), com.avito.android.calendar_select.presentation.mvicalendarselect.mvi.k.a(), com.avito.android.calendar_select.presentation.mvicalendarselect.mvi.m.a(), this.f113345k));
        }

        @Override // com.avito.android.calendar_select.di.b
        public final void a(CalendarSelectFragment calendarSelectFragment) {
            calendarSelectFragment.f113385n0 = this.f113341g.get();
            calendarSelectFragment.f113386o0 = this.f113343i.get();
            calendarSelectFragment.f113387p0 = this.f113345k.get();
            calendarSelectFragment.f113388q0 = this.f113354t;
        }
    }

    /* compiled from: DaggerCalendarSelectComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.calendar_select.di.b.a
        public final com.avito.android.calendar_select.di.b a(CalendarSettings calendarSettings, C28478k c28478k, Y41.l<? super LocalDate, G0> lVar, com.avito.android.calendar_select.di.a aVar) {
            return new b(aVar, calendarSettings, c28478k, lVar, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
