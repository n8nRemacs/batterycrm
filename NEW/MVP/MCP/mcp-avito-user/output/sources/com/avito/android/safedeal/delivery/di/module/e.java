package com.avito.android.safedeal.delivery.di.module;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RdsOrderCancellationBlueprintsModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.safedeal.delivery.order_cancellation.konveyor.c f256065a;

    public e(com.avito.android.safedeal.delivery.order_cancellation.konveyor.c cVar) {
        this.f256065a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.safedeal.delivery.order_cancellation.konveyor.b bVar = (com.avito.android.safedeal.delivery.order_cancellation.konveyor.b) this.f256065a.get();
        a.f256059a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        return c10493a.a();
    }
}
