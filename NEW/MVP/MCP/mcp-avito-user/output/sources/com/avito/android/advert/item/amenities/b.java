package com.avito.android.advert.item.amenities;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsAmenitiesBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f72743a;

    public b(u uVar) {
        this.f72743a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f72743a.get());
    }
}
