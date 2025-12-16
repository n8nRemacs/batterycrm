package com.avito.android.tariff_lf_constructor.configure.locations.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConstructorConfigureLocationsViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f299971a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f299972b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<e> f299973c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.tariff_lf_constructor.configure.a> f299974d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<a> f299975e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l> f299976f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.tariff_lf_constructor.configure.checkbox_selector.e> f299977g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f299978h;

    /* renamed from: i, reason: collision with root package name */
    public final u f299979i;

    public k(dagger.internal.l lVar, dagger.internal.l lVar2, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f299971a = lVar;
        this.f299972b = lVar2;
        this.f299973c = provider;
        this.f299974d = provider2;
        this.f299975e = provider3;
        this.f299976f = provider4;
        this.f299977g = provider5;
        this.f299978h = provider6;
        this.f299979i = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((String) this.f299971a.f393949a, (String) this.f299972b.f393949a, this.f299973c.get(), this.f299974d.get(), this.f299975e.get(), this.f299976f.get(), this.f299977g.get(), this.f299978h.get(), (ScreenPerformanceTracker) this.f299979i.get());
    }
}
