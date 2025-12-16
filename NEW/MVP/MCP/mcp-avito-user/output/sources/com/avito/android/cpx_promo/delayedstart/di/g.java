package com.avito.android.cpx_promo.delayedstart.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.cpx_promo.delayedstart.CpxPromoDelayedStartPerfScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxPromoDelayedStartModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final f f126840a;

    /* renamed from: b, reason: collision with root package name */
    public final l f126841b;

    public g(f fVar, l lVar) {
        this.f126840a = fVar;
        this.f126841b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f126841b.f393949a;
        this.f126840a.getClass();
        CpxPromoDelayedStartPerfScreen cpxPromoDelayedStartPerfScreen = CpxPromoDelayedStartPerfScreen.f126829d;
        cpxPromoDelayedStartPerfScreen.getClass();
        return new C28478k(cpxPromoDelayedStartPerfScreen, rVar, CpxPromoDelayedStartPerfScreen.f126830e);
    }
}
