package com.avito.android.competitor_analytics;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: CompetitorAnalyticsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.competitor_analytics.mvi.i f124567a;

    public n(com.avito.android.competitor_analytics.mvi.i iVar) {
        this.f124567a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.competitor_analytics.mvi.h hVar = (com.avito.android.competitor_analytics.mvi.h) this.f124567a.get();
        i2.f411430a.getClass();
        return new m(hVar, i2.a.f411433c);
    }
}
