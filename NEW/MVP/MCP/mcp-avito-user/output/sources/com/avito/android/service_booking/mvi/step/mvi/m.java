package com.avito.android.service_booking.mvi.step.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ServiceBookingMviStepFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final j f274780a;

    /* renamed from: b, reason: collision with root package name */
    public final h f274781b;

    /* renamed from: c, reason: collision with root package name */
    public final o f274782c;

    /* renamed from: d, reason: collision with root package name */
    public final u f274783d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f274784e;

    public m(j jVar, h hVar, o oVar, u uVar, dagger.internal.u uVar2) {
        this.f274780a = jVar;
        this.f274781b = hVar;
        this.f274782c = oVar;
        this.f274783d = uVar;
        this.f274784e = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f274780a.get();
        g gVar = (g) this.f274781b.get();
        n nVar = (n) this.f274782c.get();
        s sVar = (s) this.f274783d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f274784e.get();
        ServiceBookingMviStepState.f274711i.getClass();
        return new l("ServiceBookingMviStep", ServiceBookingMviStepState.f274712j, new k(iVar, gVar, screenPerformanceTracker, sVar, nVar));
    }
}
