package com.avito.android.cpx_promo_geo.screens.region_sheet.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.cpx_promo_geo.screens.region_sheet.ui.RegionSheetPerformanceScreen;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RegionSheetModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f128280a;

    public g(l lVar) {
        this.f128280a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f128280a.f393949a;
        f.f128279a.getClass();
        return new C28478k(RegionSheetPerformanceScreen.f128472d, rVar, null, 4, null);
    }
}
