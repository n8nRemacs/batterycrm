package com.avito.android.profile.pro.impl.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileProModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final f f222606a;

    /* renamed from: b, reason: collision with root package name */
    public final u f222607b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f222608c;

    public h(f fVar, u uVar, Provider provider) {
        this.f222606a = fVar;
        this.f222607b = uVar;
        this.f222608c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f222607b.get();
        com.avito.konveyor.a aVar2 = this.f222608c.get();
        this.f222606a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
