package com.avito.android.tariff_cpt.levels.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCptLevelsListModule_ProvideItemBinder$_avito_tariff_cpt_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.levels.ui.items.business_tool.c f298595a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.levels.ui.items.business_tools_header.c f298596b;

    public e(com.avito.android.tariff_cpt.levels.ui.items.business_tool.c cVar, com.avito.android.tariff_cpt.levels.ui.items.business_tools_header.c cVar2) {
        this.f298595a = cVar;
        this.f298596b = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.tariff_cpt.levels.ui.items.business_tool.b bVar = (com.avito.android.tariff_cpt.levels.ui.items.business_tool.b) this.f298595a.get();
        com.avito.android.tariff_cpt.levels.ui.items.business_tools_header.b bVar2 = (com.avito.android.tariff_cpt.levels.ui.items.business_tools_header.b) this.f298596b.get();
        c.f298593a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        return c10493a.a();
    }
}
