package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.tracker.SearchPositionScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SearchPositionTrackerModule_ProvideScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f220844a;

    public g(l lVar) {
        this.f220844a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f220844a.f393949a;
        f.f220843a.getClass();
        return new C28478k(SearchPositionScreen.f221262d, rVar, null, 4, null);
    }
}
