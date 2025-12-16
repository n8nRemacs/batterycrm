package com.avito.android.passport.profile_add.merge.accounts_profile_error;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AccountsProfileErrorModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f212408a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f212409b;

    public e(u uVar, Provider provider) {
        this.f212408a = uVar;
        this.f212409b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f212408a.get();
        com.avito.konveyor.a aVar2 = this.f212409b.get();
        d.f212407a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
