package com.avito.android.service_booking_day_settings.daysettings.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DaySettingsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.a> f277036a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.a> f277037b;

    /* renamed from: c, reason: collision with root package name */
    public final u f277038c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_day_settings.daysettings.domain.breaks.e> f277039d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f277040e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_utils.ux_feedback.h> f277041f;

    public f(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f277036a = provider;
        this.f277037b = provider2;
        this.f277038c = uVar;
        this.f277039d = provider3;
        this.f277040e = lVar;
        this.f277041f = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f277036a.get(), this.f277037b.get(), (com.avito.android.service_booking_day_settings.daysettings.domain.shedule_day.use_case.d) this.f277038c.get(), this.f277039d.get(), (String) this.f277040e.f393949a, this.f277041f.get());
    }
}
