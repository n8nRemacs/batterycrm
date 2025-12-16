package com.avito.android.str_seller_orders.strsellerorders.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final k f290054a;

    /* renamed from: b, reason: collision with root package name */
    public final i f290055b;

    /* renamed from: c, reason: collision with root package name */
    public final p f290056c;

    /* renamed from: d, reason: collision with root package name */
    public final r f290057d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f290058e;

    public n(k kVar, i iVar, p pVar, r rVar, Provider provider) {
        this.f290054a = kVar;
        this.f290055b = iVar;
        this.f290056c = pVar;
        this.f290057d = rVar;
        this.f290058e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = (j) this.f290054a.get();
        a aVar = (a) this.f290055b.get();
        this.f290056c.getClass();
        o oVar = new o();
        q qVar = (q) this.f290057d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f290058e.get();
        StrSellerOrdersState.f289880r.getClass();
        return new m("StrSellerOrders", StrSellerOrdersState.f289881s, new l(jVar, aVar, screenPerformanceTracker, qVar, oVar));
    }
}
