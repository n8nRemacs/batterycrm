package com.avito.android.str_seller_orders.orders.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders.orders.di.a;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrOrdersFragmentModule_ProvideScreenTrackerFactoryForFragmentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f288861a;

    /* renamed from: b, reason: collision with root package name */
    public final u f288862b;

    public f(u uVar, Provider provider) {
        this.f288861a = provider;
        this.f288862b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.b) this.f288861a).get();
        C28478k c28478k = (C28478k) this.f288862b.get();
        c.f288859a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
