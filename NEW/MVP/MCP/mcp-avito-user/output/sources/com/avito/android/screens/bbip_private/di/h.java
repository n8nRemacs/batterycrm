package com.avito.android.screens.bbip_private.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BbipPrivateListModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.screens.bbip_private.ui.items.header.c f260491a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.screens.bbip_private.ui.items.duration.d f260492b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.screens.bbip_private.ui.items.budget.d f260493c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.screens.bbip_private.ui.items.budget_widget.d f260494d;

    public h(com.avito.android.screens.bbip_private.ui.items.header.c cVar, com.avito.android.screens.bbip_private.ui.items.duration.d dVar, com.avito.android.screens.bbip_private.ui.items.budget.d dVar2, com.avito.android.screens.bbip_private.ui.items.budget_widget.d dVar3) {
        this.f260491a = cVar;
        this.f260492b = dVar;
        this.f260493c = dVar2;
        this.f260494d = dVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.screens.bbip_private.ui.items.header.b bVar = (com.avito.android.screens.bbip_private.ui.items.header.b) this.f260491a.get();
        com.avito.android.screens.bbip_private.ui.items.duration.c cVar = (com.avito.android.screens.bbip_private.ui.items.duration.c) this.f260492b.get();
        com.avito.android.screens.bbip_private.ui.items.budget.c cVar2 = (com.avito.android.screens.bbip_private.ui.items.budget.c) this.f260493c.get();
        com.avito.android.screens.bbip_private.ui.items.budget_widget.c cVar3 = (com.avito.android.screens.bbip_private.ui.items.budget_widget.c) this.f260494d.get();
        f.f260489a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(cVar);
        c10493a.b(cVar2);
        c10493a.b(cVar3);
        return c10493a.a();
    }
}
