package com.avito.android.passport.auth_suggest.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PassportAuthSuggestFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f211042a;

    /* renamed from: b, reason: collision with root package name */
    public final c f211043b;

    /* renamed from: c, reason: collision with root package name */
    public final j f211044c;

    /* renamed from: d, reason: collision with root package name */
    public final l f211045d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f211046e;

    public h(e eVar, c cVar, j jVar, l lVar, dagger.internal.l lVar2) {
        this.f211042a = eVar;
        this.f211043b = cVar;
        this.f211044c = jVar;
        this.f211045d = lVar;
        this.f211046e = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f211042a.get();
        b bVar = (b) this.f211043b.get();
        this.f211044c.getClass();
        i iVar = new i();
        this.f211045d.getClass();
        k kVar = new k();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f211046e.f393949a;
        F50.c.f4540c.getClass();
        return new g("PassportAuthSuggestFragment", F50.c.f4541d, new f(dVar, bVar, screenPerformanceTracker, kVar, iVar));
    }
}
