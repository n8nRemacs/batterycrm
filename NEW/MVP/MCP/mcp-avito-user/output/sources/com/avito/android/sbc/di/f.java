package com.avito.android.sbc.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.sbc.di.h;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreateDiscountDispatchFragmentModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f259969a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f259970b;

    public f(dagger.internal.l lVar, Provider provider) {
        this.f259969a = provider;
        this.f259970b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((h.b.k) this.f259969a).get();
        C28478k c28478k = (C28478k) this.f259970b.f393949a;
        e.f259968a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
