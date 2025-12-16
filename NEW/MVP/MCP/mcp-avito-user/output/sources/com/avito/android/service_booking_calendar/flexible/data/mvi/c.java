package com.avito.android.service_booking_calendar.flexible.data.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalendarDataActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f275711a;

    public c(u uVar) {
        this.f275711a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.service_booking_calendar.flexible.data.domain.d) this.f275711a.get());
    }
}
