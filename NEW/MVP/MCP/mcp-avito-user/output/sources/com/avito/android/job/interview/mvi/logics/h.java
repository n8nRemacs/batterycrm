package com.avito.android.job.interview.mvi.logics;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import vQ.C49251c;

/* compiled from: JobInterviewInvitationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final c f174613a;

    /* renamed from: b, reason: collision with root package name */
    public final m f174614b;

    /* renamed from: c, reason: collision with root package name */
    public final q f174615c;

    /* renamed from: d, reason: collision with root package name */
    public final e f174616d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f174617e;

    public h(c cVar, m mVar, q qVar, e eVar, Provider provider) {
        this.f174613a = cVar;
        this.f174614b = mVar;
        this.f174615c = qVar;
        this.f174616d = eVar;
        this.f174617e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f174613a.get();
        this.f174614b.getClass();
        l lVar = new l();
        this.f174615c.getClass();
        p pVar = new p();
        d dVar = (d) this.f174616d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f174617e.get();
        C49251c.f440741e.getClass();
        return new g("JobInterviewInvitation", C49251c.f440742f, new f(aVar, screenPerformanceTracker, pVar, lVar, dVar));
    }
}
