package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.deeplink;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxPromoGeoDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f127796a;

    public b(com.avito.android.paid_services_impl.e eVar) {
        this.f127796a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.paid_services.a) this.f127796a.get());
    }
}
