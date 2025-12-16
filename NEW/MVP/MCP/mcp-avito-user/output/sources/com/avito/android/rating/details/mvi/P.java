package com.avito.android.rating.details.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import javax.inject.Provider;

/* compiled from: RatingDetailsFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class P implements dagger.internal.h<O> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.arch.mvi.b<RatingDetailsInternalAction>> f247258a;

    /* renamed from: b, reason: collision with root package name */
    public final H f247259b;

    /* renamed from: c, reason: collision with root package name */
    public final S f247260c;

    /* renamed from: d, reason: collision with root package name */
    public final U f247261d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f247262e;

    public P(Provider provider, H h12, S s5, U u12, dagger.internal.u uVar) {
        this.f247258a = provider;
        this.f247259b = h12;
        this.f247260c = s5;
        this.f247261d = u12;
        this.f247262e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.arch.mvi.b<RatingDetailsInternalAction> bVar = this.f247258a.get();
        C34175a c34175a = (C34175a) this.f247259b.get();
        Q q12 = (Q) this.f247260c.get();
        T t12 = (T) this.f247261d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f247262e.get();
        com.avito.android.rating.details.mvi.entity.b.f247417n.getClass();
        return new O("RatingDetails", com.avito.android.rating.details.mvi.entity.b.f247418o, new N(bVar, c34175a, screenPerformanceTracker, t12, q12));
    }
}
