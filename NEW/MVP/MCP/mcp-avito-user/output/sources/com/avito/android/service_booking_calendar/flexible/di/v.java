package com.avito.android.service_booking_calendar.flexible.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;

/* compiled from: FlexibleCalendarToolbarModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class v implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_calendar.flexible.header.toolbar.b f275826a;

    public v(com.avito.android.service_booking_calendar.flexible.header.toolbar.b bVar) {
        this.f275826a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.service_booking_calendar.flexible.header.toolbar.a aVar = (com.avito.android.service_booking_calendar.flexible.header.toolbar.a) this.f275826a.get();
        t.f275824a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
