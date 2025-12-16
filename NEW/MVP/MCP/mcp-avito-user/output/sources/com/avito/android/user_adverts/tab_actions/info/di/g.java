package com.avito.android.user_adverts.tab_actions.info.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.UserAdvertsActionsResultScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_adverts.tab_actions.info.di.a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAdvertsActionResultInfoModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f314655a;

    /* renamed from: b, reason: collision with root package name */
    public final l f314656b;

    public g(l lVar, Provider provider) {
        this.f314655a = provider;
        this.f314656b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481cF = ((a.c.b) this.f314655a).f314647a.f();
        r rVar = (r) this.f314656b.f393949a;
        d.f314650a.getClass();
        return interfaceC28481cF.a(new C28478k(UserAdvertsActionsResultScreen.f90542d, rVar, null, 4, null));
    }
}
