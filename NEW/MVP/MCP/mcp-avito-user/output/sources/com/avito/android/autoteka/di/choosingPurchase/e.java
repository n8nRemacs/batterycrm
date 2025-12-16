package com.avito.android.autoteka.di.choosingPurchase;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaChoosingPurchaseModule_Companion_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f96344a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f96345b;

    public e(u uVar, Provider provider) {
        this.f96344a = uVar;
        this.f96345b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f96344a.get();
        com.avito.konveyor.a aVar2 = this.f96345b.get();
        b.f96335a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
