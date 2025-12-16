package com.avito.android.service_booking_additional_settings.additionalsettings.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingAdditionalSettingsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f275011a;

    public f(u uVar) {
        this.f275011a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.a) this.f275011a.get());
    }
}
