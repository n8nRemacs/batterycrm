package com.avito.android.tariff_lf.edit_info.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EditInfoModule_ProvideMicroCategoryItemBinder$_avito_tariff_lf_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_lf.edit_info.item.edit_package.micro_category.b f298861a;

    public i(com.avito.android.tariff_lf.edit_info.item.edit_package.micro_category.b bVar) {
        this.f298861a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.tariff_lf.edit_info.item.edit_package.micro_category.a aVar = (com.avito.android.tariff_lf.edit_info.item.edit_package.micro_category.a) this.f298861a.get();
        c.f298839a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
