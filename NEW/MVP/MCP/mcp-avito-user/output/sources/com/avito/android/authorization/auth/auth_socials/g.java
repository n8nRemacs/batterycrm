package com.avito.android.authorization.auth.auth_socials;

import be.C25637d;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AuthSocialsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f92899a;

    /* renamed from: b, reason: collision with root package name */
    public final b f92900b;

    /* renamed from: c, reason: collision with root package name */
    public final s f92901c;

    /* renamed from: d, reason: collision with root package name */
    public final u f92902d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f92903e;

    public g(d dVar, b bVar, s sVar, u uVar, Provider provider) {
        this.f92899a = dVar;
        this.f92900b = bVar;
        this.f92901c = sVar;
        this.f92902d = uVar;
        this.f92903e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f92899a.get();
        a aVar = (a) this.f92900b.get();
        this.f92901c.getClass();
        r rVar = new r();
        t tVar = (t) this.f92902d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f92903e.get();
        C25637d.f57309c.getClass();
        return new f("AuthSocials", C25637d.f57310d, new e(cVar, aVar, screenPerformanceTracker, tVar, rVar));
    }
}
