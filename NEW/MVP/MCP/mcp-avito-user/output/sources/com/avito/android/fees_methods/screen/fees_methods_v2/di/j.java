package com.avito.android.fees_methods.screen.fees_methods_v2.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FeesMethodsV2ListModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f158252a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f158253b;

    public j(u uVar, Provider provider) {
        this.f158252a = uVar;
        this.f158253b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f158252a.get();
        com.avito.konveyor.a aVar2 = this.f158253b.get();
        g.f158244a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
