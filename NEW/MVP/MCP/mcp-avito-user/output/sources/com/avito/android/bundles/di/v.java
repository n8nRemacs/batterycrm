package com.avito.android.bundles.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;

/* compiled from: VasBundlesModule_ProvideBundleBenefitItemBinder$_avito_vas_bundles_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class v implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.bundles.ui.recycler.item.benefit.j f108317a;

    public v(com.avito.android.bundles.ui.recycler.item.benefit.j jVar) {
        this.f108317a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.bundles.ui.recycler.item.benefit.i iVar = (com.avito.android.bundles.ui.recycler.item.benefit.i) this.f108317a.get();
        t.f108315a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(iVar);
        return c10493a.a();
    }
}
