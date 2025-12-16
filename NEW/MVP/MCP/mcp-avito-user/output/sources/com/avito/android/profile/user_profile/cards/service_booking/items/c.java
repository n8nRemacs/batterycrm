package com.avito.android.profile.user_profile.cards.service_booking.items;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f225413a;

    public c(Provider<InterfaceC35863o4> provider) {
        this.f225413a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f225413a.get());
    }
}
