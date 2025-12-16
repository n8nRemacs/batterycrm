package com.avito.android.mortgage.applications_list.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ApplicationsListModule_ProvideApplicationsListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final b f198367a;

    /* renamed from: b, reason: collision with root package name */
    public final u f198368b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f198369c;

    public d(b bVar, u uVar, Provider provider) {
        this.f198367a = bVar;
        this.f198368b = uVar;
        this.f198369c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f198368b.get();
        com.avito.konveyor.a aVar2 = this.f198369c.get();
        this.f198367a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
