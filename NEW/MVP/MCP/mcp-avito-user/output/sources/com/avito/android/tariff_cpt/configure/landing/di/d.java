package com.avito.android.tariff_cpt.configure.landing.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff_cpt.TariffCptConfigureLandingScreen;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCptConfigureLandingModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f297754a;

    public d(l lVar) {
        this.f297754a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f297754a.f393949a;
        c.f297753a.getClass();
        TariffCptConfigureLandingScreen tariffCptConfigureLandingScreen = TariffCptConfigureLandingScreen.f297501d;
        tariffCptConfigureLandingScreen.getClass();
        return new C28478k(tariffCptConfigureLandingScreen, rVar, TariffCptConfigureLandingScreen.f297502e);
    }
}
