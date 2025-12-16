package com.avito.android.publish.details.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;

/* compiled from: PublishDetailsAnalyticsModule_ProvidesScreenTrackerFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class r implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final C33735p f234587a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f234588b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f234589c;

    public r(C33735p c33735p, dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f234587a = c33735p;
        this.f234588b = uVar;
        this.f234589c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return ((InterfaceC28481c) this.f234588b.get()).a(new C28478k((Screen) this.f234589c.get(), this.f234587a.f234580b, null, 4, null));
    }
}
