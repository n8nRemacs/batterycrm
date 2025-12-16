package com.avito.android.loyalty.di.quality_service;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: QualityServiceModule_ProvideAdapterPresenter$_avito_loyalty_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f183164a;

    public k(dagger.internal.f fVar) {
        this.f183164a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f183164a.get();
        i.f183161a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
