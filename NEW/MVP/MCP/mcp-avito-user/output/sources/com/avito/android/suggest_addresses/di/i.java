package com.avito.android.suggest_addresses.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuggestAddressesModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f291822a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f291823b;

    public i(u uVar, Provider provider) {
        this.f291822a = uVar;
        this.f291823b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f291822a.get();
        com.avito.konveyor.a aVar2 = this.f291823b.get();
        f.f291819a.getClass();
        return new j(aVar, aVar2);
    }
}
