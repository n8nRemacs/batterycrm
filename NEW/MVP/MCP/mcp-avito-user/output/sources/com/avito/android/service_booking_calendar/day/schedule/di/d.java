package com.avito.android.service_booking_calendar.day.schedule.di;

import com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DayScheduleModule_BindDayScheduleAnalyticsTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<com.avito.android.service_booking_calendar.day.schedule.mvi.c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f275339a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.service_booking_calendar.day.schedule.mvi.e f275340b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.service_booking_calendar.day.schedule.mvi.l f275341c;

    public d(dagger.internal.l lVar, com.avito.android.service_booking_calendar.day.schedule.mvi.e eVar, com.avito.android.service_booking_calendar.day.schedule.mvi.l lVar2) {
        this.f275339a = lVar;
        this.f275340b = eVar;
        this.f275341c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        DayScheduleFragment.Companion.ScheduleType scheduleType = (DayScheduleFragment.Companion.ScheduleType) this.f275339a.f393949a;
        h31.e eVarA = dagger.internal.g.a(w.a(this.f275340b));
        h31.e eVarA2 = dagger.internal.g.a(w.a(this.f275341c));
        c.f275338a.getClass();
        int iOrdinal = scheduleType.ordinal();
        if (iOrdinal == 0) {
            return (com.avito.android.service_booking_calendar.day.schedule.mvi.c) eVarA2.get();
        }
        if (iOrdinal == 1) {
            return (com.avito.android.service_booking_calendar.day.schedule.mvi.c) eVarA.get();
        }
        throw new NoWhenBranchMatchedException();
    }
}
