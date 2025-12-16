package com.avito.android.cart_similar_items.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;
import mn.C44104d;

/* compiled from: CartSimilarItemsFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final u f116131a;

    /* renamed from: b, reason: collision with root package name */
    public final p f116132b;

    /* renamed from: c, reason: collision with root package name */
    public final B f116133c;

    /* renamed from: d, reason: collision with root package name */
    public final z f116134d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f116135e;

    public x(u uVar, p pVar, B b12, z zVar, Provider provider) {
        this.f116131a = uVar;
        this.f116132b = pVar;
        this.f116133c = b12;
        this.f116134d = zVar;
        this.f116135e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        t tVar = (t) this.f116131a.get();
        C29353a c29353a = (C29353a) this.f116132b.get();
        A a12 = (A) this.f116133c.get();
        this.f116134d.getClass();
        y yVar = new y();
        ScreenPerformanceTracker screenPerformanceTracker = this.f116135e.get();
        C44104d.f414704l.getClass();
        return new w("CartSimilarItems", C44104d.f414705m, new v(tVar, c29353a, screenPerformanceTracker, a12, yVar));
    }
}
