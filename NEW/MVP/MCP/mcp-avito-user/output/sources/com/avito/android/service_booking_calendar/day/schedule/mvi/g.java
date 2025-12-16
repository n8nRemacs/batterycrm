package com.avito.android.service_booking_calendar.day.schedule.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DayScheduleBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f275402a;

    /* renamed from: b, reason: collision with root package name */
    public final u f275403b;

    public g(dagger.internal.l lVar, u uVar) {
        this.f275402a = lVar;
        this.f275403b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((String) this.f275402a.f393949a, (com.avito.android.service_booking_calendar.domain.use_case.b) this.f275403b.get());
    }
}
