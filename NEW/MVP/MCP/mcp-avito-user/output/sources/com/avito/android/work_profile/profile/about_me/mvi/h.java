package com.avito.android.work_profile.profile.about_me.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import hQ0.C40868c;

/* compiled from: AboutMeFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f330807a;

    /* renamed from: b, reason: collision with root package name */
    public final c f330808b;

    /* renamed from: c, reason: collision with root package name */
    public final j f330809c;

    /* renamed from: d, reason: collision with root package name */
    public final l f330810d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f330811e;

    public h(e eVar, c cVar, j jVar, l lVar, dagger.internal.l lVar2) {
        this.f330807a = eVar;
        this.f330808b = cVar;
        this.f330809c = jVar;
        this.f330810d = lVar;
        this.f330811e = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f330807a.get();
        b bVar = (b) this.f330808b.get();
        this.f330809c.getClass();
        i iVar = new i();
        this.f330810d.getClass();
        k kVar = new k();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f330811e.f393949a;
        C40868c.f397195c.getClass();
        return new g("AboutMeFragment", C40868c.f397196d, new f(dVar, bVar, screenPerformanceTracker, kVar, iVar));
    }
}
