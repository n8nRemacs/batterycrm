package com.avito.android.service_booking_details.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingItemDetailsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_details.domain.a> f277432a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_details.domain.d> f277433b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f277434c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f277435d;

    /* renamed from: e, reason: collision with root package name */
    public final u f277436e;

    public i(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f277432a = provider;
        this.f277433b = provider2;
        this.f277434c = lVar;
        this.f277435d = provider3;
        this.f277436e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f277432a.get(), this.f277433b.get(), (String) this.f277434c.f393949a, this.f277435d.get(), (com.avito.android.service_booking_details.l) this.f277436e.get());
    }
}
