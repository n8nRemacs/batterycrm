package com.avito.android.service_booking_calendar.day.schedule;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: DayScheduleViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_calendar.day.schedule.mvi.j f275421a;

    public n(com.avito.android.service_booking_calendar.day.schedule.mvi.j jVar) {
        this.f275421a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.service_booking_calendar.day.schedule.mvi.i iVar = (com.avito.android.service_booking_calendar.day.schedule.mvi.i) this.f275421a.get();
        i2.f411430a.getClass();
        return new m(iVar, i2.a.f411433c);
    }
}
