package com.avito.android.guests_selector.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.guests_selector.di.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GuestsSelectorTrackerModule_ProvideScreenTrackerFactoryForFragmentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f161436a;

    /* renamed from: b, reason: collision with root package name */
    public final u f161437b;

    public k(u uVar, Provider provider) {
        this.f161436a = provider;
        this.f161437b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.C4730a) this.f161436a).get();
        C28478k c28478k = (C28478k) this.f161437b.get();
        i.f161434a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
