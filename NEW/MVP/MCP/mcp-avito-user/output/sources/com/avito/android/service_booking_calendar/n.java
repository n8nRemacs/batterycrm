package com.avito.android.service_booking_calendar;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalendarViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_calendar.mvi.j f276162a;

    public n(com.avito.android.service_booking_calendar.mvi.j jVar) {
        this.f276162a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((com.avito.android.service_booking_calendar.mvi.i) this.f276162a.get(), null, 2, null);
    }
}
