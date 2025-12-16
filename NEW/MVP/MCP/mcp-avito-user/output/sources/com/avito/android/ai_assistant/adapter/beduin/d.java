package com.avito.android.ai_assistant.adapter.beduin;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import iT.InterfaceC41342b;
import javax.inject.Provider;

/* compiled from: BeduinItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f88771a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f88772b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.lib.beduin_v2.feature.item.b> f88773c;

    /* renamed from: d, reason: collision with root package name */
    public final l f88774d;

    public d(l lVar, l lVar2, Provider provider, Provider provider2) {
        this.f88771a = lVar;
        this.f88772b = provider;
        this.f88773c = provider2;
        this.f88774d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((C28478k) this.f88771a.f393949a, this.f88772b.get(), this.f88773c.get(), (InterfaceC41342b) this.f88774d.f393949a);
    }
}
