package com.avito.android.service_booking.mvi.step.di;

import androidx.recyclerview.widget.C;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingMviStepModule_ProvideListUpdateCallback$_avito_service_booking_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f274630a;

    public i(dagger.internal.f fVar) {
        this.f274630a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f274630a.get();
        d.f274623a.getClass();
        return jVar;
    }
}
