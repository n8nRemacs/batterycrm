package com.avito.android.service_booking_calendar.flexible.content.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalendarContentFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f275669a;

    /* renamed from: b, reason: collision with root package name */
    public final j f275670b;

    /* renamed from: c, reason: collision with root package name */
    public final l f275671c;

    public h(e eVar, j jVar, l lVar) {
        this.f275669a = eVar;
        this.f275670b = jVar;
        this.f275671c = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f275669a.get();
        this.f275670b.getClass();
        i iVar = new i();
        this.f275671c.getClass();
        k kVar = new k();
        gt0.d.f396920f.getClass();
        return new g("CalendarFlexibleContent", gt0.d.f396921g, new f(dVar, kVar, iVar));
    }
}
