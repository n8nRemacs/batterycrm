package com.avito.android.parameters_sheet.di;

import androidx.recyclerview.widget.C;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ParametersListDialogModule_ProvideDataAwareAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f210767a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f210768b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f210769c;

    public h(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f210767a = provider;
        this.f210768b = provider2;
        this.f210769c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f210767a);
        com.avito.konveyor.adapter.a aVar = this.f210768b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f210769c.get();
        d.f210761a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, aVar, eVar);
    }
}
