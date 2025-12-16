package com.avito.android.cpt.mass_activation.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptMassActivationV2Module_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpt.mass_activation.ui.items.advert_v2.b f126516a;

    public l(com.avito.android.cpt.mass_activation.ui.items.advert_v2.b bVar) {
        this.f126516a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.cpt.mass_activation.ui.items.advert_v2.a aVar = (com.avito.android.cpt.mass_activation.ui.items.advert_v2.a) this.f126516a.get();
        j.f126514a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
