package com.avito.android.tariff.cpr.configure.advance.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.tariff.cpr.configure.advance.TariffCprConfigureAdvancePerfScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CprConfigureModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class q implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f295228a;

    public q(dagger.internal.l lVar) {
        this.f295228a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f295228a.f393949a;
        o.f295225a.getClass();
        return new C28478k(TariffCprConfigureAdvancePerfScreen.f295201d, rVar, "cprConfigureAdvance");
    }
}
