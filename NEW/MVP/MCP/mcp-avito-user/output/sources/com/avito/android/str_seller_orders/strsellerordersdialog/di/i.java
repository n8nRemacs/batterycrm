package com.avito.android.str_seller_orders.strsellerordersdialog.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders.strsellerordersdialog.di.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersDialogModule_ProvideScreenTrackerFactoryForFragmentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final g f290124a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f290125b;

    /* renamed from: c, reason: collision with root package name */
    public final u f290126c;

    public i(g gVar, Provider provider, u uVar) {
        this.f290124a = gVar;
        this.f290125b = provider;
        this.f290126c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.C8750a) this.f290125b).get();
        C28478k c28478k = (C28478k) this.f290126c.get();
        this.f290124a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
