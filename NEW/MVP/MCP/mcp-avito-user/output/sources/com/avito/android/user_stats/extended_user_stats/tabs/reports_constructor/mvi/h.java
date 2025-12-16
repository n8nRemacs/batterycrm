package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.ConstructorTabState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConstructorTabFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f318234a;

    /* renamed from: b, reason: collision with root package name */
    public final c f318235b;

    /* renamed from: c, reason: collision with root package name */
    public final j f318236c;

    /* renamed from: d, reason: collision with root package name */
    public final n f318237d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f318238e;

    public h(e eVar, c cVar, j jVar, n nVar, Provider provider) {
        this.f318234a = eVar;
        this.f318235b = cVar;
        this.f318236c = jVar;
        this.f318237d = nVar;
        this.f318238e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f318234a.getClass();
        d dVar = new d();
        a aVar = (a) this.f318235b.get();
        this.f318236c.getClass();
        i iVar = new i();
        k kVar = (k) this.f318237d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f318238e.get();
        ConstructorTabState.f318208r.getClass();
        return new g("ConstructorTab", ConstructorTabState.f318209s, new f(dVar, aVar, screenPerformanceTracker, kVar, iVar));
    }
}
