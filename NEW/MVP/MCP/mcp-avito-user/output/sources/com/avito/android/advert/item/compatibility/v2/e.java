package com.avito.android.advert.item.compatibility.v2;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GarageCompatibilityV2Blueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f74358a;

    public e(Provider<f> provider) {
        this.f74358a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f74358a.get());
    }
}
