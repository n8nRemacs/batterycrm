package com.avito.android.bxcontent.di.module;

import javax.inject.Provider;

/* compiled from: BxContentModule_ProvideWidgetsShowingAnalyticsFilter$_avito_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class N implements dagger.internal.h<com.avito.android.bxcontent.analytics.r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f110898a;

    public N(Provider<com.avito.android.serp.analytics.widgets_tracker.g> provider) {
        this.f110898a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.analytics.widgets_tracker.g gVar = this.f110898a.get();
        C29070s.f111022a.getClass();
        return new com.avito.android.bxcontent.analytics.r(gVar);
    }
}
