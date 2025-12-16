package com.avito.android.sx_address.list.di;

import javax.inject.Provider;

/* compiled from: SxAddressListAddressAdapterModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f293107a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f293108b;

    public i(dagger.internal.u uVar, Provider provider) {
        this.f293107a = uVar;
        this.f293108b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f293107a.get();
        com.avito.konveyor.a aVar2 = this.f293108b.get();
        e.f293103a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
