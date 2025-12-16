package com.avito.android.tariff_lf.edit_info.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.tariff_lf.TariffEditInfoScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EditInfoModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f298862a;

    public j(dagger.internal.l lVar) {
        this.f298862a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f298862a.f393949a;
        c.f298839a.getClass();
        TariffEditInfoScreen tariffEditInfoScreen = TariffEditInfoScreen.f298720d;
        tariffEditInfoScreen.getClass();
        return new C28478k(tariffEditInfoScreen, rVar, TariffEditInfoScreen.f298721e);
    }
}
