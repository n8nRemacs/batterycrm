package com.avito.android.service_booking_details.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingItemDetailsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final k f277446a;

    /* renamed from: b, reason: collision with root package name */
    public final i f277447b;

    /* renamed from: c, reason: collision with root package name */
    public final p f277448c;

    /* renamed from: d, reason: collision with root package name */
    public final r f277449d;

    /* renamed from: e, reason: collision with root package name */
    public final u f277450e;

    public n(k kVar, i iVar, p pVar, r rVar, u uVar) {
        this.f277446a = kVar;
        this.f277447b = iVar;
        this.f277448c = pVar;
        this.f277449d = rVar;
        this.f277450e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = (j) this.f277446a.get();
        h hVar = (h) this.f277447b.get();
        o oVar = (o) this.f277448c.get();
        q qVar = (q) this.f277449d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f277450e.get();
        Bt0.c.f1765l.getClass();
        return new m("ServiceBookingItemDetails", Bt0.c.f1766m, new l(jVar, hVar, screenPerformanceTracker, qVar, oVar));
    }
}
