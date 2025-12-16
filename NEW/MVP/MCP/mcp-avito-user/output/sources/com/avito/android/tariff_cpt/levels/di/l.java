package com.avito.android.tariff_cpt.levels.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff_cpt.TariffCptLevelsV2PerfScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCptLevelsModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f298605a;

    public l(dagger.internal.l lVar) {
        this.f298605a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f298605a.f393949a;
        j.f298602a.getClass();
        return new C28478k(TariffCptLevelsV2PerfScreen.f297512d, rVar, null, 4, null);
    }
}
