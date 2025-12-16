package com.avito.android.service_booking_common.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;

/* compiled from: ServiceBookingTimeslotItemModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class C implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_common.blueprints.date.timeslot_list.b f276509a;

    public C(com.avito.android.service_booking_common.blueprints.date.timeslot_list.b bVar) {
        this.f276509a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.service_booking_common.blueprints.date.timeslot_list.a aVar = (com.avito.android.service_booking_common.blueprints.date.timeslot_list.a) this.f276509a.get();
        w.f276556a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
