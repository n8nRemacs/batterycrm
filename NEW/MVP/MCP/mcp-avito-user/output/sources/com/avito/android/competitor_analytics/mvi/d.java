package com.avito.android.competitor_analytics.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CompetitorAnalyticsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f124430a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.competitor_analytics.storage.a> f124431b;

    public d(u uVar, Provider provider) {
        this.f124430a = uVar;
        this.f124431b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.competitor_analytics.domain.d) this.f124430a.get(), this.f124431b.get());
    }
}
