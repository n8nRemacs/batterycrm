package com.avito.android.similar_adverts.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.SimilarAdvertsListScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.similar_adverts.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SimilarAdvertsListTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f283919a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f283920b;

    public k(dagger.internal.l lVar, Provider provider) {
        this.f283919a = provider;
        this.f283920b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.o) this.f283919a).get();
        r rVar = (r) this.f283920b.f393949a;
        j.f283918a.getClass();
        return interfaceC28481c.a(new C28478k(SimilarAdvertsListScreen.f90494d, rVar, "similar-adverts"));
    }
}
