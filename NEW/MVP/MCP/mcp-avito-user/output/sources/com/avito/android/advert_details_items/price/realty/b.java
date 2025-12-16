package com.avito.android.advert_details_items.price.realty;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsNormalizedAndHistoryPricesBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f85233a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f85234b;

    public b(g gVar, Provider provider) {
        this.f85233a = gVar;
        this.f85234b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((f) this.f85233a.get(), this.f85234b.get());
    }
}
