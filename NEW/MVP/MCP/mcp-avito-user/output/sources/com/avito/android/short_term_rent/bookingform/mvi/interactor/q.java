package com.avito.android.short_term_rent.bookingform.mvi.interactor;

import com.avito.android.short_term_rent.bookingform.BookingFormOpenParams;
import com.google.gson.Gson;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BookingFormMapper_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class q implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f281923a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f281924b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.short_term_rent.bookingform.data.models.d f281925c;

    /* renamed from: d, reason: collision with root package name */
    public final l f281926d;

    public q(dagger.internal.l lVar, Provider provider, com.avito.android.short_term_rent.bookingform.data.models.d dVar, l lVar2) {
        this.f281923a = lVar;
        this.f281924b = provider;
        this.f281925c = dVar;
        this.f281926d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        BookingFormOpenParams bookingFormOpenParams = (BookingFormOpenParams) this.f281923a.f393949a;
        Gson gson = this.f281924b.get();
        com.avito.android.short_term_rent.bookingform.data.models.c cVar = (com.avito.android.short_term_rent.bookingform.data.models.c) this.f281925c.get();
        this.f281926d.getClass();
        return new m(bookingFormOpenParams, gson, cVar, new k());
    }
}
