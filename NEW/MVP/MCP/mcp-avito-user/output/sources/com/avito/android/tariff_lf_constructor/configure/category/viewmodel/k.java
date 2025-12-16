package com.avito.android.tariff_lf_constructor.configure.category.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConstructorConfigureCategoryViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f299423a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f299424b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a> f299425c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<e> f299426d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.tariff_lf_constructor.configure.a> f299427e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f299428f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f299429g;

    public k(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f299423a = lVar;
        this.f299424b = lVar2;
        this.f299425c = provider;
        this.f299426d = provider2;
        this.f299427e = provider3;
        this.f299428f = provider4;
        this.f299429g = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((String) this.f299423a.f393949a, (String) this.f299424b.f393949a, this.f299425c.get(), this.f299426d.get(), this.f299427e.get(), this.f299428f.get(), (ScreenPerformanceTracker) this.f299429g.get());
    }
}
