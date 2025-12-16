package com.avito.android.vas_performance.screens.visual.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VisualVasListModule_ProvideItemBinder$_avito_vas_performance_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.visual.item.header.c f321028a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.visual.item.item.c f321029b;

    public j(com.avito.android.vas_performance.screens.visual.item.header.c cVar, com.avito.android.vas_performance.screens.visual.item.item.c cVar2) {
        this.f321028a = cVar;
        this.f321029b = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.vas_performance.screens.visual.item.header.b bVar = (com.avito.android.vas_performance.screens.visual.item.header.b) this.f321028a.get();
        com.avito.android.vas_performance.screens.visual.item.item.b bVar2 = (com.avito.android.vas_performance.screens.visual.item.item.b) this.f321029b.get();
        h.f321026a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        return c10493a.a();
    }
}
