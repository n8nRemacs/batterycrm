package com.avito.android.short_term_rent.bookingform.mvi.interactor;

import com.avito.android.short_term_rent.bookingform.BookingFormOpenParams;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreateBookingRequestInteractorImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<u> f281946a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<a> f281947b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.short_term_rent.bookingform.domain.f f281948c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f281949d;

    public t(Provider provider, Provider provider2, com.avito.android.short_term_rent.bookingform.domain.f fVar, dagger.internal.l lVar) {
        this.f281946a = provider;
        this.f281947b = provider2;
        this.f281948c = fVar;
        this.f281949d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new s(this.f281946a.get(), this.f281947b.get(), (com.avito.android.short_term_rent.bookingform.domain.b) this.f281948c.get(), (BookingFormOpenParams) this.f281949d.f393949a);
    }
}
