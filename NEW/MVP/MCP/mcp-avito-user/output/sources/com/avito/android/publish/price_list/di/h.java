package com.avito.android.publish.price_list.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectPriceListItemsModule_ProvideDiffCalculator$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.publish.price_list.items.diff.c f238497a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.publish.price_list.items.diff.e f238498b;

    public h(com.avito.android.publish.price_list.items.diff.c cVar, com.avito.android.publish.price_list.items.diff.e eVar) {
        this.f238497a = cVar;
        this.f238498b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.price_list.items.diff.b bVar = (com.avito.android.publish.price_list.items.diff.b) this.f238497a.get();
        com.avito.android.publish.price_list.items.diff.d dVar = (com.avito.android.publish.price_list.items.diff.d) this.f238498b.get();
        e.f238492a.getClass();
        return new com.avito.android.recycler.data_aware.i(bVar, null, false, dVar, 2, null);
    }
}
