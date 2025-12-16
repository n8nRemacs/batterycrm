package com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MyAddressAddressesListModule_ProvideSimpleRecyclerAdapterFactory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f309697a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f309698b;

    public c(u uVar, Provider provider) {
        this.f309697a = uVar;
        this.f309698b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f309697a.get();
        com.avito.konveyor.a aVar2 = this.f309698b.get();
        b.f309696a.getClass();
        return new j(aVar, aVar2);
    }
}
