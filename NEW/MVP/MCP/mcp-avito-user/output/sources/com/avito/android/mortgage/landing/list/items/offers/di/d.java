package com.avito.android.mortgage.landing.list.items.offers.di;

import com.avito.android.recycler.data_aware.g;
import com.avito.android.recycler.data_aware.i;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OffersViewModule_ProvideDiffCalculatorFactory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.landing.list.items.offers.offer.payload.c f199813a;

    public d(com.avito.android.mortgage.landing.list.items.offers.offer.payload.c cVar) {
        this.f199813a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.mortgage.landing.list.items.offers.offer.payload.b bVar = (com.avito.android.mortgage.landing.list.items.offers.offer.payload.b) this.f199813a.get();
        int i12 = c.f199812a;
        return new i(new g(), new com.avito.android.mortgage.landing.list.items.offers.offer.c(), false, bVar);
    }
}
