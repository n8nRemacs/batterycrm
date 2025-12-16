package com.avito.android.travel_payment_selector.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentSelectorModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class q implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final g f302624a;

    /* renamed from: b, reason: collision with root package name */
    public final u f302625b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f302626c;

    public q(g gVar, u uVar, Provider provider) {
        this.f302624a = gVar;
        this.f302625b = uVar;
        this.f302626c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f302625b.get();
        com.avito.konveyor.a aVar2 = this.f302626c.get();
        this.f302624a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
