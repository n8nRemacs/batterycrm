package com.avito.android.map.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.map.MapArguments;
import com.avito.android.map.mvi.entity.MapInternalAction;
import com.avito.android.map.mvi.entity.a;
import javax.inject.Provider;

/* compiled from: MapFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.map.mvi.x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31634x implements dagger.internal.h<C31633w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.arch.mvi.b<MapInternalAction>> f185315a;

    /* renamed from: b, reason: collision with root package name */
    public final C31629s f185316b;

    /* renamed from: c, reason: collision with root package name */
    public final O f185317c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f185318d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f185319e;

    public C31634x(Provider provider, C31629s c31629s, O o12, dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f185315a = provider;
        this.f185316b = c31629s;
        this.f185317c = o12;
        this.f185318d = lVar;
        this.f185319e = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.arch.mvi.b<MapInternalAction> bVar = this.f185315a.get();
        C31612a c31612a = (C31612a) this.f185316b.get();
        M m12 = (M) this.f185317c.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f185318d.f393949a;
        MapArguments mapArguments = (MapArguments) this.f185319e.f393949a;
        com.avito.android.map.mvi.entity.a.f185146E.getClass();
        return new C31633w("Map", a.b.a(mapArguments), new C31632v(bVar, c31612a, screenPerformanceTracker, m12));
    }
}
