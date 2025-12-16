package com.avito.android.tariff_lf.package_info.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffPackageInfoModule_ProvideMicroCategoryItemBinder$_avito_tariff_lf_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_lf.package_info.recycler.microcategory.b f299224a;

    public l(com.avito.android.tariff_lf.package_info.recycler.microcategory.b bVar) {
        this.f299224a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.tariff_lf.package_info.recycler.microcategory.a aVar = (com.avito.android.tariff_lf.package_info.recycler.microcategory.a) this.f299224a.get();
        h.f299220a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
