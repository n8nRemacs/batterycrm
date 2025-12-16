package com.avito.android.cpx_promo.impl.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxPromoReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpx_promo.c f127245a;

    public v(com.avito.android.cpx_promo.c cVar) {
        this.f127245a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u((com.avito.android.cpx_promo.b) this.f127245a.get());
    }
}
