package com.avito.android.service_booking_calendar.flexible.data.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalendarDataReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final u f275743a;

    public l(u uVar) {
        this.f275743a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((com.avito.android.service_booking_calendar.flexible.data.domain.a) this.f275743a.get());
    }
}
