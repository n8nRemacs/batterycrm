package com.avito.android.tariff.cpx.configure.advance.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.TariffCpxConfigureAdvanceScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxConfigureAdvanceModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f295598a;

    public m(dagger.internal.l lVar) {
        this.f295598a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f295598a.f393949a;
        k.f295595a.getClass();
        return new C28478k(TariffCpxConfigureAdvanceScreen.f90530d, rVar, "tariffCpxConfigureAdvance");
    }
}
