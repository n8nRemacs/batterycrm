package com.avito.android.vas_performance.di.visual_legacy;

import com.avito.android.analytics.screens.tracker.H;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LegacyVisualVasAnalyticsModule_ProvideTrackedContentInfo$_avito_vas_performance_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<H.c> {

    /* renamed from: a, reason: collision with root package name */
    public final d f320173a;

    public e(d dVar) {
        this.f320173a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f320173a.get();
        c.f320171a.getClass();
        return new H.c(str, false);
    }
}
