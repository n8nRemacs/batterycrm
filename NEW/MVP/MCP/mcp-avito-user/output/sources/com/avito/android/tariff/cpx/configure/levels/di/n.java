package com.avito.android.tariff.cpx.configure.levels.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.MnzTariffCpxConfigureLevels;
import com.avito.android.analytics.screens.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxConfigureLevelsModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f296126a;

    public n(dagger.internal.l lVar) {
        this.f296126a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f296126a.f393949a;
        l.f296123a.getClass();
        return new C28478k(MnzTariffCpxConfigureLevels.f90410d, rVar, "tariffCpxConfigureLevels");
    }
}
