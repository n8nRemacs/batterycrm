package com.avito.android.service_booking_settings.work_hours.item.schedule;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.service_booking_settings.work_hours.item.schedule.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingWorkHourDayBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<org.threeten.bp.format.c> f277983a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f277984b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<c> f277985c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f277986d;

    public b(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f277983a = provider;
        this.f277984b = provider2;
        this.f277985c = provider3;
        this.f277986d = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f277983a.get(), this.f277984b.get(), this.f277985c.get(), (h.b) this.f277986d.f393949a);
    }
}
