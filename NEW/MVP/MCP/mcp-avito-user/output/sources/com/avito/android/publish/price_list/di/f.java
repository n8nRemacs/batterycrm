package com.avito.android.publish.price_list.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectPriceListItemsModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f238493a;

    public f(dagger.internal.u uVar) {
        this.f238493a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f238493a.get();
        e.f238492a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
