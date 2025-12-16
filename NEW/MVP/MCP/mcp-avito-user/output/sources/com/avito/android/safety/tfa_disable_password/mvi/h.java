package com.avito.android.safety.tfa_disable_password.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wo0.C49661c;

/* compiled from: TfaDisablePasswordFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f258132a;

    /* renamed from: b, reason: collision with root package name */
    public final c f258133b;

    /* renamed from: c, reason: collision with root package name */
    public final j f258134c;

    /* renamed from: d, reason: collision with root package name */
    public final l f258135d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f258136e;

    public h(e eVar, c cVar, j jVar, l lVar, Provider provider) {
        this.f258132a = eVar;
        this.f258133b = cVar;
        this.f258134c = jVar;
        this.f258135d = lVar;
        this.f258136e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f258132a.get();
        b bVar = (b) this.f258133b.get();
        this.f258134c.getClass();
        i iVar = new i();
        this.f258135d.getClass();
        k kVar = new k();
        ScreenPerformanceTracker screenPerformanceTracker = this.f258136e.get();
        C49661c.f441790f.getClass();
        return new g("TfaDisablePassword", C49661c.f441791g, new f(dVar, bVar, screenPerformanceTracker, kVar, iVar));
    }
}
