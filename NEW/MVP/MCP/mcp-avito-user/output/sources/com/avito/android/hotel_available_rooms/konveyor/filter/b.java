package com.avito.android.hotel_available_rooms.konveyor.filter;

import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: HotelRoomFilterBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f162916a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Locale> f162917b;

    public b(f fVar, Provider provider) {
        this.f162916a = fVar;
        this.f162917b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f162916a.get(), this.f162917b.get());
    }
}
