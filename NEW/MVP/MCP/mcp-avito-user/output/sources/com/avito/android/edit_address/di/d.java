package com.avito.android.edit_address.di;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditAddressModule_ProvideAdapterFactory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f145855a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f145856b;

    public d(u uVar, Provider provider) {
        this.f145855a = uVar;
        this.f145856b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f145855a.get();
        com.avito.konveyor.a aVar2 = this.f145856b.get();
        c.f145854a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
