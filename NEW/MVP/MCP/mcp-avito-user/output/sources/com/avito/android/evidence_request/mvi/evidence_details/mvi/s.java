package com.avito.android.evidence_request.mvi.evidence_details.mvi;

import Xz.C17068c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EvidenceDetailsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final p f149095a;

    /* renamed from: b, reason: collision with root package name */
    public final d f149096b;

    /* renamed from: c, reason: collision with root package name */
    public final u f149097c;

    /* renamed from: d, reason: collision with root package name */
    public final w f149098d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f149099e;

    public s(p pVar, d dVar, u uVar, w wVar, dagger.internal.u uVar2) {
        this.f149095a = pVar;
        this.f149096b = dVar;
        this.f149097c = uVar;
        this.f149098d = wVar;
        this.f149099e = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f149095a.get();
        c cVar = (c) this.f149096b.get();
        t tVar = (t) this.f149097c.get();
        v vVar = (v) this.f149098d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f149099e.get();
        C17068c.f19200g.getClass();
        return new r("EvidenceDetails", C17068c.f19201h, new q(eVar, cVar, screenPerformanceTracker, vVar, tVar));
    }
}
