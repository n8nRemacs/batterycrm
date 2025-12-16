package com.avito.android.service_booking_calendar.flexible.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;

/* compiled from: FlexibleCalendarHeaderModule_ProvideMonthItemBinderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_calendar.flexible.header.recycler.month.h f275805a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.service_booking_calendar.flexible.header.recycler.month.d f275806b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.service_booking_calendar.flexible.header.recycler.month.f f275807c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.service_booking_calendar.flexible.header.recycler.month.b f275808d;

    public i(com.avito.android.service_booking_calendar.flexible.header.recycler.month.h hVar, com.avito.android.service_booking_calendar.flexible.header.recycler.month.d dVar, com.avito.android.service_booking_calendar.flexible.header.recycler.month.f fVar, com.avito.android.service_booking_calendar.flexible.header.recycler.month.b bVar) {
        this.f275805a = hVar;
        this.f275806b = dVar;
        this.f275807c = fVar;
        this.f275808d = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.service_booking_calendar.flexible.header.recycler.month.g gVar = (com.avito.android.service_booking_calendar.flexible.header.recycler.month.g) this.f275805a.get();
        com.avito.android.service_booking_calendar.flexible.header.recycler.month.c cVar = (com.avito.android.service_booking_calendar.flexible.header.recycler.month.c) this.f275806b.get();
        com.avito.android.service_booking_calendar.flexible.header.recycler.month.e eVar = (com.avito.android.service_booking_calendar.flexible.header.recycler.month.e) this.f275807c.get();
        com.avito.android.service_booking_calendar.flexible.header.recycler.month.a aVar = (com.avito.android.service_booking_calendar.flexible.header.recycler.month.a) this.f275808d.get();
        e.f275798a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(gVar);
        c10493a.b(cVar);
        c10493a.b(eVar);
        c10493a.b(aVar);
        return c10493a.a();
    }
}
