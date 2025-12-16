package com.avito.android.mortgage.pre_approval.result.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PreApprovalResultFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final l f202142a;

    /* renamed from: b, reason: collision with root package name */
    public final c f202143b;

    /* renamed from: c, reason: collision with root package name */
    public final g f202144c;

    /* renamed from: d, reason: collision with root package name */
    public final e f202145d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f202146e;

    public j(l lVar, c cVar, g gVar, e eVar, Provider provider) {
        this.f202142a = lVar;
        this.f202143b = cVar;
        this.f202144c = gVar;
        this.f202145d = eVar;
        this.f202146e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k kVar = (k) this.f202142a.get();
        a aVar = (a) this.f202143b.get();
        this.f202144c.getClass();
        f fVar = new f();
        d dVar = (d) this.f202145d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f202146e.get();
        X00.a.f18101b.getClass();
        return new i("preApprovalResult", X00.a.f18102c, new h(dVar, screenPerformanceTracker, kVar, aVar, fVar));
    }
}
