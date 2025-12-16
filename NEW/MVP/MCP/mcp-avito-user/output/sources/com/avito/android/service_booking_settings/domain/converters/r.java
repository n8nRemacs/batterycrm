package com.avito.android.service_booking_settings.domain.converters;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingWorkHoursSchedulePeriodConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f277889a;

    public r(Provider<InterfaceC35863o4> provider) {
        this.f277889a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f277889a.get());
    }
}
