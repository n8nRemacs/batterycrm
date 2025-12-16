package com.avito.android.short_term_rent.bookingform.mvi;

import com.avito.android.short_term_rent.bookingform.BookingFormOpenParams;
import javax.inject.Provider;

/* compiled from: BookingFormBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f282015a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.short_term_rent.bookingform.mvi.interactor.d> f282016b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f282017c;

    public u(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f282015a = lVar;
        this.f282016b = provider;
        this.f282017c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new t((BookingFormOpenParams) this.f282015a.f393949a, this.f282016b.get(), ((Boolean) this.f282017c.f393949a).booleanValue());
    }
}
