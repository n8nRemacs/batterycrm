package com.avito.android.tariff_cpt.configure.migration.di;

import com.avito.android.tariff_cpt.configure.migration.deeplink.TariffCptMigrationLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffCptMigrationDeeplinkMappingsModule_ProvideCptMigrationMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.configure.migration.deeplink.b f298056a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.configure.migration.deeplink.d f298057b;

    public j(com.avito.android.tariff_cpt.configure.migration.deeplink.b bVar, com.avito.android.tariff_cpt.configure.migration.deeplink.d dVar) {
        this.f298056a = bVar;
        this.f298057b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f298057b.getClass();
        com.avito.android.tariff_cpt.configure.migration.deeplink.c cVar = new com.avito.android.tariff_cpt.configure.migration.deeplink.c();
        com.avito.android.tariff_cpt.configure.migration.deeplink.b bVar = this.f298056a;
        i.f298055a.getClass();
        return new C43834a(TariffCptMigrationLink.class, cVar, new C43834a.b.C11809b(bVar));
    }
}
