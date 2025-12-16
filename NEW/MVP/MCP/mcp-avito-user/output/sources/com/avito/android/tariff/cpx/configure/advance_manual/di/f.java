package com.avito.android.tariff.cpx.configure.advance_manual.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.TariffCpxConfigureAdvanceManualScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxConfigureAdvanceManualModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f295811a;

    public f(l lVar) {
        this.f295811a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f295811a.f393949a;
        d.f295808a.getClass();
        return new C28478k(TariffCpxConfigureAdvanceManualScreen.f90529d, rVar, "tariffCpxConfigureAdvanceManual");
    }
}
