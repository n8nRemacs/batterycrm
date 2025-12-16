package com.avito.android.campaigns_sale_search.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CampaignsSaleSearchKonveyorModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f114522a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f114523b;

    public e(u uVar, Provider provider) {
        this.f114522a = uVar;
        this.f114523b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f114522a.get();
        com.avito.konveyor.a aVar2 = this.f114523b.get();
        d.f114521a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
