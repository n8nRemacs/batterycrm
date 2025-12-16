package com.avito.android.service_booking_details.domain;

import Pu0.InterfaceC14839a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingGetPhoneNumberUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14839a> f277342a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f277343b;

    public f(Provider<InterfaceC14839a> provider, Provider<R0> provider2) {
        this.f277342a = provider;
        this.f277343b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f277342a.get(), this.f277343b.get());
    }
}
