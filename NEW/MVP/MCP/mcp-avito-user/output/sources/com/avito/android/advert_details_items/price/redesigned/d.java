package com.avito.android.advert_details_items.price.redesigned;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsPriceBuyerBonusesBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert_details_items.price.c> f85263a;

    public d(Provider<com.avito.android.advert_details_items.price.c> provider) {
        this.f85263a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f85263a.get());
    }
}
