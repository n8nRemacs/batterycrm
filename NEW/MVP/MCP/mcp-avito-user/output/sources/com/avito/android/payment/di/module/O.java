package com.avito.android.payment.di.module;

import javax.inject.Provider;

/* compiled from: PaymentStatusFormModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class O implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final F f214224a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f214225b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f214226c;

    public O(F f12, dagger.internal.u uVar, Provider provider) {
        this.f214224a = f12;
        this.f214225b = uVar;
        this.f214226c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f214225b.get();
        com.avito.konveyor.a aVar2 = this.f214226c.get();
        this.f214224a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
