package com.avito.android.user_adverts_filters.main.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.user_adverts_filters.main.tracker.UserAdvertsFiltersScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserAdvertsFiltersTrackerModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f316042a;

    public g(l lVar) {
        this.f316042a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f316042a.f393949a;
        f.f316041a.getClass();
        return new C28478k(UserAdvertsFiltersScreen.f316328d, rVar, null, 4, null);
    }
}
