package com.avito.android.service_booking_calendar.di;

import com.avito.android.service_booking_calendar.CalendarView;
import com.avito.android.service_booking_calendar.di.a;
import dagger.internal.A;
import dagger.internal.u;
import dagger.internal.z;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerCalendarViewComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class j {

    /* compiled from: DaggerCalendarViewComponent.java */
    public static final class b implements com.avito.android.service_booking_calendar.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.service_booking_calendar.n f275491a = new com.avito.android.service_booking_calendar.n(new com.avito.android.service_booking_calendar.mvi.j(com.avito.android.service_booking_calendar.mvi.g.a(), com.avito.android.service_booking_calendar.mvi.e.a(), com.avito.android.service_booking_calendar.mvi.l.a(), com.avito.android.service_booking_calendar.mvi.n.a()));

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f275492b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.service_booking_calendar.view.day.e> f275493c;

        /* renamed from: d, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f275494d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.service_booking_calendar.view.month.e> f275495e;

        /* renamed from: f, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f275496f;

        /* renamed from: g, reason: collision with root package name */
        public final A f275497g;

        /* renamed from: h, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f275498h;

        /* renamed from: i, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f275499i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f275500j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f275501k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f275502l;

        /* renamed from: m, reason: collision with root package name */
        public final u<Set<TV0.d<?, ?>>> f275503m;

        public b(com.avito.android.service_booking_calendar.di.b bVar, Boolean bool, a aVar) {
            this.f275492b = dagger.internal.l.a(bool);
            u<com.avito.android.service_booking_calendar.view.day.e> uVarD = dagger.internal.g.d(com.avito.android.service_booking_calendar.view.day.h.a());
            this.f275493c = uVarD;
            this.f275494d = dagger.internal.g.d(new com.avito.android.service_booking_calendar.view.day.c(uVarD));
            u<com.avito.android.service_booking_calendar.view.month.e> uVarD2 = dagger.internal.g.d(com.avito.android.service_booking_calendar.view.month.g.a());
            this.f275495e = uVarD2;
            this.f275496f = dagger.internal.g.d(new com.avito.android.service_booking_calendar.view.month.c(uVarD2));
            A.b bVarA = A.a(2, 0);
            u<TV0.b<?, ?>> uVar = this.f275494d;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f275496f);
            this.f275497g = bVarA.b();
            this.f275498h = dagger.internal.g.d(new com.avito.android.service_booking_calendar.view.month.redesign.b(this.f275495e));
            this.f275499i = dagger.internal.g.d(new com.avito.android.service_booking_calendar.view.day.redesign.b(this.f275493c));
            A.b bVarA2 = A.a(2, 0);
            u<TV0.b<?, ?>> uVar2 = this.f275498h;
            List<u<T>> list2 = bVarA2.f393937a;
            list2.add(uVar2);
            list2.add(this.f275499i);
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new d(this.f275492b, this.f275497g, bVarA2.b()));
            this.f275500j = uVarD3;
            u<com.avito.konveyor.adapter.a> uVarD4 = dagger.internal.g.d(new g(uVarD3));
            this.f275501k = uVarD4;
            this.f275502l = dagger.internal.g.d(new h(uVarD4, this.f275500j));
            this.f275503m = dagger.internal.g.d(new f(this.f275493c, this.f275495e));
        }

        @Override // com.avito.android.service_booking_calendar.di.a
        public final void a(CalendarView calendarView) {
            calendarView.viewModelProvider = this.f275491a;
            calendarView.recyclerAdapter = this.f275502l.get();
            calendarView.adapterPresenter = this.f275501k.get();
            calendarView.itemBinder = this.f275500j.get();
            z zVar = new z(1);
            zVar.b(this.f275503m.get());
            calendarView.itemPresenterSet = zVar.c();
        }
    }

    /* compiled from: DaggerCalendarViewComponent.java */
    public static final class c implements a.InterfaceC8174a {
        public c() {
        }

        @Override // com.avito.android.service_booking_calendar.di.a.InterfaceC8174a
        public final com.avito.android.service_booking_calendar.di.a a(boolean z12, com.avito.android.service_booking_calendar.di.b bVar) {
            return new b(bVar, Boolean.valueOf(z12), null);
        }
    }

    public static a.InterfaceC8174a a() {
        return new c();
    }
}
