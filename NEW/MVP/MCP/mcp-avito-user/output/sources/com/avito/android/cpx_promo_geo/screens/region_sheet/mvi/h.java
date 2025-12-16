package com.avito.android.cpx_promo_geo.screens.region_sheet.mvi;

import com.avito.android.cpx_promo_geo.screens.region_sheet.RegionSheetData;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RegionSheetBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f128445a;

    public h(dagger.internal.l lVar) {
        this.f128445a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((RegionSheetData) this.f128445a.f393949a);
    }
}
