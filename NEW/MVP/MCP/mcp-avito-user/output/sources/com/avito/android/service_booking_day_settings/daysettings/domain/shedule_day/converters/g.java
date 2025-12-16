package com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.converters;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BreaksInfoConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f276809a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_day_settings.daysettings.domain.breaks.a> f276810b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f276811c;

    public g(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f276809a = provider;
        this.f276810b = provider2;
        this.f276811c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f276809a.get(), this.f276810b.get(), (com.avito.android.service_booking_day_settings.daysettings.domain.breaks.e) this.f276811c.get());
    }
}
