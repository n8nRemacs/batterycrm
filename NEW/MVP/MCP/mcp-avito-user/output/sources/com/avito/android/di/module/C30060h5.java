package com.avito.android.di.module;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;

/* compiled from: FragmentPerformanceTrackerModule_ProvideScreenTrackerFactoryForFragmentFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.h5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30060h5 implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f144324a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C28478k> f144325b;

    public C30060h5(Provider<InterfaceC28481c> provider, Provider<C28478k> provider2) {
        this.f144324a = provider;
        this.f144325b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f144324a.get();
        C28478k c28478k = this.f144325b.get();
        C30049g5.f144303a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
