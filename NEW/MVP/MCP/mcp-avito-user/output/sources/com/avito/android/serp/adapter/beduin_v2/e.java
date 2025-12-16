package com.avito.android.serp.adapter.beduin_v2;

import com.avito.android.C36135w2;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import iT.InterfaceC41342b;
import javax.inject.Provider;

/* compiled from: BeduinV2ItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f269012a;

    /* renamed from: b, reason: collision with root package name */
    public final l f269013b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.lib.beduin_v2.feature.item.b> f269014c;

    /* renamed from: d, reason: collision with root package name */
    public final l f269015d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C36135w2> f269016e;

    public e(l lVar, l lVar2, l lVar3, Provider provider, Provider provider2) {
        this.f269012a = lVar;
        this.f269013b = lVar2;
        this.f269014c = provider;
        this.f269015d = lVar3;
        this.f269016e = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Screen) this.f269012a.f393949a, (ScreenPerformanceTracker) this.f269013b.f393949a, this.f269014c.get(), (InterfaceC41342b) this.f269015d.f393949a, this.f269016e.get());
    }
}
