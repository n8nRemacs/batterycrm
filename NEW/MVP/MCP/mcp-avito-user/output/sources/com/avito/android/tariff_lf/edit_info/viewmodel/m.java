package com.avito.android.tariff_lf.edit_info.viewmodel;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: EditInfoViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f299107a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35211e> f299108b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35207a> f299109c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f299110d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f299111e;

    public m(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f299107a = lVar;
        this.f299108b = provider;
        this.f299109c = provider2;
        this.f299110d = provider3;
        this.f299111e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((String) this.f299107a.f393949a, this.f299108b.get(), this.f299109c.get(), this.f299110d.get(), (ScreenPerformanceTracker) this.f299111e.get());
    }
}
