package com.avito.android.orderBeduinV2.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OrderBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.orderBeduinV2.mvi.domain.b f209919a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<W40.b> f209920b;

    public o(com.avito.android.orderBeduinV2.mvi.domain.b bVar, Provider provider) {
        this.f209919a = bVar;
        this.f209920b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((com.avito.android.orderBeduinV2.mvi.domain.a) this.f209919a.get(), this.f209920b.get());
    }
}
