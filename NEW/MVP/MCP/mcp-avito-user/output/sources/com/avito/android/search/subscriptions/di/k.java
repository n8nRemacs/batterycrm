package com.avito.android.search.subscriptions.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SearchSubscriptionPluginModule_ProvideAuthorizationPluginFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<A3.b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.db.p f263948a;

    public k(com.avito.android.db.p pVar) {
        this.f263948a = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.db.n nVar = (com.avito.android.db.n) this.f263948a.get();
        j.f263947a.getClass();
        return new i(nVar);
    }
}
