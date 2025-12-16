package com.avito.android.str_insurance.screen.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_insurance.screen.di.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrInsuranceFragmentTrackerModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final h f288711a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f288712b;

    /* renamed from: c, reason: collision with root package name */
    public final u f288713c;

    public l(h hVar, Provider provider, u uVar) {
        this.f288711a = hVar;
        this.f288712b = provider;
        this.f288713c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481cB = ((a.c.e) this.f288712b).f288693a.b();
        C28478k c28478k = (C28478k) this.f288713c.get();
        this.f288711a.getClass();
        return interfaceC28481cB.a(c28478k);
    }
}
