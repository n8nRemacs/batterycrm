package com.avito.android.extended_profile.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;

/* compiled from: ExtendedProfileFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.extended_profile.mvi.z, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30475z implements dagger.internal.h<C30474y> {

    /* renamed from: a, reason: collision with root package name */
    public final C30472w f150434a;

    /* renamed from: b, reason: collision with root package name */
    public final B f150435b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f150436c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f150437d;

    public C30475z(C30472w c30472w, B b12, t0 t0Var, Provider provider) {
        this.f150434a = c30472w;
        this.f150435b = b12;
        this.f150436c = t0Var;
        this.f150437d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30451a c30451a = (C30451a) this.f150434a.get();
        this.f150435b.getClass();
        A a12 = new A();
        C c12 = (C) this.f150436c.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f150437d.get();
        com.avito.android.extended_profile.mvi.entity.a.f150238m.getClass();
        return new C30474y("ExtendedProfile", com.avito.android.extended_profile.mvi.entity.a.f150239n, new C30473x(c30451a, screenPerformanceTracker, c12, a12));
    }
}
