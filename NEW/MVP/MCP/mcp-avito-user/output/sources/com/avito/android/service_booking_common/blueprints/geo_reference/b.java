package com.avito.android.service_booking_common.blueprints.geo_reference;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SbGeoReferenceBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f276412a;

    public b(u uVar) {
        this.f276412a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f276412a.get());
    }
}
