package com.avito.android.profile.pro.impl.screen.item.beduin;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import iT.InterfaceC41342b;
import javax.inject.Provider;

/* compiled from: ProfileTabBeduinItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.lib.beduin_v2.feature.item.b> f223073a;

    /* renamed from: b, reason: collision with root package name */
    public final l f223074b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<ZS.b> f223075c;

    /* renamed from: d, reason: collision with root package name */
    public final u f223076d;

    public b(l lVar, u uVar, Provider provider, Provider provider2) {
        this.f223073a = provider;
        this.f223074b = lVar;
        this.f223075c = provider2;
        this.f223076d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f223073a.get(), (ScreenPerformanceTracker) this.f223074b.f393949a, this.f223075c.get(), (InterfaceC41342b) this.f223076d.get());
    }
}
