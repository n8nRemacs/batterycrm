package com.avito.android.sx_address.selectaddresslist.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectAddressListModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f294060a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f294061b;

    public j(u uVar, Provider provider) {
        this.f294060a = uVar;
        this.f294061b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f294060a.get();
        com.avito.konveyor.a aVar2 = this.f294061b.get();
        d.f294054a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
