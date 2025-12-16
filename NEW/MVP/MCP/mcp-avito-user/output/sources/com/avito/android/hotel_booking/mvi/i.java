package com.avito.android.hotel_booking.mvi;

import javax.inject.Provider;

/* compiled from: HotelBookingActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final v f163912a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<MI.a> f163913b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.hotel_booking.domain.j> f163914c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f163915d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.hotel_booking.domain.a> f163916e;

    public i(v vVar, Provider provider, Provider provider2, dagger.internal.u uVar, Provider provider3) {
        this.f163912a = vVar;
        this.f163913b = provider;
        this.f163914c = provider2;
        this.f163915d = uVar;
        this.f163916e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((t) this.f163912a.get(), this.f163913b.get(), this.f163914c.get(), (com.avito.android.hotel_booking.domain.d) this.f163915d.get(), this.f163916e.get());
    }
}
