package com.avito.android.advert.item.ownership_cost.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OwnershipCostRegionDialogModule_ProvideSimpleAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f77883a;

    public g(u uVar) {
        this.f77883a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f77883a.get();
        d.f77880a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
