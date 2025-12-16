package com.avito.android.comfortable_deal.deal.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DealAdapterModule_ProvideDataAwareAdapterPresenterImplFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f121054a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f121055b;

    /* renamed from: c, reason: collision with root package name */
    public final u f121056c;

    public d(u uVar, Provider provider, Provider provider2) {
        this.f121054a = provider;
        this.f121055b = provider2;
        this.f121056c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f121054a);
        com.avito.konveyor.adapter.h hVar = this.f121055b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f121056c.get();
        int i12 = b.f121052a;
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
