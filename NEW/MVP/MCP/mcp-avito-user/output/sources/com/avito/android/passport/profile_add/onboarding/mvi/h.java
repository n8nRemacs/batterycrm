package com.avito.android.passport.profile_add.onboarding.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PassportOnboardingFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f213593a;

    /* renamed from: b, reason: collision with root package name */
    public final b f213594b;

    /* renamed from: c, reason: collision with root package name */
    public final j f213595c;

    /* renamed from: d, reason: collision with root package name */
    public final l f213596d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f213597e;

    public h(e eVar, b bVar, j jVar, l lVar, Provider provider) {
        this.f213593a = eVar;
        this.f213594b = bVar;
        this.f213595c = jVar;
        this.f213596d = lVar;
        this.f213597e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f213593a.get();
        this.f213594b.getClass();
        a aVar = new a();
        this.f213595c.getClass();
        i iVar = new i();
        this.f213596d.getClass();
        k kVar = new k();
        ScreenPerformanceTracker screenPerformanceTracker = this.f213597e.get();
        h60.c.f397005c.getClass();
        return new g("PassportOnboarding", h60.c.f397006d, new f(dVar, aVar, screenPerformanceTracker, kVar, iVar));
    }
}
