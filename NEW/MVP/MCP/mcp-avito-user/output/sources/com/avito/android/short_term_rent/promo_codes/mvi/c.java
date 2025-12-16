package com.avito.android.short_term_rent.promo_codes.mvi;

import com.avito.android.short_term_rent.utils.m;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSoftBookingPromoCodesActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.short_term_rent.promo_codes.mvi.domain.a> f282441a;

    /* renamed from: b, reason: collision with root package name */
    public final u f282442b;

    public c(u uVar, Provider provider) {
        this.f282441a = provider;
        this.f282442b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f282441a.get(), (m) this.f282442b.get());
    }
}
