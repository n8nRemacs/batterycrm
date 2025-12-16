package com.avito.android.service_booking_calendar.flexible.data.domain;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WeekItemConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f275706a;

    public i(u uVar) {
        this.f275706a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.service_booking_calendar.day.schedule.domain.a) this.f275706a.get());
    }
}
