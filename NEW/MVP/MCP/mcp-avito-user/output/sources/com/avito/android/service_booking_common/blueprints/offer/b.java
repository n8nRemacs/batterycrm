package com.avito.android.service_booking_common.blueprints.offer;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SbOfferBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f276459a;

    public b(g gVar) {
        this.f276459a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((f) this.f276459a.get());
    }
}
