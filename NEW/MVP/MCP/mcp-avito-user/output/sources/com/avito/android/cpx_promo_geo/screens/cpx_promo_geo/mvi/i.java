package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxPromoGeoBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.c f127897a;

    public i(com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.c cVar) {
        this.f127897a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.b) this.f127897a.get());
    }
}
