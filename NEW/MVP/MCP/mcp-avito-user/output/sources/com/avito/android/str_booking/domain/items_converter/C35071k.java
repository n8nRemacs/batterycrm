package com.avito.android.str_booking.domain.items_converter;

import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;

/* compiled from: StrBookingButtonsConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.str_booking.domain.items_converter.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35071k implements dagger.internal.h<C35070j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f285633a;

    public C35071k(Provider<InterfaceC35863o4> provider) {
        this.f285633a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35070j(this.f285633a.get());
    }
}
