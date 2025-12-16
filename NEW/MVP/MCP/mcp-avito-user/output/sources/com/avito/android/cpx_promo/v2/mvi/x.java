package com.avito.android.cpx_promo.v2.mvi;

import dagger.internal.y;

/* compiled from: CpxPromoV2Reducer_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpx_promo.c f127780a;

    public x(com.avito.android.cpx_promo.c cVar) {
        this.f127780a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w((com.avito.android.cpx_promo.b) this.f127780a.get());
    }
}
