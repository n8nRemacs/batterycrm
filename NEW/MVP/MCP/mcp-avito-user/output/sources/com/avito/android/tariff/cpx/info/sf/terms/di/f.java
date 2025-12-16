package com.avito.android.tariff.cpx.info.sf.terms.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff.cpx.info.sf.terms.TariffCpxInfoSfTermsScreen;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCpxInfoSfTermsModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f296857a;

    public f(l lVar) {
        this.f296857a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f296857a.f393949a;
        e.f296856a.getClass();
        return new C28478k(TariffCpxInfoSfTermsScreen.f296830d, rVar, null, 4, null);
    }
}
