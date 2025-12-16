package com.avito.android.cpx_promo_geo.screens.region_sheet.ui;

import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.k;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: RegionSheetViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final k f128552a;

    public j(k kVar) {
        this.f128552a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.j jVar = (com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.j) this.f128552a.get();
        i2.f411430a.getClass();
        return new i(jVar, i2.a.f411433c);
    }
}
