package com.avito.android.short_term_rent.bookingform;

import com.avito.android.short_term_rent.bookingform.mvi.z;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: BookingFormViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final z f281753a;

    public l(z zVar) {
        this.f281753a = zVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.short_term_rent.bookingform.mvi.y yVar = (com.avito.android.short_term_rent.bookingform.mvi.y) this.f281753a.get();
        i2.f411430a.getClass();
        return new k(yVar, i2.a.f411433c);
    }
}
