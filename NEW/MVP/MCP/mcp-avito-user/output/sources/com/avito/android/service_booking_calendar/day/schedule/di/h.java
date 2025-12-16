package com.avito.android.service_booking_calendar.day.schedule.di;

import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: DayScheduleModule_ProvidePresenterSetFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_busy.c> f275349a;

    public h(Provider<com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_busy.c> provider) {
        this.f275349a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.service_booking_calendar.day.schedule.recycler.timeslot_busy.c cVar = this.f275349a.get();
        c.f275338a.getClass();
        return Collections.singleton(cVar);
    }
}
