package com.avito.android.bbl.screens.limit_increase.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LimitIncreaseModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final j f99759a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f99760b;

    public k(j jVar, dagger.internal.l lVar) {
        this.f99759a = jVar;
        this.f99760b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f99760b.f393949a;
        this.f99759a.getClass();
        return new C28478k(LimitIncreasePerformanceScreen.f99740d, rVar, null, 4, null);
    }
}
