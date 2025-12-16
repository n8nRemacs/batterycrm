package com.avito.android.mortgage.root.di;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MortgageRootModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f202294a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f202295b;

    /* renamed from: c, reason: collision with root package name */
    public final Z00.b f202296c;

    public e(Provider provider, Provider provider2, Z00.b bVar) {
        this.f202294a = provider;
        this.f202295b = provider2;
        this.f202296c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f202294a.get();
        com.avito.konveyor.a aVar2 = this.f202295b.get();
        Z00.a aVar3 = (Z00.a) this.f202296c.get();
        d.f202293a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, aVar3);
    }
}
