package com.avito.android.di.module;

import javax.inject.Provider;

/* compiled from: DevelopmentItemModule_ProvideFiltersTabGroupPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class K4 implements dagger.internal.h<com.avito.android.serp.adapter.developments_catalog.filters.tab_group.c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f144030a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f144031b;

    public K4(dagger.internal.f fVar, Provider provider) {
        this.f144030a = fVar;
        this.f144031b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f144030a);
        com.avito.android.serp.analytics.widgets_tracker.g gVar = this.f144031b.get();
        F4 f42 = F4.f143954a;
        return new com.avito.android.serp.adapter.developments_catalog.filters.tab_group.d(gVar, eVarB);
    }
}
