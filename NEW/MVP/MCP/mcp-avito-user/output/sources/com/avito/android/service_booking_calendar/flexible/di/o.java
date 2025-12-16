package com.avito.android.service_booking_calendar.flexible.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;

/* compiled from: FlexibleCalendarHeaderModule_ProvideWeekItemBinderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_calendar.flexible.header.recycler.week.b f275817a;

    public o(com.avito.android.service_booking_calendar.flexible.header.recycler.week.b bVar) {
        this.f275817a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.service_booking_calendar.flexible.header.recycler.week.a aVar = (com.avito.android.service_booking_calendar.flexible.header.recycler.week.a) this.f275817a.get();
        e.f275798a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
