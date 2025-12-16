package com.avito.android.tariff_lf_publication.count.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffLfPublicationCountModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_lf_publication.common.ui.items.header.b f300788a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff_lf_publication.count.ui.items.option.b f300789b;

    public i(com.avito.android.tariff_lf_publication.common.ui.items.header.b bVar, com.avito.android.tariff_lf_publication.count.ui.items.option.b bVar2) {
        this.f300788a = bVar;
        this.f300789b = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.tariff_lf_publication.common.ui.items.header.a aVar = (com.avito.android.tariff_lf_publication.common.ui.items.header.a) this.f300788a.get();
        com.avito.android.tariff_lf_publication.count.ui.items.option.a aVar2 = (com.avito.android.tariff_lf_publication.count.ui.items.option.a) this.f300789b.get();
        g.f300786a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        return c10493a.a();
    }
}
