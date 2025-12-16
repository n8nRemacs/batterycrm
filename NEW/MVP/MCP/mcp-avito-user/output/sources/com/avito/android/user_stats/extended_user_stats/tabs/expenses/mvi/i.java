package com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesTabState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExpensesTabFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f317845a;

    /* renamed from: b, reason: collision with root package name */
    public final d f317846b;

    /* renamed from: c, reason: collision with root package name */
    public final k f317847c;

    /* renamed from: d, reason: collision with root package name */
    public final n f317848d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f317849e;

    public i(f fVar, d dVar, k kVar, n nVar, Provider provider) {
        this.f317845a = fVar;
        this.f317846b = dVar;
        this.f317847c = kVar;
        this.f317848d = nVar;
        this.f317849e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f317845a.getClass();
        e eVar = new e();
        c cVar = (c) this.f317846b.get();
        this.f317847c.getClass();
        j jVar = new j();
        l lVar = (l) this.f317848d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f317849e.get();
        ExpensesTabState.f317824o.getClass();
        return new h("ExpensesTabFragment", ExpensesTabState.f317825p, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
