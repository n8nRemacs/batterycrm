package com.avito.android.user_advert.advert.items.stats_beduin;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import iT.InterfaceC41342b;

/* compiled from: MyAdvertStatsBeduinItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f310307a;

    /* renamed from: b, reason: collision with root package name */
    public final l f310308b;

    /* renamed from: c, reason: collision with root package name */
    public final u f310309c;

    /* renamed from: d, reason: collision with root package name */
    public final u f310310d;

    public c(l lVar, u uVar, u uVar2, u uVar3) {
        this.f310307a = uVar;
        this.f310308b = lVar;
        this.f310309c = uVar2;
        this.f310310d = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.lib.beduin_v2.feature.item.b) this.f310307a.get(), (ScreenPerformanceTracker) this.f310308b.f393949a, (ZS.b) this.f310309c.get(), (InterfaceC41342b) this.f310310d.get());
    }
}
