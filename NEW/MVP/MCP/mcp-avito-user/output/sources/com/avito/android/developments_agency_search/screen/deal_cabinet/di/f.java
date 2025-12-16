package com.avito.android.developments_agency_search.screen.deal_cabinet.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DealCabinetModule_ProvideHorizontalListItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f136978a;

    /* renamed from: b, reason: collision with root package name */
    public final i f136979b;

    public f(dagger.internal.l lVar, i iVar) {
        this.f136978a = lVar;
        this.f136979b = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        Y41.l lVar = (Y41.l) this.f136978a.f393949a;
        com.avito.android.visual_rubricator.element.e eVar = (com.avito.android.visual_rubricator.element.e) this.f136979b.get();
        d.f136975a.getClass();
        com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.deal_update_item.b bVar = new com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.deal_update_item.b(new com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.deal_update_item.d(lVar));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(eVar);
        return c10493a.a();
    }
}
