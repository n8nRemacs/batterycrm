package com.avito.android.bbl.screens.configure.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BblConfigureListModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.bbl.screens.configure.ui.items.header.c f99153a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.bbl.screens.configure.ui.items.configs.b f99154b;

    public i(com.avito.android.bbl.screens.configure.ui.items.header.c cVar, com.avito.android.bbl.screens.configure.ui.items.configs.b bVar) {
        this.f99153a = cVar;
        this.f99154b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.bbl.screens.configure.ui.items.header.b bVar = (com.avito.android.bbl.screens.configure.ui.items.header.b) this.f99153a.get();
        com.avito.android.bbl.screens.configure.ui.items.configs.a aVar = (com.avito.android.bbl.screens.configure.ui.items.configs.a) this.f99154b.get();
        g.f99151a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(aVar);
        return c10493a.a();
    }
}
