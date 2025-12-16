package com.avito.android.short_term_rent.bookingform.promocode;

import com.avito.android.short_term_rent.bookingform.promocode.mvi.l;
import com.avito.android.short_term_rent.bookingform.promocode.mvi.m;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: BookingFormPromoCodeDialogViewModel_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final m f282087a;

    public d(m mVar) {
        this.f282087a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = (l) this.f282087a.get();
        i2.f411430a.getClass();
        return new c(lVar, i2.a.f411433c);
    }
}
