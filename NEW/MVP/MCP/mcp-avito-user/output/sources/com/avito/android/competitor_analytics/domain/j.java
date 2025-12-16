package com.avito.android.competitor_analytics.domain;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CompetitorAnalyticsV2MapperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f124313a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<KO.a> f124314b;

    public j(u uVar, Provider provider) {
        this.f124313a = uVar;
        this.f124314b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.competitor_analytics.storage.a) this.f124313a.get(), this.f124314b.get());
    }
}
