package com.avito.android.loyalty.di.criteria;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TabModule_ProvideHeaderAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f183074a;

    public k(dagger.internal.f fVar) {
        this.f183074a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f183074a.get();
        j jVar = j.f183073a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
