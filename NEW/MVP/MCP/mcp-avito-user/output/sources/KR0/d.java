package kr0;

import com.avito.android.serp.adapter.C34741k;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BrandspaceWidgetModule_ProvidesGridScrollableItemsBinder$_avito_discouraged_avito_libs_serp_core_implFactory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34741k> f413249a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.serp.adapter.developments_catalog.advert_grid.b f413250b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.serp.adapter.developments_catalog.advert_grid.e f413251c;

    public d(Provider provider, com.avito.android.serp.adapter.developments_catalog.advert_grid.b bVar, com.avito.android.serp.adapter.developments_catalog.advert_grid.e eVar) {
        this.f413249a = provider;
        this.f413250b = bVar;
        this.f413251c = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        C34741k c34741k = this.f413249a.get();
        com.avito.android.serp.adapter.developments_catalog.advert_grid.a aVar = (com.avito.android.serp.adapter.developments_catalog.advert_grid.a) this.f413250b.get();
        com.avito.android.serp.adapter.developments_catalog.advert_grid.d dVar = (com.avito.android.serp.adapter.developments_catalog.advert_grid.d) this.f413251c.get();
        c.f413248a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(c34741k);
        c10493a.b(aVar);
        c10493a.b(dVar);
        return c10493a.a();
    }
}
