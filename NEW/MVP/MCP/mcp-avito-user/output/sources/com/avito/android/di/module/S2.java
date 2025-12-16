package com.avito.android.di.module;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;

/* compiled from: ComposablePerformanceTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class S2 implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f144125a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f144126b;

    public S2(dagger.internal.l lVar, Provider provider) {
        this.f144125a = provider;
        this.f144126b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f144125a.get();
        C28478k c28478k = (C28478k) this.f144126b.f393949a;
        R2.f144114a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
