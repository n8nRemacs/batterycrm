package com.avito.android.position_in_search.stats.screen.position_in_search.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.position_in_search.stats.screen.position_in_search.PositionInSearchPerfScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PositionInSearchModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f221386a;

    public e(l lVar) {
        this.f221386a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f221386a.f393949a;
        d.f221385a.getClass();
        return new C28478k(PositionInSearchPerfScreen.f221325d, rVar, null, 4, null);
    }
}
