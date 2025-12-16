package com.avito.android.short_term_rent.bookingform.promocode.mvi;

import com.avito.android.short_term_rent.bookingform.promocode.BookingFormPromoCodeDialogFragmentOpenParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PromoCodeBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f282169a;

    public j(dagger.internal.l lVar) {
        this.f282169a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((BookingFormPromoCodeDialogFragmentOpenParams) this.f282169a.f393949a);
    }
}
