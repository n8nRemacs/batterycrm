package com.avito.android.bbl.screens.configure.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BblConfigureListModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f99155a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f99156b;

    public j(u uVar, Provider provider) {
        this.f99155a = uVar;
        this.f99156b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f99155a.get();
        com.avito.konveyor.a aVar2 = this.f99156b.get();
        g.f99151a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
