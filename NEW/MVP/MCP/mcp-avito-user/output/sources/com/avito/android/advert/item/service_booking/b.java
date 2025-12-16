package com.avito.android.advert.item.service_booking;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f79828a;

    public b(u uVar) {
        this.f79828a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f79828a.get());
    }
}
