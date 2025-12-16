package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;

/* compiled from: StrBookingInfoConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class z implements dagger.internal.h<y> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f285666a;

    public z(Provider<InterfaceC35863o4> provider) {
        this.f285666a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new y(this.f285666a.get());
    }
}
