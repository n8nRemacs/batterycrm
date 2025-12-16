package com.avito.android.user_advert.advert.items.service_booking_reminder;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingReminderBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f310147a;

    /* renamed from: b, reason: collision with root package name */
    public final u f310148b;

    public b(u uVar, Provider provider) {
        this.f310147a = provider;
        this.f310148b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f310147a.get(), (com.avito.android.util.text.a) this.f310148b.get());
    }
}
