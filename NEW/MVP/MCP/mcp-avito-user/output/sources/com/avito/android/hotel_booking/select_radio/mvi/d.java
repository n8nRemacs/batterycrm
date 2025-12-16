package com.avito.android.hotel_booking.select_radio.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectRadioActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f164028a;

    public d(u uVar) {
        this.f164028a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((SI.a) this.f164028a.get());
    }
}
