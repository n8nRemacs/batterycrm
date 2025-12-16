package com.avito.android.hotel_booking.konveyor.input;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BookingFormInputBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f163670a;

    public b(j jVar) {
        this.f163670a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((h) this.f163670a.get());
    }
}
