package com.avito.android.orders.feature.beduin_orders_list.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.orders.feature.beduin_orders_list.di.i;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinOrdersModule_ProvideScreenTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f210025a;

    /* renamed from: b, reason: collision with root package name */
    public final l f210026b;

    public h(l lVar, Provider provider) {
        this.f210025a = provider;
        this.f210026b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((i.b.j) this.f210025a).get();
        C28478k c28478k = (C28478k) this.f210026b.f393949a;
        d.f210016a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
