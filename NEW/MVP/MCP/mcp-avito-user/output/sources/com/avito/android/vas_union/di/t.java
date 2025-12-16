package com.avito.android.vas_union.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasUnionV2Module_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class t implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f323191a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f323192b;

    public t(dagger.internal.u uVar, Provider provider) {
        this.f323191a = uVar;
        this.f323192b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f323191a.get();
        com.avito.konveyor.a aVar2 = this.f323192b.get();
        q.f323183a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
