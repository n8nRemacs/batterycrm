package com.avito.android.hotel_available_rooms.konveyor.converters;

import dagger.internal.y;
import java.text.SimpleDateFormat;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: HotelRoomFiltersItemConverterImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f162889a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<SimpleDateFormat> f162890b;

    public o(dagger.internal.u uVar, Provider provider) {
        this.f162889a = uVar;
        this.f162890b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f162890b.get(), (Map) this.f162889a.get());
    }
}
