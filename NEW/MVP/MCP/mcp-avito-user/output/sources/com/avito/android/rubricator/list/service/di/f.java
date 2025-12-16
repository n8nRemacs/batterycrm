package com.avito.android.rubricator.list.service.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceListModule_ProvideDataAwareAdapterPresenterImpl$_avito_discouraged_avito_libs_serp_core_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f255973a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f255974b;

    /* renamed from: c, reason: collision with root package name */
    public final u f255975c;

    public f(u uVar, Provider provider, Provider provider2) {
        this.f255973a = provider;
        this.f255974b = provider2;
        this.f255975c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f255973a);
        com.avito.konveyor.adapter.h hVar = this.f255974b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f255975c.get();
        e.f255972a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
