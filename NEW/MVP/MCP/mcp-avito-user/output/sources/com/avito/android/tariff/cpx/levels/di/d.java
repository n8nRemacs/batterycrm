package com.avito.android.tariff.cpx.levels.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxLevelsListModule_ProvideItemBinder$_avito_tariff_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.levels.ui.items.business_tools_header.c f297053a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.levels.ui.items.business_tool.c f297054b;

    public d(com.avito.android.tariff.cpx.levels.ui.items.business_tools_header.c cVar, com.avito.android.tariff.cpx.levels.ui.items.business_tool.c cVar2) {
        this.f297053a = cVar;
        this.f297054b = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.tariff.cpx.levels.ui.items.business_tools_header.b bVar = (com.avito.android.tariff.cpx.levels.ui.items.business_tools_header.b) this.f297053a.get();
        com.avito.android.tariff.cpx.levels.ui.items.business_tool.b bVar2 = (com.avito.android.tariff.cpx.levels.ui.items.business_tool.b) this.f297054b.get();
        b.f297051a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        return c10493a.a();
    }
}
