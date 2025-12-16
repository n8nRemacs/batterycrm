package com.avito.android.service_booking_calendar.day.schedule.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DayScheduleModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_busy.b f275343a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_empty.b f275344b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_inactive.b f275345c;

    public f(com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_busy.b bVar, com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_empty.b bVar2, com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_inactive.b bVar3) {
        this.f275343a = bVar;
        this.f275344b = bVar2;
        this.f275345c = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_busy.a aVar = (com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_busy.a) this.f275343a.get();
        com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_empty.a aVar2 = (com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_empty.a) this.f275344b.get();
        com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_inactive.a aVar3 = (com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_inactive.a) this.f275345c.get();
        c.f275338a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        return c10493a.a();
    }
}
