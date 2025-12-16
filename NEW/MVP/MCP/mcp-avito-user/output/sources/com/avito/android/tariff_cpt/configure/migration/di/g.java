package com.avito.android.tariff_cpt.configure.migration.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff_cpt.TariffCptMigrationScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptMigrationModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f298032a;

    public g(l lVar) {
        this.f298032a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f298032a.f393949a;
        b.f298022a.getClass();
        TariffCptMigrationScreen tariffCptMigrationScreen = TariffCptMigrationScreen.f297513d;
        tariffCptMigrationScreen.getClass();
        return new C28478k(tariffCptMigrationScreen, rVar, TariffCptMigrationScreen.f297514e);
    }
}
