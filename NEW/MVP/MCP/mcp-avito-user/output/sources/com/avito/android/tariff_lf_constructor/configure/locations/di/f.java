package com.avito.android.tariff_lf_constructor.configure.locations.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff_lf_constructor.configure.TariffConstructorConfigureLocationsScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConfigureLocationsModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f299883a;

    public f(l lVar) {
        this.f299883a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f299883a.f393949a;
        b.f299879a.getClass();
        return new C28478k(TariffConstructorConfigureLocationsScreen.f299326d, rVar, "tariffConstructorConfigureLocations");
    }
}
