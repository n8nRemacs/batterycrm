package com.avito.android.soa_stat.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.soa_stat.di.a;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SoaStatProfileSettingsTrackerModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final u f284056a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f284057b;

    public g(u uVar, Provider provider) {
        this.f284056a = uVar;
        this.f284057b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C28478k c28478k = (C28478k) this.f284056a.get();
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.e) this.f284057b).get();
        e.f284054a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
