package com.avito.android.service_booking_settings.work_hours.mvi;

import St0.InterfaceC15221a;
import com.avito.android.service_booking_settings.work_hours.ServiceBookingWorkHoursArgument;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingWorkHoursReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking_settings.data.preferences.b f278126a;

    /* renamed from: b, reason: collision with root package name */
    public final u f278127b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f278128c;

    public n(com.avito.android.service_booking_settings.data.preferences.b bVar, u uVar, dagger.internal.l lVar) {
        this.f278126a = bVar;
        this.f278127b = uVar;
        this.f278128c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m((com.avito.android.service_booking_settings.data.preferences.a) this.f278126a.get(), (InterfaceC15221a) this.f278127b.get(), (ServiceBookingWorkHoursArgument) this.f278128c.f393949a);
    }
}
