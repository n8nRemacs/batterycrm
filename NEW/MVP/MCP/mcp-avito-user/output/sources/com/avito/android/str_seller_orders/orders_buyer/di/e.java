package com.avito.android.str_seller_orders.orders_buyer.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders.orders_buyer.di.a;
import com.avito.android.str_seller_orders.orders_buyer.di.c;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrOrdersBuyerFragmentModule_StrOrdersBuyerSupportModule_ProvideScreenTrackerFactoryForFragmentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f288956a;

    /* renamed from: b, reason: collision with root package name */
    public final u f288957b;

    public e(u uVar, Provider provider) {
        this.f288956a = provider;
        this.f288957b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.b) this.f288956a).get();
        C28478k c28478k = (C28478k) this.f288957b.get();
        c.a.f288954a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
