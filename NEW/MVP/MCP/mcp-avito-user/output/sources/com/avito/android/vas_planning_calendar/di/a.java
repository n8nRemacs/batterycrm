package com.avito.android.vas_planning_calendar.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.planning.CalendarSelectionType;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.L0;
import com.avito.android.vas_planning_calendar.C36073g;
import com.avito.android.vas_planning_calendar.PlanCalendarFragment;
import com.avito.android.vas_planning_calendar.data.k;
import com.avito.android.vas_planning_calendar.data.n;
import com.avito.android.vas_planning_calendar.di.b;
import com.avito.android.vas_planning_calendar.model.DateRange;
import com.avito.android.vas_planning_calendar.y;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import hM0.C40855c;
import hM0.InterfaceC40853a;
import java.util.Date;

/* compiled from: DaggerPlanCalendarComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerPlanCalendarComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.vas_planning_calendar.di.b.a
        public final com.avito.android.vas_planning_calendar.di.b a(Resources resources, PlanCalendarFragment planCalendarFragment, Date date, DateRange dateRange, CalendarSelectionType calendarSelectionType, com.avito.android.vas_planning_calendar.di.c cVar) {
            return new c(cVar, resources, planCalendarFragment, date, dateRange, calendarSelectionType, null);
        }
    }

    /* compiled from: DaggerPlanCalendarComponent.java */
    public static final class c implements com.avito.android.vas_planning_calendar.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.vas_planning_calendar.di.c f322626a;

        /* renamed from: b, reason: collision with root package name */
        public final l f322627b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.vas_planning_calendar.domain.a> f322628c = dagger.internal.g.d(com.avito.android.vas_planning_calendar.domain.c.a());

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC35745a5> f322629d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.vas_planning_calendar.data.a> f322630e;

        /* renamed from: f, reason: collision with root package name */
        public final l f322631f;

        /* renamed from: g, reason: collision with root package name */
        public final l f322632g;

        /* renamed from: h, reason: collision with root package name */
        public final l f322633h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.vas_planning_calendar.data.l> f322634i;

        /* renamed from: j, reason: collision with root package name */
        public final u<y> f322635j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.vas_planning_calendar.view.konveyor.items.month.c f322636k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.vas_planning_calendar.view.konveyor.items.day.d> f322637l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.vas_planning_calendar.view.konveyor.items.day.c f322638m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f322639n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC40853a> f322640o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f322641p;

        /* compiled from: DaggerPlanCalendarComponent.java */
        /* renamed from: com.avito.android.vas_planning_calendar.di.a$c$a, reason: collision with other inner class name */
        public static final class C9972a implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.vas_planning_calendar.di.c f322642a;

            public C9972a(com.avito.android.vas_planning_calendar.di.c cVar) {
                this.f322642a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f322642a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public c(com.avito.android.vas_planning_calendar.di.c cVar, Resources resources, Fragment fragment, Date date, DateRange dateRange, CalendarSelectionType calendarSelectionType, C9971a c9971a) {
            this.f322626a = cVar;
            this.f322627b = l.a(fragment);
            this.f322629d = new C9972a(cVar);
            this.f322630e = dagger.internal.g.d(new k(l.a(resources)));
            this.f322631f = l.b(date);
            this.f322632g = l.b(dateRange);
            l lVarA = l.a(calendarSelectionType);
            this.f322633h = lVarA;
            u<com.avito.android.vas_planning_calendar.data.l> uVarD = dagger.internal.g.d(new n(this.f322631f, this.f322632g, lVarA));
            this.f322634i = uVarD;
            this.f322635j = dagger.internal.g.d(new h(this.f322627b, new C36073g(this.f322631f, this.f322632g, this.f322633h, uVarD, this.f322628c, this.f322629d, this.f322630e)));
            this.f322636k = new com.avito.android.vas_planning_calendar.view.konveyor.items.month.c(com.avito.android.vas_planning_calendar.view.konveyor.items.month.e.a());
            u<com.avito.android.vas_planning_calendar.view.konveyor.items.day.d> uVarD2 = dagger.internal.g.d(new i(this.f322635j));
            this.f322637l = uVarD2;
            this.f322638m = new com.avito.android.vas_planning_calendar.view.konveyor.items.day.c(uVarD2);
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new j(this.f322636k, this.f322638m, new com.avito.android.vas_planning_calendar.view.konveyor.items.empty.c(com.avito.android.vas_planning_calendar.view.konveyor.items.empty.e.a())));
            this.f322639n = uVarD3;
            u<InterfaceC40853a> uVarD4 = dagger.internal.g.d(new C40855c(uVarD3));
            this.f322640o = uVarD4;
            this.f322641p = dagger.internal.g.d(new g(uVarD4, this.f322639n));
        }

        @Override // com.avito.android.vas_planning_calendar.di.b
        public final void a(PlanCalendarFragment planCalendarFragment) {
            com.avito.android.vas_planning_calendar.di.c cVar = this.f322626a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            planCalendarFragment.f322593h0 = interfaceC28373aA;
            planCalendarFragment.f322594i0 = this.f322635j.get();
            planCalendarFragment.f322595j0 = this.f322641p.get();
            planCalendarFragment.f322596k0 = this.f322639n.get();
            L0 l0Z = cVar.z();
            t.c(l0Z);
            planCalendarFragment.f322597l0 = l0Z;
        }
    }

    public static b.a a() {
        return new b();
    }
}
