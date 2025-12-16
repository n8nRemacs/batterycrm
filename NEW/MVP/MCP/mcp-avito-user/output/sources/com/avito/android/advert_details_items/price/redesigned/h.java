package com.avito.android.advert_details_items.price.redesigned;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsPriceGoodsDiscountHintBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_details_items.price.c> f85271a;

    public h(Provider<com.avito.android.advert_details_items.price.c> provider) {
        this.f85271a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f85271a.get());
    }
}
