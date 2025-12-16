package com.avito.android.tariff.cpx.info.limits.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff.cpx.info.limits.TariffCpxInfoLimitsPerformanceScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxInfoLimitsModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f296596a;

    public i(l lVar) {
        this.f296596a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f296596a.f393949a;
        h.f296595a.getClass();
        return new C28478k(TariffCpxInfoLimitsPerformanceScreen.f296574d, rVar, null, 4, null);
    }
}
