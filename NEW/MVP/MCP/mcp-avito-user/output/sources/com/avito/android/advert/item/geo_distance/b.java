package com.avito.android.advert.item.geo_distance;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsAddressGeoDistanceBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f75675a;

    public b(u uVar) {
        this.f75675a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((f) this.f75675a.get());
    }
}
