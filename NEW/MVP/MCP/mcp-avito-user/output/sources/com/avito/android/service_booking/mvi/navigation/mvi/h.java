package com.avito.android.service_booking.mvi.navigation.mvi;

import dagger.internal.x;
import dagger.internal.y;
import java.util.LinkedHashMap;

/* compiled from: ServiceBookingNavigationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final c f274418a;

    /* renamed from: b, reason: collision with root package name */
    public final e f274419b;

    /* renamed from: c, reason: collision with root package name */
    public final n f274420c;

    /* renamed from: d, reason: collision with root package name */
    public final j f274421d;

    public h(c cVar, e eVar, n nVar, j jVar) {
        this.f274418a = cVar;
        this.f274419b = eVar;
        this.f274420c = nVar;
        this.f274421d = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f274418a.getClass();
        b bVar = new b();
        d dVar = (d) this.f274419b.get();
        this.f274420c.getClass();
        m mVar = new m();
        this.f274421d.getClass();
        return new g("ServiceBookingNavigation", new Fs0.d(new LinkedHashMap(), null), new f(bVar, dVar, mVar, new i()));
    }
}
