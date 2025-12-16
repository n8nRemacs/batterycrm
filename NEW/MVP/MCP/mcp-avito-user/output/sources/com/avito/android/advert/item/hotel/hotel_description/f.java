package com.avito.android.advert.item.hotel.hotel_description;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertHotelDescriptionPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<G5.a> f75856a;

    public f(Provider<G5.a> provider) {
        this.f75856a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f75856a.get());
    }
}
