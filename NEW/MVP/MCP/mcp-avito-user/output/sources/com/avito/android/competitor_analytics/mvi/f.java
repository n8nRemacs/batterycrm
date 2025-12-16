package com.avito.android.competitor_analytics.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CompetitorAnalyticsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f124549a;

    public f(u uVar) {
        this.f124549a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.competitor_analytics.domain.d) this.f124549a.get());
    }
}
