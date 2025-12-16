package com.avito.android.comfortable_deal.deal.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DealAdapterModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f121060a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f121061b;

    public h(u uVar, Provider provider) {
        this.f121060a = uVar;
        this.f121061b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f121060a.get();
        com.avito.konveyor.a aVar2 = this.f121061b.get();
        int i12 = b.f121052a;
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
