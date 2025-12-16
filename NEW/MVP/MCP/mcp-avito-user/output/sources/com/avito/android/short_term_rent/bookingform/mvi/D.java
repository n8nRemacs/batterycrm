package com.avito.android.short_term_rent.bookingform.mvi;

import javax.inject.Provider;

/* compiled from: BookingFormReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class D implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f281757a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f281758b;

    public D(dagger.internal.u uVar, Provider provider) {
        this.f281757a = provider;
        this.f281758b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C(this.f281757a.get(), (E) this.f281758b.get());
    }
}
