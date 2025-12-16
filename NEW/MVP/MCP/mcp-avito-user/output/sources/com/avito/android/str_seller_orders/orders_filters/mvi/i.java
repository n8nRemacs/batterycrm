package com.avito.android.str_seller_orders.orders_filters.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrOrdersFiltersFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f289201a;

    /* renamed from: b, reason: collision with root package name */
    public final c f289202b;

    /* renamed from: c, reason: collision with root package name */
    public final k f289203c;

    /* renamed from: d, reason: collision with root package name */
    public final m f289204d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f289205e;

    public i(e eVar, c cVar, k kVar, m mVar, Provider provider) {
        this.f289201a = eVar;
        this.f289202b = cVar;
        this.f289203c = kVar;
        this.f289204d = mVar;
        this.f289205e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f289201a.get();
        this.f289202b.getClass();
        b bVar = new b();
        this.f289203c.getClass();
        j jVar = new j();
        l lVar = (l) this.f289204d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f289205e.get();
        qz0.c.f429547i.getClass();
        return new g(StrOrdersFiltersScreen.f289184d.f90471b, qz0.c.f429548j, new f(dVar, bVar, screenPerformanceTracker, lVar, jVar));
    }
}
