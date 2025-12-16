package com.avito.android.str_seller_orders.strsellerordersrange.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders.strsellerordersrange.di.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersRangeModule_ProvideScreenTrackerFactoryForFragmentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f290242a;

    /* renamed from: b, reason: collision with root package name */
    public final u f290243b;

    public k(u uVar, Provider provider) {
        this.f290242a = provider;
        this.f290243b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.b) this.f290242a).get();
        C28478k c28478k = (C28478k) this.f290243b.get();
        f.f290236a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
