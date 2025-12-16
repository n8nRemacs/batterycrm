package com.avito.android.profile.remove.screen.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RemoveItemListModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f224034a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f224035b;

    public g(u uVar, Provider provider) {
        this.f224034a = uVar;
        this.f224035b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f224034a.get();
        com.avito.konveyor.a aVar2 = this.f224035b.get();
        f.f224033a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
