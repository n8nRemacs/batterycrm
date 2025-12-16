package com.avito.android.advert_details_items.price.redesigned;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsPriceGoodsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_details_items.price.c> f85267a;

    public f(Provider<com.avito.android.advert_details_items.price.c> provider) {
        this.f85267a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f85267a.get());
    }
}
