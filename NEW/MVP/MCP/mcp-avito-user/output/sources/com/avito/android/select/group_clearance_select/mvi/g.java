package com.avito.android.select.group_clearance_select.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import cq0.C39399c;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GroupClearanceFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f265521a;

    /* renamed from: b, reason: collision with root package name */
    public final b f265522b;

    /* renamed from: c, reason: collision with root package name */
    public final i f265523c;

    /* renamed from: d, reason: collision with root package name */
    public final l f265524d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f265525e;

    public g(d dVar, b bVar, i iVar, l lVar, Provider provider) {
        this.f265521a = dVar;
        this.f265522b = bVar;
        this.f265523c = iVar;
        this.f265524d = lVar;
        this.f265525e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f265521a.get();
        this.f265522b.getClass();
        a aVar = new a();
        this.f265523c.getClass();
        h hVar = new h();
        j jVar = (j) this.f265524d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f265525e.get();
        C39399c.f392964g.getClass();
        return new f("GroupClearance", C39399c.f392965h, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
