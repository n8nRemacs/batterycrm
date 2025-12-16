package com.avito.android.service_booking_details.domain;

import Bs0.InterfaceC13182a;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetServiceBookingItemDetailsUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13182a> f277328a;

    /* renamed from: b, reason: collision with root package name */
    public final u f277329b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f277330c;

    public c(u uVar, Provider provider, Provider provider2) {
        this.f277328a = provider;
        this.f277329b = uVar;
        this.f277330c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(dagger.internal.g.b(this.f277328a), (g) this.f277329b.get(), this.f277330c.get());
    }
}
