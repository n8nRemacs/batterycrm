package com.avito.android.str_booking.domain.items_converter;

import javax.inject.Provider;

/* compiled from: StrBookingCalculationConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.str_booking.domain.items_converter.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35074n implements dagger.internal.h<C35073m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<G> f285636a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f285637b;

    public C35074n(dagger.internal.u uVar, Provider provider) {
        this.f285636a = provider;
        this.f285637b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35073m(this.f285636a.get(), (P) this.f285637b.get());
    }
}
