package com.avito.android.wallet.history.mvi.components;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.wallet.history.mvi.entity.WalletHistoryState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WalletHistoryFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f327598a;

    /* renamed from: b, reason: collision with root package name */
    public final e f327599b;

    /* renamed from: c, reason: collision with root package name */
    public final n f327600c;

    /* renamed from: d, reason: collision with root package name */
    public final p f327601d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f327602e;

    public j(g gVar, e eVar, n nVar, p pVar, Provider provider) {
        this.f327598a = gVar;
        this.f327599b = eVar;
        this.f327600c = nVar;
        this.f327601d = pVar;
        this.f327602e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f327598a.get();
        d dVar = (d) this.f327599b.get();
        this.f327600c.getClass();
        m mVar = new m();
        o oVar = (o) this.f327601d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f327602e.get();
        WalletHistoryState.f327662i.getClass();
        return new i("WalletHistory", WalletHistoryState.f327663j, new h(fVar, dVar, screenPerformanceTracker, oVar, mVar));
    }
}
