package com.avito.android.service_booking_additional_settings.additionalsettings.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingAdditionalSettingsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f275017a;

    /* renamed from: b, reason: collision with root package name */
    public final d f275018b;

    /* renamed from: c, reason: collision with root package name */
    public final k f275019c;

    /* renamed from: d, reason: collision with root package name */
    public final m f275020d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f275021e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f275017a = fVar;
        this.f275018b = dVar;
        this.f275019c = kVar;
        this.f275020d = mVar;
        this.f275021e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f275017a.get();
        c cVar = (c) this.f275018b.get();
        this.f275019c.getClass();
        j jVar = new j();
        l lVar = (l) this.f275020d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f275021e.get();
        ServiceBookingAdditionalSettingsState.f274989g.getClass();
        return new h("ServiceBookingAdditionalSettings", ServiceBookingAdditionalSettingsState.f274990h, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
