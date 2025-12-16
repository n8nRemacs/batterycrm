package com.avito.android.hotel_booking.select_radio;

import com.avito.android.hotel_booking.select_radio.mvi.j;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectRadioViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final j f164001a;

    public f(j jVar) {
        this.f164001a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.hotel_booking.select_radio.mvi.h) this.f164001a.get(), null, 2, null);
    }
}
