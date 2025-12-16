package com.avito.android.order.feature.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;

/* compiled from: OrderFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final t f209709a;

    /* renamed from: b, reason: collision with root package name */
    public final C f209710b;

    /* renamed from: c, reason: collision with root package name */
    public final l f209711c;

    /* renamed from: d, reason: collision with root package name */
    public final y f209712d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f209713e;

    public w(t tVar, C c12, l lVar, y yVar, Provider provider) {
        this.f209709a = tVar;
        this.f209710b = c12;
        this.f209711c = lVar;
        this.f209712d = yVar;
        this.f209713e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        s sVar = (s) this.f209709a.get();
        this.f209710b.getClass();
        B b12 = new B();
        C32941a c32941a = (C32941a) this.f209711c.get();
        this.f209712d.getClass();
        x xVar = new x();
        return new v("Order", new P40.c(null, null, 0L, null, false, 31, null), new u(sVar, this.f209713e.get(), b12, c32941a, xVar));
    }
}
