package com.avito.android.tariff_cpt.info.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff_cpt.TariffCptInfoV2PerfScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptInfoV2Module_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f298178a;

    public k(dagger.internal.l lVar) {
        this.f298178a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f298178a.f393949a;
        j.f298177a.getClass();
        return new C28478k(TariffCptInfoV2PerfScreen.f297507d, rVar, null, 4, null);
    }
}
