package com.avito.android.avl.mvi;

import Lg.InterfaceC14391b;
import Mg.InterfaceC14486a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvlPlayerActor_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14391b> f98245a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14486a> f98246b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f98247c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.avl_analytics.a> f98248d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.loaders.n> f98249e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.loaders.j> f98250f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f98251g;

    public o(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f98245a = provider;
        this.f98246b = provider2;
        this.f98247c = lVar;
        this.f98248d = provider3;
        this.f98249e = provider4;
        this.f98250f = provider5;
        this.f98251g = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f98245a.get(), this.f98246b.get(), (String) this.f98247c.f393949a, this.f98248d.get(), this.f98249e.get(), this.f98250f.get(), (ScreenPerformanceTracker) this.f98251g.get());
    }
}
