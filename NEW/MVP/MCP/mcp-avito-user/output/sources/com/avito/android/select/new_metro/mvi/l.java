package com.avito.android.select.new_metro.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.select.new_metro.ItemsHolder;
import com.avito.android.select.new_metro.mvi.entity.SelectMetroState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectMetroFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ItemsHolder> f266283a;

    /* renamed from: b, reason: collision with root package name */
    public final h f266284b;

    /* renamed from: c, reason: collision with root package name */
    public final f f266285c;

    /* renamed from: d, reason: collision with root package name */
    public final n f266286d;

    /* renamed from: e, reason: collision with root package name */
    public final s f266287e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f266288f;

    public l(Provider provider, h hVar, f fVar, n nVar, s sVar, Provider provider2) {
        this.f266283a = provider;
        this.f266284b = hVar;
        this.f266285c = fVar;
        this.f266286d = nVar;
        this.f266287e = sVar;
        this.f266288f = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ItemsHolder itemsHolder = this.f266283a.get();
        g gVar = (g) this.f266284b.get();
        e eVar = (e) this.f266285c.get();
        this.f266286d.getClass();
        m mVar = new m();
        o oVar = (o) this.f266287e.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f266288f.get();
        SelectMetroState.f266247h.getClass();
        return new j("SelectMetro", SelectMetroState.a.a(null, itemsHolder), new i(gVar, eVar, screenPerformanceTracker, oVar, mVar));
    }
}
