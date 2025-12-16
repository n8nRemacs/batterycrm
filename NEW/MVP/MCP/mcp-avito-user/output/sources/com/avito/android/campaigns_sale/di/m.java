package com.avito.android.campaigns_sale.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CampaignsSaleKonveyorModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f113911a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f113912b;

    public m(u uVar, Provider provider) {
        this.f113911a = uVar;
        this.f113912b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f113911a.get();
        com.avito.konveyor.a aVar2 = this.f113912b.get();
        l.f113910a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, new k());
    }
}
