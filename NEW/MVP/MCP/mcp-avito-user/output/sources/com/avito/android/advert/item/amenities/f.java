package com.avito.android.advert.item.amenities;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAmenitiesPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<G5.a> f72760a;

    public f(Provider<G5.a> provider) {
        this.f72760a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f72760a.get());
    }
}
