package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi;

import Zx.C19616a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxPromoGeoReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class q implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C19616a> f127914a;

    public q(Provider<C19616a> provider) {
        this.f127914a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f127914a.get());
    }
}
