package com.avito.android.short_term_rent.soft_booking;

import gj.InterfaceC40691b;

/* compiled from: StrSoftBookingViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class C implements dagger.internal.h<B> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.short_term_rent.di.module.c f282535a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.short_term_rent.soft_booking.mvi.y f282536b;

    public C(com.avito.android.short_term_rent.di.module.c cVar, com.avito.android.short_term_rent.soft_booking.mvi.y yVar) {
        this.f282535a = cVar;
        this.f282536b = yVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new B((InterfaceC40691b) this.f282535a.get(), (com.avito.android.short_term_rent.soft_booking.mvi.x) this.f282536b.get());
    }
}
