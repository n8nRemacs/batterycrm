package com.avito.android.advert_details_items.price.redesigned;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsPriceBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_details_items.price.c> f85259a;

    public b(Provider<com.avito.android.advert_details_items.price.c> provider) {
        this.f85259a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f85259a.get());
    }
}
