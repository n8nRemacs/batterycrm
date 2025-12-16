package com.avito.android.early_access.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.avito.android.early_access.mvi.entity.EarlyAccessInternalAction;
import com.avito.android.early_access.mvi.entity.EarlyAccessState;
import javax.inject.Provider;

/* compiled from: EarlyAccessFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class r implements dagger.internal.h<C30300q> {

    /* renamed from: a, reason: collision with root package name */
    public final C30298o f145526a;

    /* renamed from: b, reason: collision with root package name */
    public final C30293j f145527b;

    /* renamed from: c, reason: collision with root package name */
    public final C30306x f145528c;

    /* renamed from: d, reason: collision with root package name */
    public final C30308z f145529d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f145530e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f145531f;

    public r(C30298o c30298o, C30293j c30293j, C30306x c30306x, C30308z c30308z, Provider provider, dagger.internal.l lVar) {
        this.f145526a = c30298o;
        this.f145527b = c30293j;
        this.f145528c = c30306x;
        this.f145529d = c30308z;
        this.f145530e = provider;
        this.f145531f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C30297n c30297n = (C30297n) this.f145526a.get();
        C30292i c30292i = (C30292i) this.f145527b.get();
        this.f145528c.getClass();
        C30305w c30305w = new C30305w();
        C30307y c30307y = (C30307y) this.f145529d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f145530e.get();
        EarlyAccessInternalAction.Initial initial = new EarlyAccessInternalAction.Initial((ReEarlyAccessData) this.f145531f.f393949a);
        EarlyAccessState.f145472b.getClass();
        return new C30300q("EarlyAccess", c30307y.a(initial, EarlyAccessState.f145473c), new C30299p(c30297n, c30292i, screenPerformanceTracker, c30307y, c30305w));
    }
}
