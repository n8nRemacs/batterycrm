package com.avito.android.messenger.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.messenger.di.C32453l0;
import javax.inject.Provider;

/* compiled from: ChannelFragmentModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class T implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195706a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f195707b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f195708c;

    public T(C32431e c32431e, Provider provider, dagger.internal.l lVar) {
        this.f195706a = c32431e;
        this.f195707b = provider;
        this.f195708c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((C32453l0.b.g0) this.f195707b).get();
        C28478k c28478k = (C28478k) this.f195708c.f393949a;
        this.f195706a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
