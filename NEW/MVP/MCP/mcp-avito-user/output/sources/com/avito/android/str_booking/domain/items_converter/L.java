package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;

/* compiled from: StrBookingPromoBannerConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class L implements dagger.internal.h<K> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f285622a;

    public L(Provider<InterfaceC35863o4> provider) {
        this.f285622a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new K(this.f285622a.get());
    }
}
