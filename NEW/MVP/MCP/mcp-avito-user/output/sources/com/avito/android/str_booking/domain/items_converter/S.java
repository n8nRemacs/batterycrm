package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;

/* compiled from: StrBookingTermsDetailsConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class S implements dagger.internal.h<Q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f285626a;

    public S(Provider<InterfaceC35863o4> provider) {
        this.f285626a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Q(this.f285626a.get());
    }
}
