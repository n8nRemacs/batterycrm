package com.avito.android.brandspace.di;

import com.avito.android.analytics.screens.tracker.F;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import pk.InterfaceC47104b;

/* compiled from: BrandspaceFragmentModule_ProvideScreenPerformanceTracker$_avito_brandspace_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC47104b> f107688a;

    public h(Provider<InterfaceC47104b> provider) {
        this.f107688a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC47104b interfaceC47104b = this.f107688a.get();
        d dVar = d.f107680a;
        F fR2 = interfaceC47104b.r();
        t.d(fR2);
        return fR2;
    }
}
