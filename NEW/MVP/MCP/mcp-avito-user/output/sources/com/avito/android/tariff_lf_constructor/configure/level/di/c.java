package com.avito.android.tariff_lf_constructor.configure.level.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff_lf_constructor.configure.TariffConstructorConfigureLevelMviScreen;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConstructorConfigureLevelModule_ProvidePerfScreenDataFactory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f299803a;

    public c(l lVar) {
        this.f299803a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f299803a.f393949a;
        b.f299802a.getClass();
        TariffConstructorConfigureLevelMviScreen tariffConstructorConfigureLevelMviScreen = TariffConstructorConfigureLevelMviScreen.f299323d;
        tariffConstructorConfigureLevelMviScreen.getClass();
        return new C28478k(tariffConstructorConfigureLevelMviScreen, rVar, TariffConstructorConfigureLevelMviScreen.f299324e);
    }
}
