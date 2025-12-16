package com.avito.android.bundles.vas_union.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;

/* compiled from: VasUnionModule_ProvideBundleBenefitItemBinder$_avito_vas_bundles_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class s implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final q f108546a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.bundles.ui.recycler.item.benefit.j f108547b;

    public s(q qVar, com.avito.android.bundles.ui.recycler.item.benefit.j jVar) {
        this.f108546a = qVar;
        this.f108547b = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.bundles.ui.recycler.item.benefit.i iVar = (com.avito.android.bundles.ui.recycler.item.benefit.i) this.f108547b.get();
        this.f108546a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(iVar);
        return c10493a.a();
    }
}
