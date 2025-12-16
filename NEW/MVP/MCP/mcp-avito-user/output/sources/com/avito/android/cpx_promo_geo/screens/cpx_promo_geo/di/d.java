package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di;

import com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.deeplink.CpxPromoGeoLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CpxPromoGeoDeeplinkMappingsModule_ProvideCpxPromoGeoMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.deeplink.b f127798a;

    public d(com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.deeplink.b bVar) {
        this.f127798a = bVar;
    }

    public static C43834a a(com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.deeplink.b bVar) {
        c.f127797a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CpxPromoGeoLink.class, new com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CpxPromoGeoLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f127798a);
    }
}
