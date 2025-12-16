package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;

/* compiled from: StrBookingScreenTitleConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class O implements dagger.internal.h<N> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f285624a;

    public O(Provider<InterfaceC35863o4> provider) {
        this.f285624a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new N(this.f285624a.get());
    }
}
