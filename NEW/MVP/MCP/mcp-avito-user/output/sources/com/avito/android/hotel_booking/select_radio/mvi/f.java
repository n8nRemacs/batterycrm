package com.avito.android.hotel_booking.select_radio.mvi;

import com.avito.android.hotel_booking.select_radio.SelectRadioOpenParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectRadioBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f164040a;

    public f(dagger.internal.l lVar) {
        this.f164040a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((SelectRadioOpenParams) this.f164040a.f393949a);
    }
}
