package com.avito.android.cpt.mass_activation.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptMassActivationModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpt.mass_activation.ui.items.header.b f126509a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.cpt.mass_activation.ui.items.advert.b f126510b;

    public f(com.avito.android.cpt.mass_activation.ui.items.header.b bVar, com.avito.android.cpt.mass_activation.ui.items.advert.b bVar2) {
        this.f126509a = bVar;
        this.f126510b = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.cpt.mass_activation.ui.items.header.a aVar = (com.avito.android.cpt.mass_activation.ui.items.header.a) this.f126509a.get();
        com.avito.android.cpt.mass_activation.ui.items.advert.a aVar2 = (com.avito.android.cpt.mass_activation.ui.items.advert.a) this.f126510b.get();
        d.f126507a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        return c10493a.a();
    }
}
