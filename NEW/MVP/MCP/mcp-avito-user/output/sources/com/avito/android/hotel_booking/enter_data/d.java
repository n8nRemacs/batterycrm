package com.avito.android.hotel_booking.enter_data;

import com.avito.android.hotel_booking.enter_data.mvi.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EnterDataViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final j f163502a;

    public d(j jVar) {
        this.f163502a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.hotel_booking.enter_data.mvi.h) this.f163502a.get(), null, 2, null);
    }
}
