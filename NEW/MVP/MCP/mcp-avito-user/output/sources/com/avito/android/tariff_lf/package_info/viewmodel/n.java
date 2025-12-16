package com.avito.android.tariff_lf.package_info.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffPackageInfoViewModelFactory_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f299294a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f299295b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a> f299296c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<e> f299297d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f299298e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f299299f;

    public n(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f299294a = lVar;
        this.f299295b = lVar2;
        this.f299296c = provider;
        this.f299297d = provider2;
        this.f299298e = provider3;
        this.f299299f = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m((String) this.f299294a.f393949a, (String) this.f299295b.f393949a, this.f299296c.get(), this.f299297d.get(), this.f299298e.get(), (ScreenPerformanceTracker) this.f299299f.get());
    }
}
