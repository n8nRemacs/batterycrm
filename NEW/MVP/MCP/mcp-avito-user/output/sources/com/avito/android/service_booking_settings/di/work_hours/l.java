package com.avito.android.service_booking_settings.di.work_hours;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingWorkHoursModule_ProvideListUpdateCallback$_avito_service_booking_settings_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final u f277842a;

    public l(u uVar) {
        this.f277842a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f277842a.get();
        g.f277835a.getClass();
        return jVar;
    }
}
