package com.avito.android.cpx_promo_geo.screens.region_sheet.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RegionSheetActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpx_promo_geo.screens.region_sheet.domain.b f128439a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.cpx_promo_geo.screens.region_sheet.domain.h f128440b;

    public f(com.avito.android.cpx_promo_geo.screens.region_sheet.domain.b bVar, com.avito.android.cpx_promo_geo.screens.region_sheet.domain.h hVar) {
        this.f128439a = bVar;
        this.f128440b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.cpx_promo_geo.screens.region_sheet.domain.a) this.f128439a.get(), (com.avito.android.cpx_promo_geo.screens.region_sheet.domain.c) this.f128440b.get());
    }
}
