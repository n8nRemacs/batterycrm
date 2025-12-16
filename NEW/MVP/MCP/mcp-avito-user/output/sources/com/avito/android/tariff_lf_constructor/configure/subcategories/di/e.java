package com.avito.android.tariff_lf_constructor.configure.subcategories.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.tariff_lf_constructor.configure.TariffConstructorConfigureSubCategoriesScreen;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConfigureSubCategoriesModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final l f300444a;

    public e(l lVar) {
        this.f300444a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f300444a.f393949a;
        b.f300441a.getClass();
        return new C28478k(TariffConstructorConfigureSubCategoriesScreen.f299329d, rVar, "tariffConstructorConfigureSubCategories");
    }
}
