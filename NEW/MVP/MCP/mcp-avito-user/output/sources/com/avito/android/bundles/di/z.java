package com.avito.android.bundles.di;

import javax.inject.Provider;

/* compiled from: VasBundlesModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class z implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f108322a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f108323b;

    public z(dagger.internal.u uVar, Provider provider) {
        this.f108322a = uVar;
        this.f108323b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f108322a.get();
        com.avito.konveyor.a aVar2 = this.f108323b.get();
        t tVar = t.f108315a;
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
