package com.avito.android.mortgage.root.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;

/* compiled from: MortgageRootFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class z implements dagger.internal.h<y> {

    /* renamed from: a, reason: collision with root package name */
    public final E f203376a;

    /* renamed from: b, reason: collision with root package name */
    public final x f203377b;

    /* renamed from: c, reason: collision with root package name */
    public final u f203378c;

    /* renamed from: d, reason: collision with root package name */
    public final C f203379d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f203380e;

    public z(E e12, x xVar, u uVar, C c12, Provider provider) {
        this.f203376a = e12;
        this.f203377b = xVar;
        this.f203378c = uVar;
        this.f203379d = c12;
        this.f203380e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        D d12 = (D) this.f203376a.get();
        w wVar = (w) this.f203377b.get();
        s sVar = (s) this.f203378c.get();
        this.f203379d.getClass();
        return new y(this.f203380e.get(), sVar, wVar, new A(), d12);
    }
}
