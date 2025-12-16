package com.avito.android.str_seller_orders.orders_seller.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders.orders_seller.di.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersPerfModule_ProvideScreenTrackerFactoryForFragmentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final l f289322a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f289323b;

    /* renamed from: c, reason: collision with root package name */
    public final u f289324c;

    public n(l lVar, Provider provider, u uVar) {
        this.f289322a = lVar;
        this.f289323b = provider;
        this.f289324c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.C8711c) this.f289323b).get();
        C28478k c28478k = (C28478k) this.f289324c.get();
        this.f289322a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
