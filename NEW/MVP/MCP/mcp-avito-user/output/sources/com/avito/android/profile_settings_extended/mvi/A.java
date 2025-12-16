package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import java.util.List;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSettingsFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class A implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final x f230377a;

    /* renamed from: b, reason: collision with root package name */
    public final P f230378b;

    /* renamed from: c, reason: collision with root package name */
    public final V f230379c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f230380d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f230381e;

    public A(x xVar, P p12, V v12, Provider provider, dagger.internal.l lVar) {
        this.f230377a = xVar;
        this.f230378b = p12;
        this.f230379c = v12;
        this.f230380d = provider;
        this.f230381e = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C33480a c33480a = (C33480a) this.f230377a.get();
        O o12 = (O) this.f230378b.get();
        Q q12 = (Q) this.f230379c.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f230380d.get();
        List list = (List) this.f230381e.f393949a;
        com.avito.android.profile_settings_extended.mvi.entity.a.f230659m.getClass();
        return new z("ExtendedProfileSettings", com.avito.android.profile_settings_extended.mvi.entity.a.a(com.avito.android.profile_settings_extended.mvi.entity.a.f230660n, null, null, false, list, null, null, null, null, null, null, null, 2039), new y(c33480a, screenPerformanceTracker, q12, o12));
    }
}
