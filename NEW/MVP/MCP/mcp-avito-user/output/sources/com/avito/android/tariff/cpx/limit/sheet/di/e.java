package com.avito.android.tariff.cpx.limit.sheet.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.MnzTariffCpxLimits;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxLimitModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f297290a;

    public e(l lVar) {
        this.f297290a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f297290a.f393949a;
        c.f297289a.getClass();
        return new C28478k(MnzTariffCpxLimits.f90412d, rVar, "tariffCpxLimit");
    }
}
