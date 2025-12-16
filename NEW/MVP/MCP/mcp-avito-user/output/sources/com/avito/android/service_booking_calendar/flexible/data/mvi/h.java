package com.avito.android.service_booking_calendar.flexible.data.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalendarDataFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f275737a;

    /* renamed from: b, reason: collision with root package name */
    public final c f275738b;

    /* renamed from: c, reason: collision with root package name */
    public final j f275739c;

    /* renamed from: d, reason: collision with root package name */
    public final l f275740d;

    public h(e eVar, c cVar, j jVar, l lVar) {
        this.f275737a = eVar;
        this.f275738b = cVar;
        this.f275739c = jVar;
        this.f275740d = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f275737a.get();
        b bVar = (b) this.f275738b.get();
        this.f275739c.getClass();
        i iVar = new i();
        k kVar = (k) this.f275740d.get();
        com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a.f275721e.getClass();
        return new g("CalendarData", com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a.f275722f, new f(dVar, bVar, kVar, iVar));
    }
}
