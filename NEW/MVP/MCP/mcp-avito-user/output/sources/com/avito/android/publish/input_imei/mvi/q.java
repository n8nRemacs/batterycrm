package com.avito.android.publish.input_imei.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import le0.C43742c;

/* compiled from: InputImeiFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final n f236451a;

    /* renamed from: b, reason: collision with root package name */
    public final g f236452b;

    /* renamed from: c, reason: collision with root package name */
    public final s f236453c;

    /* renamed from: d, reason: collision with root package name */
    public final u f236454d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f236455e;

    public q(n nVar, g gVar, s sVar, u uVar, Provider provider) {
        this.f236451a = nVar;
        this.f236452b = gVar;
        this.f236453c = sVar;
        this.f236454d = uVar;
        this.f236455e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        m mVar = (m) this.f236451a.get();
        f fVar = (f) this.f236452b.get();
        this.f236453c.getClass();
        r rVar = new r();
        this.f236454d.getClass();
        t tVar = new t();
        ScreenPerformanceTracker screenPerformanceTracker = this.f236455e.get();
        C43742c.f413973d.getClass();
        return new p("InputImei", C43742c.f413974e, new o(mVar, fVar, screenPerformanceTracker, tVar, rVar));
    }
}
