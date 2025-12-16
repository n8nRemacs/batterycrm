package com.avito.android.soa_stat.profile_settings.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SoaStatSettingFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final p f284216a;

    /* renamed from: b, reason: collision with root package name */
    public final w f284217b;

    /* renamed from: c, reason: collision with root package name */
    public final u f284218c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f284219d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f284220e;

    public s(p pVar, w wVar, u uVar, Provider provider, Provider provider2) {
        this.f284216a = pVar;
        this.f284217b = wVar;
        this.f284218c = uVar;
        this.f284219d = provider;
        this.f284220e = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f284216a.get();
        this.f284217b.getClass();
        v vVar = new v();
        this.f284218c.getClass();
        t tVar = new t();
        R0 r02 = this.f284219d.get();
        return new r("SoaStatProfileSettingFeature", new Vw0.c(null, 1, 0 == true ? 1 : 0), new q(aVar, this.f284220e.get(), vVar, tVar, r02));
    }
}
