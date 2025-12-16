package com.avito.android.messenger.conversation.analytics;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.messenger.channels.mvi.sync.MessengerSuccessRateTracker;
import com.avito.android.messenger.channels.mvi.sync.z0;
import com.avito.android.messenger.conversation.W1;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChannelTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f189332a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<z0> f189333b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<MessengerSuccessRateTracker> f189334c;

    /* renamed from: d, reason: collision with root package name */
    public final l f189335d;

    public d(l lVar, u uVar, Provider provider, Provider provider2) {
        this.f189332a = uVar;
        this.f189333b = provider;
        this.f189334c = provider2;
        this.f189335d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((ScreenPerformanceTracker) this.f189332a.get(), this.f189333b.get(), this.f189334c.get(), (W1) this.f189335d.f393949a);
    }
}
