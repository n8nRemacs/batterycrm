package com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeliveryUniversalCheckoutActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.safedeal_checkout.delivery_universal_checkout.domain.b f257094a;

    public b(com.avito.android.safedeal_checkout.delivery_universal_checkout.domain.b bVar) {
        this.f257094a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.safedeal_checkout.delivery_universal_checkout.domain.a) this.f257094a.get());
    }
}
