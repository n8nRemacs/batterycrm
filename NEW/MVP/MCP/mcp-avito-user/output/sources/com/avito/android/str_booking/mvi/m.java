package com.avito.android.str_booking.mvi;

import Mx0.C14541a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrBookingFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final h f285846a;

    /* renamed from: b, reason: collision with root package name */
    public final j f285847b;

    /* renamed from: c, reason: collision with root package name */
    public final o f285848c;

    /* renamed from: d, reason: collision with root package name */
    public final q f285849d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f285850e;

    public m(h hVar, j jVar, o oVar, q qVar, Provider provider) {
        this.f285846a = hVar;
        this.f285847b = jVar;
        this.f285848c = oVar;
        this.f285849d = qVar;
        this.f285850e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f285846a.get();
        i iVar = (i) this.f285847b.get();
        this.f285848c.getClass();
        n nVar = new n();
        this.f285849d.getClass();
        p pVar = new p();
        ScreenPerformanceTracker screenPerformanceTracker = this.f285850e.get();
        C14541a.f11117l.getClass();
        return new l("StrBooking", C14541a.f11118m, new k(aVar, iVar, screenPerformanceTracker, pVar, nVar));
    }
}
