package com.avito.android.user_viewed.di.module.internal;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserViewedScreenModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f318328a;

    /* renamed from: b, reason: collision with root package name */
    public final l f318329b;

    public h(l lVar, Provider provider) {
        this.f318328a = provider;
        this.f318329b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f318328a.get();
        C28478k c28478k = (C28478k) this.f318329b.f393949a;
        int i12 = g.f318327a;
        return interfaceC28481c.a(c28478k);
    }
}
