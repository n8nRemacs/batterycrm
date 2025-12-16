package com.avito.android.screens.bbip.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BbipListModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.screens.bbip.ui.items.title.c f260224a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.screens.bbip.ui.items.forecast.c f260225b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.screens.bbip.ui.items.budget.d f260226c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.screens.bbip.ui.items.duration.d f260227d;

    public k(com.avito.android.screens.bbip.ui.items.title.c cVar, com.avito.android.screens.bbip.ui.items.forecast.c cVar2, com.avito.android.screens.bbip.ui.items.budget.d dVar, com.avito.android.screens.bbip.ui.items.duration.d dVar2) {
        this.f260224a = cVar;
        this.f260225b = cVar2;
        this.f260226c = dVar;
        this.f260227d = dVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.screens.bbip.ui.items.title.b bVar = (com.avito.android.screens.bbip.ui.items.title.b) this.f260224a.get();
        com.avito.android.screens.bbip.ui.items.forecast.b bVar2 = (com.avito.android.screens.bbip.ui.items.forecast.b) this.f260225b.get();
        com.avito.android.screens.bbip.ui.items.budget.c cVar = (com.avito.android.screens.bbip.ui.items.budget.c) this.f260226c.get();
        com.avito.android.screens.bbip.ui.items.duration.c cVar2 = (com.avito.android.screens.bbip.ui.items.duration.c) this.f260227d.get();
        i.f260222a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(cVar);
        c10493a.b(cVar2);
        return c10493a.a();
    }
}
