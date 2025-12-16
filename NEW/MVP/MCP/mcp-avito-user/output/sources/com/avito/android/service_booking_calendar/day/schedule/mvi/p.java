package com.avito.android.service_booking_calendar.day.schedule.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DayScheduleReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final u f275420a;

    public p(u uVar) {
        this.f275420a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((c) this.f275420a.get());
    }
}
