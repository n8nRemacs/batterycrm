package com.avito.android.advert.item.compatibility.v4;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GarageCompatibilityV4Blueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f74537a;

    public e(Provider<f> provider) {
        this.f74537a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f74537a.get());
    }
}
