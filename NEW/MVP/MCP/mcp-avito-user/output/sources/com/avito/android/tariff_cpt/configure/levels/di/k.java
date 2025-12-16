package com.avito.android.tariff_cpt.configure.levels.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff_cpt.TariffCptConfigureLevelsPerfScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCptConfigureLevelsModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f297860a;

    public k(l lVar) {
        this.f297860a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f297860a.f393949a;
        i.f297857a.getClass();
        return new C28478k(TariffCptConfigureLevelsPerfScreen.f297503d, rVar, null, 4, null);
    }
}
