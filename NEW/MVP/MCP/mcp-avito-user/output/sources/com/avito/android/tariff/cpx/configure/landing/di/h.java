package com.avito.android.tariff.cpx.configure.landing.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxConfigureLandingListModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.configure.landing.items.header.c f295901a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.configure.landing.items.info.c f295902b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.configure.landing.items.accordions_card.c f295903c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.configure.landing.items.card.c f295904d;

    public h(com.avito.android.tariff.cpx.configure.landing.items.header.c cVar, com.avito.android.tariff.cpx.configure.landing.items.info.c cVar2, com.avito.android.tariff.cpx.configure.landing.items.accordions_card.c cVar3, com.avito.android.tariff.cpx.configure.landing.items.card.c cVar4) {
        this.f295901a = cVar;
        this.f295902b = cVar2;
        this.f295903c = cVar3;
        this.f295904d = cVar4;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.tariff.cpx.configure.landing.items.header.b bVar = (com.avito.android.tariff.cpx.configure.landing.items.header.b) this.f295901a.get();
        com.avito.android.tariff.cpx.configure.landing.items.info.b bVar2 = (com.avito.android.tariff.cpx.configure.landing.items.info.b) this.f295902b.get();
        com.avito.android.tariff.cpx.configure.landing.items.accordions_card.b bVar3 = (com.avito.android.tariff.cpx.configure.landing.items.accordions_card.b) this.f295903c.get();
        com.avito.android.tariff.cpx.configure.landing.items.card.b bVar4 = (com.avito.android.tariff.cpx.configure.landing.items.card.b) this.f295904d.get();
        f.f295899a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(bVar3);
        c10493a.b(bVar4);
        return c10493a.a();
    }
}
