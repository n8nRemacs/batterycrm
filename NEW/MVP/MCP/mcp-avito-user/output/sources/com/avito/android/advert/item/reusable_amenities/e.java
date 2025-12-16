package com.avito.android.advert.item.reusable_amenities;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AmenitiesItemFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f78611a;

    public e(Provider<com.avito.android.advert.item.similars.j> provider) {
        this.f78611a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f78611a.get());
    }
}
