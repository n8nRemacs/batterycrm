package com.avito.android.seller_coach.all_advices.provider;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.seller_coach.all_advices.provider.z;
import com.avito.android.seller_coach.all_advices.screen.AllAdvicesScreen;
import javax.inject.Provider;

/* compiled from: AllAdvicesTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class y implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f267371a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f267372b;

    public y(dagger.internal.l lVar, Provider provider) {
        this.f267371a = provider;
        this.f267372b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((z.b.c) this.f267371a).get();
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f267372b.f393949a;
        int i12 = u.f267370a;
        return interfaceC28481c.a(new C28478k(AllAdvicesScreen.f267394d, rVar, "sellerAdverts"));
    }
}
