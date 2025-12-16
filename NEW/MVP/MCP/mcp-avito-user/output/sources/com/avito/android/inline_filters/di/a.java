package com.avito.android.inline_filters.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerConfig;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerUiConfig;
import com.avito.android.inline_filters.calendar.SelectedDateRange;
import com.avito.android.inline_filters.di.c;
import com.avito.android.inline_filters.dialog.calendar.C31003c;
import com.avito.android.inline_filters.dialog.calendar.E;
import com.avito.android.inline_filters.dialog.calendar.models.CalendarPickerConstraints;
import com.avito.android.inline_filters.dialog.calendar.view.FiltersCalendarPickerFragment;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.L0;
import dagger.internal.u;
import java.util.List;

/* compiled from: DaggerFiltersCalendarPickerComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerFiltersCalendarPickerComponent.java */
    public static final class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public SelectedDateRange f171084a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f171085b;

        /* renamed from: c, reason: collision with root package name */
        public FiltersCalendarPickerConfig f171086c;

        /* renamed from: d, reason: collision with root package name */
        public FiltersCalendarPickerUiConfig f171087d;

        /* renamed from: e, reason: collision with root package name */
        public d f171088e;

        /* renamed from: f, reason: collision with root package name */
        public com.avito.android.analytics.screens.r f171089f;

        public b() {
        }

        @Override // com.avito.android.inline_filters.di.c.a
        public final c.a a(d dVar) {
            this.f171088e = dVar;
            return this;
        }

        @Override // com.avito.android.inline_filters.di.c.a
        public final c.a b(SelectedDateRange selectedDateRange) {
            this.f171084a = selectedDateRange;
            return this;
        }

        @Override // com.avito.android.inline_filters.di.c.a
        public final com.avito.android.inline_filters.di.c build() {
            dagger.internal.t.a(FiltersCalendarPickerConfig.class, this.f171086c);
            dagger.internal.t.a(FiltersCalendarPickerUiConfig.class, this.f171087d);
            dagger.internal.t.a(d.class, this.f171088e);
            dagger.internal.t.a(com.avito.android.analytics.screens.r.class, this.f171089f);
            return new c(this.f171088e, this.f171084a, this.f171085b, this.f171086c, this.f171087d, this.f171089f, null);
        }

        @Override // com.avito.android.inline_filters.di.c.a
        public final c.a c(com.avito.android.analytics.screens.r rVar) {
            this.f171089f = rVar;
            return this;
        }

        @Override // com.avito.android.inline_filters.di.c.a
        public final c.a d(FiltersCalendarPickerUiConfig filtersCalendarPickerUiConfig) {
            filtersCalendarPickerUiConfig.getClass();
            this.f171087d = filtersCalendarPickerUiConfig;
            return this;
        }

        @Override // com.avito.android.inline_filters.di.c.a
        public final c.a e(Integer num) {
            this.f171085b = num;
            return this;
        }

        @Override // com.avito.android.inline_filters.di.c.a
        public final c.a f(FiltersCalendarPickerConfig filtersCalendarPickerConfig) {
            filtersCalendarPickerConfig.getClass();
            this.f171086c = filtersCalendarPickerConfig;
            return this;
        }
    }

    /* compiled from: DaggerFiltersCalendarPickerComponent.java */
    public static final class c implements com.avito.android.inline_filters.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.inline_filters.di.d f171090a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.server_time.f> f171091b;

        /* renamed from: c, reason: collision with root package name */
        public final u<KN.f> f171092c;

        /* renamed from: d, reason: collision with root package name */
        public final u<KN.c> f171093d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC35745a5> f171094e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.inline_filters.dialog.calendar.view.h> f171095f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f171096g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f171097h;

        /* renamed from: i, reason: collision with root package name */
        public final u<CalendarPickerConstraints> f171098i;

        /* renamed from: j, reason: collision with root package name */
        public final u<HN.a<List<? extends MN.c>>> f171099j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.android.inline_filters.dialog.calendar.o> f171100k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.inline_filters.dialog.calendar.konveyor.items.month.c f171101l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.d> f171102m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.c f171103n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f171104o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f171105p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC28481c> f171106q;

        /* renamed from: r, reason: collision with root package name */
        public final u<C28478k> f171107r;

        /* renamed from: s, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f171108s;

        /* compiled from: DaggerFiltersCalendarPickerComponent.java */
        /* renamed from: com.avito.android.inline_filters.di.a$c$a, reason: collision with other inner class name */
        public static final class C5066a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.inline_filters.di.d f171109a;

            public C5066a(com.avito.android.inline_filters.di.d dVar) {
                this.f171109a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f171109a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerFiltersCalendarPickerComponent.java */
        public static final class b implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.inline_filters.di.d f171110a;

            public b(com.avito.android.inline_filters.di.d dVar) {
                this.f171110a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f171110a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerFiltersCalendarPickerComponent.java */
        /* renamed from: com.avito.android.inline_filters.di.a$c$c, reason: collision with other inner class name */
        public static final class C5067c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.inline_filters.di.d f171111a;

            public C5067c(com.avito.android.inline_filters.di.d dVar) {
                this.f171111a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f171111a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerFiltersCalendarPickerComponent.java */
        public static final class d implements u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.inline_filters.di.d f171112a;

            public d(com.avito.android.inline_filters.di.d dVar) {
                this.f171112a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f171112a.l();
                dagger.internal.t.c(fVarL);
                return fVarL;
            }
        }

        public c(com.avito.android.inline_filters.di.d dVar, SelectedDateRange selectedDateRange, Integer num, FiltersCalendarPickerConfig filtersCalendarPickerConfig, FiltersCalendarPickerUiConfig filtersCalendarPickerUiConfig, com.avito.android.analytics.screens.r rVar, C5065a c5065a) {
            this.f171090a = dVar;
            d dVar2 = new d(dVar);
            this.f171091b = dVar2;
            this.f171092c = dagger.internal.g.d(new KN.h(dVar2));
            this.f171093d = dagger.internal.g.d(new KN.e(dagger.internal.l.b(num)));
            this.f171094e = new b(dVar);
            this.f171095f = dagger.internal.g.d(com.avito.android.inline_filters.dialog.calendar.view.j.a());
            this.f171096g = new C5066a(dVar);
            dagger.internal.l lVarA = dagger.internal.l.a(filtersCalendarPickerConfig);
            this.f171097h = lVarA;
            this.f171098i = dagger.internal.g.d(new g(lVarA, this.f171091b));
            this.f171099j = dagger.internal.g.d(new HN.m(dagger.internal.l.b(selectedDateRange), this.f171097h, this.f171098i));
            this.f171100k = dagger.internal.g.d(new h(new E(this.f171097h, dagger.internal.l.a(filtersCalendarPickerUiConfig), this.f171092c, this.f171093d, this.f171094e, this.f171095f, this.f171096g, this.f171098i, this.f171099j)));
            this.f171101l = new com.avito.android.inline_filters.dialog.calendar.konveyor.items.month.c(com.avito.android.inline_filters.dialog.calendar.konveyor.items.month.e.a());
            u<com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.d> uVarD = dagger.internal.g.d(new i(this.f171100k));
            this.f171102m = uVarD;
            this.f171103n = new com.avito.android.inline_filters.dialog.calendar.konveyor.items.day.c(uVarD);
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new j(this.f171101l, this.f171103n, new com.avito.android.inline_filters.dialog.calendar.konveyor.items.empty.c(com.avito.android.inline_filters.dialog.calendar.konveyor.items.empty.e.a())));
            this.f171104o = uVarD2;
            this.f171105p = dagger.internal.g.d(new f(new LN.c(uVarD2), uVarD2));
            this.f171106q = new C5067c(dVar);
            u<C28478k> uVarD3 = dagger.internal.g.d(new k(dagger.internal.l.a(rVar)));
            this.f171107r = uVarD3;
            this.f171108s = dagger.internal.g.d(new l(uVarD3, this.f171106q));
        }

        @Override // com.avito.android.inline_filters.di.c
        public final void a(C31003c c31003c) {
            com.avito.android.inline_filters.di.d dVar = this.f171090a;
            InterfaceC28373a interfaceC28373aA = dVar.a();
            dagger.internal.t.c(interfaceC28373aA);
            c31003c.f171188e = interfaceC28373aA;
            c31003c.f171189f = this.f171100k.get();
            c31003c.f171190g = this.f171105p.get();
            c31003c.f171191h = this.f171104o.get();
            L0 l0Z = dVar.z();
            dagger.internal.t.c(l0Z);
            c31003c.f171192i = l0Z;
        }

        @Override // com.avito.android.inline_filters.di.c
        public final void b(FiltersCalendarPickerFragment filtersCalendarPickerFragment) {
            filtersCalendarPickerFragment.f171322i0 = this.f171100k.get();
            filtersCalendarPickerFragment.f171323j0 = this.f171108s.get();
            com.avito.android.inline_filters.di.d dVar = this.f171090a;
            InterfaceC28373a interfaceC28373aA = dVar.a();
            dagger.internal.t.c(interfaceC28373aA);
            filtersCalendarPickerFragment.f171324k0 = interfaceC28373aA;
            filtersCalendarPickerFragment.f171325l0 = this.f171105p.get();
            filtersCalendarPickerFragment.f171326m0 = this.f171104o.get();
            L0 l0Z = dVar.z();
            dagger.internal.t.c(l0Z);
            filtersCalendarPickerFragment.f171327n0 = l0Z;
        }
    }

    public static c.a a() {
        return new b();
    }
}
