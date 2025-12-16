package com.avito.android.tariff.cpr.configure.advance.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CprConfigureListModule_ProvideItemBinder$_avito_tariff_cpr_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpr.configure.advance.items.header.c f295210a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff.cpr.configure.advance.items.hints.c f295211b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.tariff.cpr.configure.advance.items.reviews.c f295212c;

    public h(com.avito.android.tariff.cpr.configure.advance.items.header.c cVar, com.avito.android.tariff.cpr.configure.advance.items.hints.c cVar2, com.avito.android.tariff.cpr.configure.advance.items.reviews.c cVar3) {
        this.f295210a = cVar;
        this.f295211b = cVar2;
        this.f295212c = cVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.tariff.cpr.configure.advance.items.header.b bVar = (com.avito.android.tariff.cpr.configure.advance.items.header.b) this.f295210a.get();
        com.avito.android.tariff.cpr.configure.advance.items.hints.b bVar2 = (com.avito.android.tariff.cpr.configure.advance.items.hints.b) this.f295211b.get();
        com.avito.android.tariff.cpr.configure.advance.items.reviews.b bVar3 = (com.avito.android.tariff.cpr.configure.advance.items.reviews.b) this.f295212c.get();
        e.f295207a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(bVar3);
        return c10493a.a();
    }
}
