package com.avito.android.search.subscriptions.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SearchSubscriptionModule_ProvidesAdapterPresenter$_avito_search_subscriptions_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f263945a;

    public h(dagger.internal.u uVar) {
        this.f263945a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f263945a.get();
        int i12 = e.f263941a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
