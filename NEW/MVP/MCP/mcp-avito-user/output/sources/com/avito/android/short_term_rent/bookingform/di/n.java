package com.avito.android.short_term_rent.bookingform.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.StrBookingFormScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BookingFormModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f281257a;

    public n(dagger.internal.l lVar) {
        this.f281257a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f281257a.f393949a;
        c.f281238a.getClass();
        return new C28478k(StrBookingFormScreen.f90507d, rVar, null, 4, null);
    }
}
