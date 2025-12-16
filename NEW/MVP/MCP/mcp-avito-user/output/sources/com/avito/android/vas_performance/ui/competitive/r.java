package com.avito.android.vas_performance.ui.competitive;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_performance.InterfaceC36051e;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CompetitiveVasViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f321518a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f321519b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC36051e> f321520c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.vas_performance.repository.a> f321521d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f321522e;

    /* renamed from: f, reason: collision with root package name */
    public final u f321523f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f321524g;

    public r(dagger.internal.l lVar, dagger.internal.l lVar2, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f321518a = lVar;
        this.f321519b = lVar2;
        this.f321520c = provider;
        this.f321521d = provider2;
        this.f321522e = provider3;
        this.f321523f = uVar;
        this.f321524g = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new q((String) this.f321518a.f393949a, (String) this.f321519b.f393949a, this.f321520c.get(), this.f321521d.get(), this.f321522e.get(), (ScreenPerformanceTracker) this.f321523f.get(), this.f321524g.get());
    }
}
