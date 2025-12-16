package com.avito.android.validation;

import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideDiffCalculatorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class J implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.recycler.data_aware.b> f319268a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f319269b;

    public J(dagger.internal.u uVar, Provider provider) {
        this.f319268a = provider;
        this.f319269b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.b bVar = this.f319268a.get();
        com.avito.android.recycler.data_aware.a aVar = (com.avito.android.recycler.data_aware.a) this.f319269b.get();
        A.f319242a.getClass();
        return new com.avito.android.recycler.data_aware.i(bVar, null, true, aVar, 2, null);
    }
}
