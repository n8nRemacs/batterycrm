package com.avito.android.str_booking.domain;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrBookingGuestProfilePrefsInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AK0.l> f285577a;

    public e(Provider<AK0.l> provider) {
        this.f285577a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f285577a.get());
    }
}
