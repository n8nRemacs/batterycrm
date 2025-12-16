package com.avito.android.tariff.cpx.configure.landing.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.MnzTariffCpxConfigureLanding;
import com.avito.android.analytics.screens.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxConfigureLandingModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f295908a;

    public k(dagger.internal.l lVar) {
        this.f295908a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f295908a.f393949a;
        j.f295907a.getClass();
        MnzTariffCpxConfigureLanding mnzTariffCpxConfigureLanding = MnzTariffCpxConfigureLanding.f90408d;
        mnzTariffCpxConfigureLanding.getClass();
        return new C28478k(mnzTariffCpxConfigureLanding, rVar, MnzTariffCpxConfigureLanding.f90409e);
    }
}
