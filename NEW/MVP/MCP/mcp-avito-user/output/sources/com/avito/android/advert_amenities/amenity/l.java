package com.avito.android.advert_amenities.amenity;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AmenityViewFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f81141a;

    /* renamed from: b, reason: collision with root package name */
    public final u f81142b;

    public l(u uVar, Provider provider) {
        this.f81141a = provider;
        this.f81142b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f81141a.get(), (c) this.f81142b.get());
    }
}
