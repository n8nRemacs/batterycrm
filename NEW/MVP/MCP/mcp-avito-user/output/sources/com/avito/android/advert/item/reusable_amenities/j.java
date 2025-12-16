package com.avito.android.advert.item.reusable_amenities;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AmenitiesPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<B7.a> f78616a;

    public j(Provider<B7.a> provider) {
        this.f78616a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f78616a.get());
    }
}
