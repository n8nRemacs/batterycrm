package com.avito.android.service_booking_settings.di.work_hours;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingWorkHoursModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f277844a;

    /* renamed from: b, reason: collision with root package name */
    public final u f277845b;

    public n(dagger.internal.f fVar, u uVar) {
        this.f277844a = fVar;
        this.f277845b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f277844a.get();
        com.avito.konveyor.a aVar2 = (com.avito.konveyor.a) this.f277845b.get();
        g.f277835a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
