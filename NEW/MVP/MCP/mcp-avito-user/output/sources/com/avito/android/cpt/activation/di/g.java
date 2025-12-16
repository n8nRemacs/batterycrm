package com.avito.android.cpt.activation.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptActivationModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f126237a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f126238b;

    public g(u uVar, Provider provider) {
        this.f126237a = uVar;
        this.f126238b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f126237a.get();
        com.avito.konveyor.a aVar2 = this.f126238b.get();
        d.f126229a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
