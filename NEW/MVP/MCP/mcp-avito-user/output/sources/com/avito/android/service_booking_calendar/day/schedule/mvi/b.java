package com.avito.android.service_booking_calendar.day.schedule.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DayScheduleActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f275389a;

    /* renamed from: b, reason: collision with root package name */
    public final u f275390b;

    public b(dagger.internal.l lVar, u uVar) {
        this.f275389a = lVar;
        this.f275390b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((String) this.f275389a.f393949a, (com.avito.android.service_booking_calendar.domain.use_case.b) this.f275390b.get());
    }
}
