package com.avito.android.short_term_rent.bookingform.mvi.interactor;

import com.avito.android.short_term_rent.bookingform.BookingFormOpenParams;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dagger.internal.y;
import iw0.InterfaceC42121a;
import javax.inject.Provider;

/* compiled from: BookingFormApiInteractorImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f281910a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.short_term_rent.bookingform.domain.h f281911b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Gson> f281912c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC42121a> f281913d;

    /* renamed from: e, reason: collision with root package name */
    public final q f281914e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f281915f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<a> f281916g;

    public j(dagger.internal.l lVar, com.avito.android.short_term_rent.bookingform.domain.h hVar, Provider provider, Provider provider2, q qVar, Provider provider3, Provider provider4) {
        this.f281910a = lVar;
        this.f281911b = hVar;
        this.f281912c = provider;
        this.f281913d = provider2;
        this.f281914e = qVar;
        this.f281915f = provider3;
        this.f281916g = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        BookingFormOpenParams bookingFormOpenParams = (BookingFormOpenParams) this.f281910a.f393949a;
        this.f281911b.getClass();
        return new i(bookingFormOpenParams, new com.avito.android.short_term_rent.bookingform.domain.g(), this.f281912c.get(), this.f281913d.get(), (m) this.f281914e.get(), this.f281915f.get(), this.f281916g.get());
    }
}
