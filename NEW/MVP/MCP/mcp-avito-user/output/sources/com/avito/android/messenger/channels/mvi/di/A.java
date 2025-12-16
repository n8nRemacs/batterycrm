package com.avito.android.messenger.channels.mvi.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.messenger.channels.mvi.di.C;
import javax.inject.Provider;

/* compiled from: ChannelsModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class A implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f187272a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f187273b;

    public A(dagger.internal.l lVar, Provider provider) {
        this.f187272a = provider;
        this.f187273b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((C.c.J) this.f187272a).get();
        C28478k c28478k = (C28478k) this.f187273b.f393949a;
        r.f187438a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
