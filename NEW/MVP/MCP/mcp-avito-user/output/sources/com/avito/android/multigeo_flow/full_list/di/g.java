package com.avito.android.multigeo_flow.full_list.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobMultiGeoFullListModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f206908a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f206909b;

    public g(u uVar, Provider provider) {
        this.f206908a = uVar;
        this.f206909b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f206908a.get();
        com.avito.konveyor.a aVar2 = this.f206909b.get();
        d.f206905a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
