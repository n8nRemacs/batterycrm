package com.avito.android.tariff_lf_constructor.configure.size.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ConstructorConfigureSizeViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f300389a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f300390b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35224a> f300391c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35228e> f300392d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.tariff_lf_constructor.configure.a> f300393e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f300394f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f300395g;

    public k(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f300389a = lVar;
        this.f300390b = lVar2;
        this.f300391c = provider;
        this.f300392d = provider2;
        this.f300393e = provider3;
        this.f300394f = provider4;
        this.f300395g = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((String) this.f300389a.f393949a, (String) this.f300390b.f393949a, this.f300391c.get(), this.f300392d.get(), this.f300393e.get(), this.f300394f.get(), (ScreenPerformanceTracker) this.f300395g.get());
    }
}
