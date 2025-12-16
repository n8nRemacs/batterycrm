package com.avito.android.work_profile.profile.cvs.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final e f331059a;

    /* renamed from: b, reason: collision with root package name */
    public final k f331060b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f331061c;

    public g(e eVar, k kVar, Provider provider) {
        this.f331059a = eVar;
        this.f331060b = kVar;
        this.f331061c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f331059a.get();
        this.f331060b.getClass();
        return new f(this.f331061c.get(), dVar, new j());
    }
}
