package com.avito.android.advert.item.ownership_cost.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OwnershipCostRegionDialogModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.b f77881a;

    public e(com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.b bVar) {
        this.f77881a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.a aVar = (com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.a) this.f77881a.get();
        d.f77880a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
