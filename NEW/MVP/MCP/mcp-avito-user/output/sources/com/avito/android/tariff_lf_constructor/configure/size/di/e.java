package com.avito.android.tariff_lf_constructor.configure.size.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff_lf_constructor.configure.TariffConstructorConfigureSizeScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConstructorConfigureSizeModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f300271a;

    public e(l lVar) {
        this.f300271a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f300271a.f393949a;
        b.f300268a.getClass();
        return new C28478k(TariffConstructorConfigureSizeScreen.f299328d, rVar, "tariffConstructorConfigureSize");
    }
}
