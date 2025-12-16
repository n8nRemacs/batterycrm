package com.avito.android.tariff_cpt.level_feature.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff_cpt.TariffCptLevelFeaturePerfScreen;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCptLevelFeatureModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f298469a;

    public g(l lVar) {
        this.f298469a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f298469a.f393949a;
        e.f298466a.getClass();
        return new C28478k(TariffCptLevelFeaturePerfScreen.f297509d, rVar, null, 4, null);
    }
}
