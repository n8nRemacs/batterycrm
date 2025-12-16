package com.avito.android.mortgage_invite.participant.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import p20.C46879d;

/* compiled from: ParticipantFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final l f206238a;

    /* renamed from: b, reason: collision with root package name */
    public final s f206239b;

    /* renamed from: c, reason: collision with root package name */
    public final j f206240c;

    /* renamed from: d, reason: collision with root package name */
    public final q f206241d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f206242e;

    public o(l lVar, s sVar, j jVar, q qVar, Provider provider) {
        this.f206238a = lVar;
        this.f206239b = sVar;
        this.f206240c = jVar;
        this.f206241d = qVar;
        this.f206242e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k kVar = (k) this.f206238a.get();
        r rVar = (r) this.f206239b.get();
        i iVar = (i) this.f206240c.get();
        this.f206241d.getClass();
        p pVar = new p();
        ScreenPerformanceTracker screenPerformanceTracker = this.f206242e.get();
        C46879d.f428144f.getClass();
        return new n("Participant", C46879d.f428145g, new m(kVar, screenPerformanceTracker, rVar, iVar, pVar));
    }
}
