package com.avito.android.hotel_available_rooms.konveyor.converters;

import dagger.internal.y;
import javax.inject.Provider;
import lE.C43624b;

/* compiled from: HotelRoomItemConverterImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<q> f162905a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<q> f162906b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C43624b> f162907c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f162908d;

    public x(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f162905a = provider;
        this.f162906b = provider2;
        this.f162907c = provider3;
        this.f162908d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w(this.f162905a.get(), this.f162906b.get(), this.f162907c.get(), (com.avito.android.hotel_available_rooms.konveyor.gallery.k) this.f162908d.get());
    }
}
