package com.avito.android.user_adverts.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.UserAdvertsScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAdvertsTrackerModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f312112a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f312113b;

    public m(dagger.internal.l lVar, Provider provider) {
        this.f312112a = provider;
        this.f312113b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = this.f312112a.get();
        r rVar = (r) this.f312113b.f393949a;
        l.f312111a.getClass();
        return interfaceC28481c.a(new C28478k(UserAdvertsScreen.f90543d, rVar, null, 4, null));
    }
}
