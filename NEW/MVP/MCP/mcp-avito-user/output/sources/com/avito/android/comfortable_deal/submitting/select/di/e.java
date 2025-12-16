package com.avito.android.comfortable_deal.submitting.select.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectRecyclerModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.b f123330a;

    public e(com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.b bVar) {
        this.f123330a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.a aVar = (com.avito.android.comfortable_deal.submitting.recycler.items.selectItem.a) this.f123330a.get();
        b.f123326a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
