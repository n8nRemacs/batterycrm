package com.avito.android.sx_address.list.di;

import javax.inject.Provider;

/* compiled from: SxAddressListPromoAdapterModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class y implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f293119a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f293120b;

    public y(dagger.internal.u uVar, Provider provider) {
        this.f293119a = uVar;
        this.f293120b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f293119a.get();
        com.avito.konveyor.a aVar2 = this.f293120b.get();
        u.f293115a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
