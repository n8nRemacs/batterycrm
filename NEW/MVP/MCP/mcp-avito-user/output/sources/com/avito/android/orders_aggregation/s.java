package com.avito.android.orders_aggregation;

import androidx.view.InterfaceC23487e;
import com.avito.android.B2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.orders_aggregation.OrdersAggregationIntentFactory;
import com.avito.android.util.R0;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OrdersAggregationViewModelFactory_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC23487e> f210310a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<f> f210311b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f210312c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f210313d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<B2> f210314e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f210315f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f210316g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<OrdersAggregationTabShownStatusStorage> f210317h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f210318i;

    public s(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f210310a = provider;
        this.f210311b = provider2;
        this.f210312c = provider3;
        this.f210313d = lVar;
        this.f210314e = provider4;
        this.f210315f = provider5;
        this.f210316g = provider6;
        this.f210317h = provider7;
        this.f210318i = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new r(this.f210310a.get(), this.f210311b.get(), this.f210312c.get(), (OrdersAggregationIntentFactory.GeneralOrdersData) this.f210313d.f393949a, this.f210314e.get(), this.f210315f.get(), this.f210316g.get(), this.f210317h.get(), (String) this.f210318i.f393949a);
    }
}
