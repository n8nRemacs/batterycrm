package com.avito.android.seller_promotions.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;

/* compiled from: SellerPromotionsFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class A implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final x f267884a;

    /* renamed from: b, reason: collision with root package name */
    public final t f267885b;

    /* renamed from: c, reason: collision with root package name */
    public final I f267886c;

    /* renamed from: d, reason: collision with root package name */
    public final G f267887d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f267888e;

    public A(x xVar, t tVar, I i12, G g12, Provider provider) {
        this.f267884a = xVar;
        this.f267885b = tVar;
        this.f267886c = i12;
        this.f267887d = g12;
        this.f267888e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        w wVar = (w) this.f267884a.get();
        C34670a c34670a = (C34670a) this.f267885b.get();
        H h12 = (H) this.f267886c.get();
        this.f267887d.getClass();
        F f12 = new F();
        ScreenPerformanceTracker screenPerformanceTracker = this.f267888e.get();
        Oq0.g.f12614k.getClass();
        return new z("SellerPromotions", Oq0.g.f12615l, new y(wVar, c34670a, screenPerformanceTracker, h12, f12));
    }
}
