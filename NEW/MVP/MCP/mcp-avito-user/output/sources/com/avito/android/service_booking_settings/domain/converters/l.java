package com.avito.android.service_booking_settings.domain.converters;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingWorkHoursLicenseAgreementConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f277883a;

    public l(Provider<InterfaceC35863o4> provider) {
        this.f277883a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f277883a.get());
    }
}
