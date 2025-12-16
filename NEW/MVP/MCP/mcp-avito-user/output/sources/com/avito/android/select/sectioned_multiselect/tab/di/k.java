package com.avito.android.select.sectioned_multiselect.tab.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SectionedMultiselectTabModule_ProvideVerticalDataAwareAdapterPresenter$_avito_select_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f266765a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f266766b;

    /* renamed from: c, reason: collision with root package name */
    public final u f266767c;

    public k(u uVar, Provider provider, Provider provider2) {
        this.f266765a = provider;
        this.f266766b = provider2;
        this.f266767c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f266765a);
        com.avito.konveyor.adapter.a aVar = this.f266766b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f266767c.get();
        e.f266751a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, aVar, eVar);
    }
}
