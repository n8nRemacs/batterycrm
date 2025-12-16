package com.avito.android.service_booking_calendar.flexible.header.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalendarHeaderActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f276033a;

    public g(u uVar) {
        this.f276033a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.service_booking_calendar.flexible.header.mvi.domain.a) this.f276033a.get());
    }
}
