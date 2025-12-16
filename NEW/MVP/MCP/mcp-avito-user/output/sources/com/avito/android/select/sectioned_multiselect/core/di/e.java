package com.avito.android.select.sectioned_multiselect.core.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SectionedMultiselectModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f266619a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f266620b;

    public e(dagger.internal.f fVar, Provider provider) {
        this.f266619a = fVar;
        this.f266620b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.c cVar = (com.avito.android.recycler.data_aware.c) this.f266619a.get();
        com.avito.konveyor.a aVar = this.f266620b.get();
        d.f266618a.getClass();
        return new com.avito.konveyor.adapter.j(cVar, aVar);
    }
}
