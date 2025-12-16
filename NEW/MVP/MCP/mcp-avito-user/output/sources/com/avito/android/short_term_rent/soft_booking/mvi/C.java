package com.avito.android.short_term_rent.soft_booking.mvi;

/* compiled from: StrSoftBookingReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class C implements dagger.internal.h<B> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f282669a;

    public C(dagger.internal.u uVar) {
        this.f282669a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new B((com.avito.android.short_term_rent.soft_booking.mvi.state.b) this.f282669a.get());
    }
}
