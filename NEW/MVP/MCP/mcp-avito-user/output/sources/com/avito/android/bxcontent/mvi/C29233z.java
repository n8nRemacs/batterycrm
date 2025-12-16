package com.avito.android.bxcontent.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import javax.inject.Provider;

/* compiled from: BxContentFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.bxcontent.mvi.z, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29233z implements dagger.internal.h<C29231y> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.arch.mvi.b<BxContentInternalAction>> f112632a;

    /* renamed from: b, reason: collision with root package name */
    public final C29219s f112633b;

    /* renamed from: c, reason: collision with root package name */
    public final K0 f112634c;

    /* renamed from: d, reason: collision with root package name */
    public final B f112635d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f112636e;

    public C29233z(Provider provider, C29219s c29219s, K0 k02, B b12, dagger.internal.l lVar) {
        this.f112632a = provider;
        this.f112633b = c29219s;
        this.f112634c = k02;
        this.f112635d = b12;
        this.f112636e = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.arch.mvi.b<BxContentInternalAction> bVar = this.f112632a.get();
        C29105a c29105a = (C29105a) this.f112633b.get();
        J0 j02 = (J0) this.f112634c.get();
        return new C29231y("BxContent", ((A) this.f112635d.get()).a(), new C29229x(bVar, c29105a, (ScreenPerformanceTracker) this.f112636e.f393949a, j02));
    }
}
