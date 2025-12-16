package com.avito.android.screens.bbip_private.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sp0.C48393a;

/* compiled from: BbipPrivateListModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f260495a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f260496b;

    public j(u uVar, Provider provider) {
        this.f260495a = uVar;
        this.f260496b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f260495a.get();
        com.avito.konveyor.a aVar2 = this.f260496b.get();
        f.f260489a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, new C48393a());
    }
}
