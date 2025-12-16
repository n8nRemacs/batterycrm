package com.avito.android.str_booking.ui;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrBookingViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.str_booking.mvi.m f286113a;

    public o(com.avito.android.str_booking.mvi.m mVar) {
        this.f286113a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((com.avito.android.str_booking.mvi.l) this.f286113a.get(), null, 2, null);
    }
}
