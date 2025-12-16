package com.avito.android.messenger.channels.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.messenger.channels.mvi.sync.z0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChannelsTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f187120a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<b> f187121b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<z0> f187122c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<MessengerStatsdEventFactory> f187123d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f187124e;

    public f(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f187120a = uVar;
        this.f187121b = provider;
        this.f187122c = provider2;
        this.f187123d = provider3;
        this.f187124e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((ScreenPerformanceTracker) this.f187120a.get(), this.f187121b.get(), this.f187122c.get(), this.f187123d.get(), this.f187124e.get());
    }
}
