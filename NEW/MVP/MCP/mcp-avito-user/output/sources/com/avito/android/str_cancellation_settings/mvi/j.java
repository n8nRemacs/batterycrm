package com.avito.android.str_cancellation_settings.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrCancellationSettingsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f288514a;

    /* renamed from: b, reason: collision with root package name */
    public final e f288515b;

    /* renamed from: c, reason: collision with root package name */
    public final l f288516c;

    /* renamed from: d, reason: collision with root package name */
    public final n f288517d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f288518e;

    public j(g gVar, e eVar, l lVar, n nVar, Provider provider) {
        this.f288514a = gVar;
        this.f288515b = eVar;
        this.f288516c = lVar;
        this.f288517d = nVar;
        this.f288518e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f288514a.get();
        a aVar = (a) this.f288515b.get();
        this.f288516c.getClass();
        k kVar = new k();
        m mVar = (m) this.f288517d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f288518e.get();
        StrCancellationSettingsState.f288460o.getClass();
        return new i("StrCancellationSettings", StrCancellationSettingsState.f288461p, new h(fVar, aVar, screenPerformanceTracker, mVar, kVar));
    }
}
