package com.avito.android.cpx_promo.priceinput.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputPerfScreen;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxPromoPriceInputModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final d f127306a;

    /* renamed from: b, reason: collision with root package name */
    public final l f127307b;

    public e(d dVar, l lVar) {
        this.f127306a = dVar;
        this.f127307b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f127307b.f393949a;
        this.f127306a.getClass();
        CpxPromoPriceInputPerfScreen cpxPromoPriceInputPerfScreen = CpxPromoPriceInputPerfScreen.f127290d;
        cpxPromoPriceInputPerfScreen.getClass();
        return new C28478k(cpxPromoPriceInputPerfScreen, rVar, CpxPromoPriceInputPerfScreen.f127291e);
    }
}
