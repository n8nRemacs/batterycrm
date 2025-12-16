package com.avito.android.vas_performance.screens.stickers.edit.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StickersEditModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f320772a;

    public k(dagger.internal.l lVar) {
        this.f320772a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f320772a.f393949a;
        j.f320771a.getClass();
        return new C28478k(StickersEditMviPerformanceScreen.f320753d, rVar, null, 4, null);
    }
}
