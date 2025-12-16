package com.avito.android.service_booking_settings.domain.converters;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingWorkHoursTimeGapConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f277891a;

    public u(Provider<InterfaceC35863o4> provider) {
        this.f277891a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t(this.f277891a.get());
    }
}
