package com.avito.android.profile.user_profile.cards.service_booking;

import au0.InterfaceC24175a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ActiveServiceBookingsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC24175a> f225404a;

    /* renamed from: b, reason: collision with root package name */
    public final u f225405b;

    public e(u uVar, Provider provider) {
        this.f225404a = provider;
        this.f225405b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f225404a.get(), (com.avito.android.profile.user_profile.cards.service_booking.items.a) this.f225405b.get());
    }
}
