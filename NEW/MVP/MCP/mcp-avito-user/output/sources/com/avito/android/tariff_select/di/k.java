package com.avito.android.tariff_select.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffSelectListModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_select.ui.items.header.c f301208a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff_select.ui.items.tariff.c f301209b;

    public k(com.avito.android.tariff_select.ui.items.header.c cVar, com.avito.android.tariff_select.ui.items.tariff.c cVar2) {
        this.f301208a = cVar;
        this.f301209b = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.tariff_select.ui.items.header.b bVar = (com.avito.android.tariff_select.ui.items.header.b) this.f301208a.get();
        com.avito.android.tariff_select.ui.items.tariff.b bVar2 = (com.avito.android.tariff_select.ui.items.tariff.b) this.f301209b.get();
        i.f301206a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        return c10493a.a();
    }
}
