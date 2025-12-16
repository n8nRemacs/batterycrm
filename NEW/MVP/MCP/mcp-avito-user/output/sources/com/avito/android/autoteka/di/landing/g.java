package com.avito.android.autoteka.di.landing;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaLandingModule_Companion_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.items.skeleton.landing.b f96439a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.autoteka.items.fullScreenError.landing.b f96440b;

    public g(com.avito.android.autoteka.items.skeleton.landing.b bVar, com.avito.android.autoteka.items.fullScreenError.landing.b bVar2) {
        this.f96439a = bVar;
        this.f96440b = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.autoteka.items.skeleton.landing.a aVar = (com.avito.android.autoteka.items.skeleton.landing.a) this.f96439a.get();
        com.avito.android.autoteka.items.fullScreenError.landing.a aVar2 = (com.avito.android.autoteka.items.fullScreenError.landing.a) this.f96440b.get();
        b.f96428a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        return c10493a.a();
    }
}
