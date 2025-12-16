package com.avito.android.early_access.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.early_access.analytic.EarlyAccessScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EarlyAccessModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f145316a;

    public i(l lVar) {
        this.f145316a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f145316a.f393949a;
        h.f145315a.getClass();
        return new C28478k(EarlyAccessScreen.f145263d, rVar, null, 4, null);
    }
}
