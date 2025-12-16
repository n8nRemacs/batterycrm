package com.avito.android.advert_amenities.amenity;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AmenityItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f81136a;

    public b(u uVar) {
        this.f81136a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((f) this.f81136a.get());
    }
}
