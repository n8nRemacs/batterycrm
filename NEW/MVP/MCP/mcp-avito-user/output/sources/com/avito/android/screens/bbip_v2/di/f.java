package com.avito.android.screens.bbip_v2.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BbipV2ListModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.screens.bbip_v2.ui.items.title.c f261440a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.screens.bbip_v2.ui.items.forecast.c f261441b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.screens.bbip_v2.ui.items.budget.d f261442c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.screens.bbip_v2.ui.items.duration.d f261443d;

    public f(com.avito.android.screens.bbip_v2.ui.items.title.c cVar, com.avito.android.screens.bbip_v2.ui.items.forecast.c cVar2, com.avito.android.screens.bbip_v2.ui.items.budget.d dVar, com.avito.android.screens.bbip_v2.ui.items.duration.d dVar2) {
        this.f261440a = cVar;
        this.f261441b = cVar2;
        this.f261442c = dVar;
        this.f261443d = dVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.screens.bbip_v2.ui.items.title.b bVar = (com.avito.android.screens.bbip_v2.ui.items.title.b) this.f261440a.get();
        com.avito.android.screens.bbip_v2.ui.items.forecast.b bVar2 = (com.avito.android.screens.bbip_v2.ui.items.forecast.b) this.f261441b.get();
        com.avito.android.screens.bbip_v2.ui.items.budget.c cVar = (com.avito.android.screens.bbip_v2.ui.items.budget.c) this.f261442c.get();
        com.avito.android.screens.bbip_v2.ui.items.duration.c cVar2 = (com.avito.android.screens.bbip_v2.ui.items.duration.c) this.f261443d.get();
        d.f261438a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(cVar);
        c10493a.b(cVar2);
        return c10493a.a();
    }
}
