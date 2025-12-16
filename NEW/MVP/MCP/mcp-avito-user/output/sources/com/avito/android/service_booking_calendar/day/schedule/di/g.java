package com.avito.android.service_booking_calendar.day.schedule.di;

import com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DayScheduleModule_ProvideLoadScheduleUseCaseFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.android.service_booking_calendar.domain.use_case.b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f275346a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.service_booking_calendar.domain.use_case.d f275347b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.service_booking_calendar.domain.use_case.g f275348c;

    public g(dagger.internal.l lVar, com.avito.android.service_booking_calendar.domain.use_case.d dVar, com.avito.android.service_booking_calendar.domain.use_case.g gVar) {
        this.f275346a = lVar;
        this.f275347b = dVar;
        this.f275348c = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        DayScheduleFragment.Companion.ScheduleType scheduleType = (DayScheduleFragment.Companion.ScheduleType) this.f275346a.f393949a;
        h31.e eVarB = dagger.internal.g.b(this.f275347b);
        h31.e eVarA = dagger.internal.g.a(w.a(this.f275348c));
        c.f275338a.getClass();
        int iOrdinal = scheduleType.ordinal();
        if (iOrdinal == 0) {
            return (com.avito.android.service_booking_calendar.domain.use_case.b) eVarA.get();
        }
        if (iOrdinal == 1) {
            return (com.avito.android.service_booking_calendar.domain.use_case.b) eVarB.get();
        }
        throw new NoWhenBranchMatchedException();
    }
}
