package com.avito.android.short_term_rent.soft_booking.mvi.state;

import com.avito.android.short_term_rent.utils.m;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSoftBookingViewStateBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<m> f282816a;

    /* renamed from: b, reason: collision with root package name */
    public final u f282817b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.short_term_rent.utils.d> f282818c;

    public e(u uVar, Provider provider, Provider provider2) {
        this.f282816a = provider;
        this.f282817b = uVar;
        this.f282818c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f282816a.get(), (com.avito.android.short_term_rent.utils.a) this.f282817b.get(), this.f282818c.get());
    }
}
