package com.avito.android.tariff.cpx.info.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff.cpx.info.TariffCpxInfoScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxInfoModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f296417a;

    public n(dagger.internal.l lVar) {
        this.f296417a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f296417a.f393949a;
        l.f296414a.getClass();
        TariffCpxInfoScreen tariffCpxInfoScreen = TariffCpxInfoScreen.f296259d;
        tariffCpxInfoScreen.getClass();
        return new C28478k(tariffCpxInfoScreen, rVar, TariffCpxInfoScreen.f296260e);
    }
}
