package com.avito.android.user_advert.advert.items.service_booking_reminder;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingReminderItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<MH0.c> f310170a;

    public i(Provider<MH0.c> provider) {
        this.f310170a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f310170a.get());
    }
}
