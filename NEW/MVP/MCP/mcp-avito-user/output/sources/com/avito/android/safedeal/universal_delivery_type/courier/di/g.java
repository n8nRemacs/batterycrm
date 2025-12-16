package com.avito.android.safedeal.universal_delivery_type.courier.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.safedeal.universal_delivery_type.courier.di.b;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalDeliveryTypeCourierModule_ProvideScreenTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f256498a;

    /* renamed from: b, reason: collision with root package name */
    public final l f256499b;

    public g(l lVar, Provider provider) {
        this.f256498a = provider;
        this.f256499b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((b.C7682b.e) this.f256498a).get();
        C28478k c28478k = (C28478k) this.f256499b.f393949a;
        d.f256492a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
