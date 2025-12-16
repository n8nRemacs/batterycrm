package com.avito.android.service_booking.mvi.step.di;

import Is0.C14155a;
import com.avito.beduin.v2.engine.core.z;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingToConverterModule_ProvideMapConverter$_avito_service_booking_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<C14155a> {

    /* renamed from: a, reason: collision with root package name */
    public final m f274635a;

    /* renamed from: b, reason: collision with root package name */
    public final u f274636b;

    public n(m mVar, u uVar) {
        this.f274635a = mVar;
        this.f274636b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        z zVar = (z) this.f274636b.get();
        this.f274635a.getClass();
        return new C14155a(zVar);
    }
}
