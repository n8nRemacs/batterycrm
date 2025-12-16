package com.avito.android.lf_levels.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.lf_levels.stats.TariffLfLevelsScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LfLevelsModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f175361a;

    public l(dagger.internal.l lVar) {
        this.f175361a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f175361a.f393949a;
        k.f175360a.getClass();
        return new C28478k(TariffLfLevelsScreen.f175398d, rVar, "tariffLfLevels");
    }
}
