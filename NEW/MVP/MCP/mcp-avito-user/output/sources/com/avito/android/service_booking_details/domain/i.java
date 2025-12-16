package com.avito.android.service_booking_details.domain;

import com.avito.android.B2;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rt0.InterfaceC47722d;

/* compiled from: ServiceBookingItemDetailsConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f277346a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<B2> f277347b;

    public i(u uVar, Provider provider) {
        this.f277346a = uVar;
        this.f277347b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((InterfaceC47722d) this.f277346a.get(), this.f277347b.get());
    }
}
