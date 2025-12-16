package com.avito.android.hotel_booking.select_single_value;

import com.avito.android.hotel_booking.select_single_value.mvi.g;
import com.avito.android.hotel_booking.select_single_value.mvi.i;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectSingleValueViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final i f164076a;

    public d(i iVar) {
        this.f164076a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((g) this.f164076a.get(), null, 2, null);
    }
}
