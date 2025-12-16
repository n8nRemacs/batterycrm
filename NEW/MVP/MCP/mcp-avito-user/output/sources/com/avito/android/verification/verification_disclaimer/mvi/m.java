package com.avito.android.verification.verification_disclaimer.mvi;

import NM0.c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DisclaimerFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final c f325117a;

    /* renamed from: b, reason: collision with root package name */
    public final o f325118b;

    /* renamed from: c, reason: collision with root package name */
    public final h f325119c;

    /* renamed from: d, reason: collision with root package name */
    public final u f325120d;

    /* renamed from: e, reason: collision with root package name */
    public final j f325121e;

    public m(c cVar, o oVar, h hVar, u uVar, j jVar) {
        this.f325117a = cVar;
        this.f325118b = oVar;
        this.f325119c = hVar;
        this.f325120d = uVar;
        this.f325121e = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f325117a.get();
        n nVar = (n) this.f325118b.get();
        g gVar = (g) this.f325119c.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f325120d.get();
        this.f325121e.getClass();
        return new l("VerificationDisclaimer", c.C0731c.f11392b, new k(bVar, gVar, screenPerformanceTracker, nVar, new i()));
    }
}
