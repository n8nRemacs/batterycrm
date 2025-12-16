package com.avito.android.user_advert.di;

import javax.inject.Provider;

/* compiled from: MyAdvertItemsModule_ProvideDataAwareAdapterPresenterImpl$_avito_user_advert_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class E implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<androidx.recyclerview.widget.C> f310794a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f310795b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f310796c;

    public E(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f310794a = provider;
        this.f310795b = provider2;
        this.f310796c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f310794a);
        com.avito.konveyor.adapter.h hVar = this.f310795b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f310796c.get();
        B.f310787a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
