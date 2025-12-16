package com.avito.android.service_booking_details.di;

import com.avito.android.date_time_formatter.r;
import com.avito.android.util.InterfaceC35945t1;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: ServiceBookingItemDetailsModule_ProvideTimeslotFormat$_avito_service_booking_details_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<InterfaceC35945t1<Long>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.j> f277318a;

    public m(Provider<com.avito.android.server_time.j> provider) {
        this.f277318a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.j jVar = this.f277318a.get();
        e.f277307a.getClass();
        return new r("d MMMM, HH:mm", new Locale("ru", "RU"), jVar);
    }
}
