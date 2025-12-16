package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxPromoGeoActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.c f127892a;

    /* renamed from: b, reason: collision with root package name */
    public final u f127893b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.f f127894c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f127895d;

    public g(com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.c cVar, u uVar, com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.f fVar, Provider provider) {
        this.f127892a = cVar;
        this.f127893b = uVar;
        this.f127894c = fVar;
        this.f127895d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.b) this.f127892a.get(), (com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.a) this.f127893b.get(), (com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.e) this.f127894c.get(), this.f127895d.get());
    }
}
