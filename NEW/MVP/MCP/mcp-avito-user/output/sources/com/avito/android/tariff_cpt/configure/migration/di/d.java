package com.avito.android.tariff_cpt.configure.migration.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptMigrationModule_ProvideItemBinder$_avito_tariff_cpt_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.common.item.screen_title.c f298024a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.configure.migration.item.terms.c f298025b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.common.item.button.c f298026c;

    public d(com.avito.android.tariff_cpt.common.item.screen_title.c cVar, com.avito.android.tariff_cpt.configure.migration.item.terms.c cVar2, com.avito.android.tariff_cpt.common.item.button.c cVar3) {
        this.f298024a = cVar;
        this.f298025b = cVar2;
        this.f298026c = cVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.tariff_cpt.common.item.screen_title.b bVar = (com.avito.android.tariff_cpt.common.item.screen_title.b) this.f298024a.get();
        com.avito.android.tariff_cpt.configure.migration.item.terms.b bVar2 = (com.avito.android.tariff_cpt.configure.migration.item.terms.b) this.f298025b.get();
        com.avito.android.tariff_cpt.common.item.button.b bVar3 = (com.avito.android.tariff_cpt.common.item.button.b) this.f298026c.get();
        b.f298022a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(bVar3);
        return c10493a.a();
    }
}
