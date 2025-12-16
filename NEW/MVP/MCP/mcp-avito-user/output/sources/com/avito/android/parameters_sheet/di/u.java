package com.avito.android.parameters_sheet.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ParametersListDialogModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class u implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f210808a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f210809b;

    public u(dagger.internal.u uVar, Provider provider) {
        this.f210808a = uVar;
        this.f210809b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.c cVar = (com.avito.android.recycler.data_aware.c) this.f210808a.get();
        com.avito.konveyor.a aVar = this.f210809b.get();
        d.f210761a.getClass();
        return new com.avito.konveyor.adapter.j(cVar, aVar);
    }
}
