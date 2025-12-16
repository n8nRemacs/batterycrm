package com.avito.android.return_checkout.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeliveryReturnCheckoutActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.return_checkout.domain.b f255313a;

    public b(com.avito.android.return_checkout.domain.b bVar) {
        this.f255313a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.return_checkout.domain.a) this.f255313a.get());
    }
}
