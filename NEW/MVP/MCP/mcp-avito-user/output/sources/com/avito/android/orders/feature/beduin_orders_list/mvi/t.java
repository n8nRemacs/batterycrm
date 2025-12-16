package com.avito.android.orders.feature.beduin_orders_list.mvi;

import Z40.c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;

/* compiled from: BeduinOrdersFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final q f210161a;

    /* renamed from: b, reason: collision with root package name */
    public final e f210162b;

    /* renamed from: c, reason: collision with root package name */
    public final v f210163c;

    /* renamed from: d, reason: collision with root package name */
    public final x f210164d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.orders.feature.beduin_orders_list.di.h f210165e;

    public t(q qVar, e eVar, v vVar, x xVar, com.avito.android.orders.feature.beduin_orders_list.di.h hVar) {
        this.f210161a = qVar;
        this.f210162b = eVar;
        this.f210163c = vVar;
        this.f210164d = xVar;
        this.f210165e = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        p pVar = (p) this.f210161a.get();
        C32944a c32944a = (C32944a) this.f210162b.get();
        this.f210163c.getClass();
        u uVar = new u();
        this.f210164d.getClass();
        w wVar = new w();
        return new s("BeduinOrders", new c.C1417c(null, 1, null), new r(pVar, c32944a, (ScreenPerformanceTracker) this.f210165e.get(), wVar, uVar));
    }
}
