package com.avito.android.advert_details_items.price.redesigned;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsPriceGoodsRestyleBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_details_items.price.c> f85275a;

    public j(Provider<com.avito.android.advert_details_items.price.c> provider) {
        this.f85275a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f85275a.get());
    }
}
