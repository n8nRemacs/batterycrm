package com.avito.android.service_booking_settings.domain.converters;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingWorkHoursContentDescriptionConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f277880a;

    public f(Provider<InterfaceC35863o4> provider) {
        this.f277880a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f277880a.get());
    }
}
