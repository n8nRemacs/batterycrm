package com.avito.android.user_adverts_filters.main.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_adverts_filters.main.di.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAdvertsFiltersTrackerModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final u f316043a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f316044b;

    public h(u uVar, Provider provider) {
        this.f316043a = uVar;
        this.f316044b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C28478k c28478k = (C28478k) this.f316043a.get();
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.h) this.f316044b).get();
        f.f316041a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
