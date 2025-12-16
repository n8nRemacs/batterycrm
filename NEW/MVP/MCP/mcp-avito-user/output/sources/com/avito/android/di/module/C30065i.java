package com.avito.android.di.module;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;

/* compiled from: ActivityPerformanceTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30065i implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f144331a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C28478k> f144332b;

    public C30065i(Provider<InterfaceC28481c> provider, Provider<C28478k> provider2) {
        this.f144331a = provider;
        this.f144332b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f144331a.get();
        C28478k c28478k = this.f144332b.get();
        C30054h.f144307a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
