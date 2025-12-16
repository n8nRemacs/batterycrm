package com.avito.android.tariff_cpt.level_feature.mvi;

import com.avito.android.tariff_cpt.level_feature.domain.TariffCptLevelFeatureContent;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCptLevelFeatureBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f298491a;

    public g(dagger.internal.l lVar) {
        this.f298491a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((TariffCptLevelFeatureContent) this.f298491a.f393949a);
    }
}
