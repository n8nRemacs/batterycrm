package com.avito.android.hotel_available_rooms;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AvailableHotelRoomsIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f162668a;

    public d(C30102l3 c30102l3) {
        this.f162668a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Context) this.f162668a.get());
    }
}
