package com.avito.android.comfortable_deal.deal.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.deal.model.DealArguments;
import com.avito.android.comfortable_deal.repository.model.CommentsFilter;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;

/* compiled from: DealFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class A implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final x f121563a;

    /* renamed from: b, reason: collision with root package name */
    public final v f121564b;

    /* renamed from: c, reason: collision with root package name */
    public final C f121565c;

    /* renamed from: d, reason: collision with root package name */
    public final E f121566d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f121567e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f121568f;

    public A(x xVar, v vVar, C c12, E e12, dagger.internal.u uVar, dagger.internal.l lVar) {
        this.f121563a = xVar;
        this.f121564b = vVar;
        this.f121565c = c12;
        this.f121566d = e12;
        this.f121567e = uVar;
        this.f121568f = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        w wVar = (w) this.f121563a.get();
        C29453a c29453a = (C29453a) this.f121564b.get();
        B b12 = (B) this.f121565c.get();
        D d12 = (D) this.f121566d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f121567e.get();
        DealArguments dealArguments = (DealArguments) this.f121568f.f393949a;
        Ep.c.f4324i.getClass();
        DealArguments.DealIdArguments dealIdArguments = dealArguments instanceof DealArguments.DealIdArguments ? (DealArguments.DealIdArguments) dealArguments : null;
        return new z("Deal", new Ep.c(dealIdArguments != null ? dealIdArguments.f121560b : null, null, null, null, null, null, new Ep.d(null, C42784z0.f406748b, null, null, null, P0.c(), null, CommentsFilter.f122615c, true, false, false)), new y(wVar, c29453a, screenPerformanceTracker, d12, b12));
    }
}
