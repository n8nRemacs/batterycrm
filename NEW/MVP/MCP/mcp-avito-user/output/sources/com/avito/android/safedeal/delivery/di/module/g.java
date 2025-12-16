package com.avito.android.safedeal.delivery.di.module;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RdsOrderCancellationBlueprintsModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f256067a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f256068b;

    public g(u uVar, Provider provider) {
        this.f256067a = uVar;
        this.f256068b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f256067a.get();
        com.avito.konveyor.a aVar2 = this.f256068b.get();
        a.f256059a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
