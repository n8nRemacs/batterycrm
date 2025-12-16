package com.avito.android.tariff.cpx.info.advance.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff.cpx.info.advance.TariffCpxAdvanceInfoScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxInfoAdvanceModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f296330a;

    public h(l lVar) {
        this.f296330a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f296330a.f393949a;
        f.f296327a.getClass();
        TariffCpxAdvanceInfoScreen tariffCpxAdvanceInfoScreen = TariffCpxAdvanceInfoScreen.f296261d;
        tariffCpxAdvanceInfoScreen.getClass();
        return new C28478k(tariffCpxAdvanceInfoScreen, rVar, TariffCpxAdvanceInfoScreen.f296262e);
    }
}
