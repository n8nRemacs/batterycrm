package com.avito.android.service_booking_details.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingItemDetailsOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final u f277452a;

    public p(u uVar) {
        this.f277452a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((com.avito.android.service_booking_details.domain.preferences.a) this.f277452a.get());
    }
}
