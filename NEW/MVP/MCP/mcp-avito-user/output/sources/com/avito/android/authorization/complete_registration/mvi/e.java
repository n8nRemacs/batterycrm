package com.avito.android.authorization.complete_registration.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CompleteRegistrationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final b f93461a;

    /* renamed from: b, reason: collision with root package name */
    public final l f93462b;

    /* renamed from: c, reason: collision with root package name */
    public final n f93463c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f93464d;

    public e(b bVar, l lVar, n nVar, Provider provider) {
        this.f93461a = bVar;
        this.f93462b = lVar;
        this.f93463c = nVar;
        this.f93464d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f93461a.get();
        this.f93462b.getClass();
        k kVar = new k();
        this.f93463c.getClass();
        m mVar = new m();
        ScreenPerformanceTracker screenPerformanceTracker = this.f93464d.get();
        ee.c.f395277g.getClass();
        return new d("CompleteRegistration", ee.c.f395278h, new c(aVar, screenPerformanceTracker, mVar, kVar));
    }
}
