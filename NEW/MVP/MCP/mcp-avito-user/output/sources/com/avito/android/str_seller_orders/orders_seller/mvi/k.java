package com.avito.android.str_seller_orders.orders_seller.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f289635a;

    /* renamed from: b, reason: collision with root package name */
    public final e f289636b;

    /* renamed from: c, reason: collision with root package name */
    public final m f289637c;

    /* renamed from: d, reason: collision with root package name */
    public final o f289638d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f289639e;

    public k(g gVar, e eVar, m mVar, o oVar, Provider provider) {
        this.f289635a = gVar;
        this.f289636b = eVar;
        this.f289637c = mVar;
        this.f289638d = oVar;
        this.f289639e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f289635a.get();
        d dVar = (d) this.f289636b.get();
        this.f289637c.getClass();
        l lVar = new l();
        n nVar = (n) this.f289638d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f289639e.get();
        StrSellerOrdersState.f289574j.getClass();
        return new i(StrOrdersSellerScreen.f289530d.f90471b, StrSellerOrdersState.f289575k, new h(fVar, dVar, screenPerformanceTracker, nVar, lVar));
    }
}
