package com.avito.android.short_term_rent.promo_codes.mvi.domain;

import com.avito.android.remote.d1;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lw0.InterfaceC43841a;

/* compiled from: StrSoftBookingPromoCodesApplyUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d1> f282457a;

    /* renamed from: b, reason: collision with root package name */
    public final u f282458b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f282459c;

    public e(u uVar, Provider provider, Provider provider2) {
        this.f282457a = provider;
        this.f282458b = uVar;
        this.f282459c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f282457a.get(), (InterfaceC43841a) this.f282458b.get(), this.f282459c.get());
    }
}
