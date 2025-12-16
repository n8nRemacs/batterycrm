package com.avito.android.service_booking_day_settings.di;

import com.avito.android.remote.R0;
import com.avito.android.service_booking_day_settings.di.c;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import vt0.InterfaceC49381a;

/* compiled from: DaySettingsApiModule_ProvideDaySettingsApiFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<InterfaceC49381a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f277155a;

    public f(Provider<R0> provider) {
        this.f277155a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) ((c.b.g) this.f277155a).get();
        e.f277154a.getClass();
        InterfaceC49381a interfaceC49381a = (InterfaceC49381a) r02.create(InterfaceC49381a.class);
        dagger.internal.t.d(interfaceC49381a);
        return interfaceC49381a;
    }
}
