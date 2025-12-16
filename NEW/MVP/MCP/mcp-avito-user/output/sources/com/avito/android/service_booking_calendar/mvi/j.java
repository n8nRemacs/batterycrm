package com.avito.android.service_booking_calendar.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalendarFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f276156a;

    /* renamed from: b, reason: collision with root package name */
    public final e f276157b;

    /* renamed from: c, reason: collision with root package name */
    public final l f276158c;

    /* renamed from: d, reason: collision with root package name */
    public final n f276159d;

    public j(g gVar, e eVar, l lVar, n nVar) {
        this.f276156a = gVar;
        this.f276157b = eVar;
        this.f276158c = lVar;
        this.f276159d = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f276156a.getClass();
        f fVar = new f();
        this.f276157b.getClass();
        d dVar = new d();
        this.f276158c.getClass();
        k kVar = new k();
        this.f276159d.getClass();
        m mVar = new m();
        mt0.d.f414789c.getClass();
        return new i("Calendar", mt0.d.f414790d, new h(fVar, dVar, mVar, kVar));
    }
}
