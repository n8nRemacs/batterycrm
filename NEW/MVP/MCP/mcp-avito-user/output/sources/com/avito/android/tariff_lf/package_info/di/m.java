package com.avito.android.tariff_lf.package_info.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff_lf.TariffPackageInfoScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffPackageInfoModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f299225a;

    public m(dagger.internal.l lVar) {
        this.f299225a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f299225a.f393949a;
        h.f299220a.getClass();
        TariffPackageInfoScreen tariffPackageInfoScreen = TariffPackageInfoScreen.f298722d;
        tariffPackageInfoScreen.getClass();
        return new C28478k(tariffPackageInfoScreen, rVar, TariffPackageInfoScreen.f298723e);
    }
}
