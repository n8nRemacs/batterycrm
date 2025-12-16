package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;

/* compiled from: StrBookingPaymentDetailsConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class I implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f285620a;

    public I(Provider<InterfaceC35863o4> provider) {
        this.f285620a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new H(this.f285620a.get());
    }
}
