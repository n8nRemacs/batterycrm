package com.avito.android.cpx_promo.impl.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.cpx_promo.impl.CpxPromoPerfScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxPromoModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final g f126949a;

    /* renamed from: b, reason: collision with root package name */
    public final l f126950b;

    public h(g gVar, l lVar) {
        this.f126949a = gVar;
        this.f126950b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f126950b.f393949a;
        this.f126949a.getClass();
        CpxPromoPerfScreen cpxPromoPerfScreen = CpxPromoPerfScreen.f126933d;
        cpxPromoPerfScreen.getClass();
        return new C28478k(cpxPromoPerfScreen, rVar, CpxPromoPerfScreen.f126934e);
    }
}
