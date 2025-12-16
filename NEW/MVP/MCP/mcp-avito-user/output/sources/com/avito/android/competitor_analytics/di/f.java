package com.avito.android.competitor_analytics.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.competitor_analytics.CompetitorAnalyticsPerfScreen;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CompetitorAnalyticsModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f124251a;

    public f(l lVar) {
        this.f124251a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f124251a.f393949a;
        e.f124250a.getClass();
        return new C28478k(CompetitorAnalyticsPerfScreen.f124244d, rVar, null, 4, null);
    }
}
