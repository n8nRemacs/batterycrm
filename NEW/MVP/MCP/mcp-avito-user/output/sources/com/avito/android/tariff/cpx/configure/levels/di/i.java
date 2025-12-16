package com.avito.android.tariff.cpx.configure.levels.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxConfigureLevelsListModule_ProvideItemBinder$_avito_tariff_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.configure.levels.items.header.c f296117a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.configure.levels.items.level_cards.c f296118b;

    public i(com.avito.android.tariff.cpx.configure.levels.items.header.c cVar, com.avito.android.tariff.cpx.configure.levels.items.level_cards.c cVar2) {
        this.f296117a = cVar;
        this.f296118b = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.tariff.cpx.configure.levels.items.header.b bVar = (com.avito.android.tariff.cpx.configure.levels.items.header.b) this.f296117a.get();
        com.avito.android.tariff.cpx.configure.levels.items.level_cards.b bVar2 = (com.avito.android.tariff.cpx.configure.levels.items.level_cards.b) this.f296118b.get();
        g.f296115a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        return c10493a.a();
    }
}
