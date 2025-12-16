package com.avito.android.short_term_rent.soft_booking.mvi;

import Xv0.InterfaceC17053a;
import javax.inject.Provider;

/* compiled from: StrSoftBookingActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class t implements dagger.internal.h<C34981a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.short_term_rent.soft_booking.domain.k> f282833a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.short_term_rent.soft_booking.domain.d> f282834b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f282835c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC17053a> f282836d;

    public t(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f282833a = provider;
        this.f282834b = provider2;
        this.f282835c = uVar;
        this.f282836d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C34981a(this.f282833a.get(), this.f282834b.get(), (com.avito.android.short_term_rent.soft_booking.domain.a) this.f282835c.get(), this.f282836d.get());
    }
}
