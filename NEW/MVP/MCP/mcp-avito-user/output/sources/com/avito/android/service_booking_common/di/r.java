package com.avito.android.service_booking_common.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;

/* compiled from: ServiceBookingDateItemModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class r implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_common.blueprints.date.date_list.b f276529a;

    public r(com.avito.android.service_booking_common.blueprints.date.date_list.b bVar) {
        this.f276529a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.service_booking_common.blueprints.date.date_list.a aVar = (com.avito.android.service_booking_common.blueprints.date.date_list.a) this.f276529a.get();
        k.f276519a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
