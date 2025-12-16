package com.avito.android.hotel_booking.mvi;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: HotelBookingInteractor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class v implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<DI.c> f163968a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.hotel_booking.domain.a> f163969b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.hotel_booking.domain.g> f163970c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f163971d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f163972e;

    public v(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f163968a = provider;
        this.f163969b = provider2;
        this.f163970c = provider3;
        this.f163971d = uVar;
        this.f163972e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t(this.f163968a.get(), this.f163969b.get(), this.f163970c.get(), (MI.a) this.f163971d.get(), this.f163972e.get());
    }
}
