package com.avito.android.cpx_promo_geo.screens.region_sheet.di;

import com.avito.android.cpx_promo_geo.screens.region_sheet.deeplink.RegionSheetLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: RegionSheetDeeplinkMappingsModule_ProvideRegionSheetMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpx_promo_geo.screens.region_sheet.deeplink.c f128278a;

    public d(com.avito.android.cpx_promo_geo.screens.region_sheet.deeplink.c cVar) {
        this.f128278a = cVar;
    }

    public static C43834a a(com.avito.android.cpx_promo_geo.screens.region_sheet.deeplink.c cVar) {
        c.f128277a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(RegionSheetLink.class, new com.avito.android.cpx_promo_geo.screens.region_sheet.deeplink.f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(RegionSheetLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f128278a);
    }
}
