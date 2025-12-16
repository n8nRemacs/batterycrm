package com.avito.android.tariff_select.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff_select.perf.TariffSelectPerfScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffSelectModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f301213a;

    public n(dagger.internal.l lVar) {
        this.f301213a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f301213a.f393949a;
        m.f301212a.getClass();
        TariffSelectPerfScreen tariffSelectPerfScreen = TariffSelectPerfScreen.f301251d;
        tariffSelectPerfScreen.getClass();
        return new C28478k(tariffSelectPerfScreen, rVar, TariffSelectPerfScreen.f301252e);
    }
}
