package com.avito.android.tariff_cpt.configure.forbidden.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff_cpt.TariffCptForbiddenScreen;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptForbiddenModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f297613a;

    public c(l lVar) {
        this.f297613a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f297613a.f393949a;
        b.f297612a.getClass();
        TariffCptForbiddenScreen tariffCptForbiddenScreen = TariffCptForbiddenScreen.f297504d;
        tariffCptForbiddenScreen.getClass();
        return new C28478k(tariffCptForbiddenScreen, rVar, TariffCptForbiddenScreen.f297505e);
    }
}
