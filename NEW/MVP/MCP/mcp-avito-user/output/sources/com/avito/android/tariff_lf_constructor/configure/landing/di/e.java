package com.avito.android.tariff_lf_constructor.configure.landing.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff_lf_constructor.configure.TariffConstructorLandingMviScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConstructorLandingModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f299658a;

    public e(l lVar) {
        this.f299658a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f299658a.f393949a;
        b.f299654a.getClass();
        TariffConstructorLandingMviScreen tariffConstructorLandingMviScreen = TariffConstructorLandingMviScreen.f299331d;
        tariffConstructorLandingMviScreen.getClass();
        return new C28478k(tariffConstructorLandingMviScreen, rVar, TariffConstructorLandingMviScreen.f299332e);
    }
}
