package com.avito.android.service_booking_details.di;

import androidx.recyclerview.widget.C;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingItemDetailsModule_ProvideListUpdateCallback$_avito_service_booking_details_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f277314a;

    public j(dagger.internal.f fVar) {
        this.f277314a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f277314a.get();
        e.f277307a.getClass();
        return jVar;
    }
}
