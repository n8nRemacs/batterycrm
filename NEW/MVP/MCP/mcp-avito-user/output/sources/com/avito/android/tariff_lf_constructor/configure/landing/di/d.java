package com.avito.android.tariff_lf_constructor.configure.landing.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConstructorLandingModule_ProvideItemBinder$_avito_tariff_lf_constructor_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_lf_constructor.configure.landing.items.header.c f299656a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.tariff_lf_constructor.configure.landing.items.landing_feature.c f299657b;

    public d(com.avito.android.tariff_lf_constructor.configure.landing.items.header.c cVar, com.avito.android.tariff_lf_constructor.configure.landing.items.landing_feature.c cVar2) {
        this.f299656a = cVar;
        this.f299657b = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.tariff_lf_constructor.configure.landing.items.header.b bVar = (com.avito.android.tariff_lf_constructor.configure.landing.items.header.b) this.f299656a.get();
        com.avito.android.tariff_lf_constructor.configure.landing.items.landing_feature.b bVar2 = (com.avito.android.tariff_lf_constructor.configure.landing.items.landing_feature.b) this.f299657b.get();
        b.f299654a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        return c10493a.a();
    }
}
