package com.avito.android.select.sectioned_multiselect.tab.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SectionedMultiselectTabModule_ProvideVerticalAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f266763a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f266764b;

    public j(u uVar, Provider provider) {
        this.f266763a = uVar;
        this.f266764b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.c cVar = (com.avito.android.recycler.data_aware.c) this.f266763a.get();
        com.avito.konveyor.a aVar = this.f266764b.get();
        e.f266751a.getClass();
        return new com.avito.konveyor.adapter.j(cVar, aVar);
    }
}
