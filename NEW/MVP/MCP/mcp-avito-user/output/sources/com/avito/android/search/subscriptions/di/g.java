package com.avito.android.search.subscriptions.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SearchSubscriptionModule_ProvideItemBinder$_avito_search_subscriptions_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.search.subscriptions.adapter.b f263944a;

    public g(com.avito.android.search.subscriptions.adapter.b bVar) {
        this.f263944a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.search.subscriptions.adapter.a aVar = (com.avito.android.search.subscriptions.adapter.a) this.f263944a.get();
        int i12 = e.f263941a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
