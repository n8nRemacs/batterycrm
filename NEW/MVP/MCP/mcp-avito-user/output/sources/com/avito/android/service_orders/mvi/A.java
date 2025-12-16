package com.avito.android.service_orders.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.service_orders.mvi.entity.ServiceOrdersListState;
import javax.inject.Provider;

/* compiled from: ServiceOrdersListFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class A implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final x f279443a;

    /* renamed from: b, reason: collision with root package name */
    public final v f279444b;

    /* renamed from: c, reason: collision with root package name */
    public final D f279445c;

    /* renamed from: d, reason: collision with root package name */
    public final F f279446d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f279447e;

    public A(x xVar, v vVar, D d12, F f12, Provider provider) {
        this.f279443a = xVar;
        this.f279444b = vVar;
        this.f279445c = d12;
        this.f279446d = f12;
        this.f279447e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        w wVar = (w) this.f279443a.get();
        s sVar = (s) this.f279444b.get();
        this.f279445c.getClass();
        B b12 = new B();
        E e12 = (E) this.f279446d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f279447e.get();
        ServiceOrdersListState.f279574h.getClass();
        return new z("ServiceOrdersList", ServiceOrdersListState.f279575i, new y(wVar, sVar, screenPerformanceTracker, e12, b12));
    }
}
