package com.avito.android.mortgage.landing.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LandingAdapterModule_ProvideDataAwareAdapterPresenterImplFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f199606a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f199607b;

    /* renamed from: c, reason: collision with root package name */
    public final u f199608c;

    public e(u uVar, Provider provider, Provider provider2) {
        this.f199606a = provider;
        this.f199607b = provider2;
        this.f199608c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f199606a);
        com.avito.konveyor.adapter.h hVar = this.f199607b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f199608c.get();
        int i12 = c.f199604a;
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
