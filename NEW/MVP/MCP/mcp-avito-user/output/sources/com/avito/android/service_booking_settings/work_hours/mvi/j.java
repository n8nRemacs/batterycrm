package com.avito.android.service_booking_settings.work_hours.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingWorkHoursFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f278118a;

    /* renamed from: b, reason: collision with root package name */
    public final e f278119b;

    /* renamed from: c, reason: collision with root package name */
    public final l f278120c;

    /* renamed from: d, reason: collision with root package name */
    public final n f278121d;

    public j(g gVar, e eVar, l lVar, n nVar) {
        this.f278118a = gVar;
        this.f278119b = eVar;
        this.f278120c = lVar;
        this.f278121d = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f278118a.get();
        c cVar = (c) this.f278119b.get();
        this.f278120c.getClass();
        k kVar = new k();
        m mVar = (m) this.f278121d.get();
        Ut0.h.f16738p.getClass();
        return new i("ServiceBookingWorkHours", Ut0.h.f16739q, new h(fVar, cVar, mVar, kVar));
    }
}
