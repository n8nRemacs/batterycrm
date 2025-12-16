package com.avito.android.str_seller_orders.orders_filters.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders.orders_filters.di.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrOrdersFiltersModule_ProvideScreenTrackerFactoryForFragmentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f289152a;

    /* renamed from: b, reason: collision with root package name */
    public final u f289153b;

    public k(u uVar, Provider provider) {
        this.f289152a = provider;
        this.f289153b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.C8706a) this.f289152a).get();
        C28478k c28478k = (C28478k) this.f289153b.get();
        f.f289145a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
