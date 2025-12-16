package com.avito.android.tariff.cpx.level.feature.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.MnzTariffCpxLevelFeature;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxLevelFeatureModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f296971a;

    public g(l lVar) {
        this.f296971a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f296971a.f393949a;
        e.f296968a.getClass();
        return new C28478k(MnzTariffCpxLevelFeature.f90411d, rVar, "tariffCpxLevelFeature");
    }
}
