package com.avito.android.str_seller_orders.orders_buyer.mvi;

import com.avito.android.analytics.screens.StrOrdersBuyerScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import pz0.C47173d;

/* compiled from: StrOrdersBuyerFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f289093a;

    /* renamed from: b, reason: collision with root package name */
    public final c f289094b;

    /* renamed from: c, reason: collision with root package name */
    public final j f289095c;

    /* renamed from: d, reason: collision with root package name */
    public final l f289096d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f289097e;

    public h(e eVar, c cVar, j jVar, l lVar, Provider provider) {
        this.f289093a = eVar;
        this.f289094b = cVar;
        this.f289095c = jVar;
        this.f289096d = lVar;
        this.f289097e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f289093a.get();
        b bVar = (b) this.f289094b.get();
        this.f289095c.getClass();
        i iVar = new i();
        k kVar = (k) this.f289096d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f289097e.get();
        String str = StrOrdersBuyerScreen.f90515d.f90471b;
        C47173d.f428930d.getClass();
        return new g(str, C47173d.f428931e, new f(dVar, bVar, iVar, screenPerformanceTracker, kVar));
    }
}
