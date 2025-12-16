package com.avito.android.auto_select.booking.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoSelectBookingFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f95847a;

    /* renamed from: b, reason: collision with root package name */
    public final c f95848b;

    /* renamed from: c, reason: collision with root package name */
    public final j f95849c;

    /* renamed from: d, reason: collision with root package name */
    public final l f95850d;

    public h(e eVar, c cVar, j jVar, l lVar) {
        this.f95847a = eVar;
        this.f95848b = cVar;
        this.f95849c = jVar;
        this.f95850d = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f95847a.get();
        b bVar = (b) this.f95848b.get();
        this.f95849c.getClass();
        i iVar = new i();
        this.f95850d.getClass();
        k kVar = new k();
        cf.d.f58079e.getClass();
        return new g("AutoSelectBooking", cf.d.f58080f, new f(dVar, bVar, kVar, iVar));
    }
}
