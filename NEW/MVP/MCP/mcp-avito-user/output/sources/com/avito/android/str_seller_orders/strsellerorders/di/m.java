package com.avito.android.str_seller_orders.strsellerorders.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders.strsellerorders.di.b;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersPerfModule_ProvideScreenTrackerFactoryForFragmentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final k f289776a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f289777b;

    /* renamed from: c, reason: collision with root package name */
    public final u f289778c;

    public m(k kVar, Provider provider, u uVar) {
        this.f289776a = kVar;
        this.f289777b = provider;
        this.f289778c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((b.c.d) this.f289777b).get();
        C28478k c28478k = (C28478k) this.f289778c.get();
        this.f289776a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
