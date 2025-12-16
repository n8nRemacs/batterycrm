package com.avito.android.tariff.cpx.level.feature.mvi;

import com.avito.android.tariff.cpx.level.feature.domain.TariffCpxLevelFeatureContent;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxLevelFeatureBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f296993a;

    public g(dagger.internal.l lVar) {
        this.f296993a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((TariffCpxLevelFeatureContent) this.f296993a.f393949a);
    }
}
