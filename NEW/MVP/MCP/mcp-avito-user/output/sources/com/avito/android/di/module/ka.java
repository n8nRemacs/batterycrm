package com.avito.android.di.module;

import com.avito.android.serp.adapter.C34741k;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import javax.inject.Provider;

/* compiled from: WitcherModule_ProvidesWitcherItemsBinderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class ka implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34741k> f144373a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.serp.adapter.developments_catalog.advert_grid.h f144374b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.constructor.v> f144375c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.serp.adapter.constructor.rich.E f144376d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.serp.adapter.constructor.services.b f144377e;

    public ka(Provider provider, com.avito.android.serp.adapter.developments_catalog.advert_grid.h hVar, Provider provider2, com.avito.android.serp.adapter.constructor.rich.E e12, com.avito.android.serp.adapter.constructor.services.b bVar) {
        this.f144373a = provider;
        this.f144374b = hVar;
        this.f144375c = provider2;
        this.f144376d = e12;
        this.f144377e = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        C34741k c34741k = this.f144373a.get();
        com.avito.android.serp.adapter.developments_catalog.advert_grid.g gVar = (com.avito.android.serp.adapter.developments_catalog.advert_grid.g) this.f144374b.get();
        com.avito.android.serp.adapter.constructor.v vVar = this.f144375c.get();
        com.avito.android.serp.adapter.constructor.rich.D d12 = (com.avito.android.serp.adapter.constructor.rich.D) this.f144376d.get();
        com.avito.android.serp.adapter.constructor.services.a aVar = (com.avito.android.serp.adapter.constructor.services.a) this.f144377e.get();
        ja.f144355a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(c34741k);
        c10493a.b(gVar);
        c10493a.b(vVar);
        c10493a.b(d12);
        c10493a.b(aVar);
        return c10493a.a();
    }
}
