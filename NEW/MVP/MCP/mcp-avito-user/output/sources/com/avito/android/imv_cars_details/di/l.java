package com.avito.android.imv_cars_details.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImvCarsDetailsItemModule_Companion_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f169956a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f169957b;

    public l(u uVar, Provider provider) {
        this.f169956a = uVar;
        this.f169957b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f169956a.get();
        com.avito.konveyor.a aVar2 = this.f169957b.get();
        h.f169940a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
