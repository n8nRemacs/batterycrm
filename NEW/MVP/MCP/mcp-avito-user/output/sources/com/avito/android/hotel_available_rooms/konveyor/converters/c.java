package com.avito.android.hotel_available_rooms.konveyor.converters;

import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HotelListItemConverterImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<v> f162882a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<i> f162883b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f162884c;

    public c(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f162882a = provider;
        this.f162883b = provider2;
        this.f162884c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f162882a.get(), this.f162883b.get(), (e) this.f162884c.get());
    }
}
