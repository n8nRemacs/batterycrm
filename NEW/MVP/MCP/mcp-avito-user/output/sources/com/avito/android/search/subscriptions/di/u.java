package com.avito.android.search.subscriptions.di;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.search.subscriptions.di.a;
import com.avito.android.search.subscriptions.tracker.SearchSubscriptionScreen;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchSubscriptionsTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class u implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f263953a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f263954b;

    public u(dagger.internal.l lVar, Provider provider) {
        this.f263953a = provider;
        this.f263954b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.h) this.f263953a).get();
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f263954b.f393949a;
        q qVar = q.f263949a;
        return interfaceC28481c.b(SearchSubscriptionScreen.f264020d, rVar);
    }
}
