package com.avito.android.profile.user_profile.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileState;
import javax.inject.Provider;

/* compiled from: UserProfileFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class g0 implements dagger.internal.h<f0> {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f226485a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f226486b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f226487c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f226488d;

    public g0(d0 d0Var, i0 i0Var, n0 n0Var, Provider provider) {
        this.f226485a = d0Var;
        this.f226486b = i0Var;
        this.f226487c = n0Var;
        this.f226488d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C33388a c33388a = (C33388a) this.f226485a.get();
        this.f226486b.getClass();
        h0 h0Var = new h0();
        l0 l0Var = (l0) this.f226487c.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f226488d.get();
        UserProfileState.f226447h.getClass();
        return new f0("UserProfile", UserProfileState.f226448i, new e0(c33388a, screenPerformanceTracker, l0Var, h0Var));
    }
}
