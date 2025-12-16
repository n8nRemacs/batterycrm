package com.avito.android.tariff_lf_constructor.configure.vertical.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff_lf_constructor.configure.TariffConstructorConfigureVerticalScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConstructorConfigureVerticalModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f300586a;

    public g(l lVar) {
        this.f300586a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f300586a.f393949a;
        b.f300574a.getClass();
        return new C28478k(TariffConstructorConfigureVerticalScreen.f299330d, rVar, "tariffConstructorConfigureVertical");
    }
}
