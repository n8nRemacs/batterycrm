package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.CpxPromoGeoPerformanceScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxPromoGeoModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f127802a;

    public i(dagger.internal.l lVar) {
        this.f127802a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f127802a.f393949a;
        h.f127801a.getClass();
        return new C28478k(CpxPromoGeoPerformanceScreen.f127930d, rVar, null, 4, null);
    }
}
