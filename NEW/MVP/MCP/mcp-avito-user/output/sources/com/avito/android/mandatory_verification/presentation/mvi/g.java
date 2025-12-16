package com.avito.android.mandatory_verification.presentation.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mandatory_verification.screen.MandatoryVerificationScreen;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MandatoryVerificationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final b f184796a;

    /* renamed from: b, reason: collision with root package name */
    public final d f184797b;

    /* renamed from: c, reason: collision with root package name */
    public final i f184798c;

    /* renamed from: d, reason: collision with root package name */
    public final k f184799d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f184800e;

    public g(b bVar, d dVar, i iVar, k kVar, Provider provider) {
        this.f184796a = bVar;
        this.f184797b = dVar;
        this.f184798c = iVar;
        this.f184799d = kVar;
        this.f184800e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f184796a.get();
        c cVar = (c) this.f184797b.get();
        this.f184798c.getClass();
        h hVar = new h();
        j jVar = (j) this.f184799d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f184800e.get();
        UX.c.f16431c.getClass();
        return new f(MandatoryVerificationScreen.f184809d.f90471b, UX.c.f16432d, new e(aVar, cVar, screenPerformanceTracker, jVar, hVar));
    }
}
