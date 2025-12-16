package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui;

import com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.k;
import com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.l;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: CpxPromoGeoViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final l f128247a;

    public h(l lVar) {
        this.f128247a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k kVar = (k) this.f128247a.get();
        i2.f411430a.getClass();
        return new g(kVar, i2.a.f411433c);
    }
}
