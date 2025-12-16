package com.avito.android.service_booking_common.di;

/* compiled from: ServiceBookingDateItemModule_ProvideAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f276520a;

    public l(dagger.internal.u uVar) {
        this.f276520a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f276520a.get();
        k.f276519a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
