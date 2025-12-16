package com.avito.android.checkout.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import so.InterfaceC48388a;

/* compiled from: CheckoutPromoCodeV2UseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48388a> f118299a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f118300b;

    public c(Provider<InterfaceC48388a> provider, Provider<R0> provider2) {
        this.f118299a = provider;
        this.f118300b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f118299a.get(), this.f118300b.get());
    }
}
