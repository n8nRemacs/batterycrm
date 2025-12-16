package com.avito.android.safedeal_checkout.delivery_universal_checkout;

import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: DeliveryUniversalCheckoutViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f257189a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.n f257190b;

    public p(Provider provider, com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.n nVar) {
        this.f257189a = provider;
        this.f257190b = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f257189a.get(), (com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.m) this.f257190b.get());
    }
}
