package com.avito.android.service_booking.mvi.di;

import com.avito.android.util.InterfaceC35945t1;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: ServiceBookingMviModule_ProvideTimeslotFormat$_avito_service_booking_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class u implements dagger.internal.h<InterfaceC35945t1<Long>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.j> f274351a;

    public u(Provider<com.avito.android.server_time.j> provider) {
        this.f274351a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.j jVar = this.f274351a.get();
        s.f274343a.getClass();
        return new com.avito.android.date_time_formatter.r("d MMMM, HH:mm", new Locale("ru", "RU"), jVar);
    }
}
