package com.avito.android.delivery_location_suggest.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeliveryLocationSuggestModule_ProvideSuggestItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.delivery_location_suggest.konveyor.suggest.b f135096a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.delivery_location_suggest.konveyor.empty.b f135097b;

    public j(com.avito.android.delivery_location_suggest.konveyor.suggest.b bVar, com.avito.android.delivery_location_suggest.konveyor.empty.b bVar2) {
        this.f135096a = bVar;
        this.f135097b = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.delivery_location_suggest.konveyor.suggest.a aVar = (com.avito.android.delivery_location_suggest.konveyor.suggest.a) this.f135096a.get();
        com.avito.android.delivery_location_suggest.konveyor.empty.a aVar2 = (com.avito.android.delivery_location_suggest.konveyor.empty.a) this.f135097b.get();
        g.f135094a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        return c10493a.a();
    }
}
