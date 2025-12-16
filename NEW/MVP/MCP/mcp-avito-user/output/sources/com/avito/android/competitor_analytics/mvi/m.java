package com.avito.android.competitor_analytics.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CompetitorAnalyticsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.competitor_analytics.domain.c f124565a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.competitor_analytics.domain.j f124566b;

    public m(com.avito.android.competitor_analytics.domain.c cVar, com.avito.android.competitor_analytics.domain.j jVar) {
        this.f124565a = cVar;
        this.f124566b = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.android.competitor_analytics.domain.a) this.f124565a.get(), (com.avito.android.competitor_analytics.domain.h) this.f124566b.get());
    }
}
