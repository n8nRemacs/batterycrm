package com.avito.android.comparison.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ComparisonModule_ProvideBodyAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f123843a;

    public k(Provider<com.avito.konveyor.a> provider) {
        this.f123843a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f123843a.get();
        j.f123842a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
