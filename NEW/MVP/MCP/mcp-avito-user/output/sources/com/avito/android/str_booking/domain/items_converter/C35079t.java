package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;

/* compiled from: StrBookingDetailsConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.str_booking.domain.items_converter.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35079t implements dagger.internal.h<C35078s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f285663a;

    public C35079t(Provider<InterfaceC35863o4> provider) {
        this.f285663a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35078s(this.f285663a.get());
    }
}
