package com.avito.android.service_booking_calendar.day.schedule.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DayScheduleFlexibleCalendarAnalyticsTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f275416a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f275417b;

    public l(dagger.internal.l lVar, Provider provider) {
        this.f275416a = provider;
        this.f275417b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f275416a.get(), (String) this.f275417b.f393949a);
    }
}
