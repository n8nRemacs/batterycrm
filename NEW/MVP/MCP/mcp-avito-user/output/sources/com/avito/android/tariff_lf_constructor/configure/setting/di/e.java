package com.avito.android.tariff_lf_constructor.configure.setting.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff_lf_constructor.configure.TariffConstructorConfigureSettingScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConstructorSettingModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f300046a;

    public e(l lVar) {
        this.f300046a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f300046a.f393949a;
        b.f300043a.getClass();
        return new C28478k(TariffConstructorConfigureSettingScreen.f299327d, rVar, "tariffConstructorConfigureSetting");
    }
}
