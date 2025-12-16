package com.avito.android.competitor_analytics.domain;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CompetitorAnalyticsMapperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f124285a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<KO.a> f124286b;

    public c(u uVar, Provider provider) {
        this.f124285a = uVar;
        this.f124286b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.competitor_analytics.storage.a) this.f124285a.get(), this.f124286b.get());
    }
}
