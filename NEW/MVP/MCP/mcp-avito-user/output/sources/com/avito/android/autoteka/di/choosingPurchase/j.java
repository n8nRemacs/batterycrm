package com.avito.android.autoteka.di.choosingPurchase;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaFullscreenChoosingPurchaseModule_Companion_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f96355a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f96356b;

    public j(u uVar, Provider provider) {
        this.f96355a = uVar;
        this.f96356b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f96355a.get();
        com.avito.konveyor.a aVar2 = this.f96356b.get();
        g.f96346a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
