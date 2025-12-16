package com.avito.android.tariff.cpx.levels.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.TariffCpxLevelsScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxLevelsModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f297062a;

    public k(dagger.internal.l lVar) {
        this.f297062a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f297062a.f393949a;
        i.f297059a.getClass();
        return new C28478k(TariffCpxLevelsScreen.f90531d, rVar, "tariffCpxLevels");
    }
}
