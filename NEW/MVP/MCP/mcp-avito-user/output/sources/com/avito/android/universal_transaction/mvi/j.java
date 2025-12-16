package com.avito.android.universal_transaction.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TransactionActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.universal_transaction.mvi.domain.b f306442a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.clientEventBus.a> f306443b;

    public j(com.avito.android.universal_transaction.mvi.domain.b bVar, Provider provider) {
        this.f306442a = bVar;
        this.f306443b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.universal_transaction.mvi.domain.a) this.f306442a.get(), this.f306443b.get());
    }
}
