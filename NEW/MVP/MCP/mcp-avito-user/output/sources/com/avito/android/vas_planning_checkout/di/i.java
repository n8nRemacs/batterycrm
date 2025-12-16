package com.avito.android.vas_planning_checkout.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasPlanCheckoutModule_ProvideSimpleRecyclerPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f322874a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f322875b;

    public i(u uVar, Provider provider) {
        this.f322874a = uVar;
        this.f322875b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f322874a.get();
        com.avito.konveyor.a aVar2 = this.f322875b.get();
        d.f322869a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
