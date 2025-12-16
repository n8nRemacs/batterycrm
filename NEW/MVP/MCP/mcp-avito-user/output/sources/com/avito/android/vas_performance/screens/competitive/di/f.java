package com.avito.android.vas_performance.screens.competitive.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.CompetitiveVasScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CompetitiveVasV2Module_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f320408a;

    public f(l lVar) {
        this.f320408a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f320408a.f393949a;
        e.f320407a.getClass();
        return new C28478k(CompetitiveVasScreen.f90327d, rVar, null, 4, null);
    }
}
