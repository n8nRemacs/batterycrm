package com.avito.android.tariff_cpt.configure.levels.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCptConfigureLevelsListModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.configure.levels.ui.items.header.c f297853a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.b f297854b;

    public g(com.avito.android.tariff_cpt.configure.levels.ui.items.header.c cVar, com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.b bVar) {
        this.f297853a = cVar;
        this.f297854b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.tariff_cpt.configure.levels.ui.items.header.b bVar = (com.avito.android.tariff_cpt.configure.levels.ui.items.header.b) this.f297853a.get();
        com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.a aVar = (com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards.a) this.f297854b.get();
        e.f297851a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(aVar);
        return c10493a.a();
    }
}
