package com.avito.android.service_booking_day_settings.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SettingsRecyclerModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class u implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_day_settings.daysettings.adapter.c f277167a;

    public u(com.avito.android.service_booking_day_settings.daysettings.adapter.c cVar) {
        this.f277167a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.service_booking_day_settings.daysettings.adapter.b bVar = (com.avito.android.service_booking_day_settings.daysettings.adapter.b) this.f277167a.get();
        r.f277162a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        return c10493a.a();
    }
}
