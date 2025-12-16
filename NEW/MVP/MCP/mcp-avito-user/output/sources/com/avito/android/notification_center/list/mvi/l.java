package com.avito.android.notification_center.list.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotificationCenterFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final i f207710a;

    /* renamed from: b, reason: collision with root package name */
    public final n f207711b;

    /* renamed from: c, reason: collision with root package name */
    public final p f207712c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f207713d;

    public l(i iVar, n nVar, p pVar, Provider provider) {
        this.f207710a = iVar;
        this.f207711b = nVar;
        this.f207712c = pVar;
        this.f207713d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f207710a.get();
        this.f207711b.getClass();
        m mVar = new m();
        o oVar = (o) this.f207712c.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f207713d.get();
        NotificationCenterMviState.f207678h.getClass();
        return new k("NotificationCenterMvi", NotificationCenterMviState.f207679i, new j(hVar, screenPerformanceTracker, oVar, mVar));
    }
}
